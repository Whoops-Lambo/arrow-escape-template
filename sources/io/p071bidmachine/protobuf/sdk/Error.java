package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Error extends y4 implements ErrorOrBuilder {
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Data error_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Data reason_;
    private static final Error DEFAULT_INSTANCE = new Error();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Error.1
        @Override // com.explorestack.protobuf.g7
        public Error parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Error(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements ErrorOrBuilder {
        private v7 errorBuilder_;
        private Data error_;
        private Object name_;
        private v7 reasonBuilder_;
        private Data reason_;

        private Builder() {
            super(null);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        private v7 getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new v7(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private v7 getReasonFieldBuilder() {
            if (this.reasonBuilder_ == null) {
                this.reasonBuilder_ = new v7(getReason(), getParentForChildren(), isClean());
                this.reason_ = null;
            }
            return this.reasonBuilder_;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error buildPartial() {
            Error error = new Error(this);
            error.name_ = this.name_;
            v7 v7Var = this.errorBuilder_;
            if (v7Var == null) {
                error.error_ = this.error_;
            } else {
                error.error_ = (Data) v7Var.a();
            }
            v7 v7Var2 = this.reasonBuilder_;
            if (v7Var2 == null) {
                error.reason_ = this.reason_;
            } else {
                error.reason_ = (Data) v7Var2.a();
            }
            onBuilt();
            return error;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
                return this;
            }
            this.error_ = null;
            this.errorBuilder_ = null;
            return this;
        }

        public Builder clearReason() {
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                onChanged();
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getError() {
            v7 v7Var = this.errorBuilder_;
            if (v7Var != null) {
                return (Data) v7Var.d();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getErrorOrBuilder() {
            v7 v7Var = this.errorBuilder_;
            if (v7Var != null) {
                return (DataOrBuilder) v7Var.e();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getReason() {
            v7 v7Var = this.reasonBuilder_;
            if (v7Var != null) {
                return (Data) v7Var.d();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getReasonOrBuilder() {
            v7 v7Var = this.reasonBuilder_;
            if (v7Var != null) {
                return (DataOrBuilder) v7Var.e();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasReason() {
            return (this.reasonBuilder_ == null && this.reason_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable;
            w4Var.c(Error.class, Builder.class);
            return w4Var;
        }

        public Builder mergeError(Data data) {
            v7 v7Var = this.errorBuilder_;
            if (v7Var != null) {
                v7Var.f(data);
                return this;
            }
            Data data2 = this.error_;
            if (data2 != null) {
                this.error_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.error_ = data;
            }
            onChanged();
            return this;
        }

        public Builder mergeReason(Data data) {
            v7 v7Var = this.reasonBuilder_;
            if (v7Var != null) {
                v7Var.f(data);
                return this;
            }
            Data data2 = this.reason_;
            if (data2 != null) {
                this.reason_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.reason_ = data;
            }
            onChanged();
            return this;
        }

        public Builder setError(Data.Builder builder) {
            v7 v7Var = this.errorBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.error_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setReason(Data.Builder builder) {
            v7 v7Var = this.reasonBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.reason_ = builder.build();
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = y4.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error build() {
            Error errorBuildPartial = buildPartial();
            if (errorBuildPartial.isInitialized()) {
                return errorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        public Builder clearName() {
            this.name_ = Error.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Data.Builder getErrorBuilder() {
            onChanged();
            return (Data.Builder) getErrorFieldBuilder().c();
        }

        public Data.Builder getReasonBuilder() {
            onChanged();
            return (Data.Builder) getReasonFieldBuilder().c();
        }

        public Builder mergeFrom(Error error) {
            if (error == Error.getDefaultInstance()) {
                return this;
            }
            if (!error.getName().isEmpty()) {
                this.name_ = error.name_;
                onChanged();
            }
            if (error.hasError()) {
                mergeError(error.getError());
            }
            if (error.hasReason()) {
                mergeReason(error.getReason());
            }
            mergeUnknownFields(((y4) error).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            c.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            super.clearField(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Error mo250getDefaultInstanceForType() {
            return Error.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            super.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(s8 s8Var) {
            super.setUnknownFields(s8Var);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            super.clearOneof(oneofDescriptor);
            return this;
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setError(Data data) {
            v7 v7Var = this.errorBuilder_;
            if (v7Var == null) {
                data.getClass();
                this.error_ = data;
                onChanged();
                return this;
            }
            v7Var.h(data);
            return this;
        }

        public Builder setReason(Data data) {
            v7 v7Var = this.reasonBuilder_;
            if (v7Var == null) {
                data.getClass();
                this.reason_ = data;
                onChanged();
                return this;
            }
            v7Var.h(data);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Error) {
                return mergeFrom((Error) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            Error error = null;
            try {
                try {
                    Error error2 = (Error) Error.PARSER.parsePartialFrom(rVar, o3Var);
                    if (error2 != null) {
                        mergeFrom(error2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Error error3 = (Error) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        error = error3;
                        if (error != null) {
                            mergeFrom(error);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (error != null) {
                    mergeFrom(error);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Data extends y4 implements DataOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int code_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Error.Data.1
            @Override // com.explorestack.protobuf.g7
            public Data parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Data(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements DataOrBuilder {
            private int code_;
            private Object description_;

            private Builder() {
                super(null);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.code_ = this.code_;
                data.description_ = this.description_;
                onBuilt();
                return data;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable;
                w4Var.c(Data.class, Builder.class);
                return w4Var;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.description_ = "";
                return this;
            }

            public Builder clearDescription() {
                this.description_ = Data.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (data.getCode() != 0) {
                    setCode(data.getCode());
                }
                if (!data.getDescription().isEmpty()) {
                    this.description_ = data.description_;
                    onChanged();
                }
                mergeUnknownFields(((y4) data).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                c.checkByteStringIsUtf8(byteString);
                this.description_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                super.addRepeatedField(fieldDescriptor, obj);
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                super.clearField(fieldDescriptor);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Data mo250getDefaultInstanceForType() {
                return Data.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                super.setField(fieldDescriptor, obj);
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                super.setRepeatedField(fieldDescriptor, i, obj);
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(s8 s8Var) {
                super.setUnknownFields(s8Var);
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                super.clearOneof(oneofDescriptor);
                return this;
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Data data = null;
                try {
                    try {
                        Data data2 = (Data) Data.PARSER.parsePartialFrom(rVar, o3Var);
                        if (data2 != null) {
                            mergeFrom(data2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Data data3 = (Data) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            data = data3;
                            if (data != null) {
                                mergeFrom(data);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (data != null) {
                        mergeFrom(data);
                    }
                    throw th;
                }
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            return getCode() == data.getCode() && getDescription().equals(data.getDescription()) && this.unknownFields.equals(data.unknownFields);
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iQ = i2 != 0 ? w.q(1, i2) : 0;
            if (!getDescriptionBytes().isEmpty()) {
                iQ += y4.computeStringSize(2, this.description_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iQ;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.a.hashCode() + ((getDescription().hashCode() + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable;
            w4Var.c(Data.class, Builder.class);
            return w4Var;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.y4
        public Builder newBuilderForType(h4 h4Var) {
            return new Builder(h4Var);
        }

        @Override // com.explorestack.protobuf.y4
        public Object newInstance(x4 x4Var) {
            return new Data();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            int i = this.code_;
            if (i != 0) {
                wVar.T(1, (i >> 31) ^ (i << 1));
            }
            if (!getDescriptionBytes().isEmpty()) {
                y4.writeString(wVar, 2, this.description_);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Data(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 8) {
                                if (iF != 18) {
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    }
                                } else {
                                    this.description_ = rVar.E();
                                }
                            } else {
                                this.code_ = rVar.B();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Data mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Data) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString, o3Var);
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr);
        }

        public static Data parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr, o3Var);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Data) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Data parseFrom(r rVar) throws IOException {
            return (Data) y4.parseWithIOException(PARSER, rVar);
        }

        public static Data parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Data) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Data(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.description_ = "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DataOrBuilder extends MessageOrBuilder {
        int getCode();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return super.equals(obj);
        }
        Error error = (Error) obj;
        if (!getName().equals(error.getName()) || hasError() != error.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(error.getError())) && hasReason() == error.hasReason()) {
            return (!hasReason() || getReason().equals(error.getReason())) && this.unknownFields.equals(error.unknownFields);
        }
        return false;
    }

    public static Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
    }

    public static Builder newBuilder(Error error) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
    }

    public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Error) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getError() {
        Data data = this.error_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getReason() {
        Data data = this.reason_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
        if (this.error_ != null) {
            iComputeStringSize += w.o(2, getError());
        }
        if (this.reason_ != null) {
            iComputeStringSize += w.o(3, getReason());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasReason() {
        return this.reason_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasError()) {
            iHashCode = getError().hashCode() + pv1.c(iHashCode, 37, 2, 53);
        }
        if (hasReason()) {
            iHashCode = getReason().hashCode() + pv1.c(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable;
        w4Var.c(Error.class, Builder.class);
        return w4Var;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.y4
    public Builder newBuilderForType(h4 h4Var) {
        return new Builder(h4Var);
    }

    @Override // com.explorestack.protobuf.y4
    public Object newInstance(x4 x4Var) {
        return new Error();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Error(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        Data.Builder builder;
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 10) {
                                if (iF != 18) {
                                    if (iF != 26) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        Data data = this.reason_;
                                        builder = data != null ? data.toBuilder() : null;
                                        Data data2 = (Data) rVar.v(Data.parser(), o3Var);
                                        this.reason_ = data2;
                                        if (builder != null) {
                                            builder.mergeFrom(data2);
                                            this.reason_ = builder.buildPartial();
                                        }
                                    }
                                } else {
                                    Data data3 = this.error_;
                                    builder = data3 != null ? data3.toBuilder() : null;
                                    Data data4 = (Data) rVar.v(Data.parser(), o3Var);
                                    this.error_ = data4;
                                    if (builder != null) {
                                        builder.mergeFrom(data4);
                                        this.error_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.name_ = rVar.E();
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.p071bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getReasonOrBuilder() {
        return getReason();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.name_);
        }
        if (this.error_ != null) {
            wVar.M(2, getError());
        }
        if (this.reason_ != null) {
            wVar.M(3, getReason());
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Error mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Error parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Error) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static Error parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Error parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString, o3Var);
    }

    public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr);
    }

    public static Error parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr, o3Var);
    }

    public static Error parseFrom(InputStream inputStream) throws IOException {
        return (Error) y4.parseWithIOException(PARSER, inputStream);
    }

    public static Error parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Error) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static Error parseFrom(r rVar) throws IOException {
        return (Error) y4.parseWithIOException(PARSER, rVar);
    }

    public static Error parseFrom(r rVar, o3 o3Var) throws IOException {
        return (Error) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private Error(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Error() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }
}
