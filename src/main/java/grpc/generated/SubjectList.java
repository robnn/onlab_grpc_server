// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handler.proto

package grpc.generated;

import com.google.protobuf.CodedInputStream;

/**
 * Protobuf type {@code SubjectList}
 */
public  final class SubjectList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SubjectList)
        SubjectListOrBuilder {
  // Use SubjectList.newBuilder() to construct.
  private SubjectList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubjectList() {
    subjects_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubjectList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              subjects_ = new java.util.ArrayList<Subject>();
              mutable_bitField0_ |= 0x00000001;
            }
            subjects_.add(
                input.readMessage(Subject.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        subjects_ = java.util.Collections.unmodifiableList(subjects_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Handler.internal_static_SubjectList_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Handler.internal_static_SubjectList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SubjectList.class, SubjectList.Builder.class);
  }

  public static final int SUBJECTS_FIELD_NUMBER = 1;
  private java.util.List<Subject> subjects_;
  /**
   * <code>repeated .Subject subjects = 1;</code>
   */
  public java.util.List<Subject> getSubjectsList() {
    return subjects_;
  }
  /**
   * <code>repeated .Subject subjects = 1;</code>
   */
  public java.util.List<? extends SubjectOrBuilder>
      getSubjectsOrBuilderList() {
    return subjects_;
  }
  /**
   * <code>repeated .Subject subjects = 1;</code>
   */
  public int getSubjectsCount() {
    return subjects_.size();
  }
  /**
   * <code>repeated .Subject subjects = 1;</code>
   */
  public Subject getSubjects(int index) {
    return subjects_.get(index);
  }
  /**
   * <code>repeated .Subject subjects = 1;</code>
   */
  public SubjectOrBuilder getSubjectsOrBuilder(
      int index) {
    return subjects_.get(index);
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
    for (int i = 0; i < subjects_.size(); i++) {
      output.writeMessage(1, subjects_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subjects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subjects_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SubjectList)) {
      return super.equals(obj);
    }
    SubjectList other = (SubjectList) obj;

    boolean result = true;
    result = result && getSubjectsList()
        .equals(other.getSubjectsList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSubjectsCount() > 0) {
      hash = (37 * hash) + SUBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SubjectList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(CodedInputStream.newInstance(data));
  }
  public static SubjectList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(CodedInputStream.newInstance(data), extensionRegistry);
  }
  public static SubjectList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SubjectList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SubjectList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SubjectList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SubjectList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SubjectList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SubjectList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SubjectList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SubjectList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SubjectList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SubjectList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SubjectList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SubjectList)
          SubjectListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Handler.internal_static_SubjectList_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Handler.internal_static_SubjectList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SubjectList.class, SubjectList.Builder.class);
    }

    // Construct using kurovszky.robin.unicalendar.web_service.grpc.generated.SubjectList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSubjectsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (subjectsBuilder_ == null) {
        subjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        subjectsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Handler.internal_static_SubjectList_descriptor;
    }

    public SubjectList getDefaultInstanceForType() {
      return SubjectList.getDefaultInstance();
    }

    public SubjectList build() {
      SubjectList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SubjectList buildPartial() {
      SubjectList result = new SubjectList(this);
      int from_bitField0_ = bitField0_;
      if (subjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          subjects_ = java.util.Collections.unmodifiableList(subjects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subjects_ = subjects_;
      } else {
        result.subjects_ = subjectsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SubjectList) {
        return mergeFrom((SubjectList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SubjectList other) {
      if (other == SubjectList.getDefaultInstance()) return this;
      if (subjectsBuilder_ == null) {
        if (!other.subjects_.isEmpty()) {
          if (subjects_.isEmpty()) {
            subjects_ = other.subjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubjectsIsMutable();
            subjects_.addAll(other.subjects_);
          }
          onChanged();
        }
      } else {
        if (!other.subjects_.isEmpty()) {
          if (subjectsBuilder_.isEmpty()) {
            subjectsBuilder_.dispose();
            subjectsBuilder_ = null;
            subjects_ = other.subjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subjectsBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubjectsFieldBuilder() : null;
          } else {
            subjectsBuilder_.addAllMessages(other.subjects_);
          }
        }
      }
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
      SubjectList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SubjectList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Subject> subjects_ =
      java.util.Collections.emptyList();
    private void ensureSubjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        subjects_ = new java.util.ArrayList<Subject>(subjects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            Subject, Subject.Builder, SubjectOrBuilder> subjectsBuilder_;

    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public java.util.List<Subject> getSubjectsList() {
      if (subjectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subjects_);
      } else {
        return subjectsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public int getSubjectsCount() {
      if (subjectsBuilder_ == null) {
        return subjects_.size();
      } else {
        return subjectsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Subject getSubjects(int index) {
      if (subjectsBuilder_ == null) {
        return subjects_.get(index);
      } else {
        return subjectsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder setSubjects(
        int index, Subject value) {
      if (subjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectsIsMutable();
        subjects_.set(index, value);
        onChanged();
      } else {
        subjectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder setSubjects(
        int index, Subject.Builder builderForValue) {
      if (subjectsBuilder_ == null) {
        ensureSubjectsIsMutable();
        subjects_.set(index, builderForValue.build());
        onChanged();
      } else {
        subjectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder addSubjects(Subject value) {
      if (subjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectsIsMutable();
        subjects_.add(value);
        onChanged();
      } else {
        subjectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder addSubjects(
        int index, Subject value) {
      if (subjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectsIsMutable();
        subjects_.add(index, value);
        onChanged();
      } else {
        subjectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder addSubjects(
        Subject.Builder builderForValue) {
      if (subjectsBuilder_ == null) {
        ensureSubjectsIsMutable();
        subjects_.add(builderForValue.build());
        onChanged();
      } else {
        subjectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder addSubjects(
        int index, Subject.Builder builderForValue) {
      if (subjectsBuilder_ == null) {
        ensureSubjectsIsMutable();
        subjects_.add(index, builderForValue.build());
        onChanged();
      } else {
        subjectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder addAllSubjects(
        Iterable<? extends Subject> values) {
      if (subjectsBuilder_ == null) {
        ensureSubjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subjects_);
        onChanged();
      } else {
        subjectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder clearSubjects() {
      if (subjectsBuilder_ == null) {
        subjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subjectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Builder removeSubjects(int index) {
      if (subjectsBuilder_ == null) {
        ensureSubjectsIsMutable();
        subjects_.remove(index);
        onChanged();
      } else {
        subjectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Subject.Builder getSubjectsBuilder(
        int index) {
      return getSubjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public SubjectOrBuilder getSubjectsOrBuilder(
        int index) {
      if (subjectsBuilder_ == null) {
        return subjects_.get(index);  } else {
        return subjectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public java.util.List<? extends SubjectOrBuilder>
         getSubjectsOrBuilderList() {
      if (subjectsBuilder_ != null) {
        return subjectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subjects_);
      }
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Subject.Builder addSubjectsBuilder() {
      return getSubjectsFieldBuilder().addBuilder(
          Subject.getDefaultInstance());
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public Subject.Builder addSubjectsBuilder(
        int index) {
      return getSubjectsFieldBuilder().addBuilder(
          index, Subject.getDefaultInstance());
    }
    /**
     * <code>repeated .Subject subjects = 1;</code>
     */
    public java.util.List<Subject.Builder>
         getSubjectsBuilderList() {
      return getSubjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            Subject, Subject.Builder, SubjectOrBuilder>
        getSubjectsFieldBuilder() {
      if (subjectsBuilder_ == null) {
        subjectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                Subject, Subject.Builder, SubjectOrBuilder>(
                subjects_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        subjects_ = null;
      }
      return subjectsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:SubjectList)
  }

  // @@protoc_insertion_point(class_scope:SubjectList)
  private static final SubjectList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SubjectList();
  }

  public static SubjectList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubjectList>
      PARSER = new com.google.protobuf.AbstractParser<SubjectList>() {
    public SubjectList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubjectList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubjectList> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SubjectList> getParserForType() {
    return PARSER;
  }

  public SubjectList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

