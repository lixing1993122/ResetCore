﻿using UnityEngine;
using System.Collections;
using System.Reflection;
using System.Collections.Generic;
using System;

namespace ResetCore.ReAssembly
{
    public class AssemblyManager
    {

        /// <summary>
        /// 编辑器默认的程序集Assembly-CSharp.dll
        /// </summary>
        private static Assembly defaultCSharpAssembly;

        /// <summary>
        /// 程序集缓存
        /// </summary>
        private static Dictionary<string, Assembly> assemblyCache = new Dictionary<string, Assembly>();

        /// <summary>
        /// 获取编辑器默认的程序集Assembly-CSharp.dll
        /// </summary>
        public static Assembly DefaultCSharpAssembly
        {
            get
            {
                //如果已经找到，直接返回
                if (defaultCSharpAssembly != null)
                    return defaultCSharpAssembly;

                //从当前加载的程序包中寻找，如果找到，则直接记录并返回
                Assembly[] assems = AppDomain.CurrentDomain.GetAssemblies();
                foreach (Assembly assem in assems)
                {
                    //所有本地代码都编译到Assembly-CSharp中
                    if (assem.GetName().Name == "Assembly-CSharp")
                    {
                        //保存到列表并返回
                        defaultCSharpAssembly = assem;
                        break;
                    }
                }
                return defaultCSharpAssembly;
            }
        }

        /// <summary>
        /// 获取Assembly
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public static Assembly GetAssembly(string name)
        {
#if UNITY_ANDROID
            if (!assemblyCache.ContainsKey(name))
                return null;

            return assemblyCache[name];
#else
            foreach(Assembly assembly in AppDomain.CurrentDomain.GetAssemblies())
            {
                if(assembly.GetName().Name == name)
                {
                    return assembly;
                }
            }
            return null;
#endif
        }


        /// <summary>
        /// 根据名称获取程序集中的类型
        /// </summary>
        /// <param name="assembly">程序集名称，例如：SSJJ，Start</param>
        /// <param name="typeName">类型名称，必须包含完整的命名空间，例如：SSJJ.Render.BulletRail</param>
        /// <returns>类型</returns>
        public static Type GetAssemblyType(string assembly, string typeName)
        {
            Type t;

            //安卓平台使用SSJJ.dll中的类型
            if (Application.platform == RuntimePlatform.Android)
                t = AssemblyManager.GetAssembly(assembly).GetType(typeName);
            //其他平台使用默认程序集中的类型
            else
                t = AssemblyManager.DefaultCSharpAssembly.GetType(typeName);

            return t;
        }

        /// <summary>
        /// 获取默认的程序集
        /// </summary>
        /// <param name="typeName"></param>
        /// <returns></returns>
        public static Type GetDefaultAssemblyType(string typeName)
        {
            Type t = AssemblyManager.DefaultCSharpAssembly.GetType(typeName);
            return t;
        }

        public static Type[] GetTypeList(string assemblyName)
        {
            return GetAssembly(assemblyName).GetTypes();
        }
    }
}
