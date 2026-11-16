package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.c8;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.h5;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.r5;
import com.explorestack.protobuf.s5;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import com.explorestack.protobuf.z;
import com.ironsource.C5073y1;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Placement extends y4 implements e {
    public static final int ADMX_FIELD_NUMBER = 14;
    public static final int BADV_FIELD_NUMBER = 9;
    public static final int BAPP_FIELD_NUMBER = 10;
    public static final int BATTR_FIELD_NUMBER = 11;
    public static final int BCAT_FIELD_NUMBER = 6;
    public static final int CATTAX_FIELD_NUMBER = 7;
    public static final int CURLX_FIELD_NUMBER = 15;
    public static final int DISPLAY_FIELD_NUMBER = 16;
    public static final int EXT_FIELD_NUMBER = 20;
    public static final int EXT_PROTO_FIELD_NUMBER = 19;
    public static final int REWARD_FIELD_NUMBER = 5;
    public static final int SDKVER_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int SECURE_FIELD_NUMBER = 13;
    public static final int SSAI_FIELD_NUMBER = 2;
    public static final int TAGID_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 17;
    public static final int WLANG_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private boolean admx_;
    private s5 badv_;
    private s5 bapp_;
    private int battrMemoizedSerializedSize;
    private List<Integer> battr_;
    private s5 bcat_;
    private int cattax_;
    private boolean curlx_;
    private DisplayPlacement display_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private boolean reward_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private boolean secure_;
    private int ssai_;
    private volatile Object tagid_;
    private VideoPlacement video_;
    private s5 wlang_;
    private static final h5 battr_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.1
        @Override // com.explorestack.protobuf.h5
        public CreativeAttribute convert(Integer num) {
            CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
            if (creativeAttributeValueOf == null) {
                return CreativeAttribute.UNRECOGNIZED;
            }
            return creativeAttributeValueOf;
        }
    };
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.2
        @Override // com.explorestack.protobuf.g7
        public Placement parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Placement(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements e {
        private boolean admx_;
        private s5 badv_;
        private s5 bapp_;
        private List<Integer> battr_;
        private s5 bcat_;
        private int bitField0_;
        private int cattax_;
        private boolean curlx_;
        private v7 displayBuilder_;
        private DisplayPlacement display_;
        private v7 extBuilder_;
        private o7 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean reward_;
        private Object sdk_;
        private Object sdkver_;
        private boolean secure_;
        private int ssai_;
        private Object tagid_;
        private v7 videoBuilder_;
        private VideoPlacement video_;
        private s5 wlang_;

        private Builder() {
            super(null);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            r5 r5Var = r5.c;
            this.bcat_ = r5Var;
            this.cattax_ = 0;
            this.badv_ = r5Var;
            this.bapp_ = r5Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = r5Var;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder clearAdmx() {
            this.admx_ = false;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCurlx() {
            this.curlx_ = false;
            onChanged();
            return this;
        }

        public Builder clearReward() {
            this.reward_ = false;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearSsai() {
            this.ssai_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureBadvIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.badv_ = new r5(this.badv_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureBappIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.bapp_ = new r5(this.bapp_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureBattrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.battr_ = new ArrayList(this.battr_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureBcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.bcat_ = new r5(this.bcat_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureWlangIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.wlang_ = new r5(this.wlang_);
                this.bitField0_ |= 16;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.E;
        }

        private v7 getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new v7(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
        }

        private v7 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private o7 getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private v7 getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new v7(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureExtProtoIsMutable();
            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureExtProtoIsMutable();
            this.extProto_.add(builder.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.tagid_ = this.tagid_;
            placement.ssai_ = this.ssai_;
            placement.sdk_ = this.sdk_;
            placement.sdkver_ = this.sdkver_;
            placement.reward_ = this.reward_;
            if ((this.bitField0_ & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            placement.bcat_ = this.bcat_;
            placement.cattax_ = this.cattax_;
            if ((this.bitField0_ & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            placement.badv_ = this.badv_;
            if ((this.bitField0_ & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            placement.bapp_ = this.bapp_;
            if ((this.bitField0_ & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
                this.bitField0_ &= -9;
            }
            placement.battr_ = this.battr_;
            if ((this.bitField0_ & 16) != 0) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
                this.bitField0_ &= -17;
            }
            placement.wlang_ = this.wlang_;
            placement.secure_ = this.secure_;
            placement.admx_ = this.admx_;
            placement.curlx_ = this.curlx_;
            v7 v7Var = this.displayBuilder_;
            if (v7Var == null) {
                placement.display_ = this.display_;
            } else {
                placement.display_ = (DisplayPlacement) v7Var.a();
            }
            v7 v7Var2 = this.videoBuilder_;
            if (v7Var2 == null) {
                placement.video_ = this.video_;
            } else {
                placement.video_ = (VideoPlacement) v7Var2.a();
            }
            v7 v7Var3 = this.extBuilder_;
            if (v7Var3 == null) {
                placement.ext_ = this.ext_;
            } else {
                placement.ext_ = (Struct) v7Var3.a();
            }
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -33;
                }
                placement.extProto_ = this.extProto_;
            } else {
                placement.extProto_ = o7Var.f();
            }
            onBuilt();
            return placement;
        }

        public Builder clearBadv() {
            this.badv_ = r5.c;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearBapp() {
            this.bapp_ = r5.c;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearBattr() {
            this.battr_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearBcat() {
            this.bcat_ = r5.c;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
                return this;
            }
            this.display_ = null;
            this.displayBuilder_ = null;
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder clearExtProto() {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.extProto_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
                return this;
            }
            this.video_ = null;
            this.videoBuilder_ = null;
            return this;
        }

        public Builder clearWlang() {
            this.wlang_ = r5.c;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public boolean getAdmx() {
            return this.admx_;
        }

        public String getBadv(int i) {
            return (String) this.badv_.get(i);
        }

        public ByteString getBadvBytes(int i) {
            return this.badv_.getByteString(i);
        }

        public int getBadvCount() {
            return this.badv_.size();
        }

        /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
        public j7 m272getBadvList() {
            return this.badv_.getUnmodifiableView();
        }

        public String getBapp(int i) {
            return (String) this.bapp_.get(i);
        }

        public ByteString getBappBytes(int i) {
            return this.bapp_.getByteString(i);
        }

        public int getBappCount() {
            return this.bapp_.size();
        }

        /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
        public j7 m273getBappList() {
            return this.bapp_.getUnmodifiableView();
        }

        public int getBattrCount() {
            return this.battr_.size();
        }

        public List<CreativeAttribute> getBattrList() {
            return new i5(this.battr_, Placement.battr_converter_);
        }

        public int getBattrValue(int i) {
            return this.battr_.get(i).intValue();
        }

        public List<Integer> getBattrValueList() {
            return Collections.unmodifiableList(this.battr_);
        }

        public String getBcat(int i) {
            return (String) this.bcat_.get(i);
        }

        public ByteString getBcatBytes(int i) {
            return this.bcat_.getByteString(i);
        }

        public int getBcatCount() {
            return this.bcat_.size();
        }

        /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
        public j7 m274getBcatList() {
            return this.bcat_.getUnmodifiableView();
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public boolean getCurlx() {
            return this.curlx_;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.E;
        }

        public DisplayPlacement getDisplay() {
            v7 v7Var = this.displayBuilder_;
            if (v7Var != null) {
                return (DisplayPlacement) v7Var.d();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public DisplayPlacementOrBuilder getDisplayOrBuilder() {
            v7 v7Var = this.displayBuilder_;
            if (v7Var != null) {
                return (DisplayPlacementOrBuilder) v7Var.e();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public Struct getExt() {
            v7 v7Var = this.extBuilder_;
            if (v7Var != null) {
                return (Struct) v7Var.d();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public c8 getExtOrBuilder() {
            v7 v7Var = this.extBuilder_;
            if (v7Var != null) {
                return (c8) v7Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Any getExtProto(int i) {
            o7 o7Var = this.extProtoBuilder_;
            return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
        }

        public int getExtProtoCount() {
            o7 o7Var = this.extProtoBuilder_;
            return o7Var == null ? this.extProto_.size() : o7Var.b.size();
        }

        public List<Any> getExtProtoList() {
            o7 o7Var = this.extProtoBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
        }

        public g getExtProtoOrBuilder(int i) {
            o7 o7Var = this.extProtoBuilder_;
            return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
        }

        public List<? extends g> getExtProtoOrBuilderList() {
            o7 o7Var = this.extProtoBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
        }

        public boolean getReward() {
            return this.reward_;
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public int getSsai() {
            return this.ssai_;
        }

        public String getTagid() {
            Object obj = this.tagid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tagid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTagidBytes() {
            Object obj = this.tagid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tagid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public VideoPlacement getVideo() {
            v7 v7Var = this.videoBuilder_;
            if (v7Var != null) {
                return (VideoPlacement) v7Var.d();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public VideoPlacementOrBuilder getVideoOrBuilder() {
            v7 v7Var = this.videoBuilder_;
            if (v7Var != null) {
                return (VideoPlacementOrBuilder) v7Var.e();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public String getWlang(int i) {
            return (String) this.wlang_.get(i);
        }

        public ByteString getWlangBytes(int i) {
            return this.wlang_.getByteString(i);
        }

        public int getWlangCount() {
            return this.wlang_.size();
        }

        /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
        public j7 m275getWlangList() {
            return this.wlang_.getUnmodifiableView();
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.F;
            w4Var.c(Placement.class, Builder.class);
            return w4Var;
        }

        public Builder mergeDisplay(DisplayPlacement displayPlacement) {
            v7 v7Var = this.displayBuilder_;
            if (v7Var != null) {
                v7Var.f(displayPlacement);
                return this;
            }
            DisplayPlacement displayPlacement2 = this.display_;
            if (displayPlacement2 != null) {
                this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
            } else {
                this.display_ = displayPlacement;
            }
            onChanged();
            return this;
        }

        public Builder mergeExt(Struct struct) {
            v7 v7Var = this.extBuilder_;
            if (v7Var != null) {
                v7Var.f(struct);
                return this;
            }
            Struct struct2 = this.ext_;
            if (struct2 != null) {
                this.ext_ = z.m(struct2, struct);
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeVideo(VideoPlacement videoPlacement) {
            v7 v7Var = this.videoBuilder_;
            if (v7Var != null) {
                v7Var.f(videoPlacement);
                return this;
            }
            VideoPlacement videoPlacement2 = this.video_;
            if (videoPlacement2 != null) {
                this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
            } else {
                this.video_ = videoPlacement;
            }
            onChanged();
            return this;
        }

        public Builder removeExtProto(int i) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureExtProtoIsMutable();
            this.extProto_.remove(i);
            onChanged();
            return this;
        }

        public Builder setAdmx(boolean z) {
            this.admx_ = z;
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i) {
            this.cattax_ = i;
            onChanged();
            return this;
        }

        public Builder setCurlx(boolean z) {
            this.curlx_ = z;
            onChanged();
            return this;
        }

        public Builder setDisplay(DisplayPlacement.Builder builder) {
            v7 v7Var = this.displayBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.display_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            v7 v7Var = this.extBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.ext_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setExtProto(int i, Any.Builder builder) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureExtProtoIsMutable();
            this.extProto_.set(i, builder.build());
            onChanged();
            return this;
        }

        public Builder setReward(boolean z) {
            this.reward_ = z;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z) {
            this.secure_ = z;
            onChanged();
            return this;
        }

        public Builder setSsai(int i) {
            this.ssai_ = i;
            onChanged();
            return this;
        }

        public Builder setVideo(VideoPlacement.Builder builder) {
            v7 v7Var = this.videoBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.video_ = builder.build();
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllBadv(Iterable<String> iterable) {
            ensureBadvIsMutable();
            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.badv_);
            onChanged();
            return this;
        }

        public Builder addAllBapp(Iterable<String> iterable) {
            ensureBappIsMutable();
            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.bapp_);
            onChanged();
            return this;
        }

        public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
            ensureBattrIsMutable();
            Iterator<? extends CreativeAttribute> it = iterable.iterator();
            while (it.hasNext()) {
                this.battr_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder addAllBattrValue(Iterable<Integer> iterable) {
            ensureBattrIsMutable();
            for (Integer num : iterable) {
                num.intValue();
                this.battr_.add(num);
            }
            onChanged();
            return this;
        }

        public Builder addAllBcat(Iterable<String> iterable) {
            ensureBcatIsMutable();
            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.bcat_);
            onChanged();
            return this;
        }

        public Builder addAllWlang(Iterable<String> iterable) {
            ensureWlangIsMutable();
            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.wlang_);
            onChanged();
            return this;
        }

        public Builder addBadv(String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.add(str);
            onChanged();
            return this;
        }

        public Builder addBadvBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            ensureBadvIsMutable();
            this.badv_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addBapp(String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.add(str);
            onChanged();
            return this;
        }

        public Builder addBappBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            ensureBappIsMutable();
            this.bapp_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addBattr(CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder addBattrValue(int i) {
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addBcat(String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.add(str);
            onChanged();
            return this;
        }

        public Builder addBcatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            ensureBcatIsMutable();
            this.bcat_.b(byteString);
            onChanged();
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
        }

        public Builder addWlang(String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.add(str);
            onChanged();
            return this;
        }

        public Builder addWlangBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            ensureWlangIsMutable();
            this.wlang_.b(byteString);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.tagid_ = "";
            this.ssai_ = 0;
            this.sdk_ = "";
            this.sdkver_ = "";
            this.reward_ = false;
            r5 r5Var = r5.c;
            this.bcat_ = r5Var;
            int i = this.bitField0_;
            this.cattax_ = 0;
            this.badv_ = r5Var;
            this.bapp_ = r5Var;
            this.bitField0_ = i & (-8);
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = r5Var;
            this.bitField0_ = i & (-32);
            this.secure_ = false;
            this.admx_ = false;
            this.curlx_ = false;
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                this.extProto_ = list;
                this.bitField0_ = i & (-64);
                return this;
            }
            o7Var.g();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = Placement.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = Placement.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearTagid() {
            this.tagid_ = Placement.getDefaultInstance().getTagid();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        public CreativeAttribute getBattr(int i) {
            return (CreativeAttribute) Placement.battr_converter_.convert(this.battr_.get(i));
        }

        public DisplayPlacement.Builder getDisplayBuilder() {
            onChanged();
            return (DisplayPlacement.Builder) getDisplayFieldBuilder().c();
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().c();
        }

        public Any.Builder getExtProtoBuilder(int i) {
            return (Any.Builder) getExtProtoFieldBuilder().j(i);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().k();
        }

        public VideoPlacement.Builder getVideoBuilder() {
            onChanged();
            return (VideoPlacement.Builder) getVideoFieldBuilder().c();
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getTagid().isEmpty()) {
                this.tagid_ = placement.tagid_;
                onChanged();
            }
            if (placement.getSsai() != 0) {
                setSsai(placement.getSsai());
            }
            if (!placement.getSdk().isEmpty()) {
                this.sdk_ = placement.sdk_;
                onChanged();
            }
            if (!placement.getSdkver().isEmpty()) {
                this.sdkver_ = placement.sdkver_;
                onChanged();
            }
            if (placement.getReward()) {
                setReward(placement.getReward());
            }
            if (!placement.bcat_.isEmpty()) {
                if (this.bcat_.isEmpty()) {
                    this.bcat_ = placement.bcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureBcatIsMutable();
                    this.bcat_.addAll(placement.bcat_);
                }
                onChanged();
            }
            if (placement.cattax_ != 0) {
                setCattaxValue(placement.getCattaxValue());
            }
            if (!placement.badv_.isEmpty()) {
                if (this.badv_.isEmpty()) {
                    this.badv_ = placement.badv_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBadvIsMutable();
                    this.badv_.addAll(placement.badv_);
                }
                onChanged();
            }
            if (!placement.bapp_.isEmpty()) {
                if (this.bapp_.isEmpty()) {
                    this.bapp_ = placement.bapp_;
                    this.bitField0_ &= -5;
                } else {
                    ensureBappIsMutable();
                    this.bapp_.addAll(placement.bapp_);
                }
                onChanged();
            }
            if (!placement.battr_.isEmpty()) {
                if (this.battr_.isEmpty()) {
                    this.battr_ = placement.battr_;
                    this.bitField0_ &= -9;
                } else {
                    ensureBattrIsMutable();
                    this.battr_.addAll(placement.battr_);
                }
                onChanged();
            }
            if (!placement.wlang_.isEmpty()) {
                if (this.wlang_.isEmpty()) {
                    this.wlang_ = placement.wlang_;
                    this.bitField0_ &= -17;
                } else {
                    ensureWlangIsMutable();
                    this.wlang_.addAll(placement.wlang_);
                }
                onChanged();
            }
            if (placement.getSecure()) {
                setSecure(placement.getSecure());
            }
            if (placement.getAdmx()) {
                setAdmx(placement.getAdmx());
            }
            if (placement.getCurlx()) {
                setCurlx(placement.getCurlx());
            }
            if (placement.hasDisplay()) {
                mergeDisplay(placement.getDisplay());
            }
            if (placement.hasVideo()) {
                mergeVideo(placement.getVideo());
            }
            if (placement.hasExt()) {
                mergeExt(placement.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!placement.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = placement.extProto_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(placement.extProto_);
                    }
                    onChanged();
                }
            } else if (!placement.extProto_.isEmpty()) {
                boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                o7 o7Var = this.extProtoBuilder_;
                if (zIsEmpty) {
                    o7 extProtoFieldBuilder = null;
                    o7Var.a = null;
                    this.extProtoBuilder_ = null;
                    this.extProto_ = placement.extProto_;
                    this.bitField0_ &= -33;
                    if (y4.alwaysUseFieldBuilders) {
                        extProtoFieldBuilder = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = extProtoFieldBuilder;
                } else {
                    o7Var.a(placement.extProto_);
                }
            }
            mergeUnknownFields(((y4) placement).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder setBadv(int i, String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.set(i, str);
            onChanged();
            return this;
        }

        public Builder setBapp(int i, String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.set(i, str);
            onChanged();
            return this;
        }

        public Builder setBattr(int i, CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.set(i, Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder setBattrValue(int i, int i2) {
            ensureBattrIsMutable();
            this.battr_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder setBcat(int i, String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.set(i, str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setTagid(String str) {
            str.getClass();
            this.tagid_ = str;
            onChanged();
            return this;
        }

        public Builder setTagidBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
            this.tagid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setWlang(int i, String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.set(i, str);
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
        public Placement mo250getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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

        public Any.Builder addExtProtoBuilder(int i) {
            return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
        }

        public Builder setDisplay(DisplayPlacement displayPlacement) {
            v7 v7Var = this.displayBuilder_;
            if (v7Var == null) {
                displayPlacement.getClass();
                this.display_ = displayPlacement;
                onChanged();
                return this;
            }
            v7Var.h(displayPlacement);
            return this;
        }

        public Builder setExt(Struct struct) {
            v7 v7Var = this.extBuilder_;
            if (v7Var == null) {
                struct.getClass();
                this.ext_ = struct;
                onChanged();
                return this;
            }
            v7Var.h(struct);
            return this;
        }

        public Builder setVideo(VideoPlacement videoPlacement) {
            v7 v7Var = this.videoBuilder_;
            if (v7Var == null) {
                videoPlacement.getClass();
                this.video_ = videoPlacement;
                onChanged();
                return this;
            }
            v7Var.h(videoPlacement);
            return this;
        }

        public Builder addExtProto(int i, Any any) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i, any);
                onChanged();
                return this;
            }
            o7Var.d(i, any);
            return this;
        }

        public Builder setExtProto(int i, Any any) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i, any);
                onChanged();
                return this;
            }
            o7Var.s(i, any);
            return this;
        }

        public Builder addExtProto(Any any) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
                return this;
            }
            o7Var.e(any);
            return this;
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            r5 r5Var = r5.c;
            this.bcat_ = r5Var;
            this.cattax_ = 0;
            this.badv_ = r5Var;
            this.bapp_ = r5Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = r5Var;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(int i, Any.Builder builder) {
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            Placement placement = null;
            try {
                try {
                    Placement placement2 = (Placement) Placement.PARSER.parsePartialFrom(rVar, o3Var);
                    if (placement2 != null) {
                        mergeFrom(placement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Placement placement3 = (Placement) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        placement = placement3;
                        if (placement != null) {
                            mergeFrom(placement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (placement != null) {
                    mergeFrom(placement);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class DisplayPlacement extends y4 implements DisplayPlacementOrBuilder {
        public static final int AMPREN_FIELD_NUMBER = 6;
        public static final int API_FIELD_NUMBER = 10;
        public static final int CLKTYPE_FIELD_NUMBER = 5;
        public static final int CONTEXT_FIELD_NUMBER = 8;
        public static final int CTYPE_FIELD_NUMBER = 11;
        public static final int DISPLAYFMT_FIELD_NUMBER = 16;
        public static final int EVENT_FIELD_NUMBER = 18;
        public static final int EXT_FIELD_NUMBER = 20;
        public static final int EXT_PROTO_FIELD_NUMBER = 19;
        public static final int H_FIELD_NUMBER = 13;
        public static final int IFRBUST_FIELD_NUMBER = 4;
        public static final int INSTL_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 9;
        public static final int NATIVEFMT_FIELD_NUMBER = 17;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int PRIV_FIELD_NUMBER = 15;
        public static final int PTYPE_FIELD_NUMBER = 7;
        public static final int TOPFRAME_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 14;
        public static final int W_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int ampren_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private int clktype_;
        private int context_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private List<DisplayFormat> displayfmt_;
        private List<EventSpec> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private s5 ifrbust_;
        private boolean instl_;
        private byte memoizedIsInitialized;
        private s5 mime_;
        private NativeFormat nativefmt_;
        private int pos_;
        private boolean priv_;
        private int ptype_;
        private boolean topframe_;
        private int unit_;
        private int w_;
        private static final h5 api_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.1
            @Override // com.explorestack.protobuf.h5
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                if (apiFrameworkValueOf == null) {
                    return ApiFramework.UNRECOGNIZED;
                }
                return apiFrameworkValueOf;
            }
        };
        private static final h5 ctype_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.2
            @Override // com.explorestack.protobuf.h5
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                if (displayCreativeTypeValueOf == null) {
                    return DisplayCreativeType.UNRECOGNIZED;
                }
                return displayCreativeTypeValueOf;
            }
        };
        private static final DisplayPlacement DEFAULT_INSTANCE = new DisplayPlacement();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.3
            @Override // com.explorestack.protobuf.g7
            public DisplayPlacement parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new DisplayPlacement(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements DisplayPlacementOrBuilder {
            private int ampren_;
            private List<Integer> api_;
            private int bitField0_;
            private int clktype_;
            private int context_;
            private List<Integer> ctype_;
            private o7 displayfmtBuilder_;
            private List<DisplayFormat> displayfmt_;
            private o7 eventBuilder_;
            private List<EventSpec> event_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private s5 ifrbust_;
            private boolean instl_;
            private s5 mime_;
            private v7 nativefmtBuilder_;
            private NativeFormat nativefmt_;
            private int pos_;
            private boolean priv_;
            private int ptype_;
            private boolean topframe_;
            private int unit_;
            private int w_;

            private Builder() {
                super(null);
                this.pos_ = 0;
                r5 r5Var = r5.c;
                this.ifrbust_ = r5Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r5Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder clearAmpren() {
                this.ampren_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = 0;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearInstl() {
                this.instl_ = false;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPriv() {
                this.priv_ = false;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTopframe() {
                this.topframe_ = false;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureDisplayfmtIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.displayfmt_ = new ArrayList(this.displayfmt_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureIfrbustIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.ifrbust_ = new r5(this.ifrbust_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.mime_ = new r5(this.mime_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.G;
            }

            private o7 getDisplayfmtFieldBuilder() {
                if (this.displayfmtBuilder_ == null) {
                    this.displayfmtBuilder_ = new o7(this.displayfmt_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.displayfmt_ = null;
                }
                return this.displayfmtBuilder_;
            }

            private o7 getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new o7(this.event_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
            }

            private v7 getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private o7 getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private v7 getNativefmtFieldBuilder() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmtBuilder_ = new v7(getNativefmt(), getParentForChildren(), isClean());
                    this.nativefmt_ = null;
                }
                return this.nativefmtBuilder_;
            }

            public Builder addAllDisplayfmt(Iterable<? extends DisplayFormat> iterable) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.displayfmt_);
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends EventSpec> iterable) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureEventIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.event_);
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureExtProtoIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat.Builder builder) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureDisplayfmtIsMutable();
                this.displayfmt_.add(builder.build());
                onChanged();
                return this;
            }

            public Builder addEvent(EventSpec.Builder builder) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement buildPartial() {
                DisplayPlacement displayPlacement = new DisplayPlacement(this);
                displayPlacement.pos_ = this.pos_;
                displayPlacement.instl_ = this.instl_;
                displayPlacement.topframe_ = this.topframe_;
                if ((this.bitField0_ & 1) != 0) {
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                displayPlacement.ifrbust_ = this.ifrbust_;
                displayPlacement.clktype_ = this.clktype_;
                displayPlacement.ampren_ = this.ampren_;
                displayPlacement.ptype_ = this.ptype_;
                displayPlacement.context_ = this.context_;
                if ((this.bitField0_ & 2) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                displayPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 4) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -5;
                }
                displayPlacement.api_ = this.api_;
                if ((this.bitField0_ & 8) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -9;
                }
                displayPlacement.ctype_ = this.ctype_;
                displayPlacement.w_ = this.w_;
                displayPlacement.h_ = this.h_;
                displayPlacement.unit_ = this.unit_;
                displayPlacement.priv_ = this.priv_;
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                        this.bitField0_ &= -17;
                    }
                    displayPlacement.displayfmt_ = this.displayfmt_;
                } else {
                    displayPlacement.displayfmt_ = o7Var.f();
                }
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var == null) {
                    displayPlacement.nativefmt_ = this.nativefmt_;
                } else {
                    displayPlacement.nativefmt_ = (NativeFormat) v7Var.a();
                }
                o7 o7Var2 = this.eventBuilder_;
                if (o7Var2 == null) {
                    if ((this.bitField0_ & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -33;
                    }
                    displayPlacement.event_ = this.event_;
                } else {
                    displayPlacement.event_ = o7Var2.f();
                }
                v7 v7Var2 = this.extBuilder_;
                if (v7Var2 == null) {
                    displayPlacement.ext_ = this.ext_;
                } else {
                    displayPlacement.ext_ = (Struct) v7Var2.a();
                }
                o7 o7Var3 = this.extProtoBuilder_;
                if (o7Var3 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    displayPlacement.extProto_ = this.extProto_;
                } else {
                    displayPlacement.extProto_ = o7Var3.f();
                }
                onBuilt();
                return displayPlacement;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDisplayfmt() {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.displayfmt_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearEvent() {
                o7 o7Var = this.eventBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                    return this;
                }
                this.ext_ = null;
                this.extBuilder_ = null;
                return this;
            }

            public Builder clearExtProto() {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearIfrbust() {
                this.ifrbust_ = r5.c;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = r5.c;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNativefmt() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                    onChanged();
                    return this;
                }
                this.nativefmt_ = null;
                this.nativefmtBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getAmpren() {
                return this.ampren_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new i5(this.api_, DisplayPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayContextType getContext() {
                DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
                return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayCreativeType> getCtypeList() {
                return new i5(this.ctype_, DisplayPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeValue(int i) {
                return this.ctype_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.G;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormat getDisplayfmt(int i) {
                o7 o7Var = this.displayfmtBuilder_;
                return o7Var == null ? this.displayfmt_.get(i) : (DisplayFormat) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getDisplayfmtCount() {
                o7 o7Var = this.displayfmtBuilder_;
                return o7Var == null ? this.displayfmt_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayFormat> getDisplayfmtList() {
                o7 o7Var = this.displayfmtBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.displayfmt_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i) {
                o7 o7Var = this.displayfmtBuilder_;
                return o7Var == null ? this.displayfmt_.get(i) : (DisplayFormatOrBuilder) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
                o7 o7Var = this.displayfmtBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.displayfmt_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpec getEvent(int i) {
                o7 o7Var = this.eventBuilder_;
                return o7Var == null ? this.event_.get(i) : (EventSpec) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getEventCount() {
                o7 o7Var = this.eventBuilder_;
                return o7Var == null ? this.event_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<EventSpec> getEventList() {
                o7 o7Var = this.eventBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.event_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpecOrBuilder getEventOrBuilder(int i) {
                o7 o7Var = this.eventBuilder_;
                return o7Var == null ? this.event_.get(i) : (EventSpecOrBuilder) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
                o7 o7Var = this.eventBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getIfrbust(int i) {
                return (String) this.ifrbust_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getIfrbustBytes(int i) {
                return this.ifrbust_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getIfrbustCount() {
                return this.ifrbust_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public j7 getIfrbustList() {
                return this.ifrbust_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getInstl() {
                return this.instl_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getMime(int i) {
                return (String) this.mime_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public j7 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormat getNativefmt() {
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var != null) {
                    return (NativeFormat) v7Var.d();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormatOrBuilder getNativefmtOrBuilder() {
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var != null) {
                    return (NativeFormatOrBuilder) v7Var.e();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getPriv() {
                return this.priv_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayPlacementType getPtype() {
                DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
                return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getTopframe() {
                return this.topframe_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasNativefmt() {
                return (this.nativefmtBuilder_ == null && this.nativefmt_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.H;
                w4Var.c(DisplayPlacement.class, Builder.class);
                return w4Var;
            }

            public Builder mergeExt(Struct struct) {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    v7Var.f(struct);
                    return this;
                }
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = z.m(struct2, struct);
                } else {
                    this.ext_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder mergeNativefmt(NativeFormat nativeFormat) {
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var != null) {
                    v7Var.f(nativeFormat);
                    return this;
                }
                NativeFormat nativeFormat2 = this.nativefmt_;
                if (nativeFormat2 != null) {
                    this.nativefmt_ = NativeFormat.newBuilder(nativeFormat2).mergeFrom(nativeFormat).buildPartial();
                } else {
                    this.nativefmt_ = nativeFormat;
                }
                onChanged();
                return this;
            }

            public Builder removeDisplayfmt(int i) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                this.displayfmt_.remove(i);
                onChanged();
                return this;
            }

            public Builder removeEvent(int i) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureEventIsMutable();
                this.event_.remove(i);
                onChanged();
                return this;
            }

            public Builder removeExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
                return this;
            }

            public Builder setAmpren(int i) {
                this.ampren_ = i;
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i) {
                this.clktype_ = i;
                onChanged();
                return this;
            }

            public Builder setContextValue(int i) {
                this.context_ = i;
                onChanged();
                return this;
            }

            public Builder setDisplayfmt(int i, DisplayFormat.Builder builder) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureDisplayfmtIsMutable();
                this.displayfmt_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setEvent(int i, EventSpec.Builder builder) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureEventIsMutable();
                this.event_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.ext_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setH(int i) {
                this.h_ = i;
                onChanged();
                return this;
            }

            public Builder setInstl(boolean z) {
                this.instl_ = z;
                onChanged();
                return this;
            }

            public Builder setNativefmt(NativeFormat.Builder builder) {
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.nativefmt_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i) {
                this.pos_ = i;
                onChanged();
                return this;
            }

            public Builder setPriv(boolean z) {
                this.priv_ = z;
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i) {
                this.ptype_ = i;
                onChanged();
                return this;
            }

            public Builder setTopframe(boolean z) {
                this.topframe_ = z;
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i) {
                this.unit_ = i;
                onChanged();
                return this;
            }

            public Builder setW(int i) {
                this.w_ = i;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getDisplayfmtFieldBuilder();
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends DisplayCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllIfrbust(Iterable<String> iterable) {
                ensureIfrbustIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.ifrbust_);
                onChanged();
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addCtype(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public DisplayFormat.Builder addDisplayfmtBuilder() {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().c(DisplayFormat.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder() {
                return (EventSpec.Builder) getEventFieldBuilder().c(EventSpec.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addIfrbust(String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.add(str);
                onChanged();
                return this;
            }

            public Builder addIfrbustBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensureIfrbustIsMutable();
                this.ifrbust_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement build() {
                DisplayPlacement displayPlacementBuildPartial = buildPartial();
                if (displayPlacementBuildPartial.isInitialized()) {
                    return displayPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.pos_ = 0;
                this.instl_ = false;
                this.topframe_ = false;
                r5 r5Var = r5.c;
                this.ifrbust_ = r5Var;
                int i = this.bitField0_;
                this.clktype_ = 0;
                this.ampren_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r5Var;
                this.bitField0_ = i & (-4);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.bitField0_ = i & (-16);
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.priv_ = false;
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    this.displayfmt_ = list;
                    this.bitField0_ = i & (-32);
                } else {
                    o7Var.g();
                }
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                o7 o7Var2 = this.eventBuilder_;
                if (o7Var2 == null) {
                    this.event_ = list;
                    this.bitField0_ &= -33;
                } else {
                    o7Var2.g();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                o7 o7Var3 = this.extProtoBuilder_;
                if (o7Var3 == null) {
                    this.extProto_ = list;
                    this.bitField0_ &= -65;
                    return this;
                }
                o7Var3.g();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) DisplayPlacement.api_converter_.convert(this.api_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayCreativeType getCtype(int i) {
                return (DisplayCreativeType) DisplayPlacement.ctype_converter_.convert(this.ctype_.get(i));
            }

            public DisplayFormat.Builder getDisplayfmtBuilder(int i) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().j(i);
            }

            public List<DisplayFormat.Builder> getDisplayfmtBuilderList() {
                return getDisplayfmtFieldBuilder().k();
            }

            public EventSpec.Builder getEventBuilder(int i) {
                return (EventSpec.Builder) getEventFieldBuilder().j(i);
            }

            public List<EventSpec.Builder> getEventBuilderList() {
                return getEventFieldBuilder().k();
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().c();
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return (Any.Builder) getExtProtoFieldBuilder().j(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().k();
            }

            public NativeFormat.Builder getNativefmtBuilder() {
                onChanged();
                return (NativeFormat.Builder) getNativefmtFieldBuilder().c();
            }

            public Builder mergeFrom(DisplayPlacement displayPlacement) {
                o7 displayfmtFieldBuilder;
                o7 eventFieldBuilder;
                if (displayPlacement == DisplayPlacement.getDefaultInstance()) {
                    return this;
                }
                if (displayPlacement.pos_ != 0) {
                    setPosValue(displayPlacement.getPosValue());
                }
                if (displayPlacement.getInstl()) {
                    setInstl(displayPlacement.getInstl());
                }
                if (displayPlacement.getTopframe()) {
                    setTopframe(displayPlacement.getTopframe());
                }
                if (!displayPlacement.ifrbust_.isEmpty()) {
                    if (this.ifrbust_.isEmpty()) {
                        this.ifrbust_ = displayPlacement.ifrbust_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIfrbustIsMutable();
                        this.ifrbust_.addAll(displayPlacement.ifrbust_);
                    }
                    onChanged();
                }
                if (displayPlacement.clktype_ != 0) {
                    setClktypeValue(displayPlacement.getClktypeValue());
                }
                if (displayPlacement.getAmpren() != 0) {
                    setAmpren(displayPlacement.getAmpren());
                }
                if (displayPlacement.ptype_ != 0) {
                    setPtypeValue(displayPlacement.getPtypeValue());
                }
                if (displayPlacement.context_ != 0) {
                    setContextValue(displayPlacement.getContextValue());
                }
                if (!displayPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = displayPlacement.mime_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(displayPlacement.mime_);
                    }
                    onChanged();
                }
                if (!displayPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = displayPlacement.api_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(displayPlacement.api_);
                    }
                    onChanged();
                }
                if (!displayPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = displayPlacement.ctype_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(displayPlacement.ctype_);
                    }
                    onChanged();
                }
                if (displayPlacement.getW() != 0) {
                    setW(displayPlacement.getW());
                }
                if (displayPlacement.getH() != 0) {
                    setH(displayPlacement.getH());
                }
                if (displayPlacement.unit_ != 0) {
                    setUnitValue(displayPlacement.getUnitValue());
                }
                if (displayPlacement.getPriv()) {
                    setPriv(displayPlacement.getPriv());
                }
                o7 extProtoFieldBuilder = null;
                if (this.displayfmtBuilder_ == null) {
                    if (!displayPlacement.displayfmt_.isEmpty()) {
                        if (this.displayfmt_.isEmpty()) {
                            this.displayfmt_ = displayPlacement.displayfmt_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureDisplayfmtIsMutable();
                            this.displayfmt_.addAll(displayPlacement.displayfmt_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.displayfmt_.isEmpty()) {
                    boolean zIsEmpty = this.displayfmtBuilder_.b.isEmpty();
                    o7 o7Var = this.displayfmtBuilder_;
                    if (zIsEmpty) {
                        o7Var.a = null;
                        this.displayfmtBuilder_ = null;
                        this.displayfmt_ = displayPlacement.displayfmt_;
                        this.bitField0_ &= -17;
                        if (y4.alwaysUseFieldBuilders) {
                            displayfmtFieldBuilder = getDisplayfmtFieldBuilder();
                        } else {
                            displayfmtFieldBuilder = null;
                        }
                        this.displayfmtBuilder_ = displayfmtFieldBuilder;
                    } else {
                        o7Var.a(displayPlacement.displayfmt_);
                    }
                }
                if (displayPlacement.hasNativefmt()) {
                    mergeNativefmt(displayPlacement.getNativefmt());
                }
                if (this.eventBuilder_ == null) {
                    if (!displayPlacement.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = displayPlacement.event_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(displayPlacement.event_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.event_.isEmpty()) {
                    boolean zIsEmpty2 = this.eventBuilder_.b.isEmpty();
                    o7 o7Var2 = this.eventBuilder_;
                    if (zIsEmpty2) {
                        o7Var2.a = null;
                        this.eventBuilder_ = null;
                        this.event_ = displayPlacement.event_;
                        this.bitField0_ &= -33;
                        if (y4.alwaysUseFieldBuilders) {
                            eventFieldBuilder = getEventFieldBuilder();
                        } else {
                            eventFieldBuilder = null;
                        }
                        this.eventBuilder_ = eventFieldBuilder;
                    } else {
                        o7Var2.a(displayPlacement.event_);
                    }
                }
                if (displayPlacement.hasExt()) {
                    mergeExt(displayPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!displayPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = displayPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(displayPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.extProto_.isEmpty()) {
                    boolean zIsEmpty3 = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var3 = this.extProtoBuilder_;
                    if (zIsEmpty3) {
                        o7Var3.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = displayPlacement.extProto_;
                        this.bitField0_ &= -65;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var3.a(displayPlacement.extProto_);
                    }
                }
                mergeUnknownFields(((y4) displayPlacement).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContext(DisplayContextType displayContextType) {
                displayContextType.getClass();
                this.context_ = displayContextType.getNumber();
                onChanged();
                return this;
            }

            public Builder setCtype(int i, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i, int i2) {
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setIfrbust(int i, String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setMime(int i, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtype(DisplayPlacementType displayPlacementType) {
                displayPlacementType.getClass();
                this.ptype_ = displayPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
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
            public DisplayPlacement mo250getDefaultInstanceForType() {
                return DisplayPlacement.getDefaultInstance();
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

            public DisplayFormat.Builder addDisplayfmtBuilder(int i) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().b(i, DisplayFormat.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder(int i) {
                return (EventSpec.Builder) getEventFieldBuilder().b(i, EventSpec.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
            }

            public Builder setExt(Struct struct) {
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                    return this;
                }
                v7Var.h(struct);
                return this;
            }

            public Builder setNativefmt(NativeFormat nativeFormat) {
                v7 v7Var = this.nativefmtBuilder_;
                if (v7Var == null) {
                    nativeFormat.getClass();
                    this.nativefmt_ = nativeFormat;
                    onChanged();
                    return this;
                }
                v7Var.h(nativeFormat);
                return this;
            }

            public Builder addDisplayfmt(int i, DisplayFormat displayFormat) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i, displayFormat);
                    onChanged();
                    return this;
                }
                o7Var.d(i, displayFormat);
                return this;
            }

            public Builder addEvent(int i, EventSpec eventSpec) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i, eventSpec);
                    onChanged();
                    return this;
                }
                o7Var.d(i, eventSpec);
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                    return this;
                }
                o7Var.d(i, any);
                return this;
            }

            public Builder setDisplayfmt(int i, DisplayFormat displayFormat) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i, displayFormat);
                    onChanged();
                    return this;
                }
                o7Var.s(i, displayFormat);
                return this;
            }

            public Builder setEvent(int i, EventSpec eventSpec) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.set(i, eventSpec);
                    onChanged();
                    return this;
                }
                o7Var.s(i, eventSpec);
                return this;
            }

            public Builder setExtProto(int i, Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                    return this;
                }
                o7Var.s(i, any);
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat displayFormat) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(displayFormat);
                    onChanged();
                    return this;
                }
                o7Var.e(displayFormat);
                return this;
            }

            public Builder addEvent(EventSpec eventSpec) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(eventSpec);
                    onChanged();
                    return this;
                }
                o7Var.e(eventSpec);
                return this;
            }

            public Builder addExtProto(Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                    return this;
                }
                o7Var.e(any);
                return this;
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.pos_ = 0;
                r5 r5Var = r5.c;
                this.ifrbust_ = r5Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r5Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addDisplayfmt(int i, DisplayFormat.Builder builder) {
                o7 o7Var = this.displayfmtBuilder_;
                if (o7Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            public Builder addEvent(int i, EventSpec.Builder builder) {
                o7 o7Var = this.eventBuilder_;
                if (o7Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DisplayPlacement) {
                    return mergeFrom((DisplayPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                DisplayPlacement displayPlacement = null;
                try {
                    try {
                        DisplayPlacement displayPlacement2 = (DisplayPlacement) DisplayPlacement.PARSER.parsePartialFrom(rVar, o3Var);
                        if (displayPlacement2 != null) {
                            mergeFrom(displayPlacement2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        DisplayPlacement displayPlacement3 = (DisplayPlacement) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            displayPlacement = displayPlacement3;
                            if (displayPlacement != null) {
                                mergeFrom(displayPlacement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (displayPlacement != null) {
                        mergeFrom(displayPlacement);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class DisplayFormat extends y4 implements DisplayFormatOrBuilder {
            public static final int EXPDIR_FIELD_NUMBER = 5;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int HRATIO_FIELD_NUMBER = 4;
            public static final int H_FIELD_NUMBER = 2;
            public static final int WRATIO_FIELD_NUMBER = 3;
            public static final int W_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int expdirMemoizedSerializedSize;
            private List<Integer> expdir_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private byte memoizedIsInitialized;
            private int w_;
            private int wratio_;
            private static final h5 expdir_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.1
                @Override // com.explorestack.protobuf.h5
                public ExpandableDirection convert(Integer num) {
                    ExpandableDirection expandableDirectionValueOf = ExpandableDirection.valueOf(num.intValue());
                    if (expandableDirectionValueOf == null) {
                        return ExpandableDirection.UNRECOGNIZED;
                    }
                    return expandableDirectionValueOf;
                }
            };
            private static final DisplayFormat DEFAULT_INSTANCE = new DisplayFormat();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.2
                @Override // com.explorestack.protobuf.g7
                public DisplayFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new DisplayFormat(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements DisplayFormatOrBuilder {
                private int bitField0_;
                private List<Integer> expdir_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private int h_;
                private int hratio_;
                private int w_;
                private int wratio_;

                private Builder() {
                    super(null);
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder clearH() {
                    this.h_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHratio() {
                    this.hratio_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearW() {
                    this.w_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWratio() {
                    this.wratio_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureExpdirIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.expdir_ = new ArrayList(this.expdir_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.I;
                }

                private v7 getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private o7 getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat buildPartial() {
                    DisplayFormat displayFormat = new DisplayFormat(this);
                    displayFormat.w_ = this.w_;
                    displayFormat.h_ = this.h_;
                    displayFormat.wratio_ = this.wratio_;
                    displayFormat.hratio_ = this.hratio_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        this.bitField0_ &= -2;
                    }
                    displayFormat.expdir_ = this.expdir_;
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        displayFormat.ext_ = this.ext_;
                    } else {
                        displayFormat.ext_ = (Struct) v7Var.a();
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        displayFormat.extProto_ = this.extProto_;
                    } else {
                        displayFormat.extProto_ = o7Var.f();
                    }
                    onBuilt();
                    return displayFormat;
                }

                public Builder clearExpdir() {
                    this.expdir_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.I;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirCount() {
                    return this.expdir_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<ExpandableDirection> getExpdirList() {
                    return new i5(this.expdir_, DisplayFormat.expdir_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirValue(int i) {
                    return this.expdir_.get(i).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Integer> getExpdirValueList() {
                    return Collections.unmodifiableList(this.expdir_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getH() {
                    return this.h_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getHratio() {
                    return this.hratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getW() {
                    return this.w_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getWratio() {
                    return this.wratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.J;
                    w4Var.c(DisplayFormat.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.f(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = z.m(struct2, struct);
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setH(int i) {
                    this.h_ = i;
                    onChanged();
                    return this;
                }

                public Builder setHratio(int i) {
                    this.hratio_ = i;
                    onChanged();
                    return this;
                }

                public Builder setW(int i) {
                    this.w_ = i;
                    onChanged();
                    return this;
                }

                public Builder setWratio(int i) {
                    this.wratio_ = i;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExpdir(Iterable<? extends ExpandableDirection> iterable) {
                    ensureExpdirIsMutable();
                    Iterator<? extends ExpandableDirection> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.expdir_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExpdirValue(Iterable<Integer> iterable) {
                    ensureExpdirIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.expdir_.add(num);
                    }
                    onChanged();
                    return this;
                }

                public Builder addExpdir(ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addExpdirValue(int i) {
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat build() {
                    DisplayFormat displayFormatBuildPartial = buildPartial();
                    if (displayFormatBuildPartial.isInitialized()) {
                        return displayFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.w_ = 0;
                    this.h_ = 0;
                    this.wratio_ = 0;
                    this.hratio_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    int i = this.bitField0_;
                    this.bitField0_ = i & (-2);
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        this.extProto_ = list;
                        this.bitField0_ = i & (-4);
                        return this;
                    }
                    o7Var.g();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public ExpandableDirection getExpdir(int i) {
                    return (ExpandableDirection) DisplayFormat.expdir_converter_.convert(this.expdir_.get(i));
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().c();
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().j(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().k();
                }

                public Builder mergeFrom(DisplayFormat displayFormat) {
                    if (displayFormat == DisplayFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (displayFormat.getW() != 0) {
                        setW(displayFormat.getW());
                    }
                    if (displayFormat.getH() != 0) {
                        setH(displayFormat.getH());
                    }
                    if (displayFormat.getWratio() != 0) {
                        setWratio(displayFormat.getWratio());
                    }
                    if (displayFormat.getHratio() != 0) {
                        setHratio(displayFormat.getHratio());
                    }
                    if (!displayFormat.expdir_.isEmpty()) {
                        if (this.expdir_.isEmpty()) {
                            this.expdir_ = displayFormat.expdir_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExpdirIsMutable();
                            this.expdir_.addAll(displayFormat.expdir_);
                        }
                        onChanged();
                    }
                    if (displayFormat.hasExt()) {
                        mergeExt(displayFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!displayFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = displayFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(displayFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!displayFormat.extProto_.isEmpty()) {
                        boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var = this.extProtoBuilder_;
                        if (zIsEmpty) {
                            o7 extProtoFieldBuilder = null;
                            o7Var.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = displayFormat.extProto_;
                            this.bitField0_ &= -3;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var.a(displayFormat.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) displayFormat).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setExpdir(int i, ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.set(i, Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setExpdirValue(int i, int i2) {
                    ensureExpdirIsMutable();
                    this.expdir_.set(i, Integer.valueOf(i2));
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
                public DisplayFormat mo250getDefaultInstanceForType() {
                    return DisplayFormat.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                }

                private Builder(h4 h4Var) {
                    super(h4Var);
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder setExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }
                    v7Var.h(struct);
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, any);
                    return this;
                }

                public Builder setExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, any);
                    return this;
                }

                public Builder addExtProto(Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }
                    o7Var.e(any);
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof DisplayFormat) {
                        return mergeFrom((DisplayFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    DisplayFormat displayFormat = null;
                    try {
                        try {
                            DisplayFormat displayFormat2 = (DisplayFormat) DisplayFormat.PARSER.parsePartialFrom(rVar, o3Var);
                            if (displayFormat2 != null) {
                                mergeFrom(displayFormat2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            DisplayFormat displayFormat3 = (DisplayFormat) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                displayFormat = displayFormat3;
                                if (displayFormat != null) {
                                    mergeFrom(displayFormat);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (displayFormat != null) {
                            mergeFrom(displayFormat);
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
                if (!(obj instanceof DisplayFormat)) {
                    return super.equals(obj);
                }
                DisplayFormat displayFormat = (DisplayFormat) obj;
                if (getW() == displayFormat.getW() && getH() == displayFormat.getH() && getWratio() == displayFormat.getWratio() && getHratio() == displayFormat.getHratio() && this.expdir_.equals(displayFormat.expdir_) && hasExt() == displayFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(displayFormat.getExt())) && getExtProtoList().equals(displayFormat.getExtProtoList()) && this.unknownFields.equals(displayFormat.unknownFields);
                }
                return false;
            }

            public static DisplayFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.I;
            }

            public static Builder newBuilder(DisplayFormat displayFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayFormat);
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public ExpandableDirection getExpdir(int i) {
                return (ExpandableDirection) expdir_converter_.convert(this.expdir_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirCount() {
                return this.expdir_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<ExpandableDirection> getExpdirList() {
                return new i5(this.expdir_, expdir_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirValue(int i) {
                return this.expdir_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Integer> getExpdirValueList() {
                return this.expdir_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getHratio() {
                return this.hratio_;
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
                int i2 = this.w_;
                int iT = i2 != 0 ? w.t(1, i2) : 0;
                int i3 = this.h_;
                if (i3 != 0) {
                    iT += w.t(2, i3);
                }
                int i4 = this.wratio_;
                if (i4 != 0) {
                    iT += w.t(3, i4);
                }
                int i5 = this.hratio_;
                if (i5 != 0) {
                    iT += w.t(4, i5);
                }
                int iJ = 0;
                for (int i6 = 0; i6 < this.expdir_.size(); i6++) {
                    iJ = z.j(iJ, this.expdir_.get(i6));
                }
                int iO = iT + iJ;
                if (!getExpdirList().isEmpty()) {
                    iO = iO + 1 + w.u(iJ);
                }
                this.expdirMemoizedSerializedSize = iJ;
                for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
                    iO += w.o(6, this.extProto_.get(i7));
                }
                if (this.ext_ != null) {
                    iO += w.o(7, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iO;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hratio = getHratio() + ((((getWratio() + ((((getH() + ((((getW() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
                if (getExpdirCount() > 0) {
                    hratio = pv1.c(hratio, 37, 5, 53) + this.expdir_.hashCode();
                }
                if (hasExt()) {
                    hratio = pv1.c(hratio, 37, 7, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hratio = pv1.c(hratio, 37, 6, 53) + getExtProtoList().hashCode();
                }
                int iHashCode = this.unknownFields.a.hashCode() + (hratio * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.J;
                w4Var.c(DisplayFormat.class, Builder.class);
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
                return new DisplayFormat();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private DisplayFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                Struct.Builder builder;
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
                                if (iF != 8) {
                                    if (iF != 16) {
                                        if (iF != 24) {
                                            if (iF != 32) {
                                                if (iF != 40) {
                                                    if (iF != 42) {
                                                        if (iF != 50) {
                                                            if (iF != 58) {
                                                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                                }
                                                            } else {
                                                                Struct struct = this.ext_;
                                                                if (struct != null) {
                                                                    builder = struct.toBuilder();
                                                                } else {
                                                                    builder = null;
                                                                }
                                                                Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                                this.ext_ = struct2;
                                                                if (builder != null) {
                                                                    builder.mergeFrom(struct2);
                                                                    this.ext_ = builder.buildPartial();
                                                                }
                                                            }
                                                        } else {
                                                            if ((i & 2) == 0) {
                                                                this.extProto_ = new ArrayList();
                                                                i |= 2;
                                                            }
                                                            this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                                        }
                                                    } else {
                                                        int iK = rVar.k(rVar.x());
                                                        while (rVar.d() > 0) {
                                                            int iO = rVar.o();
                                                            if ((i & 1) == 0) {
                                                                this.expdir_ = new ArrayList();
                                                                i |= 1;
                                                            }
                                                            this.expdir_.add(Integer.valueOf(iO));
                                                        }
                                                        rVar.j(iK);
                                                    }
                                                } else {
                                                    int iO2 = rVar.o();
                                                    if ((i & 1) == 0) {
                                                        this.expdir_ = new ArrayList();
                                                        i |= 1;
                                                    }
                                                    this.expdir_.add(Integer.valueOf(iO2));
                                                }
                                            } else {
                                                this.hratio_ = rVar.G();
                                            }
                                        } else {
                                            this.wratio_ = rVar.G();
                                        }
                                    } else {
                                        this.h_ = rVar.G();
                                    }
                                } else {
                                    this.w_ = rVar.G();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i & 1) != 0) {
                            this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        }
                        if ((i & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i & 1) != 0) {
                    this.expdir_ = Collections.unmodifiableList(this.expdir_);
                }
                if ((i & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                getSerializedSize();
                int i = this.w_;
                if (i != 0) {
                    wVar.T(1, i);
                }
                int i2 = this.h_;
                if (i2 != 0) {
                    wVar.T(2, i2);
                }
                int i3 = this.wratio_;
                if (i3 != 0) {
                    wVar.T(3, i3);
                }
                int i4 = this.hratio_;
                if (i4 != 0) {
                    wVar.T(4, i4);
                }
                if (getExpdirList().size() > 0) {
                    wVar.U(42);
                    wVar.U(this.expdirMemoizedSerializedSize);
                }
                for (int i5 = 0; i5 < this.expdir_.size(); i5++) {
                    wVar.L(this.expdir_.get(i5).intValue());
                }
                for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                    wVar.M(6, this.extProto_.get(i6));
                }
                if (this.ext_ != null) {
                    wVar.M(7, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public DisplayFormat mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (DisplayFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static DisplayFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DisplayFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString, o3Var);
            }

            public static DisplayFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr);
            }

            public static DisplayFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr, o3Var);
            }

            public static DisplayFormat parseFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) y4.parseWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (DisplayFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static DisplayFormat parseFrom(r rVar) throws IOException {
                return (DisplayFormat) y4.parseWithIOException(PARSER, rVar);
            }

            public static DisplayFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                return (DisplayFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private DisplayFormat(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private DisplayFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.expdir_ = list;
                this.extProto_ = list;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface DisplayFormatOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            ExpandableDirection getExpdir(int i);

            int getExpdirCount();

            List<ExpandableDirection> getExpdirList();

            int getExpdirValue(int i);

            List<Integer> getExpdirValueList();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            int getH();

            int getHratio();

            int getW();

            int getWratio();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class EventSpec extends y4 implements EventSpecOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 9;
            public static final int EXT_PROTO_FIELD_NUMBER = 8;
            public static final int JSTRK_FIELD_NUMBER = 4;
            public static final int METHOD_FIELD_NUMBER = 2;
            public static final int PXTRK_FIELD_NUMBER = 6;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int WJS_FIELD_NUMBER = 5;
            public static final int WPX_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int apiMemoizedSerializedSize;
            private List<Integer> api_;
            private List<Any> extProto_;
            private Struct ext_;
            private s5 jstrk_;
            private byte memoizedIsInitialized;
            private int methodMemoizedSerializedSize;
            private List<Integer> method_;
            private s5 pxtrk_;
            private int type_;
            private boolean wjs_;
            private boolean wpx_;
            private static final h5 method_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.1
                @Override // com.explorestack.protobuf.h5
                public EventTrackingMethod convert(Integer num) {
                    EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(num.intValue());
                    if (eventTrackingMethodValueOf == null) {
                        return EventTrackingMethod.UNRECOGNIZED;
                    }
                    return eventTrackingMethodValueOf;
                }
            };
            private static final h5 api_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.2
                @Override // com.explorestack.protobuf.h5
                public ApiFramework convert(Integer num) {
                    ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                    if (apiFrameworkValueOf == null) {
                        return ApiFramework.UNRECOGNIZED;
                    }
                    return apiFrameworkValueOf;
                }
            };
            private static final EventSpec DEFAULT_INSTANCE = new EventSpec();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.3
                @Override // com.explorestack.protobuf.g7
                public EventSpec parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new EventSpec(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements EventSpecOrBuilder {
                private List<Integer> api_;
                private int bitField0_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private s5 jstrk_;
                private List<Integer> method_;
                private s5 pxtrk_;
                private int type_;
                private boolean wjs_;
                private boolean wpx_;

                private Builder() {
                    super(null);
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    r5 r5Var = r5.c;
                    this.jstrk_ = r5Var;
                    this.pxtrk_ = r5Var;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWjs() {
                    this.wjs_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearWpx() {
                    this.wpx_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureApiIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.api_ = new ArrayList(this.api_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 16) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensureJstrkIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.jstrk_ = new r5(this.jstrk_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureMethodIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.method_ = new ArrayList(this.method_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensurePxtrkIsMutable() {
                    if ((this.bitField0_ & 8) == 0) {
                        this.pxtrk_ = new r5(this.pxtrk_);
                        this.bitField0_ |= 8;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.U;
                }

                private v7 getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private o7 getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec buildPartial() {
                    EventSpec eventSpec = new EventSpec(this);
                    eventSpec.type_ = this.type_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -2;
                    }
                    eventSpec.method_ = this.method_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                        this.bitField0_ &= -3;
                    }
                    eventSpec.api_ = this.api_;
                    if ((this.bitField0_ & 4) != 0) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        this.bitField0_ &= -5;
                    }
                    eventSpec.jstrk_ = this.jstrk_;
                    eventSpec.wjs_ = this.wjs_;
                    if ((this.bitField0_ & 8) != 0) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        this.bitField0_ &= -9;
                    }
                    eventSpec.pxtrk_ = this.pxtrk_;
                    eventSpec.wpx_ = this.wpx_;
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        eventSpec.ext_ = this.ext_;
                    } else {
                        eventSpec.ext_ = (Struct) v7Var.a();
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -17;
                        }
                        eventSpec.extProto_ = this.extProto_;
                    } else {
                        eventSpec.extProto_ = o7Var.f();
                    }
                    onBuilt();
                    return eventSpec;
                }

                public Builder clearApi() {
                    this.api_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -17;
                    onChanged();
                    return this;
                }

                public Builder clearJstrk() {
                    this.jstrk_ = r5.c;
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearPxtrk() {
                    this.pxtrk_ = r5.c;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiCount() {
                    return this.api_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<ApiFramework> getApiList() {
                    return new i5(this.api_, EventSpec.api_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiValue(int i) {
                    return this.api_.get(i).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getApiValueList() {
                    return Collections.unmodifiableList(this.api_);
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.U;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getJstrk(int i) {
                    return (String) this.jstrk_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getJstrkBytes(int i) {
                    return this.jstrk_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getJstrkCount() {
                    return this.jstrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public j7 getJstrkList() {
                    return this.jstrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodCount() {
                    return this.method_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<EventTrackingMethod> getMethodList() {
                    return new i5(this.method_, EventSpec.method_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodValue(int i) {
                    return this.method_.get(i).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getMethodValueList() {
                    return Collections.unmodifiableList(this.method_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getPxtrk(int i) {
                    return (String) this.pxtrk_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getPxtrkBytes(int i) {
                    return this.pxtrk_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getPxtrkCount() {
                    return this.pxtrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public j7 getPxtrkList() {
                    return this.pxtrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventType getType() {
                    EventType eventTypeValueOf = EventType.valueOf(this.type_);
                    return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWjs() {
                    return this.wjs_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWpx() {
                    return this.wpx_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.V;
                    w4Var.c(EventSpec.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.f(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = z.m(struct2, struct);
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i) {
                    this.type_ = i;
                    onChanged();
                    return this;
                }

                public Builder setWjs(boolean z) {
                    this.wjs_ = z;
                    onChanged();
                    return this;
                }

                public Builder setWpx(boolean z) {
                    this.wpx_ = z;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                    ensureApiIsMutable();
                    Iterator<? extends ApiFramework> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.api_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllApiValue(Iterable<Integer> iterable) {
                    ensureApiIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.api_.add(num);
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllJstrk(Iterable<String> iterable) {
                    ensureJstrkIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.jstrk_);
                    onChanged();
                    return this;
                }

                public Builder addAllMethod(Iterable<? extends EventTrackingMethod> iterable) {
                    ensureMethodIsMutable();
                    Iterator<? extends EventTrackingMethod> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.method_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllMethodValue(Iterable<Integer> iterable) {
                    ensureMethodIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.method_.add(num);
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllPxtrk(Iterable<String> iterable) {
                    ensurePxtrkIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.pxtrk_);
                    onChanged();
                    return this;
                }

                public Builder addApi(ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addApiValue(int i) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder addJstrk(String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addJstrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    ensureJstrkIsMutable();
                    this.jstrk_.b(byteString);
                    onChanged();
                    return this;
                }

                public Builder addMethod(EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addMethodValue(int i) {
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public Builder addPxtrk(String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addPxtrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    ensurePxtrkIsMutable();
                    this.pxtrk_.b(byteString);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec build() {
                    EventSpec eventSpecBuildPartial = buildPartial();
                    if (eventSpecBuildPartial.isInitialized()) {
                        return eventSpecBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventSpecBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    int i = this.bitField0_;
                    this.api_ = list;
                    this.bitField0_ = i & (-4);
                    r5 r5Var = r5.c;
                    this.jstrk_ = r5Var;
                    this.wjs_ = false;
                    this.pxtrk_ = r5Var;
                    this.bitField0_ = i & (-16);
                    this.wpx_ = false;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        this.extProto_ = list;
                        this.bitField0_ = i & (-32);
                        return this;
                    }
                    o7Var.g();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ApiFramework getApi(int i) {
                    return (ApiFramework) EventSpec.api_converter_.convert(this.api_.get(i));
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().c();
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().j(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().k();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventTrackingMethod getMethod(int i) {
                    return (EventTrackingMethod) EventSpec.method_converter_.convert(this.method_.get(i));
                }

                public Builder mergeFrom(EventSpec eventSpec) {
                    if (eventSpec == EventSpec.getDefaultInstance()) {
                        return this;
                    }
                    if (eventSpec.type_ != 0) {
                        setTypeValue(eventSpec.getTypeValue());
                    }
                    if (!eventSpec.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = eventSpec.method_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(eventSpec.method_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.api_.isEmpty()) {
                        if (this.api_.isEmpty()) {
                            this.api_ = eventSpec.api_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureApiIsMutable();
                            this.api_.addAll(eventSpec.api_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.jstrk_.isEmpty()) {
                        if (this.jstrk_.isEmpty()) {
                            this.jstrk_ = eventSpec.jstrk_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureJstrkIsMutable();
                            this.jstrk_.addAll(eventSpec.jstrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWjs()) {
                        setWjs(eventSpec.getWjs());
                    }
                    if (!eventSpec.pxtrk_.isEmpty()) {
                        if (this.pxtrk_.isEmpty()) {
                            this.pxtrk_ = eventSpec.pxtrk_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePxtrkIsMutable();
                            this.pxtrk_.addAll(eventSpec.pxtrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWpx()) {
                        setWpx(eventSpec.getWpx());
                    }
                    if (eventSpec.hasExt()) {
                        mergeExt(eventSpec.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!eventSpec.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = eventSpec.extProto_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(eventSpec.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!eventSpec.extProto_.isEmpty()) {
                        boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var = this.extProtoBuilder_;
                        if (zIsEmpty) {
                            o7 extProtoFieldBuilder = null;
                            o7Var.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = eventSpec.extProto_;
                            this.bitField0_ &= -17;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var.a(eventSpec.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) eventSpec).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setApi(int i, ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setApiValue(int i, int i2) {
                    ensureApiIsMutable();
                    this.api_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public Builder setJstrk(int i, String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.set(i, str);
                    onChanged();
                    return this;
                }

                public Builder setMethod(int i, EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.set(i, Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setMethodValue(int i, int i2) {
                    ensureMethodIsMutable();
                    this.method_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public Builder setPxtrk(int i, String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.set(i, str);
                    onChanged();
                    return this;
                }

                public Builder setType(EventType eventType) {
                    eventType.getClass();
                    this.type_ = eventType.getNumber();
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
                public EventSpec mo250getDefaultInstanceForType() {
                    return EventSpec.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                }

                public Builder setExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }
                    v7Var.h(struct);
                    return this;
                }

                private Builder(h4 h4Var) {
                    super(h4Var);
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    r5 r5Var = r5.c;
                    this.jstrk_ = r5Var;
                    this.pxtrk_ = r5Var;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, any);
                    return this;
                }

                public Builder setExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, any);
                    return this;
                }

                public Builder addExtProto(Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }
                    o7Var.e(any);
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof EventSpec) {
                        return mergeFrom((EventSpec) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    EventSpec eventSpec = null;
                    try {
                        try {
                            EventSpec eventSpec2 = (EventSpec) EventSpec.PARSER.parsePartialFrom(rVar, o3Var);
                            if (eventSpec2 != null) {
                                mergeFrom(eventSpec2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            EventSpec eventSpec3 = (EventSpec) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                eventSpec = eventSpec3;
                                if (eventSpec != null) {
                                    mergeFrom(eventSpec);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (eventSpec != null) {
                            mergeFrom(eventSpec);
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
                if (!(obj instanceof EventSpec)) {
                    return super.equals(obj);
                }
                EventSpec eventSpec = (EventSpec) obj;
                if (this.type_ == eventSpec.type_ && this.method_.equals(eventSpec.method_) && this.api_.equals(eventSpec.api_) && getJstrkList().equals(eventSpec.getJstrkList()) && getWjs() == eventSpec.getWjs() && getPxtrkList().equals(eventSpec.getPxtrkList()) && getWpx() == eventSpec.getWpx() && hasExt() == eventSpec.hasExt()) {
                    return (!hasExt() || getExt().equals(eventSpec.getExt())) && getExtProtoList().equals(eventSpec.getExtProtoList()) && this.unknownFields.equals(eventSpec.unknownFields);
                }
                return false;
            }

            public static EventSpec getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.U;
            }

            public static Builder newBuilder(EventSpec eventSpec) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSpec);
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EventSpec) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) api_converter_.convert(this.api_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<ApiFramework> getApiList() {
                return new i5(this.api_, api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getApiValueList() {
                return this.api_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getJstrk(int i) {
                return (String) this.jstrk_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getJstrkBytes(int i) {
                return this.jstrk_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getJstrkCount() {
                return this.jstrk_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventTrackingMethod getMethod(int i) {
                return (EventTrackingMethod) method_converter_.convert(this.method_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodCount() {
                return this.method_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<EventTrackingMethod> getMethodList() {
                return new i5(this.method_, method_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodValue(int i) {
                return this.method_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getMethodValueList() {
                return this.method_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public g7 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getPxtrk(int i) {
                return (String) this.pxtrk_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getPxtrkBytes(int i) {
                return this.pxtrk_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getPxtrkCount() {
                return this.pxtrk_.size();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iG = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
                int iJ = 0;
                for (int i2 = 0; i2 < this.method_.size(); i2++) {
                    iJ = z.j(iJ, this.method_.get(i2));
                }
                int iU = iG + iJ;
                if (!getMethodList().isEmpty()) {
                    iU = iU + 1 + w.u(iJ);
                }
                this.methodMemoizedSerializedSize = iJ;
                int iJ2 = 0;
                for (int i3 = 0; i3 < this.api_.size(); i3++) {
                    iJ2 = z.j(iJ2, this.api_.get(i3));
                }
                int iU2 = iU + iJ2;
                if (!getApiList().isEmpty()) {
                    iU2 = iU2 + 1 + w.u(iJ2);
                }
                this.apiMemoizedSerializedSize = iJ2;
                int iK = 0;
                for (int i4 = 0; i4 < this.jstrk_.size(); i4++) {
                    iK = z.k(this.jstrk_, i4, iK);
                }
                int size = getJstrkList().size() + iU2 + iK;
                if (this.wjs_) {
                    size += w.c(5);
                }
                int iK2 = 0;
                for (int i5 = 0; i5 < this.pxtrk_.size(); i5++) {
                    iK2 = z.k(this.pxtrk_, i5, iK2);
                }
                int size2 = getPxtrkList().size() + size + iK2;
                if (this.wpx_) {
                    size2 += w.c(7);
                }
                for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                    size2 += w.o(8, this.extProto_.get(i6));
                }
                if (this.ext_ != null) {
                    size2 += w.o(9, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size2;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWjs() {
                return this.wjs_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWpx() {
                return this.wpx_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.type_;
                if (getMethodCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 2, 53) + this.method_.hashCode();
                }
                if (getApiCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 3, 53) + this.api_.hashCode();
                }
                if (getJstrkCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 4, 53) + getJstrkList().hashCode();
                }
                int iC = l5.c(getWjs()) + pv1.c(iHashCode, 37, 5, 53);
                if (getPxtrkCount() > 0) {
                    iC = getPxtrkList().hashCode() + pv1.c(iC, 37, 6, 53);
                }
                int iC2 = l5.c(getWpx()) + pv1.c(iC, 37, 7, 53);
                if (hasExt()) {
                    iC2 = getExt().hashCode() + pv1.c(iC2, 37, 9, 53);
                }
                if (getExtProtoCount() > 0) {
                    iC2 = getExtProtoList().hashCode() + pv1.c(iC2, 37, 8, 53);
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iC2 * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.V;
                w4Var.c(EventSpec.class, Builder.class);
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
                return new EventSpec();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private EventSpec(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                Struct.Builder builder;
                this();
                o3Var.getClass();
                p8 p8VarB = s8.b();
                boolean z = false;
                int i = 0;
                while (!z) {
                    try {
                        try {
                            int iF = rVar.F();
                            switch (iF) {
                                case 0:
                                    break;
                                case 8:
                                    this.type_ = rVar.o();
                                    continue;
                                case 16:
                                    int iO = rVar.o();
                                    if ((i & 1) == 0) {
                                        this.method_ = new ArrayList();
                                        i |= 1;
                                    }
                                    this.method_.add(Integer.valueOf(iO));
                                    continue;
                                case 18:
                                    int iK = rVar.k(rVar.x());
                                    while (rVar.d() > 0) {
                                        int iO2 = rVar.o();
                                        if ((i & 1) == 0) {
                                            this.method_ = new ArrayList();
                                            i |= 1;
                                        }
                                        this.method_.add(Integer.valueOf(iO2));
                                    }
                                    rVar.j(iK);
                                    continue;
                                case 24:
                                    int iO3 = rVar.o();
                                    if ((i & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iO3));
                                    continue;
                                case 26:
                                    int iK2 = rVar.k(rVar.x());
                                    while (rVar.d() > 0) {
                                        int iO4 = rVar.o();
                                        if ((i & 2) == 0) {
                                            this.api_ = new ArrayList();
                                            i |= 2;
                                        }
                                        this.api_.add(Integer.valueOf(iO4));
                                    }
                                    rVar.j(iK2);
                                    continue;
                                case 34:
                                    String strE = rVar.E();
                                    if ((i & 4) == 0) {
                                        this.jstrk_ = new r5();
                                        i |= 4;
                                    }
                                    this.jstrk_.add(strE);
                                    continue;
                                case 40:
                                    this.wjs_ = rVar.l();
                                    continue;
                                case 50:
                                    String strE2 = rVar.E();
                                    if ((i & 8) == 0) {
                                        this.pxtrk_ = new r5();
                                        i |= 8;
                                    }
                                    this.pxtrk_.add(strE2);
                                    continue;
                                case 56:
                                    this.wpx_ = rVar.l();
                                    continue;
                                case 66:
                                    if ((i & 16) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                    continue;
                                case 74:
                                    Struct struct = this.ext_;
                                    if (struct != null) {
                                        builder = struct.toBuilder();
                                    } else {
                                        builder = null;
                                    }
                                    Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i & 1) != 0) {
                            this.method_ = Collections.unmodifiableList(this.method_);
                        }
                        if ((i & 2) != 0) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if ((i & 4) != 0) {
                            this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        }
                        if ((i & 8) != 0) {
                            this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        }
                        if ((i & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i & 1) != 0) {
                    this.method_ = Collections.unmodifiableList(this.method_);
                }
                if ((i & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if ((i & 4) != 0) {
                    this.jstrk_ = this.jstrk_.getUnmodifiableView();
                }
                if ((i & 8) != 0) {
                    this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                }
                if ((i & 16) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                getSerializedSize();
                if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                    wVar.K(1, this.type_);
                }
                if (getMethodList().size() > 0) {
                    wVar.U(18);
                    wVar.U(this.methodMemoizedSerializedSize);
                }
                for (int i = 0; i < this.method_.size(); i++) {
                    wVar.L(this.method_.get(i).intValue());
                }
                if (getApiList().size() > 0) {
                    wVar.U(26);
                    wVar.U(this.apiMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.api_.size(); i2++) {
                    wVar.L(this.api_.get(i2).intValue());
                }
                int iL = 0;
                while (iL < this.jstrk_.size()) {
                    iL = z.l(this.jstrk_, iL, wVar, 4, iL, 1);
                }
                boolean z = this.wjs_;
                if (z) {
                    wVar.A(5, z);
                }
                int iL2 = 0;
                while (iL2 < this.pxtrk_.size()) {
                    iL2 = z.l(this.pxtrk_, iL2, wVar, 6, iL2, 1);
                }
                boolean z2 = this.wpx_;
                if (z2) {
                    wVar.A(7, z2);
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    wVar.M(8, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    wVar.M(9, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public j7 getJstrkList() {
                return this.jstrk_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public j7 getPxtrkList() {
                return this.pxtrk_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public EventSpec mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (EventSpec) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static EventSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventSpec parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString, o3Var);
            }

            public static EventSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr);
            }

            public static EventSpec parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr, o3Var);
            }

            public static EventSpec parseFrom(InputStream inputStream) throws IOException {
                return (EventSpec) y4.parseWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (EventSpec) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static EventSpec parseFrom(r rVar) throws IOException {
                return (EventSpec) y4.parseWithIOException(PARSER, rVar);
            }

            public static EventSpec parseFrom(r rVar, o3 o3Var) throws IOException {
                return (EventSpec) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private EventSpec(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private EventSpec() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                List list = Collections.EMPTY_LIST;
                this.method_ = list;
                this.api_ = list;
                r5 r5Var = r5.c;
                this.jstrk_ = r5Var;
                this.pxtrk_ = r5Var;
                this.extProto_ = list;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface EventSpecOrBuilder extends MessageOrBuilder {
            ApiFramework getApi(int i);

            int getApiCount();

            List<ApiFramework> getApiList();

            int getApiValue(int i);

            List<Integer> getApiValueList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            String getJstrk(int i);

            ByteString getJstrkBytes(int i);

            int getJstrkCount();

            List<String> getJstrkList();

            EventTrackingMethod getMethod(int i);

            int getMethodCount();

            List<EventTrackingMethod> getMethodList();

            int getMethodValue(int i);

            List<Integer> getMethodValueList();

            String getPxtrk(int i);

            ByteString getPxtrkBytes(int i);

            int getPxtrkCount();

            List<String> getPxtrkList();

            EventType getType();

            int getTypeValue();

            boolean getWjs();

            boolean getWpx();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class NativeFormat extends y4 implements NativeFormatOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 1;
            public static final int EXT_FIELD_NUMBER = 3;
            public static final int EXT_PROTO_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AssetFormat> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private static final NativeFormat DEFAULT_INSTANCE = new NativeFormat();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.1
                @Override // com.explorestack.protobuf.g7
                public NativeFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new NativeFormat(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class AssetFormat extends y4 implements AssetFormatOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 8;
                public static final int EXT_PROTO_FIELD_NUMBER = 7;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMG_FIELD_NUMBER = 4;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAssetFormat data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAssetFormat img_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAssetFormat title_;
                private VideoPlacement video_;
                private static final AssetFormat DEFAULT_INSTANCE = new AssetFormat();
                private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.1
                    @Override // com.explorestack.protobuf.g7
                    public AssetFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        return new AssetFormat(rVar, o3Var);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class Builder extends g4 implements AssetFormatOrBuilder {
                    private int bitField0_;
                    private v7 dataBuilder_;
                    private DataAssetFormat data_;
                    private v7 extBuilder_;
                    private o7 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private v7 imgBuilder_;
                    private ImageAssetFormat img_;
                    private boolean req_;
                    private v7 titleBuilder_;
                    private TitleAssetFormat title_;
                    private v7 videoBuilder_;
                    private VideoPlacement video_;

                    private Builder() {
                        super(null);
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private v7 getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new v7(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.M;
                    }

                    private v7 getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private o7 getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private v7 getImgFieldBuilder() {
                        if (this.imgBuilder_ == null) {
                            this.imgBuilder_ = new v7(getImg(), getParentForChildren(), isClean());
                            this.img_ = null;
                        }
                        return this.imgBuilder_;
                    }

                    private v7 getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new v7(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private v7 getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new v7(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var != null) {
                            o7Var.a(iterable);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var != null) {
                            o7Var.e(builder.build());
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat buildPartial() {
                        AssetFormat assetFormat = new AssetFormat(this);
                        assetFormat.id_ = this.id_;
                        assetFormat.req_ = this.req_;
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var == null) {
                            assetFormat.title_ = this.title_;
                        } else {
                            assetFormat.title_ = (TitleAssetFormat) v7Var.a();
                        }
                        v7 v7Var2 = this.imgBuilder_;
                        if (v7Var2 == null) {
                            assetFormat.img_ = this.img_;
                        } else {
                            assetFormat.img_ = (ImageAssetFormat) v7Var2.a();
                        }
                        v7 v7Var3 = this.videoBuilder_;
                        if (v7Var3 == null) {
                            assetFormat.video_ = this.video_;
                        } else {
                            assetFormat.video_ = (VideoPlacement) v7Var3.a();
                        }
                        v7 v7Var4 = this.dataBuilder_;
                        if (v7Var4 == null) {
                            assetFormat.data_ = this.data_;
                        } else {
                            assetFormat.data_ = (DataAssetFormat) v7Var4.a();
                        }
                        v7 v7Var5 = this.extBuilder_;
                        if (v7Var5 == null) {
                            assetFormat.ext_ = this.ext_;
                        } else {
                            assetFormat.ext_ = (Struct) v7Var5.a();
                        }
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            assetFormat.extProto_ = this.extProto_;
                        } else {
                            assetFormat.extProto_ = o7Var.f();
                        }
                        onBuilt();
                        return assetFormat;
                    }

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                            return this;
                        }
                        this.data_ = null;
                        this.dataBuilder_ = null;
                        return this;
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                            return this;
                        }
                        this.ext_ = null;
                        this.extBuilder_ = null;
                        return this;
                    }

                    public Builder clearExtProto() {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var != null) {
                            o7Var.g();
                            return this;
                        }
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearImg() {
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                            onChanged();
                            return this;
                        }
                        this.img_ = null;
                        this.imgBuilder_ = null;
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                            return this;
                        }
                        this.title_ = null;
                        this.titleBuilder_ = null;
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                            return this;
                        }
                        this.video_ = null;
                        this.videoBuilder_ = null;
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormat getData() {
                        v7 v7Var = this.dataBuilder_;
                        if (v7Var != null) {
                            return (DataAssetFormat) v7Var.d();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormatOrBuilder getDataOrBuilder() {
                        v7 v7Var = this.dataBuilder_;
                        if (v7Var != null) {
                            return (DataAssetFormatOrBuilder) v7Var.e();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.M;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public Struct getExt() {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            return (Struct) v7Var.d();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public c8 getExtOrBuilder() {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            return (c8) v7Var.e();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public Any getExtProto(int i) {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getExtProtoCount() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public g getExtProtoOrBuilder(int i) {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormat getImg() {
                        v7 v7Var = this.imgBuilder_;
                        if (v7Var != null) {
                            return (ImageAssetFormat) v7Var.d();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormatOrBuilder getImgOrBuilder() {
                        v7 v7Var = this.imgBuilder_;
                        if (v7Var != null) {
                            return (ImageAssetFormatOrBuilder) v7Var.e();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormat getTitle() {
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var != null) {
                            return (TitleAssetFormat) v7Var.d();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var != null) {
                            return (TitleAssetFormatOrBuilder) v7Var.e();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacement getVideo() {
                        v7 v7Var = this.videoBuilder_;
                        if (v7Var != null) {
                            return (VideoPlacement) v7Var.d();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacementOrBuilder getVideoOrBuilder() {
                        v7 v7Var = this.videoBuilder_;
                        if (v7Var != null) {
                            return (VideoPlacementOrBuilder) v7Var.e();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasImg() {
                        return (this.imgBuilder_ == null && this.img_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.g4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = b.N;
                        w4Var.c(AssetFormat.class, Builder.class);
                        return w4Var;
                    }

                    public Builder mergeData(DataAssetFormat dataAssetFormat) {
                        v7 v7Var = this.dataBuilder_;
                        if (v7Var != null) {
                            v7Var.f(dataAssetFormat);
                            return this;
                        }
                        DataAssetFormat dataAssetFormat2 = this.data_;
                        if (dataAssetFormat2 != null) {
                            this.data_ = DataAssetFormat.newBuilder(dataAssetFormat2).mergeFrom(dataAssetFormat).buildPartial();
                        } else {
                            this.data_ = dataAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeExt(Struct struct) {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            v7Var.f(struct);
                            return this;
                        }
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = z.m(struct2, struct);
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeImg(ImageAssetFormat imageAssetFormat) {
                        v7 v7Var = this.imgBuilder_;
                        if (v7Var != null) {
                            v7Var.f(imageAssetFormat);
                            return this;
                        }
                        ImageAssetFormat imageAssetFormat2 = this.img_;
                        if (imageAssetFormat2 != null) {
                            this.img_ = ImageAssetFormat.newBuilder(imageAssetFormat2).mergeFrom(imageAssetFormat).buildPartial();
                        } else {
                            this.img_ = imageAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeTitle(TitleAssetFormat titleAssetFormat) {
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var != null) {
                            v7Var.f(titleAssetFormat);
                            return this;
                        }
                        TitleAssetFormat titleAssetFormat2 = this.title_;
                        if (titleAssetFormat2 != null) {
                            this.title_ = TitleAssetFormat.newBuilder(titleAssetFormat2).mergeFrom(titleAssetFormat).buildPartial();
                        } else {
                            this.title_ = titleAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeVideo(VideoPlacement videoPlacement) {
                        v7 v7Var = this.videoBuilder_;
                        if (v7Var != null) {
                            v7Var.f(videoPlacement);
                            return this;
                        }
                        VideoPlacement videoPlacement2 = this.video_;
                        if (videoPlacement2 != null) {
                            this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                        } else {
                            this.video_ = videoPlacement;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder removeExtProto(int i) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var != null) {
                            o7Var.r(i);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                        return this;
                    }

                    public Builder setData(DataAssetFormat.Builder builder) {
                        v7 v7Var = this.dataBuilder_;
                        if (v7Var != null) {
                            v7Var.h(builder.build());
                            return this;
                        }
                        this.data_ = builder.build();
                        onChanged();
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            v7Var.h(builder.build());
                            return this;
                        }
                        this.ext_ = builder.build();
                        onChanged();
                        return this;
                    }

                    public Builder setExtProto(int i, Any.Builder builder) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var != null) {
                            o7Var.s(i, builder.build());
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                        return this;
                    }

                    public Builder setId(int i) {
                        this.id_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat.Builder builder) {
                        v7 v7Var = this.imgBuilder_;
                        if (v7Var != null) {
                            v7Var.h(builder.build());
                            return this;
                        }
                        this.img_ = builder.build();
                        onChanged();
                        return this;
                    }

                    public Builder setReq(boolean z) {
                        this.req_ = z;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat.Builder builder) {
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var != null) {
                            v7Var.h(builder.build());
                            return this;
                        }
                        this.title_ = builder.build();
                        onChanged();
                        return this;
                    }

                    public Builder setVideo(VideoPlacement.Builder builder) {
                        v7 v7Var = this.videoBuilder_;
                        if (v7Var != null) {
                            v7Var.h(builder.build());
                            return this;
                        }
                        this.video_ = builder.build();
                        onChanged();
                        return this;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (y4.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat build() {
                        AssetFormat assetFormatBuildPartial = buildPartial();
                        if (assetFormatBuildPartial.isInitialized()) {
                            return assetFormatBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetFormatBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -2;
                            return this;
                        }
                        o7Var.g();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo247clone() {
                        return (Builder) super.mo247clone();
                    }

                    public DataAssetFormat.Builder getDataBuilder() {
                        onChanged();
                        return (DataAssetFormat.Builder) getDataFieldBuilder().c();
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return (Struct.Builder) getExtFieldBuilder().c();
                    }

                    public Any.Builder getExtProtoBuilder(int i) {
                        return (Any.Builder) getExtProtoFieldBuilder().j(i);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().k();
                    }

                    public ImageAssetFormat.Builder getImgBuilder() {
                        onChanged();
                        return (ImageAssetFormat.Builder) getImgFieldBuilder().c();
                    }

                    public TitleAssetFormat.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAssetFormat.Builder) getTitleFieldBuilder().c();
                    }

                    public VideoPlacement.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoPlacement.Builder) getVideoFieldBuilder().c();
                    }

                    public Builder mergeFrom(AssetFormat assetFormat) {
                        if (assetFormat == AssetFormat.getDefaultInstance()) {
                            return this;
                        }
                        if (assetFormat.getId() != 0) {
                            setId(assetFormat.getId());
                        }
                        if (assetFormat.getReq()) {
                            setReq(assetFormat.getReq());
                        }
                        if (assetFormat.hasTitle()) {
                            mergeTitle(assetFormat.getTitle());
                        }
                        if (assetFormat.hasImg()) {
                            mergeImg(assetFormat.getImg());
                        }
                        if (assetFormat.hasVideo()) {
                            mergeVideo(assetFormat.getVideo());
                        }
                        if (assetFormat.hasData()) {
                            mergeData(assetFormat.getData());
                        }
                        if (assetFormat.hasExt()) {
                            mergeExt(assetFormat.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!assetFormat.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = assetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(assetFormat.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!assetFormat.extProto_.isEmpty()) {
                            boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                            o7 o7Var = this.extProtoBuilder_;
                            if (zIsEmpty) {
                                o7 extProtoFieldBuilder = null;
                                o7Var.a = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = assetFormat.extProto_;
                                this.bitField0_ &= -2;
                                if (y4.alwaysUseFieldBuilders) {
                                    extProtoFieldBuilder = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = extProtoFieldBuilder;
                            } else {
                                o7Var.a(assetFormat.extProto_);
                            }
                        }
                        mergeUnknownFields(((y4) assetFormat).unknownFields);
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
                    public AssetFormat mo250getDefaultInstanceForType() {
                        return AssetFormat.getDefaultInstance();
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
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Any.Builder addExtProtoBuilder(int i) {
                        return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                    }

                    public Builder setData(DataAssetFormat dataAssetFormat) {
                        v7 v7Var = this.dataBuilder_;
                        if (v7Var == null) {
                            dataAssetFormat.getClass();
                            this.data_ = dataAssetFormat;
                            onChanged();
                            return this;
                        }
                        v7Var.h(dataAssetFormat);
                        return this;
                    }

                    public Builder setExt(Struct struct) {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var == null) {
                            struct.getClass();
                            this.ext_ = struct;
                            onChanged();
                            return this;
                        }
                        v7Var.h(struct);
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat imageAssetFormat) {
                        v7 v7Var = this.imgBuilder_;
                        if (v7Var == null) {
                            imageAssetFormat.getClass();
                            this.img_ = imageAssetFormat;
                            onChanged();
                            return this;
                        }
                        v7Var.h(imageAssetFormat);
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat titleAssetFormat) {
                        v7 v7Var = this.titleBuilder_;
                        if (v7Var == null) {
                            titleAssetFormat.getClass();
                            this.title_ = titleAssetFormat;
                            onChanged();
                            return this;
                        }
                        v7Var.h(titleAssetFormat);
                        return this;
                    }

                    public Builder setVideo(VideoPlacement videoPlacement) {
                        v7 v7Var = this.videoBuilder_;
                        if (v7Var == null) {
                            videoPlacement.getClass();
                            this.video_ = videoPlacement;
                            onChanged();
                            return this;
                        }
                        v7Var.h(videoPlacement);
                        return this;
                    }

                    public Builder addExtProto(int i, Any any) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, any);
                            onChanged();
                            return this;
                        }
                        o7Var.d(i, any);
                        return this;
                    }

                    public Builder setExtProto(int i, Any any) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, any);
                            onChanged();
                            return this;
                        }
                        o7Var.s(i, any);
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                            return this;
                        }
                        o7Var.e(any);
                        return this;
                    }

                    public Builder addExtProto(int i, Any.Builder builder) {
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, builder.build());
                            onChanged();
                            return this;
                        }
                        o7Var.d(i, builder.build());
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof AssetFormat) {
                            return mergeFrom((AssetFormat) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                        AssetFormat assetFormat = null;
                        try {
                            try {
                                AssetFormat assetFormat2 = (AssetFormat) AssetFormat.PARSER.parsePartialFrom(rVar, o3Var);
                                if (assetFormat2 != null) {
                                    mergeFrom(assetFormat2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                AssetFormat assetFormat3 = (AssetFormat) e.getUnfinishedMessage();
                                try {
                                    throw e.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    assetFormat = assetFormat3;
                                    if (assetFormat != null) {
                                        mergeFrom(assetFormat);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (assetFormat != null) {
                                mergeFrom(assetFormat);
                            }
                            throw th;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class DataAssetFormat extends y4 implements DataAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private static final DataAssetFormat DEFAULT_INSTANCE = new DataAssetFormat();
                    private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.1
                        @Override // com.explorestack.protobuf.g7
                        public DataAssetFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                            return new DataAssetFormat(rVar, o3Var);
                        }
                    };

                    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                    public static final class Builder extends g4 implements DataAssetFormatOrBuilder {
                        private int bitField0_;
                        private v7 extBuilder_;
                        private o7 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;

                        private Builder() {
                            super(null);
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.S;
                        }

                        private v7 getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private o7 getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.a(iterable);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.e(builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat buildPartial() {
                            DataAssetFormat dataAssetFormat = new DataAssetFormat(this);
                            dataAssetFormat.type_ = this.type_;
                            dataAssetFormat.len_ = this.len_;
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                dataAssetFormat.ext_ = this.ext_;
                            } else {
                                dataAssetFormat.ext_ = (Struct) v7Var.a();
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAssetFormat.extProto_ = this.extProto_;
                            } else {
                                dataAssetFormat.extProto_ = o7Var.f();
                            }
                            onBuilt();
                            return dataAssetFormat;
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                                return this;
                            }
                            this.ext_ = null;
                            this.extBuilder_ = null;
                            return this;
                        }

                        public Builder clearExtProto() {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.g();
                                return this;
                            }
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -2;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.S;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public Struct getExt() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (Struct) v7Var.d();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public c8 getExtOrBuilder() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (c8) v7Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public Any getExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public g getExtProtoOrBuilder(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<? extends g> getExtProtoOrBuilderList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.g4
                        public w4 internalGetFieldAccessorTable() {
                            w4 w4Var = b.T;
                            w4Var.c(DataAssetFormat.class, Builder.class);
                            return w4Var;
                        }

                        public Builder mergeExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.f(struct);
                                return this;
                            }
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = z.m(struct2, struct);
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                            return this;
                        }

                        public Builder removeExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.r(i);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                            return this;
                        }

                        public Builder setExt(Struct.Builder builder) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.h(builder.build());
                                return this;
                            }
                            this.ext_ = builder.build();
                            onChanged();
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.s(i, builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                            return this;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
                            onChanged();
                            return this;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (y4.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat build() {
                            DataAssetFormat dataAssetFormatBuildPartial = buildPartial();
                            if (dataAssetFormatBuildPartial.isInitialized()) {
                                return dataAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clear() {
                            super.clear();
                            this.type_ = 0;
                            this.len_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                this.extProto_ = Collections.EMPTY_LIST;
                                this.bitField0_ &= -2;
                                return this;
                            }
                            o7Var.g();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder
                        /* JADX INFO: renamed from: clone */
                        public Builder mo247clone() {
                            return (Builder) super.mo247clone();
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().c();
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().j(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().k();
                        }

                        public Builder mergeFrom(DataAssetFormat dataAssetFormat) {
                            if (dataAssetFormat == DataAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (dataAssetFormat.type_ != 0) {
                                setTypeValue(dataAssetFormat.getTypeValue());
                            }
                            if (dataAssetFormat.getLen() != 0) {
                                setLen(dataAssetFormat.getLen());
                            }
                            if (dataAssetFormat.hasExt()) {
                                mergeExt(dataAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAssetFormat.extProto_.isEmpty()) {
                                boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                                o7 o7Var = this.extProtoBuilder_;
                                if (zIsEmpty) {
                                    o7 extProtoFieldBuilder = null;
                                    o7Var.a = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    if (y4.alwaysUseFieldBuilders) {
                                        extProtoFieldBuilder = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = extProtoFieldBuilder;
                                } else {
                                    o7Var.a(dataAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(((y4) dataAssetFormat).unknownFields);
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public final Builder mergeUnknownFields(s8 s8Var) {
                            return (Builder) super.mergeUnknownFields(s8Var);
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
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
                        public DataAssetFormat mo250getDefaultInstanceForType() {
                            return DataAssetFormat.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                        }

                        private Builder(h4 h4Var) {
                            super(h4Var);
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder setExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                                return this;
                            }
                            v7Var.h(struct);
                            return this;
                        }

                        public Builder addExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, any);
                            return this;
                        }

                        public Builder setExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.s(i, any);
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                                return this;
                            }
                            o7Var.e(any);
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, builder.build());
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof DataAssetFormat) {
                                return mergeFrom((DataAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                            DataAssetFormat dataAssetFormat = null;
                            try {
                                try {
                                    DataAssetFormat dataAssetFormat2 = (DataAssetFormat) DataAssetFormat.PARSER.parsePartialFrom(rVar, o3Var);
                                    if (dataAssetFormat2 != null) {
                                        mergeFrom(dataAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e) {
                                    DataAssetFormat dataAssetFormat3 = (DataAssetFormat) e.getUnfinishedMessage();
                                    try {
                                        throw e.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        dataAssetFormat = dataAssetFormat3;
                                        if (dataAssetFormat != null) {
                                            mergeFrom(dataAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (dataAssetFormat != null) {
                                    mergeFrom(dataAssetFormat);
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
                        if (!(obj instanceof DataAssetFormat)) {
                            return super.equals(obj);
                        }
                        DataAssetFormat dataAssetFormat = (DataAssetFormat) obj;
                        if (this.type_ == dataAssetFormat.type_ && getLen() == dataAssetFormat.getLen() && hasExt() == dataAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAssetFormat.getExt())) && getExtProtoList().equals(dataAssetFormat.getExtProtoList()) && this.unknownFields.equals(dataAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    public static DataAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.S;
                    }

                    public static Builder newBuilder(DataAssetFormat dataAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAssetFormat);
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static g7 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public g getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int iG = this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
                        int i2 = this.len_;
                        if (i2 != 0) {
                            iG += w.t(2, i2);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            iG += w.o(3, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            iG += w.o(4, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iG;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final s8 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i = this.memoizedHashCode;
                        if (i != 0) {
                            return i;
                        }
                        int len = getLen() + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53);
                        if (hasExt()) {
                            len = getExt().hashCode() + pv1.c(len, 37, 4, 53);
                        }
                        if (getExtProtoCount() > 0) {
                            len = getExtProtoList().hashCode() + pv1.c(len, 37, 3, 53);
                        }
                        int iHashCode = this.unknownFields.a.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.y4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = b.T;
                        w4Var.c(DataAssetFormat.class, Builder.class);
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
                        return new DataAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(w wVar) throws IOException {
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            wVar.K(1, this.type_);
                        }
                        int i = this.len_;
                        if (i != 0) {
                            wVar.T(2, i);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            wVar.M(3, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            wVar.M(4, getExt());
                        }
                        this.unknownFields.writeTo(wVar);
                    }

                    private DataAssetFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        Struct.Builder builder;
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
                                                if (iF != 26) {
                                                    if (iF != 34) {
                                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                        }
                                                    } else {
                                                        Struct struct = this.ext_;
                                                        if (struct != null) {
                                                            builder = struct.toBuilder();
                                                        } else {
                                                            builder = null;
                                                        }
                                                        Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                        this.ext_ = struct2;
                                                        if (builder != null) {
                                                            builder.mergeFrom(struct2);
                                                            this.ext_ = builder.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    if (!z2) {
                                                        this.extProto_ = new ArrayList();
                                                        z2 = true;
                                                    }
                                                    this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                                }
                                            } else {
                                                this.len_ = rVar.G();
                                            }
                                        } else {
                                            this.type_ = rVar.o();
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
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = p8VarB.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z2) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public c8 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public DataAssetFormat mo250getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (DataAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer, o3Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString);
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString, o3Var);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr, o3Var);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) y4.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (DataAssetFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static DataAssetFormat parseFrom(r rVar) throws IOException {
                        return (DataAssetFormat) y4.parseWithIOException(PARSER, rVar);
                    }

                    public static DataAssetFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                        return (DataAssetFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
                    }

                    private DataAssetFormat(g4 g4Var) {
                        super(g4Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    private DataAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public interface DataAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                    Struct getExt();

                    c8 getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    g getExtProtoOrBuilder(int i);

                    List<? extends g> getExtProtoOrBuilderList();

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class ImageAssetFormat extends y4 implements ImageAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 10;
                    public static final int EXT_PROTO_FIELD_NUMBER = 9;
                    public static final int HMIN_FIELD_NUMBER = 6;
                    public static final int HRATIO_FIELD_NUMBER = 8;
                    public static final int H_FIELD_NUMBER = 4;
                    public static final int MIME_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    public static final int WMIN_FIELD_NUMBER = 5;
                    public static final int WRATIO_FIELD_NUMBER = 7;
                    public static final int W_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private int hmin_;
                    private int hratio_;
                    private byte memoizedIsInitialized;
                    private s5 mime_;
                    private int type_;
                    private int w_;
                    private int wmin_;
                    private int wratio_;
                    private static final ImageAssetFormat DEFAULT_INSTANCE = new ImageAssetFormat();
                    private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.1
                        @Override // com.explorestack.protobuf.g7
                        public ImageAssetFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                            return new ImageAssetFormat(rVar, o3Var);
                        }
                    };

                    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                    public static final class Builder extends g4 implements ImageAssetFormatOrBuilder {
                        private int bitField0_;
                        private v7 extBuilder_;
                        private o7 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int hmin_;
                        private int hratio_;
                        private s5 mime_;
                        private int type_;
                        private int w_;
                        private int wmin_;
                        private int wratio_;

                        private Builder() {
                            super(null);
                            this.type_ = 0;
                            this.mime_ = r5.c;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHmin() {
                            this.hmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHratio() {
                            this.hratio_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWmin() {
                            this.wmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWratio() {
                            this.wratio_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 2) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 2;
                            }
                        }

                        private void ensureMimeIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.mime_ = new r5(this.mime_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.Q;
                        }

                        private v7 getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private o7 getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.a(iterable);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.e(builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat buildPartial() {
                            ImageAssetFormat imageAssetFormat = new ImageAssetFormat(this);
                            imageAssetFormat.type_ = this.type_;
                            if ((this.bitField0_ & 1) != 0) {
                                this.mime_ = this.mime_.getUnmodifiableView();
                                this.bitField0_ &= -2;
                            }
                            imageAssetFormat.mime_ = this.mime_;
                            imageAssetFormat.w_ = this.w_;
                            imageAssetFormat.h_ = this.h_;
                            imageAssetFormat.wmin_ = this.wmin_;
                            imageAssetFormat.hmin_ = this.hmin_;
                            imageAssetFormat.wratio_ = this.wratio_;
                            imageAssetFormat.hratio_ = this.hratio_;
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                imageAssetFormat.ext_ = this.ext_;
                            } else {
                                imageAssetFormat.ext_ = (Struct) v7Var.a();
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                if ((this.bitField0_ & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -3;
                                }
                                imageAssetFormat.extProto_ = this.extProto_;
                            } else {
                                imageAssetFormat.extProto_ = o7Var.f();
                            }
                            onBuilt();
                            return imageAssetFormat;
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                                return this;
                            }
                            this.ext_ = null;
                            this.extBuilder_ = null;
                            return this;
                        }

                        public Builder clearExtProto() {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.g();
                                return this;
                            }
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -3;
                            onChanged();
                            return this;
                        }

                        public Builder clearMime() {
                            this.mime_ = r5.c;
                            this.bitField0_ &= -2;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.Q;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public Struct getExt() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (Struct) v7Var.d();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public c8 getExtOrBuilder() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (c8) v7Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public Any getExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public g getExtProtoOrBuilder(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<? extends g> getExtProtoOrBuilderList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHmin() {
                            return this.hmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHratio() {
                            return this.hratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public String getMime(int i) {
                            return (String) this.mime_.get(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public ByteString getMimeBytes(int i) {
                            return this.mime_.getByteString(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getMimeCount() {
                            return this.mime_.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public j7 getMimeList() {
                            return this.mime_.getUnmodifiableView();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWmin() {
                            return this.wmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWratio() {
                            return this.wratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.g4
                        public w4 internalGetFieldAccessorTable() {
                            w4 w4Var = b.R;
                            w4Var.c(ImageAssetFormat.class, Builder.class);
                            return w4Var;
                        }

                        public Builder mergeExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.f(struct);
                                return this;
                            }
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = z.m(struct2, struct);
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                            return this;
                        }

                        public Builder removeExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.r(i);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                            return this;
                        }

                        public Builder setExt(Struct.Builder builder) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.h(builder.build());
                                return this;
                            }
                            this.ext_ = builder.build();
                            onChanged();
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.s(i, builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                            return this;
                        }

                        public Builder setH(int i) {
                            this.h_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setHmin(int i) {
                            this.hmin_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setHratio(int i) {
                            this.hratio_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i) {
                            this.w_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setWmin(int i) {
                            this.wmin_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setWratio(int i) {
                            this.wratio_ = i;
                            onChanged();
                            return this;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (y4.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllMime(Iterable<String> iterable) {
                            ensureMimeIsMutable();
                            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.mime_);
                            onChanged();
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        public Builder addMime(String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.add(str);
                            onChanged();
                            return this;
                        }

                        public Builder addMimeBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                            ensureMimeIsMutable();
                            this.mime_.b(byteString);
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat build() {
                            ImageAssetFormat imageAssetFormatBuildPartial = buildPartial();
                            if (imageAssetFormatBuildPartial.isInitialized()) {
                                return imageAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clear() {
                            super.clear();
                            this.type_ = 0;
                            this.mime_ = r5.c;
                            int i = this.bitField0_;
                            this.bitField0_ = i & (-2);
                            this.w_ = 0;
                            this.h_ = 0;
                            this.wmin_ = 0;
                            this.hmin_ = 0;
                            this.wratio_ = 0;
                            this.hratio_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                this.extProto_ = Collections.EMPTY_LIST;
                                this.bitField0_ = i & (-4);
                                return this;
                            }
                            o7Var.g();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder
                        /* JADX INFO: renamed from: clone */
                        public Builder mo247clone() {
                            return (Builder) super.mo247clone();
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().c();
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().j(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().k();
                        }

                        public Builder mergeFrom(ImageAssetFormat imageAssetFormat) {
                            if (imageAssetFormat == ImageAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (imageAssetFormat.type_ != 0) {
                                setTypeValue(imageAssetFormat.getTypeValue());
                            }
                            if (!imageAssetFormat.mime_.isEmpty()) {
                                if (this.mime_.isEmpty()) {
                                    this.mime_ = imageAssetFormat.mime_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureMimeIsMutable();
                                    this.mime_.addAll(imageAssetFormat.mime_);
                                }
                                onChanged();
                            }
                            if (imageAssetFormat.getW() != 0) {
                                setW(imageAssetFormat.getW());
                            }
                            if (imageAssetFormat.getH() != 0) {
                                setH(imageAssetFormat.getH());
                            }
                            if (imageAssetFormat.getWmin() != 0) {
                                setWmin(imageAssetFormat.getWmin());
                            }
                            if (imageAssetFormat.getHmin() != 0) {
                                setHmin(imageAssetFormat.getHmin());
                            }
                            if (imageAssetFormat.getWratio() != 0) {
                                setWratio(imageAssetFormat.getWratio());
                            }
                            if (imageAssetFormat.getHratio() != 0) {
                                setHratio(imageAssetFormat.getHratio());
                            }
                            if (imageAssetFormat.hasExt()) {
                                mergeExt(imageAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAssetFormat.extProto_;
                                        this.bitField0_ &= -3;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAssetFormat.extProto_.isEmpty()) {
                                boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                                o7 o7Var = this.extProtoBuilder_;
                                if (zIsEmpty) {
                                    o7 extProtoFieldBuilder = null;
                                    o7Var.a = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAssetFormat.extProto_;
                                    this.bitField0_ &= -3;
                                    if (y4.alwaysUseFieldBuilders) {
                                        extProtoFieldBuilder = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = extProtoFieldBuilder;
                                } else {
                                    o7Var.a(imageAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(((y4) imageAssetFormat).unknownFields);
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public final Builder mergeUnknownFields(s8 s8Var) {
                            return (Builder) super.mergeUnknownFields(s8Var);
                        }

                        public Builder setMime(int i, String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.set(i, str);
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
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
                        public ImageAssetFormat mo250getDefaultInstanceForType() {
                            return ImageAssetFormat.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                        }

                        private Builder(h4 h4Var) {
                            super(h4Var);
                            this.type_ = 0;
                            this.mime_ = r5.c;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder setExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                                return this;
                            }
                            v7Var.h(struct);
                            return this;
                        }

                        public Builder addExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, any);
                            return this;
                        }

                        public Builder setExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.s(i, any);
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                                return this;
                            }
                            o7Var.e(any);
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, builder.build());
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof ImageAssetFormat) {
                                return mergeFrom((ImageAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                            ImageAssetFormat imageAssetFormat = null;
                            try {
                                try {
                                    ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) ImageAssetFormat.PARSER.parsePartialFrom(rVar, o3Var);
                                    if (imageAssetFormat2 != null) {
                                        mergeFrom(imageAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e) {
                                    ImageAssetFormat imageAssetFormat3 = (ImageAssetFormat) e.getUnfinishedMessage();
                                    try {
                                        throw e.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        imageAssetFormat = imageAssetFormat3;
                                        if (imageAssetFormat != null) {
                                            mergeFrom(imageAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (imageAssetFormat != null) {
                                    mergeFrom(imageAssetFormat);
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
                        if (!(obj instanceof ImageAssetFormat)) {
                            return super.equals(obj);
                        }
                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) obj;
                        if (this.type_ == imageAssetFormat.type_ && getMimeList().equals(imageAssetFormat.getMimeList()) && getW() == imageAssetFormat.getW() && getH() == imageAssetFormat.getH() && getWmin() == imageAssetFormat.getWmin() && getHmin() == imageAssetFormat.getHmin() && getWratio() == imageAssetFormat.getWratio() && getHratio() == imageAssetFormat.getHratio() && hasExt() == imageAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAssetFormat.getExt())) && getExtProtoList().equals(imageAssetFormat.getExtProtoList()) && this.unknownFields.equals(imageAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    public static ImageAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.Q;
                    }

                    public static Builder newBuilder(ImageAssetFormat imageAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAssetFormat);
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static g7 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public g getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHmin() {
                        return this.hmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHratio() {
                        return this.hratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public String getMime(int i) {
                        return (String) this.mime_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public ByteString getMimeBytes(int i) {
                        return this.mime_.getByteString(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getMimeCount() {
                        return this.mime_.size();
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
                        int iG = this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
                        int iK = 0;
                        for (int i2 = 0; i2 < this.mime_.size(); i2++) {
                            iK = z.k(this.mime_, i2, iK);
                        }
                        int size = getMimeList().size() + iG + iK;
                        int i3 = this.w_;
                        if (i3 != 0) {
                            size += w.t(3, i3);
                        }
                        int i4 = this.h_;
                        if (i4 != 0) {
                            size += w.t(4, i4);
                        }
                        int i5 = this.wmin_;
                        if (i5 != 0) {
                            size += w.t(5, i5);
                        }
                        int i6 = this.hmin_;
                        if (i6 != 0) {
                            size += w.t(6, i6);
                        }
                        int i7 = this.wratio_;
                        if (i7 != 0) {
                            size += w.t(7, i7);
                        }
                        int i8 = this.hratio_;
                        if (i8 != 0) {
                            size += w.t(8, i8);
                        }
                        for (int i9 = 0; i9 < this.extProto_.size(); i9++) {
                            size += w.o(9, this.extProto_.get(i9));
                        }
                        if (this.ext_ != null) {
                            size += w.o(10, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + size;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final s8 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWmin() {
                        return this.wmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWratio() {
                        return this.wratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i = this.memoizedHashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.type_;
                        if (getMimeCount() > 0) {
                            iHashCode = pv1.c(iHashCode, 37, 2, 53) + getMimeList().hashCode();
                        }
                        int hratio = getHratio() + ((((getWratio() + ((((getHmin() + ((((getWmin() + ((((getH() + ((((getW() + pv1.c(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
                        if (hasExt()) {
                            hratio = pv1.c(hratio, 37, 10, 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hratio = pv1.c(hratio, 37, 9, 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = this.unknownFields.a.hashCode() + (hratio * 29);
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.y4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = b.R;
                        w4Var.c(ImageAssetFormat.class, Builder.class);
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
                        return new ImageAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(w wVar) throws IOException {
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            wVar.K(1, this.type_);
                        }
                        int iL = 0;
                        while (iL < this.mime_.size()) {
                            iL = z.l(this.mime_, iL, wVar, 2, iL, 1);
                        }
                        int i = this.w_;
                        if (i != 0) {
                            wVar.T(3, i);
                        }
                        int i2 = this.h_;
                        if (i2 != 0) {
                            wVar.T(4, i2);
                        }
                        int i3 = this.wmin_;
                        if (i3 != 0) {
                            wVar.T(5, i3);
                        }
                        int i4 = this.hmin_;
                        if (i4 != 0) {
                            wVar.T(6, i4);
                        }
                        int i5 = this.wratio_;
                        if (i5 != 0) {
                            wVar.T(7, i5);
                        }
                        int i6 = this.hratio_;
                        if (i6 != 0) {
                            wVar.T(8, i6);
                        }
                        for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
                            wVar.M(9, this.extProto_.get(i7));
                        }
                        if (this.ext_ != null) {
                            wVar.M(10, getExt());
                        }
                        this.unknownFields.writeTo(wVar);
                    }

                    private ImageAssetFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        Struct.Builder builder;
                        this();
                        o3Var.getClass();
                        p8 p8VarB = s8.b();
                        boolean z = false;
                        int i = 0;
                        while (!z) {
                            try {
                                try {
                                    int iF = rVar.F();
                                    switch (iF) {
                                        case 0:
                                            break;
                                        case 8:
                                            this.type_ = rVar.o();
                                            continue;
                                        case 18:
                                            String strE = rVar.E();
                                            if ((i & 1) == 0) {
                                                this.mime_ = new r5();
                                                i |= 1;
                                            }
                                            this.mime_.add(strE);
                                            continue;
                                        case 24:
                                            this.w_ = rVar.G();
                                            continue;
                                        case 32:
                                            this.h_ = rVar.G();
                                            continue;
                                        case 40:
                                            this.wmin_ = rVar.G();
                                            continue;
                                        case 48:
                                            this.hmin_ = rVar.G();
                                            continue;
                                        case 56:
                                            this.wratio_ = rVar.G();
                                            continue;
                                        case 64:
                                            this.hratio_ = rVar.G();
                                            continue;
                                        case 74:
                                            if ((i & 2) == 0) {
                                                this.extProto_ = new ArrayList();
                                                i |= 2;
                                            }
                                            this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                            continue;
                                        case 82:
                                            Struct struct = this.ext_;
                                            if (struct != null) {
                                                builder = struct.toBuilder();
                                            } else {
                                                builder = null;
                                            }
                                            Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        default:
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                break;
                                            }
                                            break;
                                    }
                                    z = true;
                                } catch (InvalidProtocolBufferException e) {
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                                }
                            } catch (Throwable th) {
                                if ((i & 1) != 0) {
                                    this.mime_ = this.mime_.getUnmodifiableView();
                                }
                                if ((i & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = p8VarB.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if ((i & 1) != 0) {
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if ((i & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public c8 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public j7 getMimeList() {
                        return this.mime_;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public ImageAssetFormat mo250getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (ImageAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer, o3Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString);
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString, o3Var);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr, o3Var);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) y4.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (ImageAssetFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static ImageAssetFormat parseFrom(r rVar) throws IOException {
                        return (ImageAssetFormat) y4.parseWithIOException(PARSER, rVar);
                    }

                    public static ImageAssetFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                        return (ImageAssetFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
                    }

                    private ImageAssetFormat(g4 g4Var) {
                        super(g4Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    private ImageAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.mime_ = r5.c;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public interface ImageAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                    Struct getExt();

                    c8 getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    g getExtProtoOrBuilder(int i);

                    List<? extends g> getExtProtoOrBuilderList();

                    int getH();

                    int getHmin();

                    int getHratio();

                    String getMime(int i);

                    ByteString getMimeBytes(int i);

                    int getMimeCount();

                    List<String> getMimeList();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    int getW();

                    int getWmin();

                    int getWratio();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class TitleAssetFormat extends y4 implements TitleAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 3;
                    public static final int EXT_PROTO_FIELD_NUMBER = 2;
                    public static final int LEN_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private static final TitleAssetFormat DEFAULT_INSTANCE = new TitleAssetFormat();
                    private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.1
                        @Override // com.explorestack.protobuf.g7
                        public TitleAssetFormat parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                            return new TitleAssetFormat(rVar, o3Var);
                        }
                    };

                    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                    public static final class Builder extends g4 implements TitleAssetFormatOrBuilder {
                        private int bitField0_;
                        private v7 extBuilder_;
                        private o7 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;

                        private Builder() {
                            super(null);
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.O;
                        }

                        private v7 getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private o7 getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.a(iterable);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.e(builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat buildPartial() {
                            TitleAssetFormat titleAssetFormat = new TitleAssetFormat(this);
                            titleAssetFormat.len_ = this.len_;
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                titleAssetFormat.ext_ = this.ext_;
                            } else {
                                titleAssetFormat.ext_ = (Struct) v7Var.a();
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAssetFormat.extProto_ = this.extProto_;
                            } else {
                                titleAssetFormat.extProto_ = o7Var.f();
                            }
                            onBuilt();
                            return titleAssetFormat;
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                                return this;
                            }
                            this.ext_ = null;
                            this.extBuilder_ = null;
                            return this;
                        }

                        public Builder clearExtProto() {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.g();
                                return this;
                            }
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -2;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.O;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public Struct getExt() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (Struct) v7Var.d();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public c8 getExtOrBuilder() {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                return (c8) v7Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public Any getExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public g getExtProtoOrBuilder(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<? extends g> getExtProtoOrBuilderList() {
                            o7 o7Var = this.extProtoBuilder_;
                            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.g4
                        public w4 internalGetFieldAccessorTable() {
                            w4 w4Var = b.P;
                            w4Var.c(TitleAssetFormat.class, Builder.class);
                            return w4Var;
                        }

                        public Builder mergeExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.f(struct);
                                return this;
                            }
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = z.m(struct2, struct);
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                            return this;
                        }

                        public Builder removeExtProto(int i) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.r(i);
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                            return this;
                        }

                        public Builder setExt(Struct.Builder builder) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var != null) {
                                v7Var.h(builder.build());
                                return this;
                            }
                            this.ext_ = builder.build();
                            onChanged();
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var != null) {
                                o7Var.s(i, builder.build());
                                return this;
                            }
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                            return this;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (y4.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat build() {
                            TitleAssetFormat titleAssetFormatBuildPartial = buildPartial();
                            if (titleAssetFormatBuildPartial.isInitialized()) {
                                return titleAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clear() {
                            super.clear();
                            this.len_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                this.extProto_ = Collections.EMPTY_LIST;
                                this.bitField0_ &= -2;
                                return this;
                            }
                            o7Var.g();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder
                        /* JADX INFO: renamed from: clone */
                        public Builder mo247clone() {
                            return (Builder) super.mo247clone();
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().c();
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().j(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().k();
                        }

                        public Builder mergeFrom(TitleAssetFormat titleAssetFormat) {
                            if (titleAssetFormat == TitleAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (titleAssetFormat.getLen() != 0) {
                                setLen(titleAssetFormat.getLen());
                            }
                            if (titleAssetFormat.hasExt()) {
                                mergeExt(titleAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAssetFormat.extProto_.isEmpty()) {
                                boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                                o7 o7Var = this.extProtoBuilder_;
                                if (zIsEmpty) {
                                    o7 extProtoFieldBuilder = null;
                                    o7Var.a = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    if (y4.alwaysUseFieldBuilders) {
                                        extProtoFieldBuilder = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = extProtoFieldBuilder;
                                } else {
                                    o7Var.a(titleAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(((y4) titleAssetFormat).unknownFields);
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
                        public TitleAssetFormat mo250getDefaultInstanceForType() {
                            return TitleAssetFormat.getDefaultInstance();
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
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Any.Builder addExtProtoBuilder(int i) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                        }

                        public Builder setExt(Struct struct) {
                            v7 v7Var = this.extBuilder_;
                            if (v7Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                                return this;
                            }
                            v7Var.h(struct);
                            return this;
                        }

                        public Builder addExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, any);
                            return this;
                        }

                        public Builder setExtProto(int i, Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                                return this;
                            }
                            o7Var.s(i, any);
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                                return this;
                            }
                            o7Var.e(any);
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            o7 o7Var = this.extProtoBuilder_;
                            if (o7Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
                                onChanged();
                                return this;
                            }
                            o7Var.d(i, builder.build());
                            return this;
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof TitleAssetFormat) {
                                return mergeFrom((TitleAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                            TitleAssetFormat titleAssetFormat = null;
                            try {
                                try {
                                    TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) TitleAssetFormat.PARSER.parsePartialFrom(rVar, o3Var);
                                    if (titleAssetFormat2 != null) {
                                        mergeFrom(titleAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e) {
                                    TitleAssetFormat titleAssetFormat3 = (TitleAssetFormat) e.getUnfinishedMessage();
                                    try {
                                        throw e.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        titleAssetFormat = titleAssetFormat3;
                                        if (titleAssetFormat != null) {
                                            mergeFrom(titleAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (titleAssetFormat != null) {
                                    mergeFrom(titleAssetFormat);
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
                        if (!(obj instanceof TitleAssetFormat)) {
                            return super.equals(obj);
                        }
                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) obj;
                        if (getLen() == titleAssetFormat.getLen() && hasExt() == titleAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAssetFormat.getExt())) && getExtProtoList().equals(titleAssetFormat.getExtProtoList()) && this.unknownFields.equals(titleAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    public static TitleAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.O;
                    }

                    public static Builder newBuilder(TitleAssetFormat titleAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAssetFormat);
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static g7 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public g getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int i2 = this.len_;
                        int iT = i2 != 0 ? w.t(1, i2) : 0;
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            iT += w.o(2, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            iT += w.o(3, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iT;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final s8 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i = this.memoizedHashCode;
                        if (i != 0) {
                            return i;
                        }
                        int len = getLen() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
                        if (hasExt()) {
                            len = getExt().hashCode() + pv1.c(len, 37, 3, 53);
                        }
                        if (getExtProtoCount() > 0) {
                            len = getExtProtoList().hashCode() + pv1.c(len, 37, 2, 53);
                        }
                        int iHashCode = this.unknownFields.a.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.y4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = b.P;
                        w4Var.c(TitleAssetFormat.class, Builder.class);
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
                        return new TitleAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(w wVar) throws IOException {
                        int i = this.len_;
                        if (i != 0) {
                            wVar.T(1, i);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            wVar.M(2, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            wVar.M(3, getExt());
                        }
                        this.unknownFields.writeTo(wVar);
                    }

                    private TitleAssetFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        Struct.Builder builder;
                        this();
                        o3Var.getClass();
                        p8 p8VarB = s8.b();
                        boolean z = false;
                        boolean z2 = false;
                        while (!z) {
                            try {
                                try {
                                    try {
                                        int iF = rVar.F();
                                        if (iF != 0) {
                                            if (iF != 8) {
                                                if (iF != 18) {
                                                    if (iF != 26) {
                                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                        }
                                                    } else {
                                                        Struct struct = this.ext_;
                                                        if (struct != null) {
                                                            builder = struct.toBuilder();
                                                        } else {
                                                            builder = null;
                                                        }
                                                        Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                        this.ext_ = struct2;
                                                        if (builder != null) {
                                                            builder.mergeFrom(struct2);
                                                            this.ext_ = builder.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    if (!z2) {
                                                        this.extProto_ = new ArrayList();
                                                        z2 = true;
                                                    }
                                                    this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                                }
                                            } else {
                                                this.len_ = rVar.G();
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
                                if (z2) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = p8VarB.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z2) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public c8 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public TitleAssetFormat mo250getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (TitleAssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer, o3Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString);
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString, o3Var);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr, o3Var);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) y4.parseWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                        return (TitleAssetFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
                    }

                    public static TitleAssetFormat parseFrom(r rVar) throws IOException {
                        return (TitleAssetFormat) y4.parseWithIOException(PARSER, rVar);
                    }

                    public static TitleAssetFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                        return (TitleAssetFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
                    }

                    private TitleAssetFormat(g4 g4Var) {
                        super(g4Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    private TitleAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public interface TitleAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                    Struct getExt();

                    c8 getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    g getExtProtoOrBuilder(int i);

                    List<? extends g> getExtProtoOrBuilderList();

                    int getLen();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AssetFormat)) {
                        return super.equals(obj);
                    }
                    AssetFormat assetFormat = (AssetFormat) obj;
                    if (getId() != assetFormat.getId() || getReq() != assetFormat.getReq() || hasTitle() != assetFormat.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(assetFormat.getTitle())) || hasImg() != assetFormat.hasImg()) {
                        return false;
                    }
                    if ((hasImg() && !getImg().equals(assetFormat.getImg())) || hasVideo() != assetFormat.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(assetFormat.getVideo())) || hasData() != assetFormat.hasData()) {
                        return false;
                    }
                    if ((!hasData() || getData().equals(assetFormat.getData())) && hasExt() == assetFormat.hasExt()) {
                        return (!hasExt() || getExt().equals(assetFormat.getExt())) && getExtProtoList().equals(assetFormat.getExtProtoList()) && this.unknownFields.equals(assetFormat.unknownFields);
                    }
                    return false;
                }

                public static AssetFormat getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.M;
                }

                public static Builder newBuilder(AssetFormat assetFormat) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetFormat);
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer);
                }

                public static g7 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormat getData() {
                    DataAssetFormat dataAssetFormat = this.data_;
                    return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormat getImg() {
                    ImageAssetFormat imageAssetFormat = this.img_;
                    return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public g7 getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = this.id_;
                    int iT = i2 != 0 ? w.t(1, i2) : 0;
                    if (this.req_) {
                        iT += w.c(2);
                    }
                    if (this.title_ != null) {
                        iT += w.o(3, getTitle());
                    }
                    if (this.img_ != null) {
                        iT += w.o(4, getImg());
                    }
                    if (this.video_ != null) {
                        iT += w.o(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iT += w.o(6, getData());
                    }
                    for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                        iT += w.o(7, this.extProto_.get(i3));
                    }
                    if (this.ext_ != null) {
                        iT += w.o(8, getExt());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iT;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormat getTitle() {
                    TitleAssetFormat titleAssetFormat = this.title_;
                    return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final s8 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacement getVideo() {
                    VideoPlacement videoPlacement = this.video_;
                    return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasImg() {
                    return this.img_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasVideo() {
                    return this.video_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iC = l5.c(getReq()) + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                    if (hasTitle()) {
                        iC = pv1.c(iC, 37, 3, 53) + getTitle().hashCode();
                    }
                    if (hasImg()) {
                        iC = pv1.c(iC, 37, 4, 53) + getImg().hashCode();
                    }
                    if (hasVideo()) {
                        iC = pv1.c(iC, 37, 5, 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iC = pv1.c(iC, 37, 6, 53) + getData().hashCode();
                    }
                    if (hasExt()) {
                        iC = pv1.c(iC, 37, 8, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iC = pv1.c(iC, 37, 7, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode = this.unknownFields.a.hashCode() + (iC * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.y4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.N;
                    w4Var.c(AssetFormat.class, Builder.class);
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
                    return new AssetFormat();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(w wVar) throws IOException {
                    int i = this.id_;
                    if (i != 0) {
                        wVar.T(1, i);
                    }
                    boolean z = this.req_;
                    if (z) {
                        wVar.A(2, z);
                    }
                    if (this.title_ != null) {
                        wVar.M(3, getTitle());
                    }
                    if (this.img_ != null) {
                        wVar.M(4, getImg());
                    }
                    if (this.video_ != null) {
                        wVar.M(5, getVideo());
                    }
                    if (this.data_ != null) {
                        wVar.M(6, getData());
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        wVar.M(7, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        wVar.M(8, getExt());
                    }
                    this.unknownFields.writeTo(wVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private AssetFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    this();
                    o3Var.getClass();
                    p8 p8VarB = s8.b();
                    boolean z = false;
                    byte b = false;
                    while (!z) {
                        try {
                            try {
                                int iF = rVar.F();
                                if (iF != 0) {
                                    if (iF != 8) {
                                        if (iF != 16) {
                                            if (iF != 26) {
                                                if (iF != 34) {
                                                    if (iF != 42) {
                                                        if (iF != 50) {
                                                            if (iF != 58) {
                                                                if (iF != 66) {
                                                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                                    }
                                                                } else {
                                                                    Struct struct = this.ext_;
                                                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                                                    Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                                    this.ext_ = struct2;
                                                                    if (builder != null) {
                                                                        builder.mergeFrom(struct2);
                                                                        this.ext_ = builder.buildPartial();
                                                                    }
                                                                }
                                                            } else {
                                                                if (b == false) {
                                                                    this.extProto_ = new ArrayList();
                                                                    b = true;
                                                                }
                                                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                                            }
                                                        } else {
                                                            DataAssetFormat dataAssetFormat = this.data_;
                                                            DataAssetFormat.Builder builder2 = dataAssetFormat != null ? dataAssetFormat.toBuilder() : null;
                                                            DataAssetFormat dataAssetFormat2 = (DataAssetFormat) rVar.v(DataAssetFormat.parser(), o3Var);
                                                            this.data_ = dataAssetFormat2;
                                                            if (builder2 != null) {
                                                                builder2.mergeFrom(dataAssetFormat2);
                                                                this.data_ = builder2.buildPartial();
                                                            }
                                                        }
                                                    } else {
                                                        VideoPlacement videoPlacement = this.video_;
                                                        VideoPlacement.Builder builder3 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                                                        VideoPlacement videoPlacement2 = (VideoPlacement) rVar.v(VideoPlacement.parser(), o3Var);
                                                        this.video_ = videoPlacement2;
                                                        if (builder3 != null) {
                                                            builder3.mergeFrom(videoPlacement2);
                                                            this.video_ = builder3.buildPartial();
                                                        }
                                                    }
                                                } else {
                                                    ImageAssetFormat imageAssetFormat = this.img_;
                                                    ImageAssetFormat.Builder builder4 = imageAssetFormat != null ? imageAssetFormat.toBuilder() : null;
                                                    ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) rVar.v(ImageAssetFormat.parser(), o3Var);
                                                    this.img_ = imageAssetFormat2;
                                                    if (builder4 != null) {
                                                        builder4.mergeFrom(imageAssetFormat2);
                                                        this.img_ = builder4.buildPartial();
                                                    }
                                                }
                                            } else {
                                                TitleAssetFormat titleAssetFormat = this.title_;
                                                TitleAssetFormat.Builder builder5 = titleAssetFormat != null ? titleAssetFormat.toBuilder() : null;
                                                TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) rVar.v(TitleAssetFormat.parser(), o3Var);
                                                this.title_ = titleAssetFormat2;
                                                if (builder5 != null) {
                                                    builder5.mergeFrom(titleAssetFormat2);
                                                    this.title_ = builder5.buildPartial();
                                                }
                                            }
                                        } else {
                                            this.req_ = rVar.l();
                                        }
                                    } else {
                                        this.id_ = rVar.G();
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e2) {
                                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th) {
                            if (b != false) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = p8VarB.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (b != false) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormatOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public c8 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormatOrBuilder getImgOrBuilder() {
                    return getImg();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacementOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public AssetFormat mo250getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (AssetFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer, o3Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static AssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static AssetFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString, o3Var);
                }

                public static AssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr);
                }

                public static AssetFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr, o3Var);
                }

                public static AssetFormat parseFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) y4.parseWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (AssetFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
                }

                public static AssetFormat parseFrom(r rVar) throws IOException {
                    return (AssetFormat) y4.parseWithIOException(PARSER, rVar);
                }

                public static AssetFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                    return (AssetFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
                }

                private AssetFormat(g4 g4Var) {
                    super(g4Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private AssetFormat() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.EMPTY_LIST;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public interface AssetFormatOrBuilder extends MessageOrBuilder {
                AssetFormat.DataAssetFormat getData();

                AssetFormat.DataAssetFormatOrBuilder getDataOrBuilder();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                Struct getExt();

                c8 getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                g getExtProtoOrBuilder(int i);

                List<? extends g> getExtProtoOrBuilderList();

                int getId();

                AssetFormat.ImageAssetFormat getImg();

                AssetFormat.ImageAssetFormatOrBuilder getImgOrBuilder();

                boolean getReq();

                AssetFormat.TitleAssetFormat getTitle();

                AssetFormat.TitleAssetFormatOrBuilder getTitleOrBuilder();

                VideoPlacement getVideo();

                VideoPlacementOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImg();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements NativeFormatOrBuilder {
                private o7 assetBuilder_;
                private List<AssetFormat> asset_;
                private int bitField0_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;

                private Builder() {
                    super(null);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private o7 getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        this.assetBuilder_ = new o7(this.asset_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.K;
                }

                private v7 getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private o7 getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public Builder addAllAsset(Iterable<? extends AssetFormat> iterable) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureAssetIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.asset_);
                    onChanged();
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addAsset(AssetFormat.Builder builder) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureAssetIsMutable();
                    this.asset_.add(builder.build());
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat buildPartial() {
                    NativeFormat nativeFormat = new NativeFormat(this);
                    int i = this.bitField0_;
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        if ((i & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        nativeFormat.asset_ = this.asset_;
                    } else {
                        nativeFormat.asset_ = o7Var.f();
                    }
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        nativeFormat.ext_ = this.ext_;
                    } else {
                        nativeFormat.ext_ = (Struct) v7Var.a();
                    }
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (o7Var2 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        nativeFormat.extProto_ = this.extProto_;
                    } else {
                        nativeFormat.extProto_ = o7Var2.f();
                    }
                    onBuilt();
                    return nativeFormat;
                }

                public Builder clearAsset() {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.asset_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormat getAsset(int i) {
                    o7 o7Var = this.assetBuilder_;
                    return o7Var == null ? this.asset_.get(i) : (AssetFormat) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getAssetCount() {
                    o7 o7Var = this.assetBuilder_;
                    return o7Var == null ? this.asset_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<AssetFormat> getAssetList() {
                    o7 o7Var = this.assetBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.asset_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormatOrBuilder getAssetOrBuilder(int i) {
                    o7 o7Var = this.assetBuilder_;
                    return o7Var == null ? this.asset_.get(i) : (AssetFormatOrBuilder) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                    o7 o7Var = this.assetBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.K;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.L;
                    w4Var.c(NativeFormat.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.f(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = z.m(struct2, struct);
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeAsset(int i) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureAssetIsMutable();
                    this.asset_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder setAsset(int i, AssetFormat.Builder builder) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureAssetIsMutable();
                    this.asset_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public AssetFormat.Builder addAssetBuilder() {
                    return (AssetFormat.Builder) getAssetFieldBuilder().c(AssetFormat.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat build() {
                    NativeFormat nativeFormatBuildPartial = buildPartial();
                    if (nativeFormatBuildPartial.isInitialized()) {
                        return nativeFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        this.asset_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        o7Var.g();
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (o7Var2 == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                        return this;
                    }
                    o7Var2.g();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public AssetFormat.Builder getAssetBuilder(int i) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().j(i);
                }

                public List<AssetFormat.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().k();
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().c();
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().j(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().k();
                }

                public Builder mergeFrom(NativeFormat nativeFormat) {
                    o7 assetFieldBuilder;
                    if (nativeFormat == NativeFormat.getDefaultInstance()) {
                        return this;
                    }
                    o7 extProtoFieldBuilder = null;
                    if (this.assetBuilder_ == null) {
                        if (!nativeFormat.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeFormat.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeFormat.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.asset_.isEmpty()) {
                        boolean zIsEmpty = this.assetBuilder_.b.isEmpty();
                        o7 o7Var = this.assetBuilder_;
                        if (zIsEmpty) {
                            o7Var.a = null;
                            this.assetBuilder_ = null;
                            this.asset_ = nativeFormat.asset_;
                            this.bitField0_ &= -2;
                            if (y4.alwaysUseFieldBuilders) {
                                assetFieldBuilder = getAssetFieldBuilder();
                            } else {
                                assetFieldBuilder = null;
                            }
                            this.assetBuilder_ = assetFieldBuilder;
                        } else {
                            o7Var.a(nativeFormat.asset_);
                        }
                    }
                    if (nativeFormat.hasExt()) {
                        mergeExt(nativeFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.extProto_.isEmpty()) {
                        boolean zIsEmpty2 = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var2 = this.extProtoBuilder_;
                        if (zIsEmpty2) {
                            o7Var2.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeFormat.extProto_;
                            this.bitField0_ &= -3;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var2.a(nativeFormat.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) nativeFormat).unknownFields);
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
                public NativeFormat mo250getDefaultInstanceForType() {
                    return NativeFormat.getDefaultInstance();
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

                public AssetFormat.Builder addAssetBuilder(int i) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().b(i, AssetFormat.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                }

                private Builder(h4 h4Var) {
                    super(h4Var);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder setExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }
                    v7Var.h(struct);
                    return this;
                }

                public Builder addAsset(int i, AssetFormat assetFormat) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i, assetFormat);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, assetFormat);
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, any);
                    return this;
                }

                public Builder setAsset(int i, AssetFormat assetFormat) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.set(i, assetFormat);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, assetFormat);
                    return this;
                }

                public Builder setExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, any);
                    return this;
                }

                public Builder addAsset(AssetFormat assetFormat) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(assetFormat);
                        onChanged();
                        return this;
                    }
                    o7Var.e(assetFormat);
                    return this;
                }

                public Builder addExtProto(Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }
                    o7Var.e(any);
                    return this;
                }

                public Builder addAsset(int i, AssetFormat.Builder builder) {
                    o7 o7Var = this.assetBuilder_;
                    if (o7Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof NativeFormat) {
                        return mergeFrom((NativeFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    NativeFormat nativeFormat = null;
                    try {
                        try {
                            NativeFormat nativeFormat2 = (NativeFormat) NativeFormat.PARSER.parsePartialFrom(rVar, o3Var);
                            if (nativeFormat2 != null) {
                                mergeFrom(nativeFormat2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            NativeFormat nativeFormat3 = (NativeFormat) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                nativeFormat = nativeFormat3;
                                if (nativeFormat != null) {
                                    mergeFrom(nativeFormat);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (nativeFormat != null) {
                            mergeFrom(nativeFormat);
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
                if (!(obj instanceof NativeFormat)) {
                    return super.equals(obj);
                }
                NativeFormat nativeFormat = (NativeFormat) obj;
                if (getAssetList().equals(nativeFormat.getAssetList()) && hasExt() == nativeFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(nativeFormat.getExt())) && getExtProtoList().equals(nativeFormat.getExtProtoList()) && this.unknownFields.equals(nativeFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                for (int i = 0; i < this.asset_.size(); i++) {
                    wVar.M(1, this.asset_.get(i));
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    wVar.M(2, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    wVar.M(3, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            public static NativeFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.K;
            }

            public static Builder newBuilder(NativeFormat nativeFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeFormat);
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormat getAsset(int i) {
                return this.asset_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<AssetFormat> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormatOrBuilder getAssetOrBuilder(int i) {
                return this.asset_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
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
                int iO = 0;
                for (int i2 = 0; i2 < this.asset_.size(); i2++) {
                    iO += w.o(1, this.asset_.get(i2));
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    iO += w.o(2, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    iO += w.o(3, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iO;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (getAssetCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 1, 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    iHashCode = pv1.c(iHashCode, 37, 3, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 2, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.L;
                w4Var.c(NativeFormat.class, Builder.class);
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
                return new NativeFormat();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private NativeFormat(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                Struct.Builder builder;
                this();
                o3Var.getClass();
                p8 p8VarB = s8.b();
                boolean z = false;
                int i = 0;
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
                                                Struct struct = this.ext_;
                                                if (struct != null) {
                                                    builder = struct.toBuilder();
                                                } else {
                                                    builder = null;
                                                }
                                                Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                this.ext_ = struct2;
                                                if (builder != null) {
                                                    builder.mergeFrom(struct2);
                                                    this.ext_ = builder.buildPartial();
                                                }
                                            }
                                        } else {
                                            if ((i & 2) == 0) {
                                                this.extProto_ = new ArrayList();
                                                i |= 2;
                                            }
                                            this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                        }
                                    } else {
                                        if ((i & 1) == 0) {
                                            this.asset_ = new ArrayList();
                                            i |= 1;
                                        }
                                        this.asset_.add((AssetFormat) rVar.v(AssetFormat.parser(), o3Var));
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
                        if ((i & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                        }
                        if ((i & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i & 1) != 0) {
                    this.asset_ = Collections.unmodifiableList(this.asset_);
                }
                if ((i & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public NativeFormat mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (NativeFormat) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static NativeFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static NativeFormat parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString, o3Var);
            }

            public static NativeFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr);
            }

            public static NativeFormat parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr, o3Var);
            }

            public static NativeFormat parseFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) y4.parseWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (NativeFormat) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static NativeFormat parseFrom(r rVar) throws IOException {
                return (NativeFormat) y4.parseWithIOException(PARSER, rVar);
            }

            public static NativeFormat parseFrom(r rVar, o3 o3Var) throws IOException {
                return (NativeFormat) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private NativeFormat(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private NativeFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.asset_ = list;
                this.extProto_ = list;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface NativeFormatOrBuilder extends MessageOrBuilder {
            NativeFormat.AssetFormat getAsset(int i);

            int getAssetCount();

            List<NativeFormat.AssetFormat> getAssetList();

            NativeFormat.AssetFormatOrBuilder getAssetOrBuilder(int i);

            List<? extends NativeFormat.AssetFormatOrBuilder> getAssetOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayPlacement)) {
                return super.equals(obj);
            }
            DisplayPlacement displayPlacement = (DisplayPlacement) obj;
            if (this.pos_ != displayPlacement.pos_ || getInstl() != displayPlacement.getInstl() || getTopframe() != displayPlacement.getTopframe() || !getIfrbustList().equals(displayPlacement.getIfrbustList()) || this.clktype_ != displayPlacement.clktype_ || getAmpren() != displayPlacement.getAmpren() || this.ptype_ != displayPlacement.ptype_ || this.context_ != displayPlacement.context_ || !getMimeList().equals(displayPlacement.getMimeList()) || !this.api_.equals(displayPlacement.api_) || !this.ctype_.equals(displayPlacement.ctype_) || getW() != displayPlacement.getW() || getH() != displayPlacement.getH() || this.unit_ != displayPlacement.unit_ || getPriv() != displayPlacement.getPriv() || !getDisplayfmtList().equals(displayPlacement.getDisplayfmtList()) || hasNativefmt() != displayPlacement.hasNativefmt()) {
                return false;
            }
            if ((!hasNativefmt() || getNativefmt().equals(displayPlacement.getNativefmt())) && getEventList().equals(displayPlacement.getEventList()) && hasExt() == displayPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(displayPlacement.getExt())) && getExtProtoList().equals(displayPlacement.getExtProtoList()) && this.unknownFields.equals(displayPlacement.unknownFields);
            }
            return false;
        }

        public static DisplayPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.G;
        }

        public static Builder newBuilder(DisplayPlacement displayPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayPlacement);
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getAmpren() {
            return this.ampren_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ApiFramework getApi(int i) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new i5(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayContextType getContext() {
            DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
            return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getContextValue() {
            return this.context_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayCreativeType getCtype(int i) {
            return (DisplayCreativeType) ctype_converter_.convert(this.ctype_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayCreativeType> getCtypeList() {
            return new i5(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeValue(int i) {
            return this.ctype_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormat getDisplayfmt(int i) {
            return this.displayfmt_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getDisplayfmtCount() {
            return this.displayfmt_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayFormat> getDisplayfmtList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i) {
            return this.displayfmt_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpec getEvent(int i) {
            return this.event_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<EventSpec> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpecOrBuilder getEventOrBuilder(int i) {
            return this.event_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getIfrbust(int i) {
            return (String) this.ifrbust_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getIfrbustBytes(int i) {
            return this.ifrbust_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getIfrbustCount() {
            return this.ifrbust_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getInstl() {
            return this.instl_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getMime(int i) {
            return (String) this.mime_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormat getNativefmt() {
            NativeFormat nativeFormat = this.nativefmt_;
            return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getPriv() {
            return this.priv_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayPlacementType getPtype() {
            DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
            return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber() ? w.g(1, this.pos_) : 0;
            if (this.instl_) {
                iG += w.c(2);
            }
            if (this.topframe_) {
                iG += w.c(3);
            }
            int iK = 0;
            for (int i2 = 0; i2 < this.ifrbust_.size(); i2++) {
                iK = z.k(this.ifrbust_, i2, iK);
            }
            int size = getIfrbustList().size() + iG + iK;
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                size += w.g(5, this.clktype_);
            }
            int i3 = this.ampren_;
            if (i3 != 0) {
                size += w.t(6, i3);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                size += w.g(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                size += w.g(8, this.context_);
            }
            int iK2 = 0;
            for (int i4 = 0; i4 < this.mime_.size(); i4++) {
                iK2 = z.k(this.mime_, i4, iK2);
            }
            int size2 = getMimeList().size() + size + iK2;
            int iJ = 0;
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                iJ = z.j(iJ, this.api_.get(i5));
            }
            int iU = size2 + iJ;
            if (!getApiList().isEmpty()) {
                iU = iU + 1 + w.u(iJ);
            }
            this.apiMemoizedSerializedSize = iJ;
            int iJ2 = 0;
            for (int i6 = 0; i6 < this.ctype_.size(); i6++) {
                iJ2 = z.j(iJ2, this.ctype_.get(i6));
            }
            int iO = iU + iJ2;
            if (!getCtypeList().isEmpty()) {
                iO = iO + 1 + w.u(iJ2);
            }
            this.ctypeMemoizedSerializedSize = iJ2;
            int i7 = this.w_;
            if (i7 != 0) {
                iO += w.t(12, i7);
            }
            int i8 = this.h_;
            if (i8 != 0) {
                iO += w.t(13, i8);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iO += w.g(14, this.unit_);
            }
            if (this.priv_) {
                iO += w.c(15);
            }
            for (int i9 = 0; i9 < this.displayfmt_.size(); i9++) {
                iO += w.o(16, this.displayfmt_.get(i9));
            }
            if (this.nativefmt_ != null) {
                iO += w.o(17, getNativefmt());
            }
            for (int i10 = 0; i10 < this.event_.size(); i10++) {
                iO += w.o(18, this.event_.get(i10));
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                iO += w.o(19, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                iO += w.o(20, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getTopframe() {
            return this.topframe_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasNativefmt() {
            return this.nativefmt_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iC = l5.c(getTopframe()) + ((((l5.c(getInstl()) + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.pos_, 37, 2, 53)) * 37) + 3) * 53);
            if (getIfrbustCount() > 0) {
                iC = pv1.c(iC, 37, 4, 53) + getIfrbustList().hashCode();
            }
            int i2 = z.i((((getAmpren() + z.i(pv1.c(iC, 37, 5, 53), this.clktype_, 37, 6, 53)) * 37) + 7) * 53, this.ptype_, 37, 8, 53) + this.context_;
            if (getMimeCount() > 0) {
                i2 = pv1.c(i2, 37, 9, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                i2 = pv1.c(i2, 37, 10, 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                i2 = pv1.c(i2, 37, 11, 53) + this.ctype_.hashCode();
            }
            int iC2 = l5.c(getPriv()) + z.i((((getH() + ((((getW() + pv1.c(i2, 37, 12, 53)) * 37) + 13) * 53)) * 37) + 14) * 53, this.unit_, 37, 15, 53);
            if (getDisplayfmtCount() > 0) {
                iC2 = getDisplayfmtList().hashCode() + pv1.c(iC2, 37, 16, 53);
            }
            if (hasNativefmt()) {
                iC2 = getNativefmt().hashCode() + pv1.c(iC2, 37, 17, 53);
            }
            if (getEventCount() > 0) {
                iC2 = getEventList().hashCode() + pv1.c(iC2, 37, 18, 53);
            }
            if (hasExt()) {
                iC2 = getExt().hashCode() + pv1.c(iC2, 37, 20, 53);
            }
            if (getExtProtoCount() > 0) {
                iC2 = getExtProtoList().hashCode() + pv1.c(iC2, 37, 19, 53);
            }
            int iHashCode = this.unknownFields.a.hashCode() + (iC2 * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.H;
            w4Var.c(DisplayPlacement.class, Builder.class);
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
            return new DisplayPlacement();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private DisplayPlacement(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        switch (iF) {
                            case 0:
                                break;
                            case 8:
                                this.pos_ = rVar.o();
                                continue;
                            case 16:
                                this.instl_ = rVar.l();
                                continue;
                            case 24:
                                this.topframe_ = rVar.l();
                                continue;
                            case 34:
                                String strE = rVar.E();
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 == 0) {
                                    this.ifrbust_ = new r5();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.ifrbust_.add(strE);
                                continue;
                            case 40:
                                this.clktype_ = rVar.o();
                                continue;
                            case 48:
                                this.ampren_ = rVar.G();
                                continue;
                            case 56:
                                this.ptype_ = rVar.o();
                                continue;
                            case 64:
                                this.context_ = rVar.o();
                                continue;
                            case 74:
                                String strE2 = rVar.E();
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 == 0) {
                                    this.mime_ = new r5();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.mime_.add(strE2);
                                continue;
                            case C5073y1.c /* 80 */:
                                int iO = rVar.o();
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 == 0) {
                                    this.api_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.api_.add(Integer.valueOf(iO));
                                continue;
                            case 82:
                                int iK = rVar.k(rVar.x());
                                i = i;
                                while (rVar.d() > 0) {
                                    int iO2 = rVar.o();
                                    if (((i == true ? 1 : 0) & 4) == 0) {
                                        this.api_ = new ArrayList();
                                        i = (i == true ? 1 : 0) | 4;
                                    }
                                    this.api_.add(Integer.valueOf(iO2));
                                    i = i;
                                }
                                rVar.j(iK);
                                continue;
                            case 88:
                                int iO3 = rVar.o();
                                int i5 = (i == true ? 1 : 0) & 8;
                                i = i;
                                if (i5 == 0) {
                                    this.ctype_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8;
                                }
                                this.ctype_.add(Integer.valueOf(iO3));
                                continue;
                            case 90:
                                int iK2 = rVar.k(rVar.x());
                                i = i;
                                while (rVar.d() > 0) {
                                    int iO4 = rVar.o();
                                    if (((i == true ? 1 : 0) & 8) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i = (i == true ? 1 : 0) | 8;
                                    }
                                    this.ctype_.add(Integer.valueOf(iO4));
                                    i = i;
                                }
                                rVar.j(iK2);
                                continue;
                            case 96:
                                this.w_ = rVar.G();
                                continue;
                            case 104:
                                this.h_ = rVar.G();
                                continue;
                            case 112:
                                this.unit_ = rVar.o();
                                continue;
                            case com.safedk.android.analytics.brandsafety.b.v /* 120 */:
                                this.priv_ = rVar.l();
                                continue;
                            case 130:
                                int i6 = (i == true ? 1 : 0) & 16;
                                i = i;
                                if (i6 == 0) {
                                    this.displayfmt_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 16;
                                }
                                this.displayfmt_.add((DisplayFormat) rVar.v(DisplayFormat.parser(), o3Var));
                                continue;
                            case 138:
                                NativeFormat nativeFormat = this.nativefmt_;
                                NativeFormat.Builder builder = nativeFormat != null ? nativeFormat.toBuilder() : null;
                                NativeFormat nativeFormat2 = (NativeFormat) rVar.v(NativeFormat.parser(), o3Var);
                                this.nativefmt_ = nativeFormat2;
                                if (builder != null) {
                                    builder.mergeFrom(nativeFormat2);
                                    this.nativefmt_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 146:
                                int i7 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i7 == 0) {
                                    this.event_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.event_.add((EventSpec) rVar.v(EventSpec.parser(), o3Var));
                                continue;
                            case 154:
                                int i8 = (i == true ? 1 : 0) & 64;
                                i = i;
                                if (i8 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 64;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case 162:
                                Struct struct = this.ext_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                this.ext_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.ext_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) != 0) {
                        this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 2) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 4) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (((i == true ? 1 : 0) & 8) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if (((i == true ? 1 : 0) & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                    }
                    if (((i == true ? 1 : 0) & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (((i == true ? 1 : 0) & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i == true ? 1 : 0) & 1) != 0) {
                this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 2) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 4) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if (((i == true ? 1 : 0) & 8) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if (((i == true ? 1 : 0) & 16) != 0) {
                this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
            }
            if (((i == true ? 1 : 0) & 32) != 0) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (((i == true ? 1 : 0) & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormatOrBuilder getNativefmtOrBuilder() {
            return getNativefmt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            getSerializedSize();
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                wVar.K(1, this.pos_);
            }
            boolean z = this.instl_;
            if (z) {
                wVar.A(2, z);
            }
            boolean z2 = this.topframe_;
            if (z2) {
                wVar.A(3, z2);
            }
            int iL = 0;
            while (iL < this.ifrbust_.size()) {
                iL = z.l(this.ifrbust_, iL, wVar, 4, iL, 1);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                wVar.K(5, this.clktype_);
            }
            int i = this.ampren_;
            if (i != 0) {
                wVar.T(6, i);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                wVar.K(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                wVar.K(8, this.context_);
            }
            int iL2 = 0;
            while (iL2 < this.mime_.size()) {
                iL2 = z.l(this.mime_, iL2, wVar, 9, iL2, 1);
            }
            if (getApiList().size() > 0) {
                wVar.U(82);
                wVar.U(this.apiMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.api_.size(); i2++) {
                wVar.L(this.api_.get(i2).intValue());
            }
            if (getCtypeList().size() > 0) {
                wVar.U(90);
                wVar.U(this.ctypeMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.ctype_.size(); i3++) {
                wVar.L(this.ctype_.get(i3).intValue());
            }
            int i4 = this.w_;
            if (i4 != 0) {
                wVar.T(12, i4);
            }
            int i5 = this.h_;
            if (i5 != 0) {
                wVar.T(13, i5);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                wVar.K(14, this.unit_);
            }
            boolean z3 = this.priv_;
            if (z3) {
                wVar.A(15, z3);
            }
            for (int i6 = 0; i6 < this.displayfmt_.size(); i6++) {
                wVar.M(16, this.displayfmt_.get(i6));
            }
            if (this.nativefmt_ != null) {
                wVar.M(17, getNativefmt());
            }
            for (int i7 = 0; i7 < this.event_.size(); i7++) {
                wVar.M(18, this.event_.get(i7));
            }
            for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
                wVar.M(19, this.extProto_.get(i8));
            }
            if (this.ext_ != null) {
                wVar.M(20, getExt());
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public j7 getIfrbustList() {
            return this.ifrbust_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public j7 getMimeList() {
            return this.mime_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public DisplayPlacement mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (DisplayPlacement) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DisplayPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayPlacement parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString, o3Var);
        }

        public static DisplayPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr);
        }

        public static DisplayPlacement parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr, o3Var);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) y4.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (DisplayPlacement) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static DisplayPlacement parseFrom(r rVar) throws IOException {
            return (DisplayPlacement) y4.parseWithIOException(PARSER, rVar);
        }

        public static DisplayPlacement parseFrom(r rVar, o3 o3Var) throws IOException {
            return (DisplayPlacement) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private DisplayPlacement(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private DisplayPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.pos_ = 0;
            r5 r5Var = r5.c;
            this.ifrbust_ = r5Var;
            this.clktype_ = 0;
            this.ptype_ = 0;
            this.context_ = 0;
            this.mime_ = r5Var;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.displayfmt_ = list;
            this.event_ = list;
            this.extProto_ = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DisplayPlacementOrBuilder extends MessageOrBuilder {
        int getAmpren();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        ClickType getClktype();

        int getClktypeValue();

        DisplayContextType getContext();

        int getContextValue();

        DisplayCreativeType getCtype(int i);

        int getCtypeCount();

        List<DisplayCreativeType> getCtypeList();

        int getCtypeValue(int i);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        DisplayPlacement.DisplayFormat getDisplayfmt(int i);

        int getDisplayfmtCount();

        List<DisplayPlacement.DisplayFormat> getDisplayfmtList();

        DisplayPlacement.DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i);

        List<? extends DisplayPlacement.DisplayFormatOrBuilder> getDisplayfmtOrBuilderList();

        DisplayPlacement.EventSpec getEvent(int i);

        int getEventCount();

        List<DisplayPlacement.EventSpec> getEventList();

        DisplayPlacement.EventSpecOrBuilder getEventOrBuilder(int i);

        List<? extends DisplayPlacement.EventSpecOrBuilder> getEventOrBuilderList();

        Struct getExt();

        c8 getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i);

        List<? extends g> getExtProtoOrBuilderList();

        int getH();

        String getIfrbust(int i);

        ByteString getIfrbustBytes(int i);

        int getIfrbustCount();

        List<String> getIfrbustList();

        boolean getInstl();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        DisplayPlacement.NativeFormat getNativefmt();

        DisplayPlacement.NativeFormatOrBuilder getNativefmtOrBuilder();

        PlacementPosition getPos();

        int getPosValue();

        boolean getPriv();

        DisplayPlacementType getPtype();

        int getPtypeValue();

        boolean getTopframe();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        boolean hasNativefmt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class VideoPlacement extends y4 implements VideoPlacementOrBuilder {
        public static final int API_FIELD_NUMBER = 11;
        public static final int BOXING_FIELD_NUMBER = 24;
        public static final int CLKTYPE_FIELD_NUMBER = 9;
        public static final int COMPTYPE_FIELD_NUMBER = 26;
        public static final int COMP_FIELD_NUMBER = 25;
        public static final int CTYPE_FIELD_NUMBER = 12;
        public static final int DELAY_FIELD_NUMBER = 3;
        public static final int DELIVERY_FIELD_NUMBER = 21;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int H_FIELD_NUMBER = 14;
        public static final int LINEAR_FIELD_NUMBER = 23;
        public static final int MAXBITR_FIELD_NUMBER = 20;
        public static final int MAXDUR_FIELD_NUMBER = 17;
        public static final int MAXEXT_FIELD_NUMBER = 18;
        public static final int MAXSEQ_FIELD_NUMBER = 22;
        public static final int MIME_FIELD_NUMBER = 10;
        public static final int MINBITR_FIELD_NUMBER = 19;
        public static final int MINDUR_FIELD_NUMBER = 16;
        public static final int PLAYEND_FIELD_NUMBER = 8;
        public static final int PLAYMETHOD_FIELD_NUMBER = 7;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int PTYPE_FIELD_NUMBER = 1;
        public static final int SKIPAFTER_FIELD_NUMBER = 6;
        public static final int SKIPMIN_FIELD_NUMBER = 5;
        public static final int SKIP_FIELD_NUMBER = 4;
        public static final int UNIT_FIELD_NUMBER = 15;
        public static final int W_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private boolean boxing_;
        private int clktype_;
        private List<Companion> comp_;
        private int comptypeMemoizedSerializedSize;
        private List<Integer> comptype_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private int delay_;
        private int deliveryMemoizedSerializedSize;
        private List<Integer> delivery_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int linear_;
        private int maxbitr_;
        private int maxdur_;
        private int maxext_;
        private int maxseq_;
        private byte memoizedIsInitialized;
        private s5 mime_;
        private int minbitr_;
        private int mindur_;
        private int playend_;
        private int playmethod_;
        private int pos_;
        private int ptype_;
        private boolean skip_;
        private int skipafter_;
        private int skipmin_;
        private int unit_;
        private int w_;
        private static final h5 api_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.1
            @Override // com.explorestack.protobuf.h5
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                if (apiFrameworkValueOf == null) {
                    return ApiFramework.UNRECOGNIZED;
                }
                return apiFrameworkValueOf;
            }
        };
        private static final h5 ctype_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.2
            @Override // com.explorestack.protobuf.h5
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                if (videoCreativeTypeValueOf == null) {
                    return VideoCreativeType.UNRECOGNIZED;
                }
                return videoCreativeTypeValueOf;
            }
        };
        private static final h5 delivery_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.3
            @Override // com.explorestack.protobuf.h5
            public DeliveryMethod convert(Integer num) {
                DeliveryMethod deliveryMethodValueOf = DeliveryMethod.valueOf(num.intValue());
                if (deliveryMethodValueOf == null) {
                    return DeliveryMethod.UNRECOGNIZED;
                }
                return deliveryMethodValueOf;
            }
        };
        private static final h5 comptype_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.4
            @Override // com.explorestack.protobuf.h5
            public CompanionType convert(Integer num) {
                CompanionType companionTypeValueOf = CompanionType.valueOf(num.intValue());
                if (companionTypeValueOf == null) {
                    return CompanionType.UNRECOGNIZED;
                }
                return companionTypeValueOf;
            }
        };
        private static final VideoPlacement DEFAULT_INSTANCE = new VideoPlacement();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.5
            @Override // com.explorestack.protobuf.g7
            public VideoPlacement parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new VideoPlacement(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements VideoPlacementOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private boolean boxing_;
            private int clktype_;
            private o7 compBuilder_;
            private List<Companion> comp_;
            private List<Integer> comptype_;
            private List<Integer> ctype_;
            private int delay_;
            private List<Integer> delivery_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int linear_;
            private int maxbitr_;
            private int maxdur_;
            private int maxext_;
            private int maxseq_;
            private s5 mime_;
            private int minbitr_;
            private int mindur_;
            private int playend_;
            private int playmethod_;
            private int pos_;
            private int ptype_;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int unit_;
            private int w_;

            private Builder() {
                super(null);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = r5.c;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder clearBoxing() {
                this.boxing_ = false;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDelay() {
                this.delay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLinear() {
                this.linear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxbitr() {
                this.maxbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxdur() {
                this.maxdur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxext() {
                this.maxext_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxseq() {
                this.maxseq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinbitr() {
                this.minbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMindur() {
                this.mindur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayend() {
                this.playend_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlaymethod() {
                this.playmethod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkip() {
                this.skip_ = false;
                onChanged();
                return this;
            }

            public Builder clearSkipafter() {
                this.skipafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkipmin() {
                this.skipmin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureCompIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.comp_ = new ArrayList(this.comp_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureComptypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.comptype_ = new ArrayList(this.comptype_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureDeliveryIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.delivery_ = new ArrayList(this.delivery_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new r5(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private o7 getCompFieldBuilder() {
                if (this.compBuilder_ == null) {
                    this.compBuilder_ = new o7(this.comp_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.comp_ = null;
                }
                return this.compBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.W;
            }

            private v7 getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private o7 getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public Builder addAllComp(Iterable<? extends Companion> iterable) {
                o7 o7Var = this.compBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureCompIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.comp_);
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureExtProtoIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
                return this;
            }

            public Builder addComp(Companion.Builder builder) {
                o7 o7Var = this.compBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureCompIsMutable();
                this.comp_.add(builder.build());
                onChanged();
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement buildPartial() {
                VideoPlacement videoPlacement = new VideoPlacement(this);
                videoPlacement.ptype_ = this.ptype_;
                videoPlacement.pos_ = this.pos_;
                videoPlacement.delay_ = this.delay_;
                videoPlacement.skip_ = this.skip_;
                videoPlacement.skipmin_ = this.skipmin_;
                videoPlacement.skipafter_ = this.skipafter_;
                videoPlacement.playmethod_ = this.playmethod_;
                videoPlacement.playend_ = this.playend_;
                videoPlacement.clktype_ = this.clktype_;
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                videoPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                videoPlacement.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -5;
                }
                videoPlacement.ctype_ = this.ctype_;
                videoPlacement.w_ = this.w_;
                videoPlacement.h_ = this.h_;
                videoPlacement.unit_ = this.unit_;
                videoPlacement.mindur_ = this.mindur_;
                videoPlacement.maxdur_ = this.maxdur_;
                videoPlacement.maxext_ = this.maxext_;
                videoPlacement.minbitr_ = this.minbitr_;
                videoPlacement.maxbitr_ = this.maxbitr_;
                if ((this.bitField0_ & 8) != 0) {
                    this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    this.bitField0_ &= -9;
                }
                videoPlacement.delivery_ = this.delivery_;
                videoPlacement.maxseq_ = this.maxseq_;
                videoPlacement.linear_ = this.linear_;
                videoPlacement.boxing_ = this.boxing_;
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                        this.bitField0_ &= -17;
                    }
                    videoPlacement.comp_ = this.comp_;
                } else {
                    videoPlacement.comp_ = o7Var.f();
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    this.bitField0_ &= -33;
                }
                videoPlacement.comptype_ = this.comptype_;
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    videoPlacement.ext_ = this.ext_;
                } else {
                    videoPlacement.ext_ = (Struct) v7Var.a();
                }
                o7 o7Var2 = this.extProtoBuilder_;
                if (o7Var2 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    videoPlacement.extProto_ = this.extProto_;
                } else {
                    videoPlacement.extProto_ = o7Var2.f();
                }
                onBuilt();
                return videoPlacement;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearComp() {
                o7 o7Var = this.compBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.comp_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearComptype() {
                this.comptype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearDelivery() {
                this.delivery_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                    return this;
                }
                this.ext_ = null;
                this.extBuilder_ = null;
                return this;
            }

            public Builder clearExtProto() {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = r5.c;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new i5(this.api_, VideoPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getBoxing() {
                return this.boxing_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Companion getComp(int i) {
                o7 o7Var = this.compBuilder_;
                return o7Var == null ? this.comp_.get(i) : (Companion) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCompCount() {
                o7 o7Var = this.compBuilder_;
                return o7Var == null ? this.comp_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Companion> getCompList() {
                o7 o7Var = this.compBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.comp_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionOrBuilder getCompOrBuilder(int i) {
                o7 o7Var = this.compBuilder_;
                return o7Var == null ? this.comp_.get(i) : (CompanionOrBuilder) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
                o7 o7Var = this.compBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.comp_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeCount() {
                return this.comptype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<CompanionType> getComptypeList() {
                return new i5(this.comptype_, VideoPlacement.comptype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeValue(int i) {
                return this.comptype_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getComptypeValueList() {
                return Collections.unmodifiableList(this.comptype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<VideoCreativeType> getCtypeList() {
                return new i5(this.ctype_, VideoPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeValue(int i) {
                return this.ctype_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDelay() {
                return this.delay_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<DeliveryMethod> getDeliveryList() {
                return new i5(this.delivery_, VideoPlacement.delivery_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryValue(int i) {
                return this.delivery_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getDeliveryValueList() {
                return Collections.unmodifiableList(this.delivery_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.W;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public LinearityMode getLinear() {
                LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
                return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getLinearValue() {
                return this.linear_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxbitr() {
                return this.maxbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxdur() {
                return this.maxdur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxext() {
                return this.maxext_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public String getMime(int i) {
                return (String) this.mime_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public j7 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMinbitr() {
                return this.minbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMindur() {
                return this.mindur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackCessationMode getPlayend() {
                PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
                return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlayendValue() {
                return this.playend_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackMethod getPlaymethod() {
                PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
                return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlaymethodValue() {
                return this.playmethod_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoPlacementType getPtype() {
                VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
                return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getSkip() {
                return this.skip_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipafter() {
                return this.skipafter_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipmin() {
                return this.skipmin_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.X;
                w4Var.c(VideoPlacement.class, Builder.class);
                return w4Var;
            }

            public Builder mergeExt(Struct struct) {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    v7Var.f(struct);
                    return this;
                }
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = z.m(struct2, struct);
                } else {
                    this.ext_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder removeComp(int i) {
                o7 o7Var = this.compBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureCompIsMutable();
                this.comp_.remove(i);
                onChanged();
                return this;
            }

            public Builder removeExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
                return this;
            }

            public Builder setBoxing(boolean z) {
                this.boxing_ = z;
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i) {
                this.clktype_ = i;
                onChanged();
                return this;
            }

            public Builder setComp(int i, Companion.Builder builder) {
                o7 o7Var = this.compBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureCompIsMutable();
                this.comp_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setDelay(int i) {
                this.delay_ = i;
                onChanged();
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.ext_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
                return this;
            }

            public Builder setH(int i) {
                this.h_ = i;
                onChanged();
                return this;
            }

            public Builder setLinearValue(int i) {
                this.linear_ = i;
                onChanged();
                return this;
            }

            public Builder setMaxbitr(int i) {
                this.maxbitr_ = i;
                onChanged();
                return this;
            }

            public Builder setMaxdur(int i) {
                this.maxdur_ = i;
                onChanged();
                return this;
            }

            public Builder setMaxext(int i) {
                this.maxext_ = i;
                onChanged();
                return this;
            }

            public Builder setMaxseq(int i) {
                this.maxseq_ = i;
                onChanged();
                return this;
            }

            public Builder setMinbitr(int i) {
                this.minbitr_ = i;
                onChanged();
                return this;
            }

            public Builder setMindur(int i) {
                this.mindur_ = i;
                onChanged();
                return this;
            }

            public Builder setPlayendValue(int i) {
                this.playend_ = i;
                onChanged();
                return this;
            }

            public Builder setPlaymethodValue(int i) {
                this.playmethod_ = i;
                onChanged();
                return this;
            }

            public Builder setPosValue(int i) {
                this.pos_ = i;
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i) {
                this.ptype_ = i;
                onChanged();
                return this;
            }

            public Builder setSkip(boolean z) {
                this.skip_ = z;
                onChanged();
                return this;
            }

            public Builder setSkipafter(int i) {
                this.skipafter_ = i;
                onChanged();
                return this;
            }

            public Builder setSkipmin(int i) {
                this.skipmin_ = i;
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i) {
                this.unit_ = i;
                onChanged();
                return this;
            }

            public Builder setW(int i) {
                this.w_ = i;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getCompFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllComptype(Iterable<? extends CompanionType> iterable) {
                ensureComptypeIsMutable();
                Iterator<? extends CompanionType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.comptype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllComptypeValue(Iterable<Integer> iterable) {
                ensureComptypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.comptype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends VideoCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllDelivery(Iterable<? extends DeliveryMethod> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends DeliveryMethod> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDeliveryValue(Iterable<Integer> iterable) {
                ensureDeliveryIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.delivery_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Companion.Builder addCompBuilder() {
                return (Companion.Builder) getCompFieldBuilder().c(Companion.getDefaultInstance());
            }

            public Builder addComptype(CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addComptypeValue(int i) {
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addCtype(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addDelivery(DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder addDeliveryValue(int i) {
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement build() {
                VideoPlacement videoPlacementBuildPartial = buildPartial();
                if (videoPlacementBuildPartial.isInitialized()) {
                    return videoPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.ptype_ = 0;
                this.pos_ = 0;
                this.delay_ = 0;
                this.skip_ = false;
                this.skipmin_ = 0;
                this.skipafter_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = r5.c;
                int i = this.bitField0_;
                this.bitField0_ = i & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.mindur_ = 0;
                this.maxdur_ = 0;
                this.maxext_ = 0;
                this.minbitr_ = 0;
                this.maxbitr_ = 0;
                this.delivery_ = list;
                this.bitField0_ = i & (-16);
                this.maxseq_ = 0;
                this.linear_ = 0;
                this.boxing_ = false;
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    this.comp_ = list;
                    this.bitField0_ = i & (-32);
                } else {
                    o7Var.g();
                }
                this.comptype_ = list;
                int i2 = this.bitField0_;
                this.bitField0_ = i2 & (-33);
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                o7 o7Var2 = this.extProtoBuilder_;
                if (o7Var2 == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i2 & (-97);
                    return this;
                }
                o7Var2.g();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) VideoPlacement.api_converter_.convert(this.api_.get(i));
            }

            public Companion.Builder getCompBuilder(int i) {
                return (Companion.Builder) getCompFieldBuilder().j(i);
            }

            public List<Companion.Builder> getCompBuilderList() {
                return getCompFieldBuilder().k();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionType getComptype(int i) {
                return (CompanionType) VideoPlacement.comptype_converter_.convert(this.comptype_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoCreativeType getCtype(int i) {
                return (VideoCreativeType) VideoPlacement.ctype_converter_.convert(this.ctype_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public DeliveryMethod getDelivery(int i) {
                return (DeliveryMethod) VideoPlacement.delivery_converter_.convert(this.delivery_.get(i));
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().c();
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return (Any.Builder) getExtProtoFieldBuilder().j(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().k();
            }

            public Builder mergeFrom(VideoPlacement videoPlacement) {
                o7 compFieldBuilder;
                if (videoPlacement == VideoPlacement.getDefaultInstance()) {
                    return this;
                }
                if (videoPlacement.ptype_ != 0) {
                    setPtypeValue(videoPlacement.getPtypeValue());
                }
                if (videoPlacement.pos_ != 0) {
                    setPosValue(videoPlacement.getPosValue());
                }
                if (videoPlacement.getDelay() != 0) {
                    setDelay(videoPlacement.getDelay());
                }
                if (videoPlacement.getSkip()) {
                    setSkip(videoPlacement.getSkip());
                }
                if (videoPlacement.getSkipmin() != 0) {
                    setSkipmin(videoPlacement.getSkipmin());
                }
                if (videoPlacement.getSkipafter() != 0) {
                    setSkipafter(videoPlacement.getSkipafter());
                }
                if (videoPlacement.playmethod_ != 0) {
                    setPlaymethodValue(videoPlacement.getPlaymethodValue());
                }
                if (videoPlacement.playend_ != 0) {
                    setPlayendValue(videoPlacement.getPlayendValue());
                }
                if (videoPlacement.clktype_ != 0) {
                    setClktypeValue(videoPlacement.getClktypeValue());
                }
                if (!videoPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = videoPlacement.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(videoPlacement.mime_);
                    }
                    onChanged();
                }
                if (!videoPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = videoPlacement.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(videoPlacement.api_);
                    }
                    onChanged();
                }
                if (!videoPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = videoPlacement.ctype_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(videoPlacement.ctype_);
                    }
                    onChanged();
                }
                if (videoPlacement.getW() != 0) {
                    setW(videoPlacement.getW());
                }
                if (videoPlacement.getH() != 0) {
                    setH(videoPlacement.getH());
                }
                if (videoPlacement.unit_ != 0) {
                    setUnitValue(videoPlacement.getUnitValue());
                }
                if (videoPlacement.getMindur() != 0) {
                    setMindur(videoPlacement.getMindur());
                }
                if (videoPlacement.getMaxdur() != 0) {
                    setMaxdur(videoPlacement.getMaxdur());
                }
                if (videoPlacement.getMaxext() != 0) {
                    setMaxext(videoPlacement.getMaxext());
                }
                if (videoPlacement.getMinbitr() != 0) {
                    setMinbitr(videoPlacement.getMinbitr());
                }
                if (videoPlacement.getMaxbitr() != 0) {
                    setMaxbitr(videoPlacement.getMaxbitr());
                }
                if (!videoPlacement.delivery_.isEmpty()) {
                    if (this.delivery_.isEmpty()) {
                        this.delivery_ = videoPlacement.delivery_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureDeliveryIsMutable();
                        this.delivery_.addAll(videoPlacement.delivery_);
                    }
                    onChanged();
                }
                if (videoPlacement.getMaxseq() != 0) {
                    setMaxseq(videoPlacement.getMaxseq());
                }
                if (videoPlacement.linear_ != 0) {
                    setLinearValue(videoPlacement.getLinearValue());
                }
                if (videoPlacement.getBoxing()) {
                    setBoxing(videoPlacement.getBoxing());
                }
                o7 extProtoFieldBuilder = null;
                if (this.compBuilder_ == null) {
                    if (!videoPlacement.comp_.isEmpty()) {
                        if (this.comp_.isEmpty()) {
                            this.comp_ = videoPlacement.comp_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureCompIsMutable();
                            this.comp_.addAll(videoPlacement.comp_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.comp_.isEmpty()) {
                    boolean zIsEmpty = this.compBuilder_.b.isEmpty();
                    o7 o7Var = this.compBuilder_;
                    if (zIsEmpty) {
                        o7Var.a = null;
                        this.compBuilder_ = null;
                        this.comp_ = videoPlacement.comp_;
                        this.bitField0_ &= -17;
                        if (y4.alwaysUseFieldBuilders) {
                            compFieldBuilder = getCompFieldBuilder();
                        } else {
                            compFieldBuilder = null;
                        }
                        this.compBuilder_ = compFieldBuilder;
                    } else {
                        o7Var.a(videoPlacement.comp_);
                    }
                }
                if (!videoPlacement.comptype_.isEmpty()) {
                    if (this.comptype_.isEmpty()) {
                        this.comptype_ = videoPlacement.comptype_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureComptypeIsMutable();
                        this.comptype_.addAll(videoPlacement.comptype_);
                    }
                    onChanged();
                }
                if (videoPlacement.hasExt()) {
                    mergeExt(videoPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!videoPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = videoPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(videoPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.extProto_.isEmpty()) {
                    boolean zIsEmpty2 = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (zIsEmpty2) {
                        o7Var2.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = videoPlacement.extProto_;
                        this.bitField0_ &= -65;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var2.a(videoPlacement.extProto_);
                    }
                }
                mergeUnknownFields(((y4) videoPlacement).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setComptype(int i, CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.set(i, Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setComptypeValue(int i, int i2) {
                ensureComptypeIsMutable();
                this.comptype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setCtype(int i, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i, int i2) {
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setDelivery(int i, DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.set(i, Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder setDeliveryValue(int i, int i2) {
                ensureDeliveryIsMutable();
                this.delivery_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setLinear(LinearityMode linearityMode) {
                linearityMode.getClass();
                this.linear_ = linearityMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setMime(int i, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setPlayend(PlaybackCessationMode playbackCessationMode) {
                playbackCessationMode.getClass();
                this.playend_ = playbackCessationMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlaymethod(PlaybackMethod playbackMethod) {
                playbackMethod.getClass();
                this.playmethod_ = playbackMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtype(VideoPlacementType videoPlacementType) {
                videoPlacementType.getClass();
                this.ptype_ = videoPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
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
            public VideoPlacement mo250getDefaultInstanceForType() {
                return VideoPlacement.getDefaultInstance();
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

            public Companion.Builder addCompBuilder(int i) {
                return (Companion.Builder) getCompFieldBuilder().b(i, Companion.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
            }

            public Builder setExt(Struct struct) {
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                    return this;
                }
                v7Var.h(struct);
                return this;
            }

            public Builder addComp(int i, Companion companion) {
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(i, companion);
                    onChanged();
                    return this;
                }
                o7Var.d(i, companion);
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                    return this;
                }
                o7Var.d(i, any);
                return this;
            }

            public Builder setComp(int i, Companion companion) {
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.set(i, companion);
                    onChanged();
                    return this;
                }
                o7Var.s(i, companion);
                return this;
            }

            public Builder setExtProto(int i, Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                    return this;
                }
                o7Var.s(i, any);
                return this;
            }

            public Builder addComp(Companion companion) {
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(companion);
                    onChanged();
                    return this;
                }
                o7Var.e(companion);
                return this;
            }

            public Builder addExtProto(Any any) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                    return this;
                }
                o7Var.e(any);
                return this;
            }

            public Builder addComp(int i, Companion.Builder builder) {
                o7 o7Var = this.compBuilder_;
                if (o7Var == null) {
                    ensureCompIsMutable();
                    this.comp_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = r5.c;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VideoPlacement) {
                    return mergeFrom((VideoPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                VideoPlacement videoPlacement = null;
                try {
                    try {
                        VideoPlacement videoPlacement2 = (VideoPlacement) VideoPlacement.PARSER.parsePartialFrom(rVar, o3Var);
                        if (videoPlacement2 != null) {
                            mergeFrom(videoPlacement2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VideoPlacement videoPlacement3 = (VideoPlacement) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            videoPlacement = videoPlacement3;
                            if (videoPlacement != null) {
                                mergeFrom(videoPlacement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (videoPlacement != null) {
                        mergeFrom(videoPlacement);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Companion extends y4 implements CompanionOrBuilder {
            public static final int DISPLAY_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int VCM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private DisplayPlacement display_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private int vcm_;
            private static final Companion DEFAULT_INSTANCE = new Companion();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.1
                @Override // com.explorestack.protobuf.g7
                public Companion parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Companion(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements CompanionOrBuilder {
                private int bitField0_;
                private v7 displayBuilder_;
                private DisplayPlacement display_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private int vcm_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder clearVcm() {
                    this.vcm_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.Y;
                }

                private v7 getDisplayFieldBuilder() {
                    if (this.displayBuilder_ == null) {
                        this.displayBuilder_ = new v7(getDisplay(), getParentForChildren(), isClean());
                        this.display_ = null;
                    }
                    return this.displayBuilder_;
                }

                private v7 getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new v7(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private o7 getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.e(builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion buildPartial() {
                    Companion companion = new Companion(this);
                    companion.id_ = this.id_;
                    companion.vcm_ = this.vcm_;
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var == null) {
                        companion.display_ = this.display_;
                    } else {
                        companion.display_ = (DisplayPlacement) v7Var.a();
                    }
                    v7 v7Var2 = this.extBuilder_;
                    if (v7Var2 == null) {
                        companion.ext_ = this.ext_;
                    } else {
                        companion.ext_ = (Struct) v7Var2.a();
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        companion.extProto_ = this.extProto_;
                    } else {
                        companion.extProto_ = o7Var.f();
                    }
                    onBuilt();
                    return companion;
                }

                public Builder clearDisplay() {
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                        onChanged();
                        return this;
                    }
                    this.display_ = null;
                    this.displayBuilder_ = null;
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.Y;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacement getDisplay() {
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var != null) {
                        return (DisplayPlacement) v7Var.d();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var != null) {
                        return (DisplayPlacementOrBuilder) v7Var.e();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getVcm() {
                    return this.vcm_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasDisplay() {
                    return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.Z;
                    w4Var.c(Companion.class, Builder.class);
                    return w4Var;
                }

                public Builder mergeDisplay(DisplayPlacement displayPlacement) {
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var != null) {
                        v7Var.f(displayPlacement);
                        return this;
                    }
                    DisplayPlacement displayPlacement2 = this.display_;
                    if (displayPlacement2 != null) {
                        this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                    } else {
                        this.display_ = displayPlacement;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.f(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = z.m(struct2, struct);
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.r(i);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                    return this;
                }

                public Builder setDisplay(DisplayPlacement.Builder builder) {
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.display_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var != null) {
                        o7Var.s(i, builder.build());
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setVcm(int i) {
                    this.vcm_ = i;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion build() {
                    Companion companionBuildPartial = buildPartial();
                    if (companionBuildPartial.isInitialized()) {
                        return companionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.vcm_ = 0;
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    o7Var.g();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Companion.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public DisplayPlacement.Builder getDisplayBuilder() {
                    onChanged();
                    return (DisplayPlacement.Builder) getDisplayFieldBuilder().c();
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().c();
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().j(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().k();
                }

                public Builder mergeFrom(Companion companion) {
                    if (companion == Companion.getDefaultInstance()) {
                        return this;
                    }
                    if (!companion.getId().isEmpty()) {
                        this.id_ = companion.id_;
                        onChanged();
                    }
                    if (companion.getVcm() != 0) {
                        setVcm(companion.getVcm());
                    }
                    if (companion.hasDisplay()) {
                        mergeDisplay(companion.getDisplay());
                    }
                    if (companion.hasExt()) {
                        mergeExt(companion.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!companion.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = companion.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(companion.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!companion.extProto_.isEmpty()) {
                        boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var = this.extProtoBuilder_;
                        if (zIsEmpty) {
                            o7 extProtoFieldBuilder = null;
                            o7Var.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = companion.extProto_;
                            this.bitField0_ &= -2;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var.a(companion.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) companion).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
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
                public Companion mo250getDefaultInstanceForType() {
                    return Companion.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
                }

                private Builder(h4 h4Var) {
                    super(h4Var);
                    this.id_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder setDisplay(DisplayPlacement displayPlacement) {
                    v7 v7Var = this.displayBuilder_;
                    if (v7Var == null) {
                        displayPlacement.getClass();
                        this.display_ = displayPlacement;
                        onChanged();
                        return this;
                    }
                    v7Var.h(displayPlacement);
                    return this;
                }

                public Builder setExt(Struct struct) {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }
                    v7Var.h(struct);
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, any);
                    return this;
                }

                public Builder setExtProto(int i, Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, any);
                    return this;
                }

                public Builder addExtProto(Any any) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }
                    o7Var.e(any);
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, builder.build());
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Companion) {
                        return mergeFrom((Companion) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Companion companion = null;
                    try {
                        try {
                            Companion companion2 = (Companion) Companion.PARSER.parsePartialFrom(rVar, o3Var);
                            if (companion2 != null) {
                                mergeFrom(companion2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Companion companion3 = (Companion) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                companion = companion3;
                                if (companion != null) {
                                    mergeFrom(companion);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (companion != null) {
                            mergeFrom(companion);
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
                if (!(obj instanceof Companion)) {
                    return super.equals(obj);
                }
                Companion companion = (Companion) obj;
                if (!getId().equals(companion.getId()) || getVcm() != companion.getVcm() || hasDisplay() != companion.hasDisplay()) {
                    return false;
                }
                if ((!hasDisplay() || getDisplay().equals(companion.getDisplay())) && hasExt() == companion.hasExt()) {
                    return (!hasExt() || getExt().equals(companion.getExt())) && getExtProtoList().equals(companion.getExtProtoList()) && this.unknownFields.equals(companion.unknownFields);
                }
                return false;
            }

            public static Companion getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.Y;
            }

            public static Builder newBuilder(Companion companion) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(companion);
            }

            public static Companion parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Companion) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacement getDisplay() {
                DisplayPlacement displayPlacement = this.display_;
                return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
                int i2 = this.vcm_;
                if (i2 != 0) {
                    iComputeStringSize += w.t(2, i2);
                }
                if (this.display_ != null) {
                    iComputeStringSize += w.o(3, getDisplay());
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    iComputeStringSize += w.o(4, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += w.o(5, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getVcm() {
                return this.vcm_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasDisplay() {
                return this.display_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int vcm = getVcm() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasDisplay()) {
                    vcm = pv1.c(vcm, 37, 3, 53) + getDisplay().hashCode();
                }
                if (hasExt()) {
                    vcm = pv1.c(vcm, 37, 5, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    vcm = pv1.c(vcm, 37, 4, 53) + getExtProtoList().hashCode();
                }
                int iHashCode = this.unknownFields.a.hashCode() + (vcm * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.Z;
                w4Var.c(Companion.class, Builder.class);
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
                return new Companion();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Companion(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                this();
                o3Var.getClass();
                p8 p8VarB = s8.b();
                boolean z = false;
                byte b = false;
                while (!z) {
                    try {
                        try {
                            int iF = rVar.F();
                            if (iF != 0) {
                                if (iF != 10) {
                                    if (iF != 16) {
                                        if (iF != 26) {
                                            if (iF != 34) {
                                                if (iF != 42) {
                                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                    }
                                                } else {
                                                    Struct struct = this.ext_;
                                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                                    Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                                    this.ext_ = struct2;
                                                    if (builder != null) {
                                                        builder.mergeFrom(struct2);
                                                        this.ext_ = builder.buildPartial();
                                                    }
                                                }
                                            } else {
                                                if (b == false) {
                                                    this.extProto_ = new ArrayList();
                                                    b = true;
                                                }
                                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                            }
                                        } else {
                                            DisplayPlacement displayPlacement = this.display_;
                                            DisplayPlacement.Builder builder2 = displayPlacement != null ? displayPlacement.toBuilder() : null;
                                            DisplayPlacement displayPlacement2 = (DisplayPlacement) rVar.v(DisplayPlacement.parser(), o3Var);
                                            this.display_ = displayPlacement2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(displayPlacement2);
                                                this.display_ = builder2.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.vcm_ = rVar.G();
                                    }
                                } else {
                                    this.id_ = rVar.E();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if (b != false) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (b != false) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                return getDisplay();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.id_);
                }
                int i = this.vcm_;
                if (i != 0) {
                    wVar.T(2, i);
                }
                if (this.display_ != null) {
                    wVar.M(3, getDisplay());
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    wVar.M(4, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    wVar.M(5, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Companion mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Companion parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Companion) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Companion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Companion parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString, o3Var);
            }

            public static Companion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr);
            }

            public static Companion parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr, o3Var);
            }

            public static Companion parseFrom(InputStream inputStream) throws IOException {
                return (Companion) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Companion) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Companion parseFrom(r rVar) throws IOException {
                return (Companion) y4.parseWithIOException(PARSER, rVar);
            }

            public static Companion parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Companion) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Companion(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Companion() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface CompanionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            DisplayPlacement getDisplay();

            DisplayPlacementOrBuilder getDisplayOrBuilder();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            int getVcm();

            boolean hasDisplay();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlacement)) {
                return super.equals(obj);
            }
            VideoPlacement videoPlacement = (VideoPlacement) obj;
            if (this.ptype_ == videoPlacement.ptype_ && this.pos_ == videoPlacement.pos_ && getDelay() == videoPlacement.getDelay() && getSkip() == videoPlacement.getSkip() && getSkipmin() == videoPlacement.getSkipmin() && getSkipafter() == videoPlacement.getSkipafter() && this.playmethod_ == videoPlacement.playmethod_ && this.playend_ == videoPlacement.playend_ && this.clktype_ == videoPlacement.clktype_ && getMimeList().equals(videoPlacement.getMimeList()) && this.api_.equals(videoPlacement.api_) && this.ctype_.equals(videoPlacement.ctype_) && getW() == videoPlacement.getW() && getH() == videoPlacement.getH() && this.unit_ == videoPlacement.unit_ && getMindur() == videoPlacement.getMindur() && getMaxdur() == videoPlacement.getMaxdur() && getMaxext() == videoPlacement.getMaxext() && getMinbitr() == videoPlacement.getMinbitr() && getMaxbitr() == videoPlacement.getMaxbitr() && this.delivery_.equals(videoPlacement.delivery_) && getMaxseq() == videoPlacement.getMaxseq() && this.linear_ == videoPlacement.linear_ && getBoxing() == videoPlacement.getBoxing() && getCompList().equals(videoPlacement.getCompList()) && this.comptype_.equals(videoPlacement.comptype_) && hasExt() == videoPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(videoPlacement.getExt())) && getExtProtoList().equals(videoPlacement.getExtProtoList()) && this.unknownFields.equals(videoPlacement.unknownFields);
            }
            return false;
        }

        public static VideoPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.W;
        }

        public static Builder newBuilder(VideoPlacement videoPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlacement);
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ApiFramework getApi(int i) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new i5(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getBoxing() {
            return this.boxing_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Companion getComp(int i) {
            return this.comp_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCompCount() {
            return this.comp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Companion> getCompList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionOrBuilder getCompOrBuilder(int i) {
            return this.comp_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionType getComptype(int i) {
            return (CompanionType) comptype_converter_.convert(this.comptype_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeCount() {
            return this.comptype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<CompanionType> getComptypeList() {
            return new i5(this.comptype_, comptype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeValue(int i) {
            return this.comptype_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getComptypeValueList() {
            return this.comptype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoCreativeType getCtype(int i) {
            return (VideoCreativeType) ctype_converter_.convert(this.ctype_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<VideoCreativeType> getCtypeList() {
            return new i5(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeValue(int i) {
            return this.ctype_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDelay() {
            return this.delay_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public DeliveryMethod getDelivery(int i) {
            return (DeliveryMethod) delivery_converter_.convert(this.delivery_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryCount() {
            return this.delivery_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<DeliveryMethod> getDeliveryList() {
            return new i5(this.delivery_, delivery_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryValue(int i) {
            return this.delivery_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getDeliveryValueList() {
            return this.delivery_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public LinearityMode getLinear() {
            LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
            return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getLinearValue() {
            return this.linear_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxbitr() {
            return this.maxbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxdur() {
            return this.maxdur_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxext() {
            return this.maxext_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxseq() {
            return this.maxseq_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public String getMime(int i) {
            return (String) this.mime_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMinbitr() {
            return this.minbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMindur() {
            return this.mindur_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackCessationMode getPlayend() {
            PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
            return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlayendValue() {
            return this.playend_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackMethod getPlaymethod() {
            PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
            return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlaymethodValue() {
            return this.playmethod_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoPlacementType getPtype() {
            VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
            return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber() ? w.g(1, this.ptype_) : 0;
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                iG += w.g(2, this.pos_);
            }
            int i2 = this.delay_;
            if (i2 != 0) {
                iG += w.l(3, i2);
            }
            if (this.skip_) {
                iG += w.c(4);
            }
            int i3 = this.skipmin_;
            if (i3 != 0) {
                iG += w.t(5, i3);
            }
            int i4 = this.skipafter_;
            if (i4 != 0) {
                iG += w.t(6, i4);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                iG += w.g(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                iG += w.g(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                iG += w.g(9, this.clktype_);
            }
            int iK = 0;
            for (int i5 = 0; i5 < this.mime_.size(); i5++) {
                iK = z.k(this.mime_, i5, iK);
            }
            int size = getMimeList().size() + iG + iK;
            int iJ = 0;
            for (int i6 = 0; i6 < this.api_.size(); i6++) {
                iJ = z.j(iJ, this.api_.get(i6));
            }
            int iU = size + iJ;
            if (!getApiList().isEmpty()) {
                iU = iU + 1 + w.u(iJ);
            }
            this.apiMemoizedSerializedSize = iJ;
            int iJ2 = 0;
            for (int i7 = 0; i7 < this.ctype_.size(); i7++) {
                iJ2 = z.j(iJ2, this.ctype_.get(i7));
            }
            int iT = iU + iJ2;
            if (!getCtypeList().isEmpty()) {
                iT = iT + 1 + w.u(iJ2);
            }
            this.ctypeMemoizedSerializedSize = iJ2;
            int i8 = this.w_;
            if (i8 != 0) {
                iT += w.t(13, i8);
            }
            int i9 = this.h_;
            if (i9 != 0) {
                iT += w.t(14, i9);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iT += w.g(15, this.unit_);
            }
            int i10 = this.mindur_;
            if (i10 != 0) {
                iT += w.t(16, i10);
            }
            int i11 = this.maxdur_;
            if (i11 != 0) {
                iT += w.t(17, i11);
            }
            int i12 = this.maxext_;
            if (i12 != 0) {
                iT += w.l(18, i12);
            }
            int i13 = this.minbitr_;
            if (i13 != 0) {
                iT += w.t(19, i13);
            }
            int i14 = this.maxbitr_;
            if (i14 != 0) {
                iT += w.t(20, i14);
            }
            int iJ3 = 0;
            for (int i15 = 0; i15 < this.delivery_.size(); i15++) {
                iJ3 = z.j(iJ3, this.delivery_.get(i15));
            }
            int iO = iT + iJ3;
            if (!getDeliveryList().isEmpty()) {
                iO = iO + 2 + w.u(iJ3);
            }
            this.deliveryMemoizedSerializedSize = iJ3;
            int i16 = this.maxseq_;
            if (i16 != 0) {
                iO += w.t(22, i16);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                iO += w.g(23, this.linear_);
            }
            if (this.boxing_) {
                iO += w.c(24);
            }
            for (int i17 = 0; i17 < this.comp_.size(); i17++) {
                iO += w.o(25, this.comp_.get(i17));
            }
            int iJ4 = 0;
            for (int i18 = 0; i18 < this.comptype_.size(); i18++) {
                iJ4 = z.j(iJ4, this.comptype_.get(i18));
            }
            int iO2 = iO + iJ4;
            if (!getComptypeList().isEmpty()) {
                iO2 = iO2 + 2 + w.u(iJ4);
            }
            this.comptypeMemoizedSerializedSize = iJ4;
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                iO2 += w.o(27, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                iO2 += w.o(28, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iO2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getSkip() {
            return this.skip_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipafter() {
            return this.skipafter_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipmin() {
            return this.skipmin_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int i2 = z.i(z.i((((getSkipafter() + ((((getSkipmin() + ((((l5.c(getSkip()) + ((((getDelay() + z.i(z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.ptype_, 37, 2, 53), this.pos_, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53, this.playmethod_, 37, 8, 53), this.playend_, 37, 9, 53) + this.clktype_;
            if (getMimeCount() > 0) {
                i2 = pv1.c(i2, 37, 10, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                i2 = pv1.c(i2, 37, 11, 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                i2 = pv1.c(i2, 37, 12, 53) + this.ctype_.hashCode();
            }
            int maxbitr = getMaxbitr() + ((((getMinbitr() + ((((getMaxext() + ((((getMaxdur() + ((((getMindur() + z.i((((getH() + ((((getW() + pv1.c(i2, 37, 13, 53)) * 37) + 14) * 53)) * 37) + 15) * 53, this.unit_, 37, 16, 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53);
            if (getDeliveryCount() > 0) {
                maxbitr = this.delivery_.hashCode() + pv1.c(maxbitr, 37, 21, 53);
            }
            int iC = l5.c(getBoxing()) + z.i((((getMaxseq() + pv1.c(maxbitr, 37, 22, 53)) * 37) + 23) * 53, this.linear_, 37, 24, 53);
            if (getCompCount() > 0) {
                iC = getCompList().hashCode() + pv1.c(iC, 37, 25, 53);
            }
            if (getComptypeCount() > 0) {
                iC = this.comptype_.hashCode() + pv1.c(iC, 37, 26, 53);
            }
            if (hasExt()) {
                iC = getExt().hashCode() + pv1.c(iC, 37, 28, 53);
            }
            if (getExtProtoCount() > 0) {
                iC = getExtProtoList().hashCode() + pv1.c(iC, 37, 27, 53);
            }
            int iHashCode = this.unknownFields.a.hashCode() + (iC * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.X;
            w4Var.c(VideoPlacement.class, Builder.class);
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
            return new VideoPlacement();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private VideoPlacement(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            Struct.Builder builder;
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iF = rVar.F();
                        switch (iF) {
                            case 0:
                                break;
                            case 8:
                                this.ptype_ = rVar.o();
                                continue;
                            case 16:
                                this.pos_ = rVar.o();
                                continue;
                            case 24:
                                this.delay_ = rVar.t();
                                continue;
                            case 32:
                                this.skip_ = rVar.l();
                                continue;
                            case 40:
                                this.skipmin_ = rVar.G();
                                continue;
                            case 48:
                                this.skipafter_ = rVar.G();
                                continue;
                            case 56:
                                this.playmethod_ = rVar.o();
                                continue;
                            case 64:
                                this.playend_ = rVar.o();
                                continue;
                            case 72:
                                this.clktype_ = rVar.o();
                                continue;
                            case 82:
                                String strE = rVar.E();
                                if ((i & 1) == 0) {
                                    this.mime_ = new r5();
                                    i |= 1;
                                }
                                this.mime_.add(strE);
                                continue;
                            case 88:
                                int iO = rVar.o();
                                if ((i & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i |= 2;
                                }
                                this.api_.add(Integer.valueOf(iO));
                                continue;
                            case 90:
                                int iK = rVar.k(rVar.x());
                                while (rVar.d() > 0) {
                                    int iO2 = rVar.o();
                                    if ((i & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iO2));
                                }
                                rVar.j(iK);
                                continue;
                            case 96:
                                int iO3 = rVar.o();
                                if ((i & 4) == 0) {
                                    this.ctype_ = new ArrayList();
                                    i |= 4;
                                }
                                this.ctype_.add(Integer.valueOf(iO3));
                                continue;
                            case 98:
                                int iK2 = rVar.k(rVar.x());
                                while (rVar.d() > 0) {
                                    int iO4 = rVar.o();
                                    if ((i & 4) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i |= 4;
                                    }
                                    this.ctype_.add(Integer.valueOf(iO4));
                                }
                                rVar.j(iK2);
                                continue;
                            case 104:
                                this.w_ = rVar.G();
                                continue;
                            case 112:
                                this.h_ = rVar.G();
                                continue;
                            case com.safedk.android.analytics.brandsafety.b.v /* 120 */:
                                this.unit_ = rVar.o();
                                continue;
                            case 128:
                                this.mindur_ = rVar.G();
                                continue;
                            case 136:
                                this.maxdur_ = rVar.G();
                                continue;
                            case 144:
                                this.maxext_ = rVar.t();
                                continue;
                            case 152:
                                this.minbitr_ = rVar.G();
                                continue;
                            case 160:
                                this.maxbitr_ = rVar.G();
                                continue;
                            case 168:
                                int iO5 = rVar.o();
                                if ((i & 8) == 0) {
                                    this.delivery_ = new ArrayList();
                                    i |= 8;
                                }
                                this.delivery_.add(Integer.valueOf(iO5));
                                continue;
                            case 170:
                                int iK3 = rVar.k(rVar.x());
                                while (rVar.d() > 0) {
                                    int iO6 = rVar.o();
                                    if ((i & 8) == 0) {
                                        this.delivery_ = new ArrayList();
                                        i |= 8;
                                    }
                                    this.delivery_.add(Integer.valueOf(iO6));
                                }
                                rVar.j(iK3);
                                continue;
                            case 176:
                                this.maxseq_ = rVar.G();
                                continue;
                            case 184:
                                this.linear_ = rVar.o();
                                continue;
                            case 192:
                                this.boxing_ = rVar.l();
                                continue;
                            case 202:
                                if ((i & 16) == 0) {
                                    this.comp_ = new ArrayList();
                                    i |= 16;
                                }
                                this.comp_.add((Companion) rVar.v(Companion.parser(), o3Var));
                                continue;
                            case 208:
                                int iO7 = rVar.o();
                                if ((i & 32) == 0) {
                                    this.comptype_ = new ArrayList();
                                    i |= 32;
                                }
                                this.comptype_.add(Integer.valueOf(iO7));
                                continue;
                            case 210:
                                int iK4 = rVar.k(rVar.x());
                                while (rVar.d() > 0) {
                                    int iO8 = rVar.o();
                                    if ((i & 32) == 0) {
                                        this.comptype_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.comptype_.add(Integer.valueOf(iO8));
                                }
                                rVar.j(iK4);
                                continue;
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if ((i & 64) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i |= 64;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                Struct struct = this.ext_;
                                if (struct != null) {
                                    builder = struct.toBuilder();
                                } else {
                                    builder = null;
                                }
                                Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i & 4) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if ((i & 8) != 0) {
                        this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    }
                    if ((i & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                    }
                    if ((i & 32) != 0) {
                        this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    }
                    if ((i & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if ((i & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i & 4) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if ((i & 8) != 0) {
                this.delivery_ = Collections.unmodifiableList(this.delivery_);
            }
            if ((i & 16) != 0) {
                this.comp_ = Collections.unmodifiableList(this.comp_);
            }
            if ((i & 32) != 0) {
                this.comptype_ = Collections.unmodifiableList(this.comptype_);
            }
            if ((i & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            getSerializedSize();
            if (this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber()) {
                wVar.K(1, this.ptype_);
            }
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                wVar.K(2, this.pos_);
            }
            int i = this.delay_;
            if (i != 0) {
                wVar.K(3, i);
            }
            boolean z = this.skip_;
            if (z) {
                wVar.A(4, z);
            }
            int i2 = this.skipmin_;
            if (i2 != 0) {
                wVar.T(5, i2);
            }
            int i3 = this.skipafter_;
            if (i3 != 0) {
                wVar.T(6, i3);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                wVar.K(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                wVar.K(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                wVar.K(9, this.clktype_);
            }
            int iL = 0;
            while (iL < this.mime_.size()) {
                iL = z.l(this.mime_, iL, wVar, 10, iL, 1);
            }
            if (getApiList().size() > 0) {
                wVar.U(90);
                wVar.U(this.apiMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.api_.size(); i4++) {
                wVar.L(this.api_.get(i4).intValue());
            }
            if (getCtypeList().size() > 0) {
                wVar.U(98);
                wVar.U(this.ctypeMemoizedSerializedSize);
            }
            for (int i5 = 0; i5 < this.ctype_.size(); i5++) {
                wVar.L(this.ctype_.get(i5).intValue());
            }
            int i6 = this.w_;
            if (i6 != 0) {
                wVar.T(13, i6);
            }
            int i7 = this.h_;
            if (i7 != 0) {
                wVar.T(14, i7);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                wVar.K(15, this.unit_);
            }
            int i8 = this.mindur_;
            if (i8 != 0) {
                wVar.T(16, i8);
            }
            int i9 = this.maxdur_;
            if (i9 != 0) {
                wVar.T(17, i9);
            }
            int i10 = this.maxext_;
            if (i10 != 0) {
                wVar.K(18, i10);
            }
            int i11 = this.minbitr_;
            if (i11 != 0) {
                wVar.T(19, i11);
            }
            int i12 = this.maxbitr_;
            if (i12 != 0) {
                wVar.T(20, i12);
            }
            if (getDeliveryList().size() > 0) {
                wVar.U(170);
                wVar.U(this.deliveryMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.delivery_.size(); i13++) {
                wVar.L(this.delivery_.get(i13).intValue());
            }
            int i14 = this.maxseq_;
            if (i14 != 0) {
                wVar.T(22, i14);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                wVar.K(23, this.linear_);
            }
            boolean z2 = this.boxing_;
            if (z2) {
                wVar.A(24, z2);
            }
            for (int i15 = 0; i15 < this.comp_.size(); i15++) {
                wVar.M(25, this.comp_.get(i15));
            }
            if (getComptypeList().size() > 0) {
                wVar.U(210);
                wVar.U(this.comptypeMemoizedSerializedSize);
            }
            for (int i16 = 0; i16 < this.comptype_.size(); i16++) {
                wVar.L(this.comptype_.get(i16).intValue());
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                wVar.M(27, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                wVar.M(28, getExt());
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public j7 getMimeList() {
            return this.mime_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public VideoPlacement mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (VideoPlacement) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VideoPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoPlacement parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString, o3Var);
        }

        public static VideoPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr);
        }

        public static VideoPlacement parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr, o3Var);
        }

        public static VideoPlacement parseFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) y4.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (VideoPlacement) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static VideoPlacement parseFrom(r rVar) throws IOException {
            return (VideoPlacement) y4.parseWithIOException(PARSER, rVar);
        }

        public static VideoPlacement parseFrom(r rVar, o3 o3Var) throws IOException {
            return (VideoPlacement) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private VideoPlacement(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private VideoPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.ptype_ = 0;
            this.pos_ = 0;
            this.playmethod_ = 0;
            this.playend_ = 0;
            this.clktype_ = 0;
            this.mime_ = r5.c;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.delivery_ = list;
            this.linear_ = 0;
            this.comp_ = list;
            this.comptype_ = list;
            this.extProto_ = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface VideoPlacementOrBuilder extends MessageOrBuilder {
        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        boolean getBoxing();

        ClickType getClktype();

        int getClktypeValue();

        VideoPlacement.Companion getComp(int i);

        int getCompCount();

        List<VideoPlacement.Companion> getCompList();

        VideoPlacement.CompanionOrBuilder getCompOrBuilder(int i);

        List<? extends VideoPlacement.CompanionOrBuilder> getCompOrBuilderList();

        CompanionType getComptype(int i);

        int getComptypeCount();

        List<CompanionType> getComptypeList();

        int getComptypeValue(int i);

        List<Integer> getComptypeValueList();

        VideoCreativeType getCtype(int i);

        int getCtypeCount();

        List<VideoCreativeType> getCtypeList();

        int getCtypeValue(int i);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        int getDelay();

        DeliveryMethod getDelivery(int i);

        int getDeliveryCount();

        List<DeliveryMethod> getDeliveryList();

        int getDeliveryValue(int i);

        List<Integer> getDeliveryValueList();

        Struct getExt();

        c8 getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i);

        List<? extends g> getExtProtoOrBuilderList();

        int getH();

        LinearityMode getLinear();

        int getLinearValue();

        int getMaxbitr();

        int getMaxdur();

        int getMaxext();

        int getMaxseq();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        int getMinbitr();

        int getMindur();

        PlaybackCessationMode getPlayend();

        int getPlayendValue();

        PlaybackMethod getPlaymethod();

        int getPlaymethodValue();

        PlacementPosition getPos();

        int getPosValue();

        VideoPlacementType getPtype();

        int getPtypeValue();

        boolean getSkip();

        int getSkipafter();

        int getSkipmin();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getTagid().equals(placement.getTagid()) || getSsai() != placement.getSsai() || !getSdk().equals(placement.getSdk()) || !getSdkver().equals(placement.getSdkver()) || getReward() != placement.getReward() || !m270getBcatList().equals(placement.m270getBcatList()) || this.cattax_ != placement.cattax_ || !m268getBadvList().equals(placement.m268getBadvList()) || !m269getBappList().equals(placement.m269getBappList()) || !this.battr_.equals(placement.battr_) || !m271getWlangList().equals(placement.m271getWlangList()) || getSecure() != placement.getSecure() || getAdmx() != placement.getAdmx() || getCurlx() != placement.getCurlx() || hasDisplay() != placement.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(placement.getDisplay())) || hasVideo() != placement.hasVideo()) {
            return false;
        }
        if ((!hasVideo() || getVideo().equals(placement.getVideo())) && hasExt() == placement.hasExt()) {
            return (!hasExt() || getExt().equals(placement.getExt())) && getExtProtoList().equals(placement.getExtProtoList()) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.E;
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    public boolean getAdmx() {
        return this.admx_;
    }

    public String getBadv(int i) {
        return (String) this.badv_.get(i);
    }

    public ByteString getBadvBytes(int i) {
        return this.badv_.getByteString(i);
    }

    public int getBadvCount() {
        return this.badv_.size();
    }

    public String getBapp(int i) {
        return (String) this.bapp_.get(i);
    }

    public ByteString getBappBytes(int i) {
        return this.bapp_.getByteString(i);
    }

    public int getBappCount() {
        return this.bapp_.size();
    }

    public CreativeAttribute getBattr(int i) {
        return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i));
    }

    public int getBattrCount() {
        return this.battr_.size();
    }

    public List<CreativeAttribute> getBattrList() {
        return new i5(this.battr_, battr_converter_);
    }

    public int getBattrValue(int i) {
        return this.battr_.get(i).intValue();
    }

    public List<Integer> getBattrValueList() {
        return this.battr_;
    }

    public String getBcat(int i) {
        return (String) this.bcat_.get(i);
    }

    public ByteString getBcatBytes(int i) {
        return this.bcat_.getByteString(i);
    }

    public int getBcatCount() {
        return this.bcat_.size();
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public boolean getCurlx() {
        return this.curlx_;
    }

    public DisplayPlacement getDisplay() {
        DisplayPlacement displayPlacement = this.display_;
        return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public Any getExtProto(int i) {
        return this.extProto_.get(i);
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public g getExtProtoOrBuilder(int i) {
        return this.extProto_.get(i);
    }

    public List<? extends g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    public boolean getReward() {
        return this.reward_;
    }

    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getTagidBytes().isEmpty() ? y4.computeStringSize(1, this.tagid_) : 0;
        int i2 = this.ssai_;
        if (i2 != 0) {
            iComputeStringSize += w.t(2, i2);
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += y4.computeStringSize(3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += y4.computeStringSize(4, this.sdkver_);
        }
        if (this.reward_) {
            iComputeStringSize += w.c(5);
        }
        int iK = 0;
        for (int i3 = 0; i3 < this.bcat_.size(); i3++) {
            iK = z.k(this.bcat_, i3, iK);
        }
        int size = m270getBcatList().size() + iComputeStringSize + iK;
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size += w.g(7, this.cattax_);
        }
        int iK2 = 0;
        for (int i4 = 0; i4 < this.badv_.size(); i4++) {
            iK2 = z.k(this.badv_, i4, iK2);
        }
        int size2 = m268getBadvList().size() + size + iK2;
        int iK3 = 0;
        for (int i5 = 0; i5 < this.bapp_.size(); i5++) {
            iK3 = z.k(this.bapp_, i5, iK3);
        }
        int size3 = m269getBappList().size() + size2 + iK3;
        int iJ = 0;
        for (int i6 = 0; i6 < this.battr_.size(); i6++) {
            iJ = z.j(iJ, this.battr_.get(i6));
        }
        int iU = size3 + iJ;
        if (!getBattrList().isEmpty()) {
            iU = iU + 1 + w.u(iJ);
        }
        this.battrMemoizedSerializedSize = iJ;
        int iK4 = 0;
        for (int i7 = 0; i7 < this.wlang_.size(); i7++) {
            iK4 = z.k(this.wlang_, i7, iK4);
        }
        int size4 = m271getWlangList().size() + iU + iK4;
        if (this.secure_) {
            size4 += w.c(13);
        }
        if (this.admx_) {
            size4 += w.c(14);
        }
        if (this.curlx_) {
            size4 += w.c(15);
        }
        if (this.display_ != null) {
            size4 += w.o(16, getDisplay());
        }
        if (this.video_ != null) {
            size4 += w.o(17, getVideo());
        }
        for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
            size4 += w.o(19, this.extProto_.get(i8));
        }
        if (this.ext_ != null) {
            size4 += w.o(20, getExt());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size4;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public int getSsai() {
        return this.ssai_;
    }

    public String getTagid() {
        Object obj = this.tagid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tagid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTagidBytes() {
        Object obj = this.tagid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tagid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    public VideoPlacement getVideo() {
        VideoPlacement videoPlacement = this.video_;
        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
    }

    public String getWlang(int i) {
        return (String) this.wlang_.get(i);
    }

    public ByteString getWlangBytes(int i) {
        return this.wlang_.getByteString(i);
    }

    public int getWlangCount() {
        return this.wlang_.size();
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iC = l5.c(getReward()) + ((((getSdkver().hashCode() + ((((getSdk().hashCode() + ((((getSsai() + ((((getTagid().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getBcatCount() > 0) {
            iC = m270getBcatList().hashCode() + pv1.c(iC, 37, 6, 53);
        }
        int iC2 = pv1.c(iC, 37, 7, 53) + this.cattax_;
        if (getBadvCount() > 0) {
            iC2 = pv1.c(iC2, 37, 9, 53) + m268getBadvList().hashCode();
        }
        if (getBappCount() > 0) {
            iC2 = pv1.c(iC2, 37, 10, 53) + m269getBappList().hashCode();
        }
        if (getBattrCount() > 0) {
            iC2 = pv1.c(iC2, 37, 11, 53) + this.battr_.hashCode();
        }
        if (getWlangCount() > 0) {
            iC2 = pv1.c(iC2, 37, 12, 53) + m271getWlangList().hashCode();
        }
        int iC3 = l5.c(getCurlx()) + ((((l5.c(getAdmx()) + ((((l5.c(getSecure()) + pv1.c(iC2, 37, 13, 53)) * 37) + 14) * 53)) * 37) + 15) * 53);
        if (hasDisplay()) {
            iC3 = getDisplay().hashCode() + pv1.c(iC3, 37, 16, 53);
        }
        if (hasVideo()) {
            iC3 = getVideo().hashCode() + pv1.c(iC3, 37, 17, 53);
        }
        if (hasExt()) {
            iC3 = getExt().hashCode() + pv1.c(iC3, 37, 20, 53);
        }
        if (getExtProtoCount() > 0) {
            iC3 = getExtProtoList().hashCode() + pv1.c(iC3, 37, 19, 53);
        }
        int iHashCode = this.unknownFields.a.hashCode() + (iC3 * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = b.F;
        w4Var.c(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private Placement(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    switch (iF) {
                        case 0:
                            break;
                        case 10:
                            this.tagid_ = rVar.E();
                            continue;
                        case 16:
                            this.ssai_ = rVar.G();
                            continue;
                        case 26:
                            this.sdk_ = rVar.E();
                            continue;
                        case 34:
                            this.sdkver_ = rVar.E();
                            continue;
                        case 40:
                            this.reward_ = rVar.l();
                            continue;
                        case 50:
                            String strE = rVar.E();
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 == 0) {
                                this.bcat_ = new r5();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.bcat_.add(strE);
                            continue;
                        case 56:
                            this.cattax_ = rVar.o();
                            continue;
                        case 74:
                            String strE2 = rVar.E();
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 == 0) {
                                this.badv_ = new r5();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.badv_.add(strE2);
                            continue;
                        case 82:
                            String strE3 = rVar.E();
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 == 0) {
                                this.bapp_ = new r5();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.bapp_.add(strE3);
                            continue;
                        case 88:
                            int iO = rVar.o();
                            int i5 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i5 == 0) {
                                this.battr_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.battr_.add(Integer.valueOf(iO));
                            continue;
                        case 90:
                            int iK = rVar.k(rVar.x());
                            i = i;
                            while (rVar.d() > 0) {
                                int iO2 = rVar.o();
                                if (((i == true ? 1 : 0) & 8) == 0) {
                                    this.battr_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8;
                                }
                                this.battr_.add(Integer.valueOf(iO2));
                                i = i;
                            }
                            rVar.j(iK);
                            continue;
                        case 98:
                            String strE4 = rVar.E();
                            int i6 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i6 == 0) {
                                this.wlang_ = new r5();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.wlang_.add(strE4);
                            continue;
                        case 104:
                            this.secure_ = rVar.l();
                            continue;
                        case 112:
                            this.admx_ = rVar.l();
                            continue;
                        case com.safedk.android.analytics.brandsafety.b.v /* 120 */:
                            this.curlx_ = rVar.l();
                            continue;
                        case 130:
                            DisplayPlacement displayPlacement = this.display_;
                            DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                            DisplayPlacement displayPlacement2 = (DisplayPlacement) rVar.v(DisplayPlacement.parser(), o3Var);
                            this.display_ = displayPlacement2;
                            if (builder != null) {
                                builder.mergeFrom(displayPlacement2);
                                this.display_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 138:
                            VideoPlacement videoPlacement = this.video_;
                            VideoPlacement.Builder builder2 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                            VideoPlacement videoPlacement2 = (VideoPlacement) rVar.v(VideoPlacement.parser(), o3Var);
                            this.video_ = videoPlacement2;
                            if (builder2 != null) {
                                builder2.mergeFrom(videoPlacement2);
                                this.video_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 154:
                            int i7 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i7 == 0) {
                                this.extProto_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                            continue;
                        case 162:
                            Struct struct = this.ext_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) rVar.v(Struct.parser(), o3Var);
                            this.ext_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.ext_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        default:
                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                }
                if (((i == true ? 1 : 0) & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                }
                if (((i == true ? 1 : 0) & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                }
                if (((i == true ? 1 : 0) & 16) != 0) {
                    this.wlang_ = this.wlang_.getUnmodifiableView();
                }
                if (((i == true ? 1 : 0) & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.bcat_ = this.bcat_.getUnmodifiableView();
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.badv_ = this.badv_.getUnmodifiableView();
        }
        if (((i == true ? 1 : 0) & 4) != 0) {
            this.bapp_ = this.bapp_.getUnmodifiableView();
        }
        if (((i == true ? 1 : 0) & 8) != 0) {
            this.battr_ = Collections.unmodifiableList(this.battr_);
        }
        if (((i == true ? 1 : 0) & 16) != 0) {
            this.wlang_ = this.wlang_.getUnmodifiableView();
        }
        if (((i == true ? 1 : 0) & 32) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    public DisplayPlacementOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    public c8 getExtOrBuilder() {
        return getExt();
    }

    public VideoPlacementOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        getSerializedSize();
        if (!getTagidBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.tagid_);
        }
        int i = this.ssai_;
        if (i != 0) {
            wVar.T(2, i);
        }
        if (!getSdkBytes().isEmpty()) {
            y4.writeString(wVar, 3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            y4.writeString(wVar, 4, this.sdkver_);
        }
        boolean z = this.reward_;
        if (z) {
            wVar.A(5, z);
        }
        int iL = 0;
        while (iL < this.bcat_.size()) {
            iL = z.l(this.bcat_, iL, wVar, 6, iL, 1);
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            wVar.K(7, this.cattax_);
        }
        int iL2 = 0;
        while (iL2 < this.badv_.size()) {
            iL2 = z.l(this.badv_, iL2, wVar, 9, iL2, 1);
        }
        int iL3 = 0;
        while (iL3 < this.bapp_.size()) {
            iL3 = z.l(this.bapp_, iL3, wVar, 10, iL3, 1);
        }
        if (getBattrList().size() > 0) {
            wVar.U(90);
            wVar.U(this.battrMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.battr_.size(); i2++) {
            wVar.L(this.battr_.get(i2).intValue());
        }
        int iL4 = 0;
        while (iL4 < this.wlang_.size()) {
            iL4 = z.l(this.wlang_, iL4, wVar, 12, iL4, 1);
        }
        boolean z2 = this.secure_;
        if (z2) {
            wVar.A(13, z2);
        }
        boolean z3 = this.admx_;
        if (z3) {
            wVar.A(14, z3);
        }
        boolean z4 = this.curlx_;
        if (z4) {
            wVar.A(15, z4);
        }
        if (this.display_ != null) {
            wVar.M(16, getDisplay());
        }
        if (this.video_ != null) {
            wVar.M(17, getVideo());
        }
        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
            wVar.M(19, this.extProto_.get(i3));
        }
        if (this.ext_ != null) {
            wVar.M(20, getExt());
        }
        this.unknownFields.writeTo(wVar);
    }

    /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
    public j7 m268getBadvList() {
        return this.badv_;
    }

    /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
    public j7 m269getBappList() {
        return this.bapp_;
    }

    /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
    public j7 m270getBcatList() {
        return this.bcat_;
    }

    /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
    public j7 m271getWlangList() {
        return this.wlang_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Placement mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Placement) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString, o3Var);
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr);
    }

    public static Placement parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr, o3Var);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) y4.parseWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (Placement) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static Placement parseFrom(r rVar) throws IOException {
        return (Placement) y4.parseWithIOException(PARSER, rVar);
    }

    public static Placement parseFrom(r rVar, o3 o3Var) throws IOException {
        return (Placement) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private Placement(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.tagid_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        r5 r5Var = r5.c;
        this.bcat_ = r5Var;
        this.cattax_ = 0;
        this.badv_ = r5Var;
        this.bapp_ = r5Var;
        List list = Collections.EMPTY_LIST;
        this.battr_ = list;
        this.wlang_ = r5Var;
        this.extProto_ = list;
    }
}
