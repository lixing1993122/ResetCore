//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Option: missing-value detection (*Specified/ShouldSerialize*/Reset*) enabled
    
// Option: light framework (CF/Silverlight) enabled
    
// Generated from: RequestScene.proto
namespace Protobuf.Data
{
  [global::ProtoBuf.ProtoContract(Name=@"RequestSceneData")]
  public partial class RequestSceneData : global::ProtoBuf.IExtensible
  {
    public RequestSceneData() {}
    
    private int? _id;
    [global::ProtoBuf.ProtoMember(1, IsRequired = false, Name=@"id", DataFormat = global::ProtoBuf.DataFormat.TwosComplement)]
    public int Id
    {
      get { return _id?? (int)0; }
      set { _id = value; }
    }
    [global::System.Xml.Serialization.XmlIgnore]
    
    public bool IdSpecified
    {
      get { return this._id != null; }
      set { if (value == (this._id== null)) this._id = value ? this.Id : (int?)null; }
    }
    private bool ShouldSerializeId() { return IdSpecified; }
    private void ResetId() { IdSpecified = false; }
    
    private string _sceneType;
    [global::ProtoBuf.ProtoMember(2, IsRequired = false, Name=@"sceneType", DataFormat = global::ProtoBuf.DataFormat.Default)]
    public string SceneType
    {
      get { return _sceneType?? ""; }
      set { _sceneType = value; }
    }
    [global::System.Xml.Serialization.XmlIgnore]
    
    public bool SceneTypeSpecified
    {
      get { return this._sceneType != null; }
      set { if (value == (this._sceneType== null)) this._sceneType = value ? this.SceneType : (string)null; }
    }
    private bool ShouldSerializeSceneType() { return SceneTypeSpecified; }
    private void ResetSceneType() { SceneTypeSpecified = false; }
    
    private global::ProtoBuf.IExtension extensionObject;
    global::ProtoBuf.IExtension global::ProtoBuf.IExtensible.GetExtensionObject(bool createIfMissing)
      { return global::ProtoBuf.Extensible.GetExtensionObject(ref extensionObject, createIfMissing); }
  }
  
}