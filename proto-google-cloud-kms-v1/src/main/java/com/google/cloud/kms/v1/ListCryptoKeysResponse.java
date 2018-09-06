// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Response message for [KeyManagementService.ListCryptoKeys][google.cloud.kms.v1.KeyManagementService.ListCryptoKeys].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.ListCryptoKeysResponse}
 */
public  final class ListCryptoKeysResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.ListCryptoKeysResponse)
    ListCryptoKeysResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCryptoKeysResponse.newBuilder() to construct.
  private ListCryptoKeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCryptoKeysResponse() {
    cryptoKeys_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
    totalSize_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCryptoKeysResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              cryptoKeys_ = new java.util.ArrayList<com.google.cloud.kms.v1.CryptoKey>();
              mutable_bitField0_ |= 0x00000001;
            }
            cryptoKeys_.add(
                input.readMessage(com.google.cloud.kms.v1.CryptoKey.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          case 24: {

            totalSize_ = input.readInt32();
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
        cryptoKeys_ = java.util.Collections.unmodifiableList(cryptoKeys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListCryptoKeysResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListCryptoKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.ListCryptoKeysResponse.class, com.google.cloud.kms.v1.ListCryptoKeysResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CRYPTO_KEYS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.kms.v1.CryptoKey> cryptoKeys_;
  /**
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  public java.util.List<com.google.cloud.kms.v1.CryptoKey> getCryptoKeysList() {
    return cryptoKeys_;
  }
  /**
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.kms.v1.CryptoKeyOrBuilder> 
      getCryptoKeysOrBuilderList() {
    return cryptoKeys_;
  }
  /**
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  public int getCryptoKeysCount() {
    return cryptoKeys_.size();
  }
  /**
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  public com.google.cloud.kms.v1.CryptoKey getCryptoKeys(int index) {
    return cryptoKeys_.get(index);
  }
  /**
   * <pre>
   * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
   */
  public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeysOrBuilder(
      int index) {
    return cryptoKeys_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_;
  /**
   * <pre>
   * The total number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] that matched the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   */
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < cryptoKeys_.size(); i++) {
      output.writeMessage(1, cryptoKeys_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cryptoKeys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cryptoKeys_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.ListCryptoKeysResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.ListCryptoKeysResponse other = (com.google.cloud.kms.v1.ListCryptoKeysResponse) obj;

    boolean result = true;
    result = result && getCryptoKeysList()
        .equals(other.getCryptoKeysList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && (getTotalSize()
        == other.getTotalSize());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCryptoKeysCount() > 0) {
      hash = (37 * hash) + CRYPTO_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKeysList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListCryptoKeysResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.kms.v1.ListCryptoKeysResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Response message for [KeyManagementService.ListCryptoKeys][google.cloud.kms.v1.KeyManagementService.ListCryptoKeys].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.ListCryptoKeysResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.ListCryptoKeysResponse)
      com.google.cloud.kms.v1.ListCryptoKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListCryptoKeysResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListCryptoKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.ListCryptoKeysResponse.class, com.google.cloud.kms.v1.ListCryptoKeysResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.ListCryptoKeysResponse.newBuilder()
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
        getCryptoKeysFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (cryptoKeysBuilder_ == null) {
        cryptoKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cryptoKeysBuilder_.clear();
      }
      nextPageToken_ = "";

      totalSize_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListCryptoKeysResponse_descriptor;
    }

    public com.google.cloud.kms.v1.ListCryptoKeysResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.ListCryptoKeysResponse.getDefaultInstance();
    }

    public com.google.cloud.kms.v1.ListCryptoKeysResponse build() {
      com.google.cloud.kms.v1.ListCryptoKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.kms.v1.ListCryptoKeysResponse buildPartial() {
      com.google.cloud.kms.v1.ListCryptoKeysResponse result = new com.google.cloud.kms.v1.ListCryptoKeysResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (cryptoKeysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          cryptoKeys_ = java.util.Collections.unmodifiableList(cryptoKeys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cryptoKeys_ = cryptoKeys_;
      } else {
        result.cryptoKeys_ = cryptoKeysBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.totalSize_ = totalSize_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.ListCryptoKeysResponse) {
        return mergeFrom((com.google.cloud.kms.v1.ListCryptoKeysResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.ListCryptoKeysResponse other) {
      if (other == com.google.cloud.kms.v1.ListCryptoKeysResponse.getDefaultInstance()) return this;
      if (cryptoKeysBuilder_ == null) {
        if (!other.cryptoKeys_.isEmpty()) {
          if (cryptoKeys_.isEmpty()) {
            cryptoKeys_ = other.cryptoKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCryptoKeysIsMutable();
            cryptoKeys_.addAll(other.cryptoKeys_);
          }
          onChanged();
        }
      } else {
        if (!other.cryptoKeys_.isEmpty()) {
          if (cryptoKeysBuilder_.isEmpty()) {
            cryptoKeysBuilder_.dispose();
            cryptoKeysBuilder_ = null;
            cryptoKeys_ = other.cryptoKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cryptoKeysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCryptoKeysFieldBuilder() : null;
          } else {
            cryptoKeysBuilder_.addAllMessages(other.cryptoKeys_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
      com.google.cloud.kms.v1.ListCryptoKeysResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.ListCryptoKeysResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.kms.v1.CryptoKey> cryptoKeys_ =
      java.util.Collections.emptyList();
    private void ensureCryptoKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        cryptoKeys_ = new java.util.ArrayList<com.google.cloud.kms.v1.CryptoKey>(cryptoKeys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.CryptoKey, com.google.cloud.kms.v1.CryptoKey.Builder, com.google.cloud.kms.v1.CryptoKeyOrBuilder> cryptoKeysBuilder_;

    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.CryptoKey> getCryptoKeysList() {
      if (cryptoKeysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cryptoKeys_);
      } else {
        return cryptoKeysBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public int getCryptoKeysCount() {
      if (cryptoKeysBuilder_ == null) {
        return cryptoKeys_.size();
      } else {
        return cryptoKeysBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public com.google.cloud.kms.v1.CryptoKey getCryptoKeys(int index) {
      if (cryptoKeysBuilder_ == null) {
        return cryptoKeys_.get(index);
      } else {
        return cryptoKeysBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder setCryptoKeys(
        int index, com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCryptoKeysIsMutable();
        cryptoKeys_.set(index, value);
        onChanged();
      } else {
        cryptoKeysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder setCryptoKeys(
        int index, com.google.cloud.kms.v1.CryptoKey.Builder builderForValue) {
      if (cryptoKeysBuilder_ == null) {
        ensureCryptoKeysIsMutable();
        cryptoKeys_.set(index, builderForValue.build());
        onChanged();
      } else {
        cryptoKeysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder addCryptoKeys(com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCryptoKeysIsMutable();
        cryptoKeys_.add(value);
        onChanged();
      } else {
        cryptoKeysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder addCryptoKeys(
        int index, com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCryptoKeysIsMutable();
        cryptoKeys_.add(index, value);
        onChanged();
      } else {
        cryptoKeysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder addCryptoKeys(
        com.google.cloud.kms.v1.CryptoKey.Builder builderForValue) {
      if (cryptoKeysBuilder_ == null) {
        ensureCryptoKeysIsMutable();
        cryptoKeys_.add(builderForValue.build());
        onChanged();
      } else {
        cryptoKeysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder addCryptoKeys(
        int index, com.google.cloud.kms.v1.CryptoKey.Builder builderForValue) {
      if (cryptoKeysBuilder_ == null) {
        ensureCryptoKeysIsMutable();
        cryptoKeys_.add(index, builderForValue.build());
        onChanged();
      } else {
        cryptoKeysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder addAllCryptoKeys(
        java.lang.Iterable<? extends com.google.cloud.kms.v1.CryptoKey> values) {
      if (cryptoKeysBuilder_ == null) {
        ensureCryptoKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cryptoKeys_);
        onChanged();
      } else {
        cryptoKeysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder clearCryptoKeys() {
      if (cryptoKeysBuilder_ == null) {
        cryptoKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cryptoKeysBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public Builder removeCryptoKeys(int index) {
      if (cryptoKeysBuilder_ == null) {
        ensureCryptoKeysIsMutable();
        cryptoKeys_.remove(index);
        onChanged();
      } else {
        cryptoKeysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public com.google.cloud.kms.v1.CryptoKey.Builder getCryptoKeysBuilder(
        int index) {
      return getCryptoKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeysOrBuilder(
        int index) {
      if (cryptoKeysBuilder_ == null) {
        return cryptoKeys_.get(index);  } else {
        return cryptoKeysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.kms.v1.CryptoKeyOrBuilder> 
         getCryptoKeysOrBuilderList() {
      if (cryptoKeysBuilder_ != null) {
        return cryptoKeysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cryptoKeys_);
      }
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public com.google.cloud.kms.v1.CryptoKey.Builder addCryptoKeysBuilder() {
      return getCryptoKeysFieldBuilder().addBuilder(
          com.google.cloud.kms.v1.CryptoKey.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public com.google.cloud.kms.v1.CryptoKey.Builder addCryptoKeysBuilder(
        int index) {
      return getCryptoKeysFieldBuilder().addBuilder(
          index, com.google.cloud.kms.v1.CryptoKey.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [CryptoKeys][google.cloud.kms.v1.CryptoKey].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.CryptoKey crypto_keys = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.CryptoKey.Builder> 
         getCryptoKeysBuilderList() {
      return getCryptoKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.CryptoKey, com.google.cloud.kms.v1.CryptoKey.Builder, com.google.cloud.kms.v1.CryptoKeyOrBuilder> 
        getCryptoKeysFieldBuilder() {
      if (cryptoKeysBuilder_ == null) {
        cryptoKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKey, com.google.cloud.kms.v1.CryptoKey.Builder, com.google.cloud.kms.v1.CryptoKeyOrBuilder>(
                cryptoKeys_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        cryptoKeys_ = null;
      }
      return cryptoKeysBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListCryptoKeysRequest.page_token][google.cloud.kms.v1.ListCryptoKeysRequest.page_token] to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }

    private int totalSize_ ;
    /**
     * <pre>
     * The total number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     */
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The total number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     */
    public Builder setTotalSize(int value) {
      
      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of [CryptoKeys][google.cloud.kms.v1.CryptoKey] that matched the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     */
    public Builder clearTotalSize() {
      
      totalSize_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.ListCryptoKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.ListCryptoKeysResponse)
  private static final com.google.cloud.kms.v1.ListCryptoKeysResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.ListCryptoKeysResponse();
  }

  public static com.google.cloud.kms.v1.ListCryptoKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCryptoKeysResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCryptoKeysResponse>() {
    public ListCryptoKeysResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListCryptoKeysResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCryptoKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCryptoKeysResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.kms.v1.ListCryptoKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

