// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handler.proto

package grpc.generated;

import com.google.protobuf.CodedInputStream;

/**
 * Protobuf type {@code User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:User)
        UserOrBuilder {
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    id_ = 0L;
    userName_ = "";
    realName_ = "";
    instituteId_ = 0L;
    password_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private User(
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
          case 8: {

            id_ = input.readUInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            realName_ = s;
            break;
          }
          case 32: {

            instituteId_ = input.readUInt64();
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            password_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Handler.internal_static_User_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Handler.internal_static_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            User.class, User.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile Object userName_;
  /**
   * <code>string userName = 2;</code>
   */
  public String getUserName() {
    Object ref = userName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    Object ref = userName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REALNAME_FIELD_NUMBER = 3;
  private volatile Object realName_;
  /**
   * <code>string realName = 3;</code>
   */
  public String getRealName() {
    Object ref = realName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      realName_ = s;
      return s;
    }
  }
  /**
   * <code>string realName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRealNameBytes() {
    Object ref = realName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      realName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTITUTEID_FIELD_NUMBER = 4;
  private long instituteId_;
  /**
   * <code>uint64 instituteId = 4;</code>
   */
  public long getInstituteId() {
    return instituteId_;
  }

  public static final int PASSWORD_FIELD_NUMBER = 5;
  private volatile Object password_;
  /**
   * <code>string password = 5;</code>
   */
  public String getPassword() {
    Object ref = password_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    Object ref = password_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!getRealNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, realName_);
    }
    if (instituteId_ != 0L) {
      output.writeUInt64(4, instituteId_);
    }
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, password_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!getRealNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, realName_);
    }
    if (instituteId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, instituteId_);
    }
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, password_);
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
    if (!(obj instanceof User)) {
      return super.equals(obj);
    }
    User other = (User) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getRealName()
        .equals(other.getRealName());
    result = result && (getInstituteId()
        == other.getInstituteId());
    result = result && getPassword()
        .equals(other.getPassword());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + REALNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRealName().hashCode();
    hash = (37 * hash) + INSTITUTEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInstituteId());
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(CodedInputStream.newInstance(data));
  }
  public static User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(CodedInputStream.newInstance(data), extensionRegistry);
  }
  public static User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static User parseFrom(
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
  public static Builder newBuilder(User prototype) {
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
   * Protobuf type {@code User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:User)
          UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Handler.internal_static_User_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Handler.internal_static_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              User.class, User.Builder.class);
    }

    // Construct using kurovszky.robin.unicalendar.web_service.grpc.generated.User.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      userName_ = "";

      realName_ = "";

      instituteId_ = 0L;

      password_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Handler.internal_static_User_descriptor;
    }

    public User getDefaultInstanceForType() {
      return User.getDefaultInstance();
    }

    public User build() {
      User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public User buildPartial() {
      User result = new User(this);
      result.id_ = id_;
      result.userName_ = userName_;
      result.realName_ = realName_;
      result.instituteId_ = instituteId_;
      result.password_ = password_;
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
      if (other instanceof User) {
        return mergeFrom((User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(User other) {
      if (other == User.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getRealName().isEmpty()) {
        realName_ = other.realName_;
        onChanged();
      }
      if (other.getInstituteId() != 0L) {
        setInstituteId(other.getInstituteId());
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
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
      User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder setId(long value) {

      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder clearId() {

      id_ = 0L;
      onChanged();
      return this;
    }

    private Object userName_ = "";
    /**
     * <code>string userName = 2;</code>
     */
    public String getUserName() {
      Object ref = userName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string userName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder setUserName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder clearUserName() {

      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 2;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      userName_ = value;
      onChanged();
      return this;
    }

    private Object realName_ = "";
    /**
     * <code>string realName = 3;</code>
     */
    public String getRealName() {
      Object ref = realName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        realName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string realName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRealNameBytes() {
      Object ref = realName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        realName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string realName = 3;</code>
     */
    public Builder setRealName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      realName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string realName = 3;</code>
     */
    public Builder clearRealName() {

      realName_ = getDefaultInstance().getRealName();
      onChanged();
      return this;
    }
    /**
     * <code>string realName = 3;</code>
     */
    public Builder setRealNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      realName_ = value;
      onChanged();
      return this;
    }

    private long instituteId_ ;
    /**
     * <code>uint64 instituteId = 4;</code>
     */
    public long getInstituteId() {
      return instituteId_;
    }
    /**
     * <code>uint64 instituteId = 4;</code>
     */
    public Builder setInstituteId(long value) {

      instituteId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 instituteId = 4;</code>
     */
    public Builder clearInstituteId() {

      instituteId_ = 0L;
      onChanged();
      return this;
    }

    private Object password_ = "";
    /**
     * <code>string password = 5;</code>
     */
    public String getPassword() {
      Object ref = password_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string password = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 5;</code>
     */
    public Builder setPassword(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 5;</code>
     */
    public Builder clearPassword() {

      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string password = 5;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      password_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:User)
  }

  // @@protoc_insertion_point(class_scope:User)
  private static final User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new User();
  }

  public static User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  public User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

