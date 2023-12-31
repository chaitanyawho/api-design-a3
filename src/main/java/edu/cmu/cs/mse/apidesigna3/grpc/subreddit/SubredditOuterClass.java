// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subreddit.proto

package edu.cmu.cs.mse.apidesigna3.grpc.subreddit;

public final class SubredditOuterClass {

	private static final com.google.protobuf.Descriptors.Descriptor
		internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor;
	private static final
	com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_fieldAccessorTable;
	private static final com.google.protobuf.Descriptors.FileDescriptor
		descriptor;

	static {
		String[] descriptorData = {
			"\n\017subreddit.proto\022*edu.cmu.cs.mse.apides" +
				"igna3.model.subreddit\"\263\001\n\tSubreddit\022\014\n\004n" +
				"ame\030\001 \001(\t\022S\n\005state\030\002 \001(\0162D.edu.cmu.cs.ms" +
				"e.apidesigna3.model.subreddit.Subreddit." +
				"SubredditState\022\014\n\004tags\030\003 \003(\t\"5\n\016Subreddi" +
				"tState\022\n\n\006PUBLIC\020\000\022\013\n\007PRIVATE\020\001\022\n\n\006HIDDE" +
				"N\020\002b\006proto3"
		};
		descriptor = com.google.protobuf.Descriptors.FileDescriptor
			.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[]{
				});
		internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor =
			getDescriptor().getMessageTypes().get(0);
		internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_fieldAccessorTable = new
			com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
			internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor,
			new String[]{"Name", "State", "Tags",});
	}

	private SubredditOuterClass() {
	}

	public static void registerAllExtensions(
		com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(
		com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions(
			(com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}

	public interface SubredditOrBuilder extends
		// @@protoc_insertion_point(interface_extends:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit)
		com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>string name = 1;</code>
		 *
		 * @return The name.
		 */
		String getName();

		/**
		 * <code>string name = 1;</code>
		 *
		 * @return The bytes for name.
		 */
		com.google.protobuf.ByteString
		getNameBytes();

		/**
		 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
		 * 2;</code>
		 *
		 * @return The enum numeric value on the wire for state.
		 */
		int getStateValue();

		/**
		 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
		 * 2;</code>
		 *
		 * @return The state.
		 */
		Subreddit.SubredditState getState();

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @return A list containing the tags.
		 */
		java.util.List<String>
		getTagsList();

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @return The count of tags.
		 */
		int getTagsCount();

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @param index The index of the element to return.
		 * @return The tags at the given index.
		 */
		String getTags(int index);

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @param index The index of the value to return.
		 * @return The bytes of the tags at the given index.
		 */
		com.google.protobuf.ByteString
		getTagsBytes(int index);
	}

	/**
	 * Protobuf type {@code edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit}
	 */
	public static final class Subreddit extends
		com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit)
		SubredditOrBuilder {

		public static final int NAME_FIELD_NUMBER = 1;
		public static final int STATE_FIELD_NUMBER = 2;
		public static final int TAGS_FIELD_NUMBER = 3;
		private static final long serialVersionUID = 0L;
		// @@protoc_insertion_point(class_scope:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit)
		private static final Subreddit DEFAULT_INSTANCE;
		private static final com.google.protobuf.Parser<Subreddit>
			PARSER = new com.google.protobuf.AbstractParser<Subreddit>() {
			@Override
			public Subreddit parsePartialFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
				Builder builder = newBuilder();
				try {
					builder.mergeFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					throw e.setUnfinishedMessage(builder.buildPartial());
				} catch (com.google.protobuf.UninitializedMessageException e) {
					throw e.asInvalidProtocolBufferException()
						.setUnfinishedMessage(builder.buildPartial());
				} catch (java.io.IOException e) {
					throw new com.google.protobuf.InvalidProtocolBufferException(e)
						.setUnfinishedMessage(builder.buildPartial());
				}
				return builder.buildPartial();
			}
		};

		static {
			DEFAULT_INSTANCE = new Subreddit();
		}

		@SuppressWarnings("serial")
		private volatile Object name_ = "";
		private int state_ = 0;
		@SuppressWarnings("serial")
		private com.google.protobuf.LazyStringArrayList tags_ =
			com.google.protobuf.LazyStringArrayList.emptyList();
		private byte memoizedIsInitialized = -1;

		// Use Subreddit.newBuilder() to construct.
		private Subreddit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private Subreddit() {
			name_ = "";
			state_ = 0;
			tags_ =
				com.google.protobuf.LazyStringArrayList.emptyList();
		}

		public static com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return SubredditOuterClass.internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor;
		}

		public static Subreddit parseFrom(
			java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static Subreddit parseFrom(
			java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static Subreddit parseFrom(
			com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static Subreddit parseFrom(
			com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static Subreddit parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static Subreddit parseFrom(
			byte[] data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static Subreddit parseFrom(java.io.InputStream input)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
		}

		public static Subreddit parseFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static Subreddit parseDelimitedFrom(java.io.InputStream input)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input);
		}

		public static Subreddit parseDelimitedFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
		}

		public static Subreddit parseFrom(
			com.google.protobuf.CodedInputStream input)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
		}

		public static Subreddit parseFrom(
			com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(Subreddit prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public static Subreddit getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		public static com.google.protobuf.Parser<Subreddit> parser() {
			return PARSER;
		}

		@Override
		@SuppressWarnings({"unused"})
		protected Object newInstance(
			UnusedPrivateParameter unused) {
			return new Subreddit();
		}

		@Override
		protected FieldAccessorTable
		internalGetFieldAccessorTable() {
			return SubredditOuterClass.internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_fieldAccessorTable
				.ensureFieldAccessorsInitialized(
					Subreddit.class, Builder.class);
		}

		/**
		 * <code>string name = 1;</code>
		 *
		 * @return The name.
		 */
		@Override
		public String getName() {
			Object ref = name_;
			if (ref instanceof String) {
				return (String) ref;
			} else {
				com.google.protobuf.ByteString bs =
					(com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				name_ = s;
				return s;
			}
		}

		/**
		 * <code>string name = 1;</code>
		 *
		 * @return The bytes for name.
		 */
		@Override
		public com.google.protobuf.ByteString
		getNameBytes() {
			Object ref = name_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b =
					com.google.protobuf.ByteString.copyFromUtf8(
						(String) ref);
				name_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
		 * 2;</code>
		 *
		 * @return The enum numeric value on the wire for state.
		 */
		@Override
		public int getStateValue() {
			return state_;
		}

		/**
		 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
		 * 2;</code>
		 *
		 * @return The state.
		 */
		@Override
		public SubredditState getState() {
			SubredditState result = SubredditState.forNumber(state_);
			return result == null ? SubredditState.UNRECOGNIZED : result;
		}

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @return A list containing the tags.
		 */
		public com.google.protobuf.ProtocolStringList
		getTagsList() {
			return tags_;
		}

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @return The count of tags.
		 */
		public int getTagsCount() {
			return tags_.size();
		}

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @param index The index of the element to return.
		 * @return The tags at the given index.
		 */
		public String getTags(int index) {
			return tags_.get(index);
		}

		/**
		 * <pre>
		 * Assuming tags are represented as strings
		 * </pre>
		 *
		 * <code>repeated string tags = 3;</code>
		 *
		 * @param index The index of the value to return.
		 * @return The bytes of the tags at the given index.
		 */
		public com.google.protobuf.ByteString
		getTagsBytes(int index) {
			return tags_.getByteString(index);
		}

		@Override
		public boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1) {
				return true;
			}
			if (isInitialized == 0) {
				return false;
			}

			memoizedIsInitialized = 1;
			return true;
		}

		@Override
		public void writeTo(com.google.protobuf.CodedOutputStream output)
			throws java.io.IOException {
			if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
			}
			if (state_ != SubredditState.PUBLIC.getNumber()) {
				output.writeEnum(2, state_);
			}
			for (int i = 0; i < tags_.size(); i++) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tags_.getRaw(i));
			}
			getUnknownFields().writeTo(output);
		}

		@Override
		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1) {
				return size;
			}

			size = 0;
			if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
			}
			if (state_ != SubredditState.PUBLIC.getNumber()) {
				size += com.google.protobuf.CodedOutputStream
					.computeEnumSize(2, state_);
			}
			{
				int dataSize = 0;
				for (int i = 0; i < tags_.size(); i++) {
					dataSize += computeStringSizeNoTag(tags_.getRaw(i));
				}
				size += dataSize;
				size += getTagsList().size();
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSize = size;
			return size;
		}

		@Override
		public boolean equals(final Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof Subreddit other)) {
				return super.equals(obj);
			}

			if (!getName()
				.equals(other.getName())) {
				return false;
			}
			if (state_ != other.state_) {
				return false;
			}
			if (!getTagsList()
				.equals(other.getTagsList())) {
				return false;
			}
			return getUnknownFields().equals(other.getUnknownFields());
		}

		@Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			hash = (37 * hash) + NAME_FIELD_NUMBER;
			hash = (53 * hash) + getName().hashCode();
			hash = (37 * hash) + STATE_FIELD_NUMBER;
			hash = (53 * hash) + state_;
			if (getTagsCount() > 0) {
				hash = (37 * hash) + TAGS_FIELD_NUMBER;
				hash = (53 * hash) + getTagsList().hashCode();
			}
			hash = (29 * hash) + getUnknownFields().hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		@Override
		public Builder newBuilderForType() {
			return newBuilder();
		}

		@Override
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

		@Override
		public com.google.protobuf.Parser<Subreddit> getParserForType() {
			return PARSER;
		}

		@Override
		public Subreddit getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

		/**
		 * Protobuf enum
		 * {@code edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState}
		 */
		public enum SubredditState
			implements com.google.protobuf.ProtocolMessageEnum {
			/**
			 * <code>PUBLIC = 0;</code>
			 */
			PUBLIC(0),
			/**
			 * <code>PRIVATE = 1;</code>
			 */
			PRIVATE(1),
			/**
			 * <code>HIDDEN = 2;</code>
			 */
			HIDDEN(2),
			UNRECOGNIZED(-1),
			;

			/**
			 * <code>PUBLIC = 0;</code>
			 */
			public static final int PUBLIC_VALUE = 0;
			/**
			 * <code>PRIVATE = 1;</code>
			 */
			public static final int PRIVATE_VALUE = 1;
			/**
			 * <code>HIDDEN = 2;</code>
			 */
			public static final int HIDDEN_VALUE = 2;
			private static final com.google.protobuf.Internal.EnumLiteMap<
				SubredditState> internalValueMap =
				new com.google.protobuf.Internal.EnumLiteMap<SubredditState>() {
					public SubredditState findValueByNumber(int number) {
						return SubredditState.forNumber(number);
					}
				};
			private static final SubredditState[] VALUES = values();
			private final int value;

			SubredditState(int value) {
				this.value = value;
			}

			/**
			 * @param value The numeric wire value of the corresponding enum entry.
			 * @return The enum associated with the given numeric wire value.
			 * @deprecated Use {@link #forNumber(int)} instead.
			 */
			@Deprecated
			public static SubredditState valueOf(int value) {
				return forNumber(value);
			}

			/**
			 * @param value The numeric wire value of the corresponding enum entry.
			 * @return The enum associated with the given numeric wire value.
			 */
			public static SubredditState forNumber(int value) {
				switch (value) {
					case 0:
						return PUBLIC;
					case 1:
						return PRIVATE;
					case 2:
						return HIDDEN;
					default:
						return null;
				}
			}

			public static com.google.protobuf.Internal.EnumLiteMap<SubredditState>
			internalGetValueMap() {
				return internalValueMap;
			}

			public static final com.google.protobuf.Descriptors.EnumDescriptor
			getDescriptor() {
				return Subreddit.getDescriptor().getEnumTypes().get(0);
			}

			public static SubredditState valueOf(
				com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
				if (desc.getType() != getDescriptor()) {
					throw new IllegalArgumentException(
						"EnumValueDescriptor is not for this type.");
				}
				if (desc.getIndex() == -1) {
					return UNRECOGNIZED;
				}
				return VALUES[desc.getIndex()];
			}

			public final int getNumber() {
				if (this == UNRECOGNIZED) {
					throw new IllegalArgumentException(
						"Can't get the number of an unknown enum value.");
				}
				return value;
			}

			public final com.google.protobuf.Descriptors.EnumValueDescriptor
			getValueDescriptor() {
				if (this == UNRECOGNIZED) {
					throw new IllegalStateException(
						"Can't get the descriptor of an unrecognized enum value.");
				}
				return getDescriptor().getValues().get(ordinal());
			}

			public final com.google.protobuf.Descriptors.EnumDescriptor
			getDescriptorForType() {
				return getDescriptor();
			}

			// @@protoc_insertion_point(enum_scope:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState)
		}

		/**
		 * Protobuf type {@code edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit}
		 */
		public static final class Builder extends
			com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit)
			SubredditOrBuilder {

			private int bitField0_;
			private Object name_ = "";
			private int state_ = 0;
			private com.google.protobuf.LazyStringArrayList tags_ =
				com.google.protobuf.LazyStringArrayList.emptyList();

			// Construct using edu.cmu.cs.mse.apidesigna3.model.subreddit.SubredditOuterClass.Subreddit.newBuilder()
			private Builder() {

			}

			private Builder(
				BuilderParent parent) {
				super(parent);

			}

			public static com.google.protobuf.Descriptors.Descriptor
			getDescriptor() {
				return SubredditOuterClass.internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor;
			}

			@Override
			protected FieldAccessorTable
			internalGetFieldAccessorTable() {
				return SubredditOuterClass.internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
						Subreddit.class, Builder.class);
			}

			@Override
			public Builder clear() {
				super.clear();
				bitField0_ = 0;
				name_ = "";
				state_ = 0;
				tags_ =
					com.google.protobuf.LazyStringArrayList.emptyList();
				return this;
			}

			@Override
			public com.google.protobuf.Descriptors.Descriptor
			getDescriptorForType() {
				return SubredditOuterClass.internal_static_edu_cmu_cs_mse_apidesigna3_model_subreddit_Subreddit_descriptor;
			}

			@Override
			public Subreddit getDefaultInstanceForType() {
				return Subreddit.getDefaultInstance();
			}

			@Override
			public Subreddit build() {
				Subreddit result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			@Override
			public Subreddit buildPartial() {
				Subreddit result = new Subreddit(this);
				if (bitField0_ != 0) {
					buildPartial0(result);
				}
				onBuilt();
				return result;
			}

			private void buildPartial0(Subreddit result) {
				int from_bitField0_ = bitField0_;
				if (((from_bitField0_ & 0x00000001) != 0)) {
					result.name_ = name_;
				}
				if (((from_bitField0_ & 0x00000002) != 0)) {
					result.state_ = state_;
				}
				if (((from_bitField0_ & 0x00000004) != 0)) {
					tags_.makeImmutable();
					result.tags_ = tags_;
				}
			}

			@Override
			public Builder clone() {
				return super.clone();
			}

			@Override
			public Builder setField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				Object value) {
				return super.setField(field, value);
			}

			@Override
			public Builder clearField(
				com.google.protobuf.Descriptors.FieldDescriptor field) {
				return super.clearField(field);
			}

			@Override
			public Builder clearOneof(
				com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return super.clearOneof(oneof);
			}

			@Override
			public Builder setRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				int index, Object value) {
				return super.setRepeatedField(field, index, value);
			}

			@Override
			public Builder addRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				Object value) {
				return super.addRepeatedField(field, value);
			}

			@Override
			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof Subreddit) {
					return mergeFrom((Subreddit) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(Subreddit other) {
				if (other == Subreddit.getDefaultInstance()) {
					return this;
				}
				if (!other.getName().isEmpty()) {
					name_ = other.name_;
					bitField0_ |= 0x00000001;
					onChanged();
				}
				if (other.state_ != 0) {
					setStateValue(other.getStateValue());
				}
				if (!other.tags_.isEmpty()) {
					if (tags_.isEmpty()) {
						tags_ = other.tags_;
						bitField0_ |= 0x00000004;
					} else {
						ensureTagsIsMutable();
						tags_.addAll(other.tags_);
					}
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				onChanged();
				return this;
			}

			@Override
			public boolean isInitialized() {
				return true;
			}

			@Override
			public Builder mergeFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
				if (extensionRegistry == null) {
					throw new NullPointerException();
				}
				try {
					boolean done = false;
					while (!done) {
						int tag = input.readTag();
						switch (tag) {
							case 0:
								done = true;
								break;
							case 10: {
								name_ = input.readStringRequireUtf8();
								bitField0_ |= 0x00000001;
								break;
							} // case 10
							case 16: {
								state_ = input.readEnum();
								bitField0_ |= 0x00000002;
								break;
							} // case 16
							case 26: {
								String s = input.readStringRequireUtf8();
								ensureTagsIsMutable();
								tags_.add(s);
								break;
							} // case 26
							default: {
								if (!super.parseUnknownField(input, extensionRegistry, tag)) {
									done = true; // was an endgroup tag
								}
								break;
							} // default:
						} // switch (tag)
					} // while (!done)
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					throw e.unwrapIOException();
				} finally {
					onChanged();
				} // finally
				return this;
			}

			/**
			 * <code>string name = 1;</code>
			 *
			 * @return The name.
			 */
			public String getName() {
				Object ref = name_;
				if (!(ref instanceof String)) {
					com.google.protobuf.ByteString bs =
						(com.google.protobuf.ByteString) ref;
					String s = bs.toStringUtf8();
					name_ = s;
					return s;
				} else {
					return (String) ref;
				}
			}

			/**
			 * <code>string name = 1;</code>
			 *
			 * @param value The name to set.
			 * @return This builder for chaining.
			 */
			public Builder setName(
				String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				name_ = value;
				bitField0_ |= 0x00000001;
				onChanged();
				return this;
			}

			/**
			 * <code>string name = 1;</code>
			 *
			 * @return The bytes for name.
			 */
			public com.google.protobuf.ByteString
			getNameBytes() {
				Object ref = name_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b =
						com.google.protobuf.ByteString.copyFromUtf8(
							(String) ref);
					name_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string name = 1;</code>
			 *
			 * @param value The bytes for name to set.
			 * @return This builder for chaining.
			 */
			public Builder setNameBytes(
				com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);
				name_ = value;
				bitField0_ |= 0x00000001;
				onChanged();
				return this;
			}

			/**
			 * <code>string name = 1;</code>
			 *
			 * @return This builder for chaining.
			 */
			public Builder clearName() {
				name_ = getDefaultInstance().getName();
				bitField0_ = (bitField0_ & ~0x00000001);
				onChanged();
				return this;
			}

			/**
			 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
			 * 2;</code>
			 *
			 * @return The enum numeric value on the wire for state.
			 */
			@Override
			public int getStateValue() {
				return state_;
			}

			/**
			 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
			 * 2;</code>
			 *
			 * @param value The enum numeric value on the wire for state to set.
			 * @return This builder for chaining.
			 */
			public Builder setStateValue(int value) {
				state_ = value;
				bitField0_ |= 0x00000002;
				onChanged();
				return this;
			}

			/**
			 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
			 * 2;</code>
			 *
			 * @return The state.
			 */
			@Override
			public SubredditState getState() {
				SubredditState result = SubredditState.forNumber(state_);
				return result == null ? SubredditState.UNRECOGNIZED : result;
			}

			/**
			 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
			 * 2;</code>
			 *
			 * @param value The state to set.
			 * @return This builder for chaining.
			 */
			public Builder setState(SubredditState value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				state_ = value.getNumber();
				onChanged();
				return this;
			}

			/**
			 * <code>.edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit.SubredditState state =
			 * 2;</code>
			 *
			 * @return This builder for chaining.
			 */
			public Builder clearState() {
				bitField0_ = (bitField0_ & ~0x00000002);
				state_ = 0;
				onChanged();
				return this;
			}

			private void ensureTagsIsMutable() {
				if (!tags_.isModifiable()) {
					tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
				}
				bitField0_ |= 0x00000004;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @return A list containing the tags.
			 */
			public com.google.protobuf.ProtocolStringList
			getTagsList() {
				tags_.makeImmutable();
				return tags_;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @return The count of tags.
			 */
			public int getTagsCount() {
				return tags_.size();
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param index The index of the element to return.
			 * @return The tags at the given index.
			 */
			public String getTags(int index) {
				return tags_.get(index);
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param index The index of the value to return.
			 * @return The bytes of the tags at the given index.
			 */
			public com.google.protobuf.ByteString
			getTagsBytes(int index) {
				return tags_.getByteString(index);
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param index The index to set the value at.
			 * @param value The tags to set.
			 * @return This builder for chaining.
			 */
			public Builder setTags(
				int index, String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureTagsIsMutable();
				tags_.set(index, value);
				bitField0_ |= 0x00000004;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param value The tags to add.
			 * @return This builder for chaining.
			 */
			public Builder addTags(
				String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureTagsIsMutable();
				tags_.add(value);
				bitField0_ |= 0x00000004;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param values The tags to add.
			 * @return This builder for chaining.
			 */
			public Builder addAllTags(
				Iterable<String> values) {
				ensureTagsIsMutable();
				com.google.protobuf.AbstractMessageLite.Builder.addAll(
					values, tags_);
				bitField0_ |= 0x00000004;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @return This builder for chaining.
			 */
			public Builder clearTags() {
				tags_ =
					com.google.protobuf.LazyStringArrayList.emptyList();
				bitField0_ = (bitField0_ & ~0x00000004);
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Assuming tags are represented as strings
			 * </pre>
			 *
			 * <code>repeated string tags = 3;</code>
			 *
			 * @param value The bytes of the tags to add.
			 * @return This builder for chaining.
			 */
			public Builder addTagsBytes(
				com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);
				ensureTagsIsMutable();
				tags_.add(value);
				bitField0_ |= 0x00000004;
				onChanged();
				return this;
			}

			@Override
			public Builder setUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			@Override
			public Builder mergeUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:edu.cmu.cs.mse.apidesigna3.model.subreddit.Subreddit)
		}

	}

	// @@protoc_insertion_point(outer_class_scope)
}
