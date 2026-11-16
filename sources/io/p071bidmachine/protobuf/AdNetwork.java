package io.p071bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a6;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.d6;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.h9;
import com.explorestack.protobuf.k6;
import com.explorestack.protobuf.l9;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdNetwork extends y4 implements AdNetworkOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private volatile Object className_;
    private k6 customParams_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private static final AdNetwork DEFAULT_INSTANCE = new AdNetwork();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.AdNetwork.1
        @Override // com.explorestack.protobuf.g7
        public AdNetwork parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new AdNetwork(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AdUnit extends y4 implements AdUnitOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int CUSTOM_PARAMS_FIELD_NUMBER = 2;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.AdNetwork.AdUnit.1
            @Override // com.explorestack.protobuf.g7
            public AdUnit parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new AdUnit(rVar, o3Var);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object adFormat_;
        private k6 customParams_;
        private byte memoizedIsInitialized;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements AdUnitOrBuilder {
            private Object adFormat_;
            private int bitField0_;
            private k6 customParams_;

            private Builder() {
                super(null);
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.g4
            public k6 internalGetMapField(int i) {
                if (i == 2) {
                    return internalGetCustomParams();
                }
                y.j(pv1.k(i, "Invalid map field number: "));
                return null;
            }

            @Override // com.explorestack.protobuf.g4
            public k6 internalGetMutableMapField(int i) {
                if (i == 2) {
                    return internalGetMutableCustomParams();
                }
                y.j(pv1.k(i, "Invalid map field number: "));
                return null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            private k6 internalGetCustomParams() {
                k6 k6Var = this.customParams_;
                return k6Var == null ? k6.e(CustomParamsDefaultEntryHolder.defaultEntry) : k6Var;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit(this);
                adUnit.adFormat_ = this.adFormat_;
                adUnit.customParams_ = internalGetCustomParams();
                adUnit.customParams_.a = false;
                onBuilt();
                return adUnit;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getAdFormat() {
                Object obj = this.adFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adFormat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public ByteString getAdFormatBytes() {
                Object obj = this.adFormat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adFormat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable;
                w4Var.c(AdUnit.class, Builder.class);
                return w4Var;
            }

            private k6 internalGetMutableCustomParams() {
                onChanged();
                if (this.customParams_ == null) {
                    this.customParams_ = k6.l(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.customParams_.a) {
                    this.customParams_ = this.customParams_.d();
                }
                return this.customParams_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = y4.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit build() {
                AdUnit adUnitBuildPartial = buildPartial();
                if (adUnitBuildPartial.isInitialized()) {
                    return adUnitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.adFormat_ = "";
                internalGetMutableCustomParams().a();
                return this;
            }

            public Builder clearAdFormat() {
                this.adFormat_ = AdUnit.getDefaultInstance().getAdFormat();
                onChanged();
                return this;
            }

            public Builder clearCustomParams() {
                internalGetMutableCustomParams().j().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public boolean containsCustomParams(String str) {
                str.getClass();
                return internalGetCustomParams().h().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomParams() {
                return getCustomParamsMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public int getCustomParamsCount() {
                return internalGetCustomParams().h().size();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public Map<String, String> getCustomParamsMap() {
                return internalGetCustomParams().h();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrDefault(String str, String str2) {
                str.getClass();
                Map mapH = internalGetCustomParams().h();
                if (mapH.containsKey(str)) {
                    return (String) mapH.get(str);
                }
                return str2;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrThrow(String str) {
                str.getClass();
                Map mapH = internalGetCustomParams().h();
                if (mapH.containsKey(str)) {
                    return (String) mapH.get(str);
                }
                e32.a();
                return null;
            }

            @Deprecated
            public Map<String, String> getMutableCustomParams() {
                return internalGetMutableCustomParams().j();
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getAdFormat().isEmpty()) {
                    this.adFormat_ = adUnit.adFormat_;
                    onChanged();
                }
                internalGetMutableCustomParams().k(adUnit.internalGetCustomParams());
                mergeUnknownFields(((y4) adUnit).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder putAllCustomParams(Map<String, String> map) {
                internalGetMutableCustomParams().j().putAll(map);
                return this;
            }

            public Builder putCustomParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCustomParams().j().put(str, str2);
                return this;
            }

            public Builder removeCustomParams(String str) {
                str.getClass();
                internalGetMutableCustomParams().j().remove(str);
                return this;
            }

            public Builder setAdFormat(String str) {
                str.getClass();
                this.adFormat_ = str;
                onChanged();
                return this;
            }

            public Builder setAdFormatBytes(ByteString byteString) {
                byteString.getClass();
                c.checkByteStringIsUtf8(byteString);
                this.adFormat_ = byteString;
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
            public AdUnit mo250getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
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
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                AdUnit adUnit = null;
                try {
                    try {
                        AdUnit adUnit2 = (AdUnit) AdUnit.PARSER.parsePartialFrom(rVar, o3Var);
                        if (adUnit2 != null) {
                            mergeFrom(adUnit2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        AdUnit adUnit3 = (AdUnit) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            adUnit = adUnit3;
                            if (adUnit != null) {
                                mergeFrom(adUnit);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (adUnit != null) {
                        mergeFrom(adUnit);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class CustomParamsDefaultEntryHolder {
            static final d6 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor;
                h9 h9Var = l9.c;
                defaultEntry = new d6(descriptor, h9Var, h9Var, "");
            }

            private CustomParamsDefaultEntryHolder() {
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            return getAdFormat().equals(adUnit.getAdFormat()) && internalGetCustomParams().equals(adUnit.internalGetCustomParams()) && this.unknownFields.equals(adUnit.unknownFields);
        }

        @Override // com.explorestack.protobuf.y4
        public k6 internalGetMapField(int i) {
            if (i == 2) {
                return internalGetCustomParams();
            }
            y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public k6 internalGetCustomParams() {
            k6 k6Var = this.customParams_;
            return k6Var == null ? k6.e(CustomParamsDefaultEntryHolder.defaultEntry) : k6Var;
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getAdFormat() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adFormat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public ByteString getAdFormatBytes() {
            Object obj = this.adFormat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adFormat_ = byteStringCopyFromUtf8;
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
            int iComputeStringSize = !getAdFormatBytes().isEmpty() ? y4.computeStringSize(1, this.adFormat_) : 0;
            for (Map.Entry entry : internalGetCustomParams().h().entrySet()) {
                a6 a6VarNewBuilderForType = CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType();
                a6VarNewBuilderForType.b = entry.getKey();
                a6VarNewBuilderForType.d = true;
                a6VarNewBuilderForType.c = entry.getValue();
                a6VarNewBuilderForType.e = true;
                iComputeStringSize += w.p(a6VarNewBuilderForType.build()) + w.s(2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
            int iHashCode = getAdFormat().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (!internalGetCustomParams().h().isEmpty()) {
                iHashCode = internalGetCustomParams().hashCode() + pv1.c(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable;
            w4Var.c(AdUnit.class, Builder.class);
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
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AdUnit(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                            if (iF != 10) {
                                if (iF != 18) {
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    }
                                } else {
                                    if (!z2) {
                                        this.customParams_ = k6.l(CustomParamsDefaultEntryHolder.defaultEntry);
                                        z2 = true;
                                    }
                                    d6 d6Var = (d6) rVar.v(CustomParamsDefaultEntryHolder.defaultEntry.c.f, o3Var);
                                    this.customParams_.j().put(d6Var.a, d6Var.b);
                                }
                            } else {
                                this.adFormat_ = rVar.E();
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

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().h().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().h().size();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().h();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapH = internalGetCustomParams().h();
            if (mapH.containsKey(str)) {
                return (String) mapH.get(str);
            }
            return str2;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map mapH = internalGetCustomParams().h();
            if (mapH.containsKey(str)) {
                return (String) mapH.get(str);
            }
            e32.a();
            return null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (!getAdFormatBytes().isEmpty()) {
                y4.writeString(wVar, 1, this.adFormat_);
            }
            y4.serializeStringMapTo(wVar, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 2);
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public AdUnit mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (AdUnit) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdUnit parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString, o3Var);
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr);
        }

        public static AdUnit parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr, o3Var);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) y4.parseWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (AdUnit) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static AdUnit parseFrom(r rVar) throws IOException {
            return (AdUnit) y4.parseWithIOException(PARSER, rVar);
        }

        public static AdUnit parseFrom(r rVar, o3 o3Var) throws IOException {
            return (AdUnit) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private AdUnit(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private AdUnit() {
            this.memoizedIsInitialized = (byte) -1;
            this.adFormat_ = "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsCustomParams(String str);

        String getAdFormat();

        ByteString getAdFormatBytes();

        @Deprecated
        Map<String, String> getCustomParams();

        int getCustomParamsCount();

        Map<String, String> getCustomParamsMap();

        String getCustomParamsOrDefault(String str, String str2);

        String getCustomParamsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements AdNetworkOrBuilder {
        private o7 adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;
        private Object className_;
        private k6 customParams_;
        private Object name_;

        private Builder() {
            super(null);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMapField(int i) {
            if (i == 3) {
                return internalGetCustomParams();
            }
            y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMutableMapField(int i) {
            if (i == 3) {
                return internalGetMutableCustomParams();
            }
            y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 2;
            }
        }

        private o7 getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new o7(this.adUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        private k6 internalGetCustomParams() {
            k6 k6Var = this.customParams_;
            return k6Var == null ? k6.e(CustomParamsDefaultEntryHolder.defaultEntry) : k6Var;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.add(builder.build());
            onChanged();
            return this;
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureAdUnitsIsMutable();
            b.addAll((Iterable) iterable, (List) this.adUnits_);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork buildPartial() {
            AdNetwork adNetwork = new AdNetwork(this);
            adNetwork.name_ = this.name_;
            adNetwork.className_ = this.className_;
            adNetwork.customParams_ = internalGetCustomParams();
            adNetwork.customParams_.a = false;
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -3;
                }
                adNetwork.adUnits_ = this.adUnits_;
            } else {
                adNetwork.adUnits_ = o7Var.f();
            }
            onBuilt();
            return adNetwork;
        }

        public Builder clearAdUnits() {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.adUnits_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnit getAdUnits(int i) {
            o7 o7Var = this.adUnitsBuilder_;
            return o7Var == null ? this.adUnits_.get(i) : (AdUnit) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public int getAdUnitsCount() {
            o7 o7Var = this.adUnitsBuilder_;
            return o7Var == null ? this.adUnits_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public List<AdUnit> getAdUnitsList() {
            o7 o7Var = this.adUnitsBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.adUnits_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            o7 o7Var = this.adUnitsBuilder_;
            return o7Var == null ? this.adUnits_.get(i) : (AdUnitOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            o7 o7Var = this.adUnitsBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.adUnits_);
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public String getClassName() {
            Object obj = this.className_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.className_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable;
            w4Var.c(AdNetwork.class, Builder.class);
            return w4Var;
        }

        public Builder removeAdUnits(int i) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i);
            onChanged();
            return this;
        }

        public Builder setAdUnits(int i, AdUnit.Builder builder) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i, builder.build());
            onChanged();
            return this;
        }

        private k6 internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = k6.l(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.a) {
                this.customParams_ = this.customParams_.d();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().c(AdUnit.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork build() {
            AdNetwork adNetworkBuildPartial = buildPartial();
            if (adNetworkBuildPartial.isInitialized()) {
                return adNetworkBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adNetworkBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            this.className_ = "";
            internalGetMutableCustomParams().a();
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            o7Var.g();
            return this;
        }

        public Builder clearClassName() {
            this.className_ = AdNetwork.getDefaultInstance().getClassName();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().j().clear();
            return this;
        }

        public Builder clearName() {
            this.name_ = AdNetwork.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().h().containsKey(str);
        }

        public AdUnit.Builder getAdUnitsBuilder(int i) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().j(i);
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().k();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().h().size();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().h();
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapH = internalGetCustomParams().h();
            if (mapH.containsKey(str)) {
                return (String) mapH.get(str);
            }
            return str2;
        }

        @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map mapH = internalGetCustomParams().h();
            if (mapH.containsKey(str)) {
                return (String) mapH.get(str);
            }
            e32.a();
            return null;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().j();
        }

        public Builder mergeFrom(AdNetwork adNetwork) {
            if (adNetwork == AdNetwork.getDefaultInstance()) {
                return this;
            }
            if (!adNetwork.getName().isEmpty()) {
                this.name_ = adNetwork.name_;
                onChanged();
            }
            if (!adNetwork.getClassName().isEmpty()) {
                this.className_ = adNetwork.className_;
                onChanged();
            }
            internalGetMutableCustomParams().k(adNetwork.internalGetCustomParams());
            if (this.adUnitsBuilder_ == null) {
                if (!adNetwork.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = adNetwork.adUnits_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(adNetwork.adUnits_);
                    }
                    onChanged();
                }
            } else if (!adNetwork.adUnits_.isEmpty()) {
                boolean zIsEmpty = this.adUnitsBuilder_.b.isEmpty();
                o7 o7Var = this.adUnitsBuilder_;
                if (zIsEmpty) {
                    o7 adUnitsFieldBuilder = null;
                    o7Var.a = null;
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = adNetwork.adUnits_;
                    this.bitField0_ &= -3;
                    if (y4.alwaysUseFieldBuilders) {
                        adUnitsFieldBuilder = getAdUnitsFieldBuilder();
                    }
                    this.adUnitsBuilder_ = adUnitsFieldBuilder;
                } else {
                    o7Var.a(adNetwork.adUnits_);
                }
            }
            mergeUnknownFields(((y4) adNetwork).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().j().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().j().put(str, str2);
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().j().remove(str);
            return this;
        }

        public Builder setClassName(String str) {
            str.getClass();
            this.className_ = str;
            onChanged();
            return this;
        }

        public Builder setClassNameBytes(ByteString byteString) {
            byteString.getClass();
            c.checkByteStringIsUtf8(byteString);
            this.className_ = byteString;
            onChanged();
            return this;
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
        public AdNetwork mo250getDefaultInstanceForType() {
            return AdNetwork.getDefaultInstance();
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

        public AdUnit.Builder addAdUnitsBuilder(int i) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().b(i, AdUnit.getDefaultInstance());
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addAdUnits(int i, AdUnit adUnit) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, adUnit);
                onChanged();
                return this;
            }
            o7Var.d(i, adUnit);
            return this;
        }

        public Builder setAdUnits(int i, AdUnit adUnit) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i, adUnit);
                onChanged();
                return this;
            }
            o7Var.s(i, adUnit);
            return this;
        }

        public Builder addAdUnits(AdUnit adUnit) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(adUnit);
                onChanged();
                return this;
            }
            o7Var.e(adUnit);
            return this;
        }

        public Builder addAdUnits(int i, AdUnit.Builder builder) {
            o7 o7Var = this.adUnitsBuilder_;
            if (o7Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdNetwork) {
                return mergeFrom((AdNetwork) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            AdNetwork adNetwork = null;
            try {
                try {
                    AdNetwork adNetwork2 = (AdNetwork) AdNetwork.PARSER.parsePartialFrom(rVar, o3Var);
                    if (adNetwork2 != null) {
                        mergeFrom(adNetwork2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    AdNetwork adNetwork3 = (AdNetwork) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        adNetwork = adNetwork3;
                        if (adNetwork != null) {
                            mergeFrom(adNetwork);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (adNetwork != null) {
                    mergeFrom(adNetwork);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class CustomParamsDefaultEntryHolder {
        static final d6 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor;
            h9 h9Var = l9.c;
            defaultEntry = new d6(descriptor, h9Var, h9Var, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdNetwork)) {
            return super.equals(obj);
        }
        AdNetwork adNetwork = (AdNetwork) obj;
        return getName().equals(adNetwork.getName()) && getClassName().equals(adNetwork.getClassName()) && internalGetCustomParams().equals(adNetwork.internalGetCustomParams()) && getAdUnitsList().equals(adNetwork.getAdUnitsList()) && this.unknownFields.equals(adNetwork.unknownFields);
    }

    @Override // com.explorestack.protobuf.y4
    public k6 internalGetMapField(int i) {
        if (i == 3) {
            return internalGetCustomParams();
        }
        y.j(pv1.k(i, "Invalid map field number: "));
        return null;
    }

    public static AdNetwork getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k6 internalGetCustomParams() {
        k6 k6Var = this.customParams_;
        return k6Var == null ? k6.e(CustomParamsDefaultEntryHolder.defaultEntry) : k6Var;
    }

    public static Builder newBuilder(AdNetwork adNetwork) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adNetwork);
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnit getAdUnits(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public String getClassName() {
        Object obj = this.className_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.className_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public ByteString getClassNameBytes() {
        Object obj = this.className_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.className_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
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

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? y4.computeStringSize(1, this.name_) : 0;
        if (!getClassNameBytes().isEmpty()) {
            iComputeStringSize += y4.computeStringSize(2, this.className_);
        }
        for (Map.Entry entry : internalGetCustomParams().h().entrySet()) {
            a6 a6VarNewBuilderForType = CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType();
            a6VarNewBuilderForType.b = entry.getKey();
            a6VarNewBuilderForType.d = true;
            a6VarNewBuilderForType.c = entry.getValue();
            a6VarNewBuilderForType.e = true;
            iComputeStringSize += w.p(a6VarNewBuilderForType.build()) + w.s(3);
        }
        for (int i2 = 0; i2 < this.adUnits_.size(); i2++) {
            iComputeStringSize += w.o(4, this.adUnits_.get(i2));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
        int iHashCode = getClassName().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (!internalGetCustomParams().h().isEmpty()) {
            iHashCode = pv1.c(iHashCode, 37, 3, 53) + internalGetCustomParams().hashCode();
        }
        if (getAdUnitsCount() > 0) {
            iHashCode = pv1.c(iHashCode, 37, 4, 53) + getAdUnitsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable;
        w4Var.c(AdNetwork.class, Builder.class);
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
        return new AdNetwork();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private AdNetwork(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        int i = 0;
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
                                        if ((i & 2) == 0) {
                                            this.adUnits_ = new ArrayList();
                                            i |= 2;
                                        }
                                        this.adUnits_.add((AdUnit) rVar.v(AdUnit.parser(), o3Var));
                                    }
                                } else {
                                    if ((i & 1) == 0) {
                                        this.customParams_ = k6.l(CustomParamsDefaultEntryHolder.defaultEntry);
                                        i |= 1;
                                    }
                                    d6 d6Var = (d6) rVar.v(CustomParamsDefaultEntryHolder.defaultEntry.c.f, o3Var);
                                    this.customParams_.j().put(d6Var.a, d6Var.b);
                                }
                            } else {
                                this.className_ = rVar.E();
                            }
                        } else {
                            this.name_ = rVar.E();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 2) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 2) != 0) {
            this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().h().containsKey(str);
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().h().size();
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().h();
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map mapH = internalGetCustomParams().h();
        if (mapH.containsKey(str)) {
            return (String) mapH.get(str);
        }
        return str2;
    }

    @Override // io.p071bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map mapH = internalGetCustomParams().h();
        if (mapH.containsKey(str)) {
            return (String) mapH.get(str);
        }
        e32.a();
        return null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.name_);
        }
        if (!getClassNameBytes().isEmpty()) {
            y4.writeString(wVar, 2, this.className_);
        }
        y4.serializeStringMapTo(wVar, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 3);
        for (int i = 0; i < this.adUnits_.size(); i++) {
            wVar.M(4, this.adUnits_.get(i));
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public AdNetwork mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (AdNetwork) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static AdNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdNetwork parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString, o3Var);
    }

    public static AdNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr);
    }

    public static AdNetwork parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr, o3Var);
    }

    public static AdNetwork parseFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) y4.parseWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (AdNetwork) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static AdNetwork parseFrom(r rVar) throws IOException {
        return (AdNetwork) y4.parseWithIOException(PARSER, rVar);
    }

    public static AdNetwork parseFrom(r rVar, o3 o3Var) throws IOException {
        return (AdNetwork) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private AdNetwork(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private AdNetwork() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.className_ = "";
        this.adUnits_ = Collections.EMPTY_LIST;
    }
}
