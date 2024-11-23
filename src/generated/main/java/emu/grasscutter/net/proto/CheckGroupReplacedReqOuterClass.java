// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckGroupReplacedReq.proto

package emu.grasscutter.net.proto;

public final class CheckGroupReplacedReqOuterClass {
  private CheckGroupReplacedReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CheckGroupReplacedReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CheckGroupReplacedReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @return A list containing the groupIdList.
     */
    java.util.List<java.lang.Integer> getGroupIdListList();
    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @return The count of groupIdList.
     */
    int getGroupIdListCount();
    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The groupIdList at the given index.
     */
    int getGroupIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 29675
   * Obf: JFCBHKJPMPK
   * </pre>
   *
   * Protobuf type {@code CheckGroupReplacedReq}
   */
  public static final class CheckGroupReplacedReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CheckGroupReplacedReq)
      CheckGroupReplacedReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckGroupReplacedReq.newBuilder() to construct.
    private CheckGroupReplacedReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckGroupReplacedReq() {
      groupIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CheckGroupReplacedReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CheckGroupReplacedReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                groupIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              groupIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                groupIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                groupIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          groupIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.internal_static_CheckGroupReplacedReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.internal_static_CheckGroupReplacedReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.class, emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.Builder.class);
    }

    public static final int GROUP_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList groupIdList_;
    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @return A list containing the groupIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGroupIdListList() {
      return groupIdList_;
    }
    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @return The count of groupIdList.
     */
    public int getGroupIdListCount() {
      return groupIdList_.size();
    }
    /**
     * <code>repeated uint32 group_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The groupIdList at the given index.
     */
    public int getGroupIdList(int index) {
      return groupIdList_.getInt(index);
    }
    private int groupIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getGroupIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(groupIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < groupIdList_.size(); i++) {
        output.writeUInt32NoTag(groupIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < groupIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(groupIdList_.getInt(i));
        }
        size += dataSize;
        if (!getGroupIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        groupIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq other = (emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq) obj;

      if (!getGroupIdListList()
          .equals(other.getGroupIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getGroupIdListCount() > 0) {
        hash = (37 * hash) + GROUP_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getGroupIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 29675
     * Obf: JFCBHKJPMPK
     * </pre>
     *
     * Protobuf type {@code CheckGroupReplacedReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CheckGroupReplacedReq)
        emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.internal_static_CheckGroupReplacedReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.internal_static_CheckGroupReplacedReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.class, emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        groupIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.internal_static_CheckGroupReplacedReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq build() {
        emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq buildPartial() {
        emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq result = new emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          groupIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groupIdList_ = groupIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq) {
          return mergeFrom((emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq other) {
        if (other == emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq.getDefaultInstance()) return this;
        if (!other.groupIdList_.isEmpty()) {
          if (groupIdList_.isEmpty()) {
            groupIdList_ = other.groupIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupIdListIsMutable();
            groupIdList_.addAll(other.groupIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList groupIdList_ = emptyIntList();
      private void ensureGroupIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          groupIdList_ = mutableCopy(groupIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @return A list containing the groupIdList.
       */
      public java.util.List<java.lang.Integer>
          getGroupIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(groupIdList_) : groupIdList_;
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @return The count of groupIdList.
       */
      public int getGroupIdListCount() {
        return groupIdList_.size();
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The groupIdList at the given index.
       */
      public int getGroupIdList(int index) {
        return groupIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The groupIdList to set.
       * @return This builder for chaining.
       */
      public Builder setGroupIdList(
          int index, int value) {
        ensureGroupIdListIsMutable();
        groupIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @param value The groupIdList to add.
       * @return This builder for chaining.
       */
      public Builder addGroupIdList(int value) {
        ensureGroupIdListIsMutable();
        groupIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @param values The groupIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGroupIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGroupIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groupIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 group_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupIdList() {
        groupIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CheckGroupReplacedReq)
    }

    // @@protoc_insertion_point(class_scope:CheckGroupReplacedReq)
    private static final emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq();
    }

    public static emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CheckGroupReplacedReq>
        PARSER = new com.google.protobuf.AbstractParser<CheckGroupReplacedReq>() {
      @java.lang.Override
      public CheckGroupReplacedReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CheckGroupReplacedReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CheckGroupReplacedReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CheckGroupReplacedReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CheckGroupReplacedReqOuterClass.CheckGroupReplacedReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CheckGroupReplacedReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CheckGroupReplacedReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CheckGroupReplacedReq.proto\".\n\025CheckGr" +
      "oupReplacedReq\022\025\n\rgroup_id_list\030\n \003(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CheckGroupReplacedReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CheckGroupReplacedReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CheckGroupReplacedReq_descriptor,
        new java.lang.String[] { "GroupIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
