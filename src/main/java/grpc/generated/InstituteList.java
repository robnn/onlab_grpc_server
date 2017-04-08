// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handler.proto

package grpc.generated;

/**
 * Protobuf type {@code InstituteList}
 */
public final class InstituteList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:InstituteList)
    InstituteListOrBuilder {
  // Use InstituteList.newBuilder() to construct.
  private InstituteList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private InstituteList(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final InstituteList defaultInstance;
  public static InstituteList getDefaultInstance() {
    return defaultInstance;
  }

  public InstituteList getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private InstituteList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              institutes_ = new java.util.ArrayList<Institute>();
              mutable_bitField0_ |= 0x00000001;
            }
            institutes_.add(input.readMessage(Institute.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        institutes_ = java.util.Collections.unmodifiableList(institutes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Handler.internal_static_InstituteList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Handler.internal_static_InstituteList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            InstituteList.class, InstituteList.Builder.class);
  }

  public static com.google.protobuf.Parser<InstituteList> PARSER =
      new com.google.protobuf.AbstractParser<InstituteList>() {
    public InstituteList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstituteList(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<InstituteList> getParserForType() {
    return PARSER;
  }

  public static final int INSTITUTES_FIELD_NUMBER = 1;
  private java.util.List<Institute> institutes_;
  /**
   * <code>repeated .Institute institutes = 1;</code>
   */
  public java.util.List<Institute> getInstitutesList() {
    return institutes_;
  }
  /**
   * <code>repeated .Institute institutes = 1;</code>
   */
  public java.util.List<? extends InstituteOrBuilder>
      getInstitutesOrBuilderList() {
    return institutes_;
  }
  /**
   * <code>repeated .Institute institutes = 1;</code>
   */
  public int getInstitutesCount() {
    return institutes_.size();
  }
  /**
   * <code>repeated .Institute institutes = 1;</code>
   */
  public Institute getInstitutes(int index) {
    return institutes_.get(index);
  }
  /**
   * <code>repeated .Institute institutes = 1;</code>
   */
  public InstituteOrBuilder getInstitutesOrBuilder(
      int index) {
    return institutes_.get(index);
  }

  private void initFields() {
    institutes_ = java.util.Collections.emptyList();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getInstitutesCount(); i++) {
      if (!getInstitutes(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < institutes_.size(); i++) {
      output.writeMessage(1, institutes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < institutes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, institutes_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static InstituteList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static InstituteList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static InstituteList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static InstituteList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static InstituteList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static InstituteList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static InstituteList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static InstituteList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static InstituteList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static InstituteList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(InstituteList prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code InstituteList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InstituteList)
          InstituteListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Handler.internal_static_InstituteList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Handler.internal_static_InstituteList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              InstituteList.class, InstituteList.Builder.class);
    }

    // Construct using grpc.generated.InstituteList.newBuilder()
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
        getInstitutesFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (institutesBuilder_ == null) {
        institutes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        institutesBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Handler.internal_static_InstituteList_descriptor;
    }

    public InstituteList getDefaultInstanceForType() {
      return InstituteList.getDefaultInstance();
    }

    public InstituteList build() {
      InstituteList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public InstituteList buildPartial() {
      InstituteList result = new InstituteList(this);
      int from_bitField0_ = bitField0_;
      if (institutesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          institutes_ = java.util.Collections.unmodifiableList(institutes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.institutes_ = institutes_;
      } else {
        result.institutes_ = institutesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof InstituteList) {
        return mergeFrom((InstituteList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(InstituteList other) {
      if (other == InstituteList.getDefaultInstance()) return this;
      if (institutesBuilder_ == null) {
        if (!other.institutes_.isEmpty()) {
          if (institutes_.isEmpty()) {
            institutes_ = other.institutes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstitutesIsMutable();
            institutes_.addAll(other.institutes_);
          }
          onChanged();
        }
      } else {
        if (!other.institutes_.isEmpty()) {
          if (institutesBuilder_.isEmpty()) {
            institutesBuilder_.dispose();
            institutesBuilder_ = null;
            institutes_ = other.institutes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            institutesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getInstitutesFieldBuilder() : null;
          } else {
            institutesBuilder_.addAllMessages(other.institutes_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getInstitutesCount(); i++) {
        if (!getInstitutes(i).isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      InstituteList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (InstituteList) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Institute> institutes_ =
      java.util.Collections.emptyList();
    private void ensureInstitutesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        institutes_ = new java.util.ArrayList<Institute>(institutes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
            Institute, Institute.Builder, InstituteOrBuilder> institutesBuilder_;

    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public java.util.List<Institute> getInstitutesList() {
      if (institutesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(institutes_);
      } else {
        return institutesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public int getInstitutesCount() {
      if (institutesBuilder_ == null) {
        return institutes_.size();
      } else {
        return institutesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Institute getInstitutes(int index) {
      if (institutesBuilder_ == null) {
        return institutes_.get(index);
      } else {
        return institutesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder setInstitutes(
        int index, Institute value) {
      if (institutesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstitutesIsMutable();
        institutes_.set(index, value);
        onChanged();
      } else {
        institutesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder setInstitutes(
        int index, Institute.Builder builderForValue) {
      if (institutesBuilder_ == null) {
        ensureInstitutesIsMutable();
        institutes_.set(index, builderForValue.build());
        onChanged();
      } else {
        institutesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder addInstitutes(Institute value) {
      if (institutesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstitutesIsMutable();
        institutes_.add(value);
        onChanged();
      } else {
        institutesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder addInstitutes(
        int index, Institute value) {
      if (institutesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstitutesIsMutable();
        institutes_.add(index, value);
        onChanged();
      } else {
        institutesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder addInstitutes(
        Institute.Builder builderForValue) {
      if (institutesBuilder_ == null) {
        ensureInstitutesIsMutable();
        institutes_.add(builderForValue.build());
        onChanged();
      } else {
        institutesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder addInstitutes(
        int index, Institute.Builder builderForValue) {
      if (institutesBuilder_ == null) {
        ensureInstitutesIsMutable();
        institutes_.add(index, builderForValue.build());
        onChanged();
      } else {
        institutesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder addAllInstitutes(
        java.lang.Iterable<? extends Institute> values) {
      if (institutesBuilder_ == null) {
        ensureInstitutesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, institutes_);
        onChanged();
      } else {
        institutesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder clearInstitutes() {
      if (institutesBuilder_ == null) {
        institutes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        institutesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Builder removeInstitutes(int index) {
      if (institutesBuilder_ == null) {
        ensureInstitutesIsMutable();
        institutes_.remove(index);
        onChanged();
      } else {
        institutesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Institute.Builder getInstitutesBuilder(
        int index) {
      return getInstitutesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public InstituteOrBuilder getInstitutesOrBuilder(
        int index) {
      if (institutesBuilder_ == null) {
        return institutes_.get(index);  } else {
        return institutesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public java.util.List<? extends InstituteOrBuilder>
         getInstitutesOrBuilderList() {
      if (institutesBuilder_ != null) {
        return institutesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(institutes_);
      }
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Institute.Builder addInstitutesBuilder() {
      return getInstitutesFieldBuilder().addBuilder(
          Institute.getDefaultInstance());
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public Institute.Builder addInstitutesBuilder(
        int index) {
      return getInstitutesFieldBuilder().addBuilder(
          index, Institute.getDefaultInstance());
    }
    /**
     * <code>repeated .Institute institutes = 1;</code>
     */
    public java.util.List<Institute.Builder>
         getInstitutesBuilderList() {
      return getInstitutesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
            Institute, Institute.Builder, InstituteOrBuilder>
        getInstitutesFieldBuilder() {
      if (institutesBuilder_ == null) {
        institutesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                Institute, Institute.Builder, InstituteOrBuilder>(
                institutes_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        institutes_ = null;
      }
      return institutesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:InstituteList)
  }

  static {
    defaultInstance = new InstituteList(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:InstituteList)
}
