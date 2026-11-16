package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.l5;
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
/* JADX INFO: loaded from: classes.dex */
public final class AdFormat extends y4 implements AdFormatOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int INTERSTITIAL_FIELD_NUMBER = 4;
    public static final int NATIVE_FIELD_NUMBER = 2;
    public static final int REWARDED_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int specCase_;
    private Object spec_;
    private static final AdFormat DEFAULT_INSTANCE = new AdFormat();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.AdFormat.1
        @Override // com.explorestack.protobuf.g7
        public AdFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new AdFormat(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Banner extends y4 implements BannerOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int IS_ADAPTIVE_FIELD_NUMBER = 3;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int height_;
        private boolean isAdaptive_;
        private byte memoizedIsInitialized;
        private int width_;
        private static final Banner DEFAULT_INSTANCE = new Banner();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Banner.1
            @Override // com.explorestack.protobuf.g7
            public Banner parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Banner(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements BannerOrBuilder {
            private int height_;
            private boolean isAdaptive_;
            private int width_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsAdaptive() {
                this.isAdaptive_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Banner buildPartial() {
                Banner banner = new Banner(this);
                banner.width_ = this.width_;
                banner.height_ = this.height_;
                banner.isAdaptive_ = this.isAdaptive_;
                onBuilt();
                return banner;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public boolean getIsAdaptive() {
                return this.isAdaptive_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable;
                w4Var.c(Banner.class, Builder.class);
                return w4Var;
            }

            public Builder setHeight(int i) {
                this.height_ = i;
                onChanged();
                return this;
            }

            public Builder setIsAdaptive(boolean z) {
                this.isAdaptive_ = z;
                onChanged();
                return this;
            }

            public Builder setWidth(int i) {
                this.width_ = i;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Banner build() {
                Banner bannerBuildPartial = buildPartial();
                if (bannerBuildPartial.isInitialized()) {
                    return bannerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bannerBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.width_ = 0;
                this.height_ = 0;
                this.isAdaptive_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Banner banner) {
                if (banner == Banner.getDefaultInstance()) {
                    return this;
                }
                if (banner.getWidth() != 0) {
                    setWidth(banner.getWidth());
                }
                if (banner.getHeight() != 0) {
                    setHeight(banner.getHeight());
                }
                if (banner.getIsAdaptive()) {
                    setIsAdaptive(banner.getIsAdaptive());
                }
                mergeUnknownFields(((y4) banner).unknownFields);
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
            public Banner mo250getDefaultInstanceForType() {
                return Banner.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Banner) {
                    return mergeFrom((Banner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Banner banner = null;
                try {
                    try {
                        Banner banner2 = (Banner) Banner.PARSER.parsePartialFrom(rVar, o3Var);
                        if (banner2 != null) {
                            mergeFrom(banner2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Banner banner3 = (Banner) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            banner = banner3;
                            if (banner != null) {
                                mergeFrom(banner);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (banner != null) {
                        mergeFrom(banner);
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
            if (!(obj instanceof Banner)) {
                return super.equals(obj);
            }
            Banner banner = (Banner) obj;
            return getWidth() == banner.getWidth() && getHeight() == banner.getHeight() && getIsAdaptive() == banner.getIsAdaptive() && this.unknownFields.equals(banner.unknownFields);
        }

        public static Banner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_descriptor;
        }

        public static Builder newBuilder(Banner banner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
        }

        public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Banner) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public boolean getIsAdaptive() {
            return this.isAdaptive_;
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
            int i2 = this.width_;
            int iT = i2 != 0 ? w.t(1, i2) : 0;
            int i3 = this.height_;
            if (i3 != 0) {
                iT += w.t(2, i3);
            }
            if (this.isAdaptive_) {
                iT += w.c(3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iT;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.BannerOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.a.hashCode() + ((l5.c(getIsAdaptive()) + ((((getHeight() + ((((getWidth() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Banner_fieldAccessorTable;
            w4Var.c(Banner.class, Builder.class);
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
            return new Banner();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            int i = this.width_;
            if (i != 0) {
                wVar.T(1, i);
            }
            int i2 = this.height_;
            if (i2 != 0) {
                wVar.T(2, i2);
            }
            boolean z = this.isAdaptive_;
            if (z) {
                wVar.A(3, z);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Banner(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 16) {
                                    if (iF != 24) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        this.isAdaptive_ = rVar.l();
                                    }
                                } else {
                                    this.height_ = rVar.G();
                                }
                            } else {
                                this.width_ = rVar.G();
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
        public Banner mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Banner parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Banner) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Banner parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Banner parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(byteString, o3Var);
        }

        public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr);
        }

        public static Banner parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Banner) PARSER.parseFrom(bArr, o3Var);
        }

        public static Banner parseFrom(InputStream inputStream) throws IOException {
            return (Banner) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Banner parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Banner) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Banner parseFrom(r rVar) throws IOException {
            return (Banner) y4.parseWithIOException(PARSER, rVar);
        }

        public static Banner parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Banner) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Banner(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Banner() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface BannerOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        int getHeight();

        boolean getIsAdaptive();

        int getWidth();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements AdFormatOrBuilder {
        private v7 bannerBuilder_;
        private v7 interstitialBuilder_;
        private v7 nativeBuilder_;
        private v7 rewardedBuilder_;
        private int specCase_;
        private Object spec_;

        private Builder() {
            super(null);
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder clearSpec() {
            this.specCase_ = 0;
            this.spec_ = null;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private v7 getBannerFieldBuilder() {
            if (this.bannerBuilder_ == null) {
                if (this.specCase_ != 1) {
                    this.spec_ = Banner.getDefaultInstance();
                }
                this.bannerBuilder_ = new v7((Banner) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 1;
            onChanged();
            return this.bannerBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        private v7 getInterstitialFieldBuilder() {
            if (this.interstitialBuilder_ == null) {
                if (this.specCase_ != 4) {
                    this.spec_ = Interstitial.getDefaultInstance();
                }
                this.interstitialBuilder_ = new v7((Interstitial) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 4;
            onChanged();
            return this.interstitialBuilder_;
        }

        private v7 getNativeFieldBuilder() {
            if (this.nativeBuilder_ == null) {
                if (this.specCase_ != 2) {
                    this.spec_ = Native.getDefaultInstance();
                }
                this.nativeBuilder_ = new v7((Native) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 2;
            onChanged();
            return this.nativeBuilder_;
        }

        private v7 getRewardedFieldBuilder() {
            if (this.rewardedBuilder_ == null) {
                if (this.specCase_ != 3) {
                    this.spec_ = Rewarded.getDefaultInstance();
                }
                this.rewardedBuilder_ = new v7((Rewarded) this.spec_, getParentForChildren(), isClean());
                this.spec_ = null;
            }
            this.specCase_ = 3;
            onChanged();
            return this.rewardedBuilder_;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat buildPartial() {
            AdFormat adFormat = new AdFormat(this);
            if (this.specCase_ == 1) {
                v7 v7Var = this.bannerBuilder_;
                if (v7Var == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = v7Var.a();
                }
            }
            if (this.specCase_ == 2) {
                v7 v7Var2 = this.nativeBuilder_;
                if (v7Var2 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = v7Var2.a();
                }
            }
            if (this.specCase_ == 3) {
                v7 v7Var3 = this.rewardedBuilder_;
                if (v7Var3 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = v7Var3.a();
                }
            }
            if (this.specCase_ == 4) {
                v7 v7Var4 = this.interstitialBuilder_;
                if (v7Var4 == null) {
                    adFormat.spec_ = this.spec_;
                } else {
                    adFormat.spec_ = v7Var4.a();
                }
            }
            adFormat.specCase_ = this.specCase_;
            onBuilt();
            return adFormat;
        }

        public Builder clearBanner() {
            v7 v7Var = this.bannerBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i == 1) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 1) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            v7Var.b();
            return this;
        }

        public Builder clearInterstitial() {
            v7 v7Var = this.interstitialBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i == 4) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 4) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            v7Var.b();
            return this;
        }

        public Builder clearNative() {
            v7 v7Var = this.nativeBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i == 2) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 2) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            v7Var.b();
            return this;
        }

        public Builder clearRewarded() {
            v7 v7Var = this.rewardedBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i == 3) {
                    this.specCase_ = 0;
                    this.spec_ = null;
                    onChanged();
                }
                return this;
            }
            if (i == 3) {
                this.specCase_ = 0;
                this.spec_ = null;
            }
            v7Var.b();
            return this;
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Banner getBanner() {
            v7 v7Var = this.bannerBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                return i == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
            }
            return i == 1 ? (Banner) v7Var.d() : Banner.getDefaultInstance();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            v7 v7Var;
            int i = this.specCase_;
            if (i != 1 || (v7Var = this.bannerBuilder_) == null) {
                return i == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
            }
            return (BannerOrBuilder) v7Var.e();
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Interstitial getInterstitial() {
            v7 v7Var = this.interstitialBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                return i == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
            }
            return i == 4 ? (Interstitial) v7Var.d() : Interstitial.getDefaultInstance();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public InterstitialOrBuilder getInterstitialOrBuilder() {
            v7 v7Var;
            int i = this.specCase_;
            if (i != 4 || (v7Var = this.interstitialBuilder_) == null) {
                return i == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
            }
            return (InterstitialOrBuilder) v7Var.e();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Native getNative() {
            v7 v7Var = this.nativeBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                return i == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
            }
            return i == 2 ? (Native) v7Var.d() : Native.getDefaultInstance();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            v7 v7Var;
            int i = this.specCase_;
            if (i != 2 || (v7Var = this.nativeBuilder_) == null) {
                return i == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
            }
            return (NativeOrBuilder) v7Var.e();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public Rewarded getRewarded() {
            v7 v7Var = this.rewardedBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                return i == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
            }
            return i == 3 ? (Rewarded) v7Var.d() : Rewarded.getDefaultInstance();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public RewardedOrBuilder getRewardedOrBuilder() {
            v7 v7Var;
            int i = this.specCase_;
            if (i != 3 || (v7Var = this.rewardedBuilder_) == null) {
                return i == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
            }
            return (RewardedOrBuilder) v7Var.e();
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public SpecCase getSpecCase() {
            return SpecCase.forNumber(this.specCase_);
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasBanner() {
            return this.specCase_ == 1;
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasInterstitial() {
            return this.specCase_ == 4;
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasNative() {
            return this.specCase_ == 2;
        }

        @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
        public boolean hasRewarded() {
            return this.specCase_ == 3;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable;
            w4Var.c(AdFormat.class, Builder.class);
            return w4Var;
        }

        public Builder mergeBanner(Banner banner) {
            v7 v7Var = this.bannerBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i != 1 || this.spec_ == Banner.getDefaultInstance()) {
                    this.spec_ = banner;
                } else {
                    this.spec_ = Banner.newBuilder((Banner) this.spec_).mergeFrom(banner).buildPartial();
                }
                onChanged();
            } else {
                if (i == 1) {
                    v7Var.f(banner);
                }
                this.bannerBuilder_.h(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder mergeInterstitial(Interstitial interstitial) {
            v7 v7Var = this.interstitialBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i != 4 || this.spec_ == Interstitial.getDefaultInstance()) {
                    this.spec_ = interstitial;
                } else {
                    this.spec_ = Interstitial.newBuilder((Interstitial) this.spec_).mergeFrom(interstitial).buildPartial();
                }
                onChanged();
            } else {
                if (i == 4) {
                    v7Var.f(interstitial);
                }
                this.interstitialBuilder_.h(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder mergeNative(Native r4) {
            v7 v7Var = this.nativeBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i != 2 || this.spec_ == Native.getDefaultInstance()) {
                    this.spec_ = r4;
                } else {
                    this.spec_ = Native.newBuilder((Native) this.spec_).mergeFrom(r4).buildPartial();
                }
                onChanged();
            } else {
                if (i == 2) {
                    v7Var.f(r4);
                }
                this.nativeBuilder_.h(r4);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder mergeRewarded(Rewarded rewarded) {
            v7 v7Var = this.rewardedBuilder_;
            int i = this.specCase_;
            if (v7Var == null) {
                if (i != 3 || this.spec_ == Rewarded.getDefaultInstance()) {
                    this.spec_ = rewarded;
                } else {
                    this.spec_ = Rewarded.newBuilder((Rewarded) this.spec_).mergeFrom(rewarded).buildPartial();
                }
                onChanged();
            } else {
                if (i == 3) {
                    v7Var.f(rewarded);
                }
                this.rewardedBuilder_.h(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        public Builder setBanner(Banner.Builder builder) {
            v7 v7Var = this.bannerBuilder_;
            if (v7Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                v7Var.h(builder.build());
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder setInterstitial(Interstitial.Builder builder) {
            v7 v7Var = this.interstitialBuilder_;
            if (v7Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                v7Var.h(builder.build());
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder setNative(Native.Builder builder) {
            v7 v7Var = this.nativeBuilder_;
            if (v7Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                v7Var.h(builder.build());
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder setRewarded(Rewarded.Builder builder) {
            v7 v7Var = this.rewardedBuilder_;
            if (v7Var == null) {
                this.spec_ = builder.build();
                onChanged();
            } else {
                v7Var.h(builder.build());
            }
            this.specCase_ = 3;
            return this;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = y4.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdFormat build() {
            AdFormat adFormatBuildPartial = buildPartial();
            if (adFormatBuildPartial.isInitialized()) {
                return adFormatBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adFormatBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.specCase_ = 0;
            this.spec_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public Banner.Builder getBannerBuilder() {
            return (Banner.Builder) getBannerFieldBuilder().c();
        }

        public Interstitial.Builder getInterstitialBuilder() {
            return (Interstitial.Builder) getInterstitialFieldBuilder().c();
        }

        public Native.Builder getNativeBuilder() {
            return (Native.Builder) getNativeFieldBuilder().c();
        }

        public Rewarded.Builder getRewardedBuilder() {
            return (Rewarded.Builder) getRewardedFieldBuilder().c();
        }

        public Builder mergeFrom(AdFormat adFormat) {
            if (adFormat == AdFormat.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[adFormat.getSpecCase().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            mergeInterstitial(adFormat.getInterstitial());
                        }
                    } else {
                        mergeRewarded(adFormat.getRewarded());
                    }
                } else {
                    mergeNative(adFormat.getNative());
                }
            } else {
                mergeBanner(adFormat.getBanner());
            }
            mergeUnknownFields(((y4) adFormat).unknownFields);
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
        public AdFormat mo250getDefaultInstanceForType() {
            return AdFormat.getDefaultInstance();
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
            this.specCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setBanner(Banner banner) {
            v7 v7Var = this.bannerBuilder_;
            if (v7Var == null) {
                banner.getClass();
                this.spec_ = banner;
                onChanged();
            } else {
                v7Var.h(banner);
            }
            this.specCase_ = 1;
            return this;
        }

        public Builder setInterstitial(Interstitial interstitial) {
            v7 v7Var = this.interstitialBuilder_;
            if (v7Var == null) {
                interstitial.getClass();
                this.spec_ = interstitial;
                onChanged();
            } else {
                v7Var.h(interstitial);
            }
            this.specCase_ = 4;
            return this;
        }

        public Builder setNative(Native r2) {
            v7 v7Var = this.nativeBuilder_;
            if (v7Var == null) {
                r2.getClass();
                this.spec_ = r2;
                onChanged();
            } else {
                v7Var.h(r2);
            }
            this.specCase_ = 2;
            return this;
        }

        public Builder setRewarded(Rewarded rewarded) {
            v7 v7Var = this.rewardedBuilder_;
            if (v7Var == null) {
                rewarded.getClass();
                this.spec_ = rewarded;
                onChanged();
            } else {
                v7Var.h(rewarded);
            }
            this.specCase_ = 3;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdFormat) {
                return mergeFrom((AdFormat) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            AdFormat adFormat = null;
            try {
                try {
                    AdFormat adFormat2 = (AdFormat) AdFormat.PARSER.parsePartialFrom(rVar, o3Var);
                    if (adFormat2 != null) {
                        mergeFrom(adFormat2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    AdFormat adFormat3 = (AdFormat) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        adFormat = adFormat3;
                        if (adFormat != null) {
                            mergeFrom(adFormat);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (adFormat != null) {
                    mergeFrom(adFormat);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Interstitial extends y4 implements InterstitialOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Interstitial DEFAULT_INSTANCE = new Interstitial();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Interstitial.1
            @Override // com.explorestack.protobuf.g7
            public Interstitial parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Interstitial(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements InterstitialOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Interstitial buildPartial() {
                Interstitial interstitial = new Interstitial(this);
                interstitial.hasBanner_ = this.hasBanner_;
                interstitial.hasVideo_ = this.hasVideo_;
                onBuilt();
                return interstitial;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable;
                w4Var.c(Interstitial.class, Builder.class);
                return w4Var;
            }

            public Builder setHasBanner(boolean z) {
                this.hasBanner_ = z;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Interstitial build() {
                Interstitial interstitialBuildPartial = buildPartial();
                if (interstitialBuildPartial.isInitialized()) {
                    return interstitialBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) interstitialBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Interstitial interstitial) {
                if (interstitial == Interstitial.getDefaultInstance()) {
                    return this;
                }
                if (interstitial.getHasBanner()) {
                    setHasBanner(interstitial.getHasBanner());
                }
                if (interstitial.getHasVideo()) {
                    setHasVideo(interstitial.getHasVideo());
                }
                mergeUnknownFields(((y4) interstitial).unknownFields);
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
            public Interstitial mo250getDefaultInstanceForType() {
                return Interstitial.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Interstitial) {
                    return mergeFrom((Interstitial) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Interstitial interstitial = null;
                try {
                    try {
                        Interstitial interstitial2 = (Interstitial) Interstitial.PARSER.parsePartialFrom(rVar, o3Var);
                        if (interstitial2 != null) {
                            mergeFrom(interstitial2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Interstitial interstitial3 = (Interstitial) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            interstitial = interstitial3;
                            if (interstitial != null) {
                                mergeFrom(interstitial);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (interstitial != null) {
                        mergeFrom(interstitial);
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
            if (!(obj instanceof Interstitial)) {
                return super.equals(obj);
            }
            Interstitial interstitial = (Interstitial) obj;
            return getHasBanner() == interstitial.getHasBanner() && getHasVideo() == interstitial.getHasVideo() && this.unknownFields.equals(interstitial.unknownFields);
        }

        public static Interstitial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_descriptor;
        }

        public static Builder newBuilder(Interstitial interstitial) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(interstitial);
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Interstitial) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.InterstitialOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            int iC = this.hasBanner_ ? w.c(1) : 0;
            if (this.hasVideo_) {
                iC += w.c(2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iC;
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
            int iHashCode = this.unknownFields.a.hashCode() + ((l5.c(getHasVideo()) + ((((l5.c(getHasBanner()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Interstitial_fieldAccessorTable;
            w4Var.c(Interstitial.class, Builder.class);
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
            return new Interstitial();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            boolean z = this.hasBanner_;
            if (z) {
                wVar.A(1, z);
            }
            boolean z2 = this.hasVideo_;
            if (z2) {
                wVar.A(2, z2);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Interstitial(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 16) {
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    }
                                } else {
                                    this.hasVideo_ = rVar.l();
                                }
                            } else {
                                this.hasBanner_ = rVar.l();
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
        public Interstitial mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Interstitial parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Interstitial) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Interstitial parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Interstitial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Interstitial parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(byteString, o3Var);
        }

        public static Interstitial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr);
        }

        public static Interstitial parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Interstitial) PARSER.parseFrom(bArr, o3Var);
        }

        public static Interstitial parseFrom(InputStream inputStream) throws IOException {
            return (Interstitial) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Interstitial parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Interstitial) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Interstitial parseFrom(r rVar) throws IOException {
            return (Interstitial) y4.parseWithIOException(PARSER, rVar);
        }

        public static Interstitial parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Interstitial) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Interstitial(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Interstitial() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterstitialOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Native extends y4 implements NativeOrBuilder {
        public static final int HAS_ICON_FIELD_NUMBER = 1;
        public static final int HAS_IMAGE_FIELD_NUMBER = 2;
        public static final int HAS_VIDEO_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean hasIcon_;
        private boolean hasImage_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Native DEFAULT_INSTANCE = new Native();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Native.1
            @Override // com.explorestack.protobuf.g7
            public Native parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Native(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements NativeOrBuilder {
            private boolean hasIcon_;
            private boolean hasImage_;
            private boolean hasVideo_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public Builder clearHasIcon() {
                this.hasIcon_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasImage() {
                this.hasImage_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Native buildPartial() {
                Native r0 = new Native(this);
                r0.hasIcon_ = this.hasIcon_;
                r0.hasImage_ = this.hasImage_;
                r0.hasVideo_ = this.hasVideo_;
                onBuilt();
                return r0;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasIcon() {
                return this.hasIcon_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasImage() {
                return this.hasImage_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable;
                w4Var.c(Native.class, Builder.class);
                return w4Var;
            }

            public Builder setHasIcon(boolean z) {
                this.hasIcon_ = z;
                onChanged();
                return this;
            }

            public Builder setHasImage(boolean z) {
                this.hasImage_ = z;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Native build() {
                Native nativeBuildPartial = buildPartial();
                if (nativeBuildPartial.isInitialized()) {
                    return nativeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.hasIcon_ = false;
                this.hasImage_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Native r2) {
                if (r2 == Native.getDefaultInstance()) {
                    return this;
                }
                if (r2.getHasIcon()) {
                    setHasIcon(r2.getHasIcon());
                }
                if (r2.getHasImage()) {
                    setHasImage(r2.getHasImage());
                }
                if (r2.getHasVideo()) {
                    setHasVideo(r2.getHasVideo());
                }
                mergeUnknownFields(((y4) r2).unknownFields);
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
            public Native mo250getDefaultInstanceForType() {
                return Native.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Native) {
                    return mergeFrom((Native) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Native r0 = null;
                try {
                    try {
                        Native r3 = (Native) Native.PARSER.parsePartialFrom(rVar, o3Var);
                        if (r3 != null) {
                            mergeFrom(r3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Native r4 = (Native) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
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
            if (!(obj instanceof Native)) {
                return super.equals(obj);
            }
            Native r5 = (Native) obj;
            return getHasIcon() == r5.getHasIcon() && getHasImage() == r5.getHasImage() && getHasVideo() == r5.getHasVideo() && this.unknownFields.equals(r5.unknownFields);
        }

        public static Native getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_descriptor;
        }

        public static Builder newBuilder(Native r1) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
        }

        public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Native) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasIcon() {
            return this.hasIcon_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasImage() {
            return this.hasImage_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.NativeOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            int iC = this.hasIcon_ ? w.c(1) : 0;
            if (this.hasImage_) {
                iC += w.c(2);
            }
            if (this.hasVideo_) {
                iC += w.c(3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iC;
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
            int iHashCode = this.unknownFields.a.hashCode() + ((l5.c(getHasVideo()) + ((((l5.c(getHasImage()) + ((((l5.c(getHasIcon()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Native_fieldAccessorTable;
            w4Var.c(Native.class, Builder.class);
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
            return new Native();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            boolean z = this.hasIcon_;
            if (z) {
                wVar.A(1, z);
            }
            boolean z2 = this.hasImage_;
            if (z2) {
                wVar.A(2, z2);
            }
            boolean z3 = this.hasVideo_;
            if (z3) {
                wVar.A(3, z3);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Native(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 16) {
                                    if (iF != 24) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        this.hasVideo_ = rVar.l();
                                    }
                                } else {
                                    this.hasImage_ = rVar.l();
                                }
                            } else {
                                this.hasIcon_ = rVar.l();
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
        public Native mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Native parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Native) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Native parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Native parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(byteString, o3Var);
        }

        public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr);
        }

        public static Native parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Native) PARSER.parseFrom(bArr, o3Var);
        }

        public static Native parseFrom(InputStream inputStream) throws IOException {
            return (Native) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Native parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Native) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Native parseFrom(r rVar) throws IOException {
            return (Native) y4.parseWithIOException(PARSER, rVar);
        }

        public static Native parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Native) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Native(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Native() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface NativeOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        boolean getHasIcon();

        boolean getHasImage();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Rewarded extends y4 implements RewardedOrBuilder {
        public static final int HAS_BANNER_FIELD_NUMBER = 1;
        public static final int HAS_VIDEO_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean hasBanner_;
        private boolean hasVideo_;
        private byte memoizedIsInitialized;
        private static final Rewarded DEFAULT_INSTANCE = new Rewarded();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.AdFormat.Rewarded.1
            @Override // com.explorestack.protobuf.g7
            public Rewarded parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Rewarded(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements RewardedOrBuilder {
            private boolean hasBanner_;
            private boolean hasVideo_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public Builder clearHasBanner() {
                this.hasBanner_ = false;
                onChanged();
                return this;
            }

            public Builder clearHasVideo() {
                this.hasVideo_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rewarded buildPartial() {
                Rewarded rewarded = new Rewarded(this);
                rewarded.hasBanner_ = this.hasBanner_;
                rewarded.hasVideo_ = this.hasVideo_;
                onBuilt();
                return rewarded;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasBanner() {
                return this.hasBanner_;
            }

            @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
            public boolean getHasVideo() {
                return this.hasVideo_;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable;
                w4Var.c(Rewarded.class, Builder.class);
                return w4Var;
            }

            public Builder setHasBanner(boolean z) {
                this.hasBanner_ = z;
                onChanged();
                return this;
            }

            public Builder setHasVideo(boolean z) {
                this.hasVideo_ = z;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rewarded build() {
                Rewarded rewardedBuildPartial = buildPartial();
                if (rewardedBuildPartial.isInitialized()) {
                    return rewardedBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rewardedBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.hasBanner_ = false;
                this.hasVideo_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Builder mergeFrom(Rewarded rewarded) {
                if (rewarded == Rewarded.getDefaultInstance()) {
                    return this;
                }
                if (rewarded.getHasBanner()) {
                    setHasBanner(rewarded.getHasBanner());
                }
                if (rewarded.getHasVideo()) {
                    setHasVideo(rewarded.getHasVideo());
                }
                mergeUnknownFields(((y4) rewarded).unknownFields);
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
            public Rewarded mo250getDefaultInstanceForType() {
                return Rewarded.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Rewarded) {
                    return mergeFrom((Rewarded) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Rewarded rewarded = null;
                try {
                    try {
                        Rewarded rewarded2 = (Rewarded) Rewarded.PARSER.parsePartialFrom(rVar, o3Var);
                        if (rewarded2 != null) {
                            mergeFrom(rewarded2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Rewarded rewarded3 = (Rewarded) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            rewarded = rewarded3;
                            if (rewarded != null) {
                                mergeFrom(rewarded);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rewarded != null) {
                        mergeFrom(rewarded);
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
            if (!(obj instanceof Rewarded)) {
                return super.equals(obj);
            }
            Rewarded rewarded = (Rewarded) obj;
            return getHasBanner() == rewarded.getHasBanner() && getHasVideo() == rewarded.getHasVideo() && this.unknownFields.equals(rewarded.unknownFields);
        }

        public static Rewarded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_descriptor;
        }

        public static Builder newBuilder(Rewarded rewarded) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rewarded);
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rewarded) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasBanner() {
            return this.hasBanner_;
        }

        @Override // io.bidmachine.protobuf.sdk.AdFormat.RewardedOrBuilder
        public boolean getHasVideo() {
            return this.hasVideo_;
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
            int iC = this.hasBanner_ ? w.c(1) : 0;
            if (this.hasVideo_) {
                iC += w.c(2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iC;
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
            int iHashCode = this.unknownFields.a.hashCode() + ((l5.c(getHasVideo()) + ((((l5.c(getHasBanner()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_Rewarded_fieldAccessorTable;
            w4Var.c(Rewarded.class, Builder.class);
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
            return new Rewarded();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            boolean z = this.hasBanner_;
            if (z) {
                wVar.A(1, z);
            }
            boolean z2 = this.hasVideo_;
            if (z2) {
                wVar.A(2, z2);
            }
            this.unknownFields.writeTo(wVar);
        }

        private Rewarded(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 16) {
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    }
                                } else {
                                    this.hasVideo_ = rVar.l();
                                }
                            } else {
                                this.hasBanner_ = rVar.l();
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
        public Rewarded mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Rewarded parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Rewarded) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Rewarded parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Rewarded parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rewarded parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(byteString, o3Var);
        }

        public static Rewarded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr);
        }

        public static Rewarded parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Rewarded) PARSER.parseFrom(bArr, o3Var);
        }

        public static Rewarded parseFrom(InputStream inputStream) throws IOException {
            return (Rewarded) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Rewarded parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Rewarded) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Rewarded parseFrom(r rVar) throws IOException {
            return (Rewarded) y4.parseWithIOException(PARSER, rVar);
        }

        public static Rewarded parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Rewarded) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Rewarded(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Rewarded() {
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RewardedOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        boolean getHasBanner();

        boolean getHasVideo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum SpecCase implements c5 {
        BANNER(1),
        NATIVE(2),
        REWARDED(3),
        INTERSTITIAL(4),
        SPEC_NOT_SET(0);

        private final int value;

        public static SpecCase forNumber(int i) {
            if (i == 0) {
                return SPEC_NOT_SET;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return NATIVE;
            }
            if (i == 3) {
                return REWARDED;
            }
            if (i != 4) {
                return null;
            }
            return INTERSTITIAL;
        }

        @Override // com.explorestack.protobuf.c5
        public int getNumber() {
            return this.value;
        }

        SpecCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static SpecCase valueOf(int i) {
            return forNumber(i);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdFormat)) {
            return super.equals(obj);
        }
        AdFormat adFormat = (AdFormat) obj;
        if (!getSpecCase().equals(adFormat.getSpecCase())) {
            return false;
        }
        int i = this.specCase_;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && !getInterstitial().equals(adFormat.getInterstitial())) {
                        return false;
                    }
                } else if (!getRewarded().equals(adFormat.getRewarded())) {
                    return false;
                }
            } else if (!getNative().equals(adFormat.getNative())) {
                return false;
            }
        } else if (!getBanner().equals(adFormat.getBanner())) {
            return false;
        }
        return this.unknownFields.equals(adFormat.unknownFields);
    }

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.AdFormat$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase;

        static {
            int[] iArr = new int[SpecCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase = iArr;
            try {
                iArr[SpecCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$AdFormat$SpecCase[SpecCase.SPEC_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static AdFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_descriptor;
    }

    public static Builder newBuilder(AdFormat adFormat) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adFormat);
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Banner getBanner() {
        return this.specCase_ == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public BannerOrBuilder getBannerOrBuilder() {
        return this.specCase_ == 1 ? (Banner) this.spec_ : Banner.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Interstitial getInterstitial() {
        return this.specCase_ == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public InterstitialOrBuilder getInterstitialOrBuilder() {
        return this.specCase_ == 4 ? (Interstitial) this.spec_ : Interstitial.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Native getNative() {
        return this.specCase_ == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public NativeOrBuilder getNativeOrBuilder() {
        return this.specCase_ == 2 ? (Native) this.spec_ : Native.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public Rewarded getRewarded() {
        return this.specCase_ == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public RewardedOrBuilder getRewardedOrBuilder() {
        return this.specCase_ == 3 ? (Rewarded) this.spec_ : Rewarded.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iO = this.specCase_ == 1 ? w.o(1, (Banner) this.spec_) : 0;
        if (this.specCase_ == 2) {
            iO += w.o(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            iO += w.o(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            iO += w.o(4, (Interstitial) this.spec_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iO;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public SpecCase getSpecCase() {
        return SpecCase.forNumber(this.specCase_);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasBanner() {
        return this.specCase_ == 1;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasInterstitial() {
        return this.specCase_ == 4;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasNative() {
        return this.specCase_ == 2;
    }

    @Override // io.p071bidmachine.protobuf.sdk.AdFormatOrBuilder
    public boolean hasRewarded() {
        return this.specCase_ == 3;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int iC;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode2 = getDescriptor().hashCode() + 779;
        int i2 = this.specCase_;
        if (i2 == 1) {
            iC = pv1.c(iHashCode2, 37, 1, 53);
            iHashCode = getBanner().hashCode();
        } else if (i2 == 2) {
            iC = pv1.c(iHashCode2, 37, 2, 53);
            iHashCode = getNative().hashCode();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    iC = pv1.c(iHashCode2, 37, 4, 53);
                    iHashCode = getInterstitial().hashCode();
                }
                int iHashCode3 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iC = pv1.c(iHashCode2, 37, 3, 53);
            iHashCode = getRewarded().hashCode();
        }
        iHashCode2 = iC + iHashCode;
        int iHashCode4 = this.unknownFields.a.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = SDKProto.internal_static_bidmachine_protobuf_sdk_AdFormat_fieldAccessorTable;
        w4Var.c(AdFormat.class, Builder.class);
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
        return new AdFormat();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (this.specCase_ == 1) {
            wVar.M(1, (Banner) this.spec_);
        }
        if (this.specCase_ == 2) {
            wVar.M(2, (Native) this.spec_);
        }
        if (this.specCase_ == 3) {
            wVar.M(3, (Rewarded) this.spec_);
        }
        if (this.specCase_ == 4) {
            wVar.M(4, (Interstitial) this.spec_);
        }
        this.unknownFields.writeTo(wVar);
    }

    private AdFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 26) {
                                    if (iF != 34) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        Interstitial.Builder builder = this.specCase_ == 4 ? ((Interstitial) this.spec_).toBuilder() : null;
                                        MessageLite messageLiteV = rVar.v(Interstitial.parser(), o3Var);
                                        this.spec_ = messageLiteV;
                                        if (builder != null) {
                                            builder.mergeFrom((Interstitial) messageLiteV);
                                            this.spec_ = builder.buildPartial();
                                        }
                                        this.specCase_ = 4;
                                    }
                                } else {
                                    Rewarded.Builder builder2 = this.specCase_ == 3 ? ((Rewarded) this.spec_).toBuilder() : null;
                                    MessageLite messageLiteV2 = rVar.v(Rewarded.parser(), o3Var);
                                    this.spec_ = messageLiteV2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Rewarded) messageLiteV2);
                                        this.spec_ = builder2.buildPartial();
                                    }
                                    this.specCase_ = 3;
                                }
                            } else {
                                Native.Builder builder3 = this.specCase_ == 2 ? ((Native) this.spec_).toBuilder() : null;
                                MessageLite messageLiteV3 = rVar.v(Native.parser(), o3Var);
                                this.spec_ = messageLiteV3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((Native) messageLiteV3);
                                    this.spec_ = builder3.buildPartial();
                                }
                                this.specCase_ = 2;
                            }
                        } else {
                            Banner.Builder builder4 = this.specCase_ == 1 ? ((Banner) this.spec_).toBuilder() : null;
                            MessageLite messageLiteV4 = rVar.v(Banner.parser(), o3Var);
                            this.spec_ = messageLiteV4;
                            if (builder4 != null) {
                                builder4.mergeFrom((Banner) messageLiteV4);
                                this.spec_ = builder4.buildPartial();
                            }
                            this.specCase_ = 1;
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
    public AdFormat mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static AdFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (AdFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static AdFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static AdFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(byteString, o3Var);
    }

    public static AdFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr);
    }

    public static AdFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdFormat) PARSER.parseFrom(bArr, o3Var);
    }

    public static AdFormat parseFrom(InputStream inputStream) throws IOException {
        return (AdFormat) y4.parseWithIOException(PARSER, inputStream);
    }

    public static AdFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (AdFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static AdFormat parseFrom(r rVar) throws IOException {
        return (AdFormat) y4.parseWithIOException(PARSER, rVar);
    }

    public static AdFormat parseFrom(r rVar, o3 o3Var) throws IOException {
        return (AdFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private AdFormat(g4 g4Var) {
        super(g4Var);
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private AdFormat() {
        this.specCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}
