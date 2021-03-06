// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transform3D.proto

public final class Transform3D {
  private Transform3D() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Transform3DDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Transform3DData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 instanceId = 1;</code>
     */
    boolean hasInstanceId();
    /**
     * <code>optional int32 instanceId = 1;</code>
     */
    int getInstanceId();

    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    boolean hasLocalPosition();
    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    Vector3D.Vector3DData getLocalPosition();
    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    Vector3D.Vector3DDataOrBuilder getLocalPositionOrBuilder();

    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    boolean hasLocalEulerAngle();
    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    Vector3D.Vector3DData getLocalEulerAngle();
    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    Vector3D.Vector3DDataOrBuilder getLocalEulerAngleOrBuilder();

    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    boolean hasLocalScale();
    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    Vector3D.Vector3DData getLocalScale();
    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    Vector3D.Vector3DDataOrBuilder getLocalScaleOrBuilder();
  }
  /**
   * Protobuf type {@code Transform3DData}
   */
  public  static final class Transform3DData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Transform3DData)
      Transform3DDataOrBuilder {
    // Use Transform3DData.newBuilder() to construct.
    private Transform3DData(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private Transform3DData() {
      instanceId_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Transform3DData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              instanceId_ = input.readInt32();
              break;
            }
            case 18: {
              Vector3D.Vector3DData.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = localPosition_.toBuilder();
              }
              localPosition_ = input.readMessage(Vector3D.Vector3DData.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(localPosition_);
                localPosition_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              Vector3D.Vector3DData.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = localEulerAngle_.toBuilder();
              }
              localEulerAngle_ = input.readMessage(Vector3D.Vector3DData.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(localEulerAngle_);
                localEulerAngle_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              Vector3D.Vector3DData.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = localScale_.toBuilder();
              }
              localScale_ = input.readMessage(Vector3D.Vector3DData.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(localScale_);
                localScale_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Transform3D.internal_static_Transform3DData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Transform3D.internal_static_Transform3DData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Transform3D.Transform3DData.class, Transform3D.Transform3DData.Builder.class);
    }

    private int bitField0_;
    public static final int INSTANCEID_FIELD_NUMBER = 1;
    private int instanceId_;
    /**
     * <code>optional int32 instanceId = 1;</code>
     */
    public boolean hasInstanceId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 instanceId = 1;</code>
     */
    public int getInstanceId() {
      return instanceId_;
    }

    public static final int LOCALPOSITION_FIELD_NUMBER = 2;
    private Vector3D.Vector3DData localPosition_;
    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    public boolean hasLocalPosition() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    public Vector3D.Vector3DData getLocalPosition() {
      return localPosition_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localPosition_;
    }
    /**
     * <code>optional .Vector3DData localPosition = 2;</code>
     */
    public Vector3D.Vector3DDataOrBuilder getLocalPositionOrBuilder() {
      return localPosition_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localPosition_;
    }

    public static final int LOCALEULERANGLE_FIELD_NUMBER = 3;
    private Vector3D.Vector3DData localEulerAngle_;
    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    public boolean hasLocalEulerAngle() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    public Vector3D.Vector3DData getLocalEulerAngle() {
      return localEulerAngle_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localEulerAngle_;
    }
    /**
     * <code>optional .Vector3DData localEulerAngle = 3;</code>
     */
    public Vector3D.Vector3DDataOrBuilder getLocalEulerAngleOrBuilder() {
      return localEulerAngle_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localEulerAngle_;
    }

    public static final int LOCALSCALE_FIELD_NUMBER = 4;
    private Vector3D.Vector3DData localScale_;
    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    public boolean hasLocalScale() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    public Vector3D.Vector3DData getLocalScale() {
      return localScale_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localScale_;
    }
    /**
     * <code>optional .Vector3DData localScale = 4;</code>
     */
    public Vector3D.Vector3DDataOrBuilder getLocalScaleOrBuilder() {
      return localScale_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localScale_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, instanceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getLocalPosition());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getLocalEulerAngle());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getLocalScale());
      }
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, instanceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLocalPosition());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLocalEulerAngle());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getLocalScale());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static Transform3D.Transform3DData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Transform3D.Transform3DData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Transform3D.Transform3DData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Transform3D.Transform3DData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Transform3D.Transform3DData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Transform3D.Transform3DData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Transform3D.Transform3DData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Transform3D.Transform3DData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Transform3D.Transform3DData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Transform3D.Transform3DData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Transform3D.Transform3DData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Transform3DData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Transform3DData)
        Transform3D.Transform3DDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Transform3D.internal_static_Transform3DData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Transform3D.internal_static_Transform3DData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Transform3D.Transform3DData.class, Transform3D.Transform3DData.Builder.class);
      }

      // Construct using Transform3D.Transform3DData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocalPositionFieldBuilder();
          getLocalEulerAngleFieldBuilder();
          getLocalScaleFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        instanceId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (localPositionBuilder_ == null) {
          localPosition_ = null;
        } else {
          localPositionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (localEulerAngleBuilder_ == null) {
          localEulerAngle_ = null;
        } else {
          localEulerAngleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (localScaleBuilder_ == null) {
          localScale_ = null;
        } else {
          localScaleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Transform3D.internal_static_Transform3DData_descriptor;
      }

      public Transform3D.Transform3DData getDefaultInstanceForType() {
        return Transform3D.Transform3DData.getDefaultInstance();
      }

      public Transform3D.Transform3DData build() {
        Transform3D.Transform3DData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Transform3D.Transform3DData buildPartial() {
        Transform3D.Transform3DData result = new Transform3D.Transform3DData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.instanceId_ = instanceId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (localPositionBuilder_ == null) {
          result.localPosition_ = localPosition_;
        } else {
          result.localPosition_ = localPositionBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (localEulerAngleBuilder_ == null) {
          result.localEulerAngle_ = localEulerAngle_;
        } else {
          result.localEulerAngle_ = localEulerAngleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (localScaleBuilder_ == null) {
          result.localScale_ = localScale_;
        } else {
          result.localScale_ = localScaleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Transform3D.Transform3DData) {
          return mergeFrom((Transform3D.Transform3DData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Transform3D.Transform3DData other) {
        if (other == Transform3D.Transform3DData.getDefaultInstance()) return this;
        if (other.hasInstanceId()) {
          setInstanceId(other.getInstanceId());
        }
        if (other.hasLocalPosition()) {
          mergeLocalPosition(other.getLocalPosition());
        }
        if (other.hasLocalEulerAngle()) {
          mergeLocalEulerAngle(other.getLocalEulerAngle());
        }
        if (other.hasLocalScale()) {
          mergeLocalScale(other.getLocalScale());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Transform3D.Transform3DData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Transform3D.Transform3DData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int instanceId_ ;
      /**
       * <code>optional int32 instanceId = 1;</code>
       */
      public boolean hasInstanceId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 instanceId = 1;</code>
       */
      public int getInstanceId() {
        return instanceId_;
      }
      /**
       * <code>optional int32 instanceId = 1;</code>
       */
      public Builder setInstanceId(int value) {
        bitField0_ |= 0x00000001;
        instanceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 instanceId = 1;</code>
       */
      public Builder clearInstanceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        instanceId_ = 0;
        onChanged();
        return this;
      }

      private Vector3D.Vector3DData localPosition_ = null;
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> localPositionBuilder_;
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public boolean hasLocalPosition() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Vector3D.Vector3DData getLocalPosition() {
        if (localPositionBuilder_ == null) {
          return localPosition_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localPosition_;
        } else {
          return localPositionBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Builder setLocalPosition(Vector3D.Vector3DData value) {
        if (localPositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          localPosition_ = value;
          onChanged();
        } else {
          localPositionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Builder setLocalPosition(
          Vector3D.Vector3DData.Builder builderForValue) {
        if (localPositionBuilder_ == null) {
          localPosition_ = builderForValue.build();
          onChanged();
        } else {
          localPositionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Builder mergeLocalPosition(Vector3D.Vector3DData value) {
        if (localPositionBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              localPosition_ != null &&
              localPosition_ != Vector3D.Vector3DData.getDefaultInstance()) {
            localPosition_ =
              Vector3D.Vector3DData.newBuilder(localPosition_).mergeFrom(value).buildPartial();
          } else {
            localPosition_ = value;
          }
          onChanged();
        } else {
          localPositionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Builder clearLocalPosition() {
        if (localPositionBuilder_ == null) {
          localPosition_ = null;
          onChanged();
        } else {
          localPositionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Vector3D.Vector3DData.Builder getLocalPositionBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLocalPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      public Vector3D.Vector3DDataOrBuilder getLocalPositionOrBuilder() {
        if (localPositionBuilder_ != null) {
          return localPositionBuilder_.getMessageOrBuilder();
        } else {
          return localPosition_ == null ?
              Vector3D.Vector3DData.getDefaultInstance() : localPosition_;
        }
      }
      /**
       * <code>optional .Vector3DData localPosition = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> 
          getLocalPositionFieldBuilder() {
        if (localPositionBuilder_ == null) {
          localPositionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder>(
                  getLocalPosition(),
                  getParentForChildren(),
                  isClean());
          localPosition_ = null;
        }
        return localPositionBuilder_;
      }

      private Vector3D.Vector3DData localEulerAngle_ = null;
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> localEulerAngleBuilder_;
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public boolean hasLocalEulerAngle() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Vector3D.Vector3DData getLocalEulerAngle() {
        if (localEulerAngleBuilder_ == null) {
          return localEulerAngle_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localEulerAngle_;
        } else {
          return localEulerAngleBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Builder setLocalEulerAngle(Vector3D.Vector3DData value) {
        if (localEulerAngleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          localEulerAngle_ = value;
          onChanged();
        } else {
          localEulerAngleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Builder setLocalEulerAngle(
          Vector3D.Vector3DData.Builder builderForValue) {
        if (localEulerAngleBuilder_ == null) {
          localEulerAngle_ = builderForValue.build();
          onChanged();
        } else {
          localEulerAngleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Builder mergeLocalEulerAngle(Vector3D.Vector3DData value) {
        if (localEulerAngleBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              localEulerAngle_ != null &&
              localEulerAngle_ != Vector3D.Vector3DData.getDefaultInstance()) {
            localEulerAngle_ =
              Vector3D.Vector3DData.newBuilder(localEulerAngle_).mergeFrom(value).buildPartial();
          } else {
            localEulerAngle_ = value;
          }
          onChanged();
        } else {
          localEulerAngleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Builder clearLocalEulerAngle() {
        if (localEulerAngleBuilder_ == null) {
          localEulerAngle_ = null;
          onChanged();
        } else {
          localEulerAngleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Vector3D.Vector3DData.Builder getLocalEulerAngleBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLocalEulerAngleFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      public Vector3D.Vector3DDataOrBuilder getLocalEulerAngleOrBuilder() {
        if (localEulerAngleBuilder_ != null) {
          return localEulerAngleBuilder_.getMessageOrBuilder();
        } else {
          return localEulerAngle_ == null ?
              Vector3D.Vector3DData.getDefaultInstance() : localEulerAngle_;
        }
      }
      /**
       * <code>optional .Vector3DData localEulerAngle = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> 
          getLocalEulerAngleFieldBuilder() {
        if (localEulerAngleBuilder_ == null) {
          localEulerAngleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder>(
                  getLocalEulerAngle(),
                  getParentForChildren(),
                  isClean());
          localEulerAngle_ = null;
        }
        return localEulerAngleBuilder_;
      }

      private Vector3D.Vector3DData localScale_ = null;
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> localScaleBuilder_;
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public boolean hasLocalScale() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Vector3D.Vector3DData getLocalScale() {
        if (localScaleBuilder_ == null) {
          return localScale_ == null ? Vector3D.Vector3DData.getDefaultInstance() : localScale_;
        } else {
          return localScaleBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Builder setLocalScale(Vector3D.Vector3DData value) {
        if (localScaleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          localScale_ = value;
          onChanged();
        } else {
          localScaleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Builder setLocalScale(
          Vector3D.Vector3DData.Builder builderForValue) {
        if (localScaleBuilder_ == null) {
          localScale_ = builderForValue.build();
          onChanged();
        } else {
          localScaleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Builder mergeLocalScale(Vector3D.Vector3DData value) {
        if (localScaleBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              localScale_ != null &&
              localScale_ != Vector3D.Vector3DData.getDefaultInstance()) {
            localScale_ =
              Vector3D.Vector3DData.newBuilder(localScale_).mergeFrom(value).buildPartial();
          } else {
            localScale_ = value;
          }
          onChanged();
        } else {
          localScaleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Builder clearLocalScale() {
        if (localScaleBuilder_ == null) {
          localScale_ = null;
          onChanged();
        } else {
          localScaleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Vector3D.Vector3DData.Builder getLocalScaleBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getLocalScaleFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      public Vector3D.Vector3DDataOrBuilder getLocalScaleOrBuilder() {
        if (localScaleBuilder_ != null) {
          return localScaleBuilder_.getMessageOrBuilder();
        } else {
          return localScale_ == null ?
              Vector3D.Vector3DData.getDefaultInstance() : localScale_;
        }
      }
      /**
       * <code>optional .Vector3DData localScale = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder> 
          getLocalScaleFieldBuilder() {
        if (localScaleBuilder_ == null) {
          localScaleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Vector3D.Vector3DData, Vector3D.Vector3DData.Builder, Vector3D.Vector3DDataOrBuilder>(
                  getLocalScale(),
                  getParentForChildren(),
                  isClean());
          localScale_ = null;
        }
        return localScaleBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Transform3DData)
    }

    // @@protoc_insertion_point(class_scope:Transform3DData)
    private static final Transform3D.Transform3DData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Transform3D.Transform3DData();
    }

    public static Transform3D.Transform3DData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<Transform3DData> PARSER =
        new com.google.protobuf.AbstractParser<Transform3DData>() {
      public Transform3DData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Transform3DData(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Transform3DData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Transform3DData> getParserForType() {
      return PARSER;
    }

    public Transform3D.Transform3DData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Transform3DData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Transform3DData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Transform3D.proto\032\016Vector3D.proto\"\226\001\n\017" +
      "Transform3DData\022\022\n\ninstanceId\030\001 \001(\005\022$\n\rl" +
      "ocalPosition\030\002 \001(\0132\r.Vector3DData\022&\n\017loc" +
      "alEulerAngle\030\003 \001(\0132\r.Vector3DData\022!\n\nloc" +
      "alScale\030\004 \001(\0132\r.Vector3DData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          .Vector3D.getDescriptor(),
        }, assigner);
    internal_static_Transform3DData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Transform3DData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Transform3DData_descriptor,
        new java.lang.String[] { "InstanceId", "LocalPosition", "LocalEulerAngle", "LocalScale", });
    Vector3D.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
