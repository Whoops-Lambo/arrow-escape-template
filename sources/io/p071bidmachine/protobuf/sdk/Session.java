package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.i;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Session extends y4 implements SessionOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final Session DEFAULT_INSTANCE = new Session();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Session.1
        @Override // com.explorestack.protobuf.g7
        public Session parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Session(rVar, o3Var);
        }
    };
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Context context_;
    private byte memoizedIsInitialized;
    private volatile Object sessionId_;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements SessionOrBuilder {
        private v7 contextBuilder_;
        private Context context_;
        private Object sessionId_;

        private Builder() {
            super(null);
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private v7 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new v7(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session buildPartial() {
            Session session = new Session(this);
            session.sessionId_ = this.sessionId_;
            v7 v7Var = this.contextBuilder_;
            if (v7Var == null) {
                session.context_ = this.context_;
            } else {
                session.context_ = (Context) v7Var.a();
            }
            onBuilt();
            return session;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
        public Context getContext() {
            v7 v7Var = this.contextBuilder_;
            if (v7Var != null) {
                return (Context) v7Var.d();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            v7 v7Var = this.contextBuilder_;
            if (v7Var != null) {
                return (ContextOrBuilder) v7Var.e();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable;
            w4Var.c(Session.class, Builder.class);
            return w4Var;
        }

        public Builder mergeContext(Context context) {
            v7 v7Var = this.contextBuilder_;
            if (v7Var != null) {
                v7Var.f(context);
                return this;
            }
            Context context2 = this.context_;
            if (context2 != null) {
                this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
            } else {
                this.context_ = context;
            }
            onChanged();
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            v7 v7Var = this.contextBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.context_ = builder.build();
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = y4.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session build() {
            Session sessionBuildPartial = buildPartial();
            if (sessionBuildPartial.isInitialized()) {
                return sessionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.sessionId_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = Session.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().c();
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (!session.getSessionId().isEmpty()) {
                this.sessionId_ = session.sessionId_;
                onChanged();
            }
            if (session.hasContext()) {
                mergeContext(session.getContext());
            }
            mergeUnknownFields(((y4) session).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            c.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
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
        public Session mo250getDefaultInstanceForType() {
            return Session.getDefaultInstance();
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
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setContext(Context context) {
            v7 v7Var = this.contextBuilder_;
            if (v7Var == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
                return this;
            }
            v7Var.h(context);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            Session session = null;
            try {
                try {
                    Session session2 = (Session) Session.PARSER.parsePartialFrom(rVar, o3Var);
                    if (session2 != null) {
                        mergeFrom(session2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Session session3 = (Session) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        session = session3;
                        if (session != null) {
                            mergeFrom(session);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (session != null) {
                    mergeFrom(session);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Context extends y4 implements ContextOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        public static final int IAA_FIELD_NUMBER = 7;
        public static final int IAP_FIELD_NUMBER = 6;
        public static final int LAST_SESSION_DURATION_FIELD_NUMBER = 5;
        public static final int RETENTION_FIELD_NUMBER = 3;
        public static final int SC_FIELD_NUMBER = 2;
        public static final int SESSIONDURATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContextualData> data_;
        private BoolValue iaa_;
        private BoolValue iap_;
        private long lastSessionDuration_;
        private byte memoizedIsInitialized;
        private int retention_;
        private int sc_;
        private long sessionduration_;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Session.Context.1
            @Override // com.explorestack.protobuf.g7
            public Context parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Context(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements ContextOrBuilder {
            private int bitField0_;
            private o7 dataBuilder_;
            private List<ContextualData> data_;
            private v7 iaaBuilder_;
            private BoolValue iaa_;
            private v7 iapBuilder_;
            private BoolValue iap_;
            private long lastSessionDuration_;
            private int retention_;
            private int sc_;
            private long sessionduration_;

            private Builder() {
                super(null);
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder clearRetention() {
                this.retention_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSc() {
                this.sc_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private o7 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new o7(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            private v7 getIaaFieldBuilder() {
                if (this.iaaBuilder_ == null) {
                    this.iaaBuilder_ = new v7(getIaa(), getParentForChildren(), isClean());
                    this.iaa_ = null;
                }
                return this.iaaBuilder_;
            }

            private v7 getIapFieldBuilder() {
                if (this.iapBuilder_ == null) {
                    this.iapBuilder_ = new v7(getIap(), getParentForChildren(), isClean());
                    this.iap_ = null;
                }
                return this.iapBuilder_;
            }

            public Builder addAllData(Iterable<? extends ContextualData> iterable) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                b.addAll((Iterable) iterable, (List) this.data_);
                onChanged();
                return this;
            }

            public Builder addData(ContextualData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureDataIsMutable();
                this.data_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                context.sessionduration_ = this.sessionduration_;
                context.sc_ = this.sc_;
                context.retention_ = this.retention_;
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    context.data_ = this.data_;
                } else {
                    context.data_ = o7Var.f();
                }
                context.lastSessionDuration_ = this.lastSessionDuration_;
                v7 v7Var = this.iapBuilder_;
                if (v7Var == null) {
                    context.iap_ = this.iap_;
                } else {
                    context.iap_ = (BoolValue) v7Var.a();
                }
                v7 v7Var2 = this.iaaBuilder_;
                if (v7Var2 == null) {
                    context.iaa_ = this.iaa_;
                } else {
                    context.iaa_ = (BoolValue) v7Var2.a();
                }
                onBuilt();
                return context;
            }

            public Builder clearData() {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearIaa() {
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                    onChanged();
                    return this;
                }
                this.iaa_ = null;
                this.iaaBuilder_ = null;
                return this;
            }

            public Builder clearIap() {
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                    onChanged();
                    return this;
                }
                this.iap_ = null;
                this.iapBuilder_ = null;
                return this;
            }

            public Builder clearLastSessionDuration() {
                this.lastSessionDuration_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualData getData(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (ContextualData) o7Var.l(i, false);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getDataCount() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.size() : o7Var.b.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<ContextualData> getDataList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.data_) : o7Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualDataOrBuilder getDataOrBuilder(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (ContextualDataOrBuilder) o7Var.n(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIaa() {
                v7 v7Var = this.iaaBuilder_;
                if (v7Var != null) {
                    return (BoolValue) v7Var.d();
                }
                BoolValue boolValue = this.iaa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public i getIaaOrBuilder() {
                v7 v7Var = this.iaaBuilder_;
                if (v7Var != null) {
                    return (i) v7Var.e();
                }
                BoolValue boolValue = this.iaa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIap() {
                v7 v7Var = this.iapBuilder_;
                if (v7Var != null) {
                    return (BoolValue) v7Var.d();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public i getIapOrBuilder() {
                v7 v7Var = this.iapBuilder_;
                if (v7Var != null) {
                    return (i) v7Var.e();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getLastSessionDuration() {
                return this.lastSessionDuration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getRetention() {
                return this.retention_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getSc() {
                return this.sc_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIaa() {
                return (this.iaaBuilder_ == null && this.iaa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIap() {
                return (this.iapBuilder_ == null && this.iap_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable;
                w4Var.c(Context.class, Builder.class);
                return w4Var;
            }

            public Builder mergeIaa(BoolValue boolValue) {
                v7 v7Var = this.iaaBuilder_;
                if (v7Var != null) {
                    v7Var.f(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.iaa_;
                if (boolValue2 != null) {
                    this.iaa_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.iaa_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeIap(BoolValue boolValue) {
                v7 v7Var = this.iapBuilder_;
                if (v7Var != null) {
                    v7Var.f(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.iap_;
                if (boolValue2 != null) {
                    this.iap_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.iap_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder removeData(int i) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i);
                onChanged();
                return this;
            }

            public Builder setData(int i, ContextualData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureDataIsMutable();
                this.data_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setIaa(BoolValue.Builder builder) {
                v7 v7Var = this.iaaBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.iaa_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setIap(BoolValue.Builder builder) {
                v7 v7Var = this.iapBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.iap_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setLastSessionDuration(long j) {
                this.lastSessionDuration_ = j;
                onChanged();
                return this;
            }

            public Builder setRetention(int i) {
                this.retention_ = i;
                onChanged();
                return this;
            }

            public Builder setSc(int i) {
                this.sc_ = i;
                onChanged();
                return this;
            }

            public Builder setSessionduration(long j) {
                this.sessionduration_ = j;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public ContextualData.Builder addDataBuilder() {
                return (ContextualData.Builder) getDataFieldBuilder().c(ContextualData.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context contextBuildPartial = buildPartial();
                if (contextBuildPartial.isInitialized()) {
                    return contextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.sessionduration_ = 0L;
                this.sc_ = 0;
                this.retention_ = 0;
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    o7Var.g();
                }
                this.lastSessionDuration_ = 0L;
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                } else {
                    this.iap_ = null;
                    this.iapBuilder_ = null;
                }
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                    return this;
                }
                this.iaa_ = null;
                this.iaaBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public ContextualData.Builder getDataBuilder(int i) {
                return (ContextualData.Builder) getDataFieldBuilder().j(i);
            }

            public List<ContextualData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().k();
            }

            public BoolValue.Builder getIaaBuilder() {
                onChanged();
                return (BoolValue.Builder) getIaaFieldBuilder().c();
            }

            public BoolValue.Builder getIapBuilder() {
                onChanged();
                return (BoolValue.Builder) getIapFieldBuilder().c();
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (context.getSessionduration() != 0) {
                    setSessionduration(context.getSessionduration());
                }
                if (context.getSc() != 0) {
                    setSc(context.getSc());
                }
                if (context.getRetention() != 0) {
                    setRetention(context.getRetention());
                }
                if (this.dataBuilder_ == null) {
                    if (!context.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = context.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(context.data_);
                        }
                        onChanged();
                    }
                } else if (!context.data_.isEmpty()) {
                    boolean zIsEmpty = this.dataBuilder_.b.isEmpty();
                    o7 o7Var = this.dataBuilder_;
                    if (zIsEmpty) {
                        o7 dataFieldBuilder = null;
                        o7Var.a = null;
                        this.dataBuilder_ = null;
                        this.data_ = context.data_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            dataFieldBuilder = getDataFieldBuilder();
                        }
                        this.dataBuilder_ = dataFieldBuilder;
                    } else {
                        o7Var.a(context.data_);
                    }
                }
                if (context.getLastSessionDuration() != 0) {
                    setLastSessionDuration(context.getLastSessionDuration());
                }
                if (context.hasIap()) {
                    mergeIap(context.getIap());
                }
                if (context.hasIaa()) {
                    mergeIaa(context.getIaa());
                }
                mergeUnknownFields(((y4) context).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
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
            public Context mo250getDefaultInstanceForType() {
                return Context.getDefaultInstance();
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
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public ContextualData.Builder addDataBuilder(int i) {
                return (ContextualData.Builder) getDataFieldBuilder().b(i, ContextualData.getDefaultInstance());
            }

            public Builder setIaa(BoolValue boolValue) {
                v7 v7Var = this.iaaBuilder_;
                if (v7Var == null) {
                    boolValue.getClass();
                    this.iaa_ = boolValue;
                    onChanged();
                    return this;
                }
                v7Var.h(boolValue);
                return this;
            }

            public Builder setIap(BoolValue boolValue) {
                v7 v7Var = this.iapBuilder_;
                if (v7Var == null) {
                    boolValue.getClass();
                    this.iap_ = boolValue;
                    onChanged();
                    return this;
                }
                v7Var.h(boolValue);
                return this;
            }

            public Builder addData(int i, ContextualData contextualData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, contextualData);
                    onChanged();
                    return this;
                }
                o7Var.d(i, contextualData);
                return this;
            }

            public Builder setData(int i, ContextualData contextualData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, contextualData);
                    onChanged();
                    return this;
                }
                o7Var.s(i, contextualData);
                return this;
            }

            public Builder addData(ContextualData contextualData) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(contextualData);
                    onChanged();
                    return this;
                }
                o7Var.e(contextualData);
                return this;
            }

            public Builder addData(int i, ContextualData.Builder builder) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Context context = null;
                try {
                    try {
                        Context context2 = (Context) Context.PARSER.parsePartialFrom(rVar, o3Var);
                        if (context2 != null) {
                            mergeFrom(context2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Context context3 = (Context) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            context = context3;
                            if (context != null) {
                                mergeFrom(context);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (context != null) {
                        mergeFrom(context);
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
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (getSessionduration() != context.getSessionduration() || getSc() != context.getSc() || getRetention() != context.getRetention() || !getDataList().equals(context.getDataList()) || getLastSessionDuration() != context.getLastSessionDuration() || hasIap() != context.hasIap()) {
                return false;
            }
            if ((!hasIap() || getIap().equals(context.getIap())) && hasIaa() == context.hasIaa()) {
                return (!hasIaa() || getIaa().equals(context.getIaa())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualData getData(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<ContextualData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIaa() {
            BoolValue boolValue = this.iaa_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIap() {
            BoolValue boolValue = this.iap_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getLastSessionDuration() {
            return this.lastSessionDuration_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getRetention() {
            return this.retention_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getSc() {
            return this.sc_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.sessionduration_;
            int iV = j != 0 ? w.v(1, j) : 0;
            int i2 = this.sc_;
            if (i2 != 0) {
                iV += w.t(2, i2);
            }
            int i3 = this.retention_;
            if (i3 != 0) {
                iV += w.t(3, i3);
            }
            for (int i4 = 0; i4 < this.data_.size(); i4++) {
                iV += w.o(4, this.data_.get(i4));
            }
            long j2 = this.lastSessionDuration_;
            if (j2 != 0) {
                iV += w.v(5, j2);
            }
            if (this.iap_ != null) {
                iV += w.o(6, getIap());
            }
            if (this.iaa_ != null) {
                iV += w.o(7, getIaa());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iV;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIaa() {
            return this.iaa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIap() {
            return this.iap_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int retention = getRetention() + ((((getSc() + ((((l5.d(getSessionduration()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
            if (getDataCount() > 0) {
                retention = getDataList().hashCode() + pv1.c(retention, 37, 4, 53);
            }
            int iD = l5.d(getLastSessionDuration()) + pv1.c(retention, 37, 5, 53);
            if (hasIap()) {
                iD = getIap().hashCode() + pv1.c(iD, 37, 6, 53);
            }
            if (hasIaa()) {
                iD = getIaa().hashCode() + pv1.c(iD, 37, 7, 53);
            }
            int iHashCode = this.unknownFields.a.hashCode() + (iD * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable;
            w4Var.c(Context.class, Builder.class);
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
            return new Context();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            long j = this.sessionduration_;
            if (j != 0) {
                wVar.V(1, j);
            }
            int i = this.sc_;
            if (i != 0) {
                wVar.T(2, i);
            }
            int i2 = this.retention_;
            if (i2 != 0) {
                wVar.T(3, i2);
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                wVar.M(4, this.data_.get(i3));
            }
            long j2 = this.lastSessionDuration_;
            if (j2 != 0) {
                wVar.V(5, j2);
            }
            if (this.iap_ != null) {
                wVar.M(6, getIap());
            }
            if (this.iaa_ != null) {
                wVar.M(7, getIaa());
            }
            this.unknownFields.writeTo(wVar);
        }

        private Context(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            BoolValue.Builder builder;
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        if (iF != 0) {
                            if (iF != 8) {
                                if (iF != 16) {
                                    if (iF != 24) {
                                        if (iF != 34) {
                                            if (iF != 40) {
                                                if (iF != 50) {
                                                    if (iF != 58) {
                                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                        }
                                                    } else {
                                                        BoolValue boolValue = this.iaa_;
                                                        builder = boolValue != null ? boolValue.toBuilder() : null;
                                                        BoolValue boolValue2 = (BoolValue) rVar.v(BoolValue.parser(), o3Var);
                                                        this.iaa_ = boolValue2;
                                                        if (builder != null) {
                                                            builder.mergeFrom(boolValue2);
                                                            this.iaa_ = builder.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    BoolValue boolValue3 = this.iap_;
                                                    builder = boolValue3 != null ? boolValue3.toBuilder() : null;
                                                    BoolValue boolValue4 = (BoolValue) rVar.v(BoolValue.parser(), o3Var);
                                                    this.iap_ = boolValue4;
                                                    if (builder != null) {
                                                        builder.mergeFrom(boolValue4);
                                                        this.iap_ = builder.buildPartial();
                                                    }
                                                }
                                            } else {
                                                this.lastSessionDuration_ = rVar.H();
                                            }
                                        } else {
                                            if (!z2) {
                                                this.data_ = new ArrayList();
                                                z2 = true;
                                            }
                                            this.data_.add((ContextualData) rVar.v(ContextualData.parser(), o3Var));
                                        }
                                    } else {
                                        this.retention_ = rVar.G();
                                    }
                                } else {
                                    this.sc_ = rVar.G();
                                }
                            } else {
                                this.sessionduration_ = rVar.H();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public i getIaaOrBuilder() {
            return getIaa();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public i getIapOrBuilder() {
            return getIap();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Context mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Context parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Context) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Context parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString, o3Var);
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr);
        }

        public static Context parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr, o3Var);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Context) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Context parseFrom(r rVar) throws IOException {
            return (Context) y4.parseWithIOException(PARSER, rVar);
        }

        public static Context parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Context) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Context(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ContextOrBuilder extends MessageOrBuilder {
        ContextualData getData(int i);

        int getDataCount();

        List<ContextualData> getDataList();

        ContextualDataOrBuilder getDataOrBuilder(int i);

        List<? extends ContextualDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        BoolValue getIaa();

        i getIaaOrBuilder();

        BoolValue getIap();

        i getIapOrBuilder();

        long getLastSessionDuration();

        int getRetention();

        int getSc();

        long getSessionduration();

        boolean hasIaa();

        boolean hasIap();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (getSessionId().equals(session.getSessionId()) && hasContext() == session.hasContext()) {
            return (!hasContext() || getContext().equals(session.getContext())) && this.unknownFields.equals(session.unknownFields);
        }
        return false;
    }

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
    }

    public static Session parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Session) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
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
        int iComputeStringSize = !getSessionIdBytes().isEmpty() ? y4.computeStringSize(1, this.sessionId_) : 0;
        if (this.context_ != null) {
            iComputeStringSize += w.o(2, getContext());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getSessionId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasContext()) {
            iHashCode = getContext().hashCode() + pv1.c(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable;
        w4Var.c(Session.class, Builder.class);
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
        return new Session();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Session(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        Context.Builder builder;
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    if (iF != 0) {
                        if (iF != 10) {
                            if (iF != 18) {
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                }
                            } else {
                                Context context = this.context_;
                                if (context != null) {
                                    builder = context.toBuilder();
                                } else {
                                    builder = null;
                                }
                                Context context2 = (Context) rVar.v(Context.parser(), o3Var);
                                this.context_ = context2;
                                if (builder != null) {
                                    builder.mergeFrom(context2);
                                    this.context_ = builder.buildPartial();
                                }
                            }
                        } else {
                            this.sessionId_ = rVar.E();
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

    @Override // io.p071bidmachine.protobuf.sdk.SessionOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (!getSessionIdBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.sessionId_);
        }
        if (this.context_ != null) {
            wVar.M(2, getContext());
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Session mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Session parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Session) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static Session parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Session parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Session parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString, o3Var);
    }

    public static Session parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr);
    }

    public static Session parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr, o3Var);
    }

    public static Session parseFrom(InputStream inputStream) throws IOException {
        return (Session) y4.parseWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Session) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static Session parseFrom(r rVar) throws IOException {
        return (Session) y4.parseWithIOException(PARSER, rVar);
    }

    public static Session parseFrom(r rVar, o3 o3Var) throws IOException {
        return (Session) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private Session(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Session() {
        this.memoizedIsInitialized = (byte) -1;
        this.sessionId_ = "";
    }
}
