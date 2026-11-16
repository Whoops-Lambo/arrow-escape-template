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
import com.explorestack.protobuf.g5;
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
import com.explorestack.protobuf.z4;
import com.ironsource.C5073y1;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class Context extends y4 implements d {
    public static final int APP_FIELD_NUMBER = 1;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int EXT_PROTO_FIELD_NUMBER = 6;
    public static final int REGS_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int USER_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private Regs regs_;
    private Restrictions restrictions_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.1
        @Override // com.explorestack.protobuf.g7
        public Context parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new Context(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class App extends y4 implements AppOrBuilder {
        public static final int BUNDLE_FIELD_NUMBER = 12;
        public static final int CATTAX_FIELD_NUMBER = 9;
        public static final int CAT_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 4;
        public static final int DOMAIN_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 18;
        public static final int EXT_PROTO_FIELD_NUMBER = 17;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAGECAT_FIELD_NUMBER = 8;
        public static final int PAID_FIELD_NUMBER = 16;
        public static final int PRIVPOLICY_FIELD_NUMBER = 10;
        public static final int PUB_FIELD_NUMBER = 3;
        public static final int RELEASE_FIELD_NUMBER = 19;
        public static final int SECTCAT_FIELD_NUMBER = 7;
        public static final int STOREID_FIELD_NUMBER = 13;
        public static final int STOREURL_FIELD_NUMBER = 14;
        public static final int VER_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private volatile Object bundle_;
        private s5 cat_;
        private int cattax_;
        private Content content_;
        private volatile Object domain_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private s5 pagecat_;
        private boolean paid_;
        private boolean privpolicy_;
        private Publisher pub_;
        private Release release_;
        private s5 sectcat_;
        private volatile Object storeid_;
        private volatile Object storeurl_;
        private volatile Object ver_;
        private static final App DEFAULT_INSTANCE = new App();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.1
            @Override // com.explorestack.protobuf.g7
            public App parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new App(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements AppOrBuilder {
            private int bitField0_;
            private Object bundle_;
            private s5 cat_;
            private int cattax_;
            private v7 contentBuilder_;
            private Content content_;
            private Object domain_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object keywords_;
            private Object name_;
            private s5 pagecat_;
            private boolean paid_;
            private boolean privpolicy_;
            private v7 pubBuilder_;
            private Publisher pub_;
            private v7 releaseBuilder_;
            private Release release_;
            private s5 sectcat_;
            private Object storeid_;
            private Object storeurl_;
            private Object ver_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                r5 r5Var = r5.c;
                this.cat_ = r5Var;
                this.sectcat_ = r5Var;
                this.pagecat_ = r5Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPaid() {
                this.paid_ = false;
                onChanged();
                return this;
            }

            public Builder clearPrivpolicy() {
                this.privpolicy_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureCatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cat_ = new r5(this.cat_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensurePagecatIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.pagecat_ = new r5(this.pagecat_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureSectcatIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.sectcat_ = new r5(this.sectcat_);
                    this.bitField0_ |= 2;
                }
            }

            private v7 getContentFieldBuilder() {
                if (this.contentBuilder_ == null) {
                    this.contentBuilder_ = new v7(getContent(), getParentForChildren(), isClean());
                    this.content_ = null;
                }
                return this.contentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.c;
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
                    this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private v7 getPubFieldBuilder() {
                if (this.pubBuilder_ == null) {
                    this.pubBuilder_ = new v7(getPub(), getParentForChildren(), isClean());
                    this.pub_ = null;
                }
                return this.pubBuilder_;
            }

            private v7 getReleaseFieldBuilder() {
                if (this.releaseBuilder_ == null) {
                    this.releaseBuilder_ = new v7(getRelease(), getParentForChildren(), isClean());
                    this.release_ = null;
                }
                return this.releaseBuilder_;
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
            public App buildPartial() {
                App app = new App(this);
                app.id_ = this.id_;
                app.name_ = this.name_;
                v7 v7Var = this.pubBuilder_;
                if (v7Var == null) {
                    app.pub_ = this.pub_;
                } else {
                    app.pub_ = (Publisher) v7Var.a();
                }
                v7 v7Var2 = this.contentBuilder_;
                if (v7Var2 == null) {
                    app.content_ = this.content_;
                } else {
                    app.content_ = (Content) v7Var2.a();
                }
                app.domain_ = this.domain_;
                if ((this.bitField0_ & 1) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                app.cat_ = this.cat_;
                if ((this.bitField0_ & 2) != 0) {
                    this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                app.sectcat_ = this.sectcat_;
                if ((this.bitField0_ & 4) != 0) {
                    this.pagecat_ = this.pagecat_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                app.pagecat_ = this.pagecat_;
                app.cattax_ = this.cattax_;
                app.privpolicy_ = this.privpolicy_;
                app.keywords_ = this.keywords_;
                app.bundle_ = this.bundle_;
                app.storeid_ = this.storeid_;
                app.storeurl_ = this.storeurl_;
                app.ver_ = this.ver_;
                app.paid_ = this.paid_;
                v7 v7Var3 = this.releaseBuilder_;
                if (v7Var3 == null) {
                    app.release_ = this.release_;
                } else {
                    app.release_ = (Release) v7Var3.a();
                }
                v7 v7Var4 = this.extBuilder_;
                if (v7Var4 == null) {
                    app.ext_ = this.ext_;
                } else {
                    app.ext_ = (Struct) v7Var4.a();
                }
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    app.extProto_ = this.extProto_;
                } else {
                    app.extProto_ = o7Var.f();
                }
                onBuilt();
                return app;
            }

            public Builder clearCat() {
                this.cat_ = r5.c;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContent() {
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                    onChanged();
                    return this;
                }
                this.content_ = null;
                this.contentBuilder_ = null;
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
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearPagecat() {
                this.pagecat_ = r5.c;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPub() {
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                    onChanged();
                    return this;
                }
                this.pub_ = null;
                this.pubBuilder_ = null;
                return this;
            }

            public Builder clearRelease() {
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                    onChanged();
                    return this;
                }
                this.release_ = null;
                this.releaseBuilder_ = null;
                return this;
            }

            public Builder clearSectcat() {
                this.sectcat_ = r5.c;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public j7 getCatList() {
                return this.cat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Content getContent() {
                v7 v7Var = this.contentBuilder_;
                if (v7Var != null) {
                    return (Content) v7Var.d();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ContentOrBuilder getContentOrBuilder() {
                v7 v7Var = this.contentBuilder_;
                if (v7Var != null) {
                    return (ContentOrBuilder) v7Var.e();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.c;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getPagecat(int i) {
                return (String) this.pagecat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getPagecatBytes(int i) {
                return this.pagecat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getPagecatCount() {
                return this.pagecat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public j7 getPagecatList() {
                return this.pagecat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPaid() {
                return this.paid_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPrivpolicy() {
                return this.privpolicy_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Publisher getPub() {
                v7 v7Var = this.pubBuilder_;
                if (v7Var != null) {
                    return (Publisher) v7Var.d();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public PublisherOrBuilder getPubOrBuilder() {
                v7 v7Var = this.pubBuilder_;
                if (v7Var != null) {
                    return (PublisherOrBuilder) v7Var.e();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Release getRelease() {
                v7 v7Var = this.releaseBuilder_;
                if (v7Var != null) {
                    return (Release) v7Var.d();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ReleaseOrBuilder getReleaseOrBuilder() {
                v7 v7Var = this.releaseBuilder_;
                if (v7Var != null) {
                    return (ReleaseOrBuilder) v7Var.e();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getSectcat(int i) {
                return (String) this.sectcat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getSectcatBytes(int i) {
                return this.sectcat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getSectcatCount() {
                return this.sectcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public j7 getSectcatList() {
                return this.sectcat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreid() {
                Object obj = this.storeid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreidBytes() {
                Object obj = this.storeid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreurl() {
                Object obj = this.storeurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreurlBytes() {
                Object obj = this.storeurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getVer() {
                Object obj = this.ver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ver_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getVerBytes() {
                Object obj = this.ver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ver_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasContent() {
                return (this.contentBuilder_ == null && this.content_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasPub() {
                return (this.pubBuilder_ == null && this.pub_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasRelease() {
                return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.d;
                w4Var.c(App.class, Builder.class);
                return w4Var;
            }

            public Builder mergeContent(Content content) {
                v7 v7Var = this.contentBuilder_;
                if (v7Var != null) {
                    v7Var.f(content);
                    return this;
                }
                Content content2 = this.content_;
                if (content2 != null) {
                    this.content_ = Content.newBuilder(content2).mergeFrom(content).buildPartial();
                } else {
                    this.content_ = content;
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

            public Builder mergePub(Publisher publisher) {
                v7 v7Var = this.pubBuilder_;
                if (v7Var != null) {
                    v7Var.f(publisher);
                    return this;
                }
                Publisher publisher2 = this.pub_;
                if (publisher2 != null) {
                    this.pub_ = Publisher.newBuilder(publisher2).mergeFrom(publisher).buildPartial();
                } else {
                    this.pub_ = publisher;
                }
                onChanged();
                return this;
            }

            public Builder mergeRelease(Release release) {
                v7 v7Var = this.releaseBuilder_;
                if (v7Var != null) {
                    v7Var.f(release);
                    return this;
                }
                Release release2 = this.release_;
                if (release2 != null) {
                    this.release_ = Release.newBuilder(release2).mergeFrom(release).buildPartial();
                } else {
                    this.release_ = release;
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

            public Builder setCattaxValue(int i) {
                this.cattax_ = i;
                onChanged();
                return this;
            }

            public Builder setContent(Content.Builder builder) {
                v7 v7Var = this.contentBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.content_ = builder.build();
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

            public Builder setPaid(boolean z) {
                this.paid_ = z;
                onChanged();
                return this;
            }

            public Builder setPrivpolicy(boolean z) {
                this.privpolicy_ = z;
                onChanged();
                return this;
            }

            public Builder setPub(Publisher.Builder builder) {
                v7 v7Var = this.pubBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.pub_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setRelease(Release.Builder builder) {
                v7 v7Var = this.releaseBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.release_ = builder.build();
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllCat(Iterable<String> iterable) {
                ensureCatIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.cat_);
                onChanged();
                return this;
            }

            public Builder addAllPagecat(Iterable<String> iterable) {
                ensurePagecatIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.pagecat_);
                onChanged();
                return this;
            }

            public Builder addAllSectcat(Iterable<String> iterable) {
                ensureSectcatIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.sectcat_);
                onChanged();
                return this;
            }

            public Builder addCat(String str) {
                str.getClass();
                ensureCatIsMutable();
                this.cat_.add(str);
                onChanged();
                return this;
            }

            public Builder addCatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensureCatIsMutable();
                this.cat_.b(byteString);
                onChanged();
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addPagecat(String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.add(str);
                onChanged();
                return this;
            }

            public Builder addPagecatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensurePagecatIsMutable();
                this.pagecat_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addSectcat(String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.add(str);
                onChanged();
                return this;
            }

            public Builder addSectcatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                ensureSectcatIsMutable();
                this.sectcat_.b(byteString);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public App build() {
                App appBuildPartial = buildPartial();
                if (appBuildPartial.isInitialized()) {
                    return appBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.name_ = "";
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                } else {
                    this.pub_ = null;
                    this.pubBuilder_ = null;
                }
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                } else {
                    this.content_ = null;
                    this.contentBuilder_ = null;
                }
                this.domain_ = "";
                r5 r5Var = r5.c;
                this.cat_ = r5Var;
                int i = this.bitField0_;
                this.sectcat_ = r5Var;
                this.pagecat_ = r5Var;
                this.bitField0_ = i & (-8);
                this.cattax_ = 0;
                this.privpolicy_ = false;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.paid_ = false;
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                } else {
                    this.release_ = null;
                    this.releaseBuilder_ = null;
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
                    this.bitField0_ = i & (-16);
                    return this;
                }
                o7Var.g();
                return this;
            }

            public Builder clearBundle() {
                this.bundle_ = App.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder clearDomain() {
                this.domain_ = App.getDefaultInstance().getDomain();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = App.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = App.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = App.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearStoreid() {
                this.storeid_ = App.getDefaultInstance().getStoreid();
                onChanged();
                return this;
            }

            public Builder clearStoreurl() {
                this.storeurl_ = App.getDefaultInstance().getStoreurl();
                onChanged();
                return this;
            }

            public Builder clearVer() {
                this.ver_ = App.getDefaultInstance().getVer();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Content.Builder getContentBuilder() {
                onChanged();
                return (Content.Builder) getContentFieldBuilder().c();
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

            public Publisher.Builder getPubBuilder() {
                onChanged();
                return (Publisher.Builder) getPubFieldBuilder().c();
            }

            public Release.Builder getReleaseBuilder() {
                onChanged();
                return (Release.Builder) getReleaseFieldBuilder().c();
            }

            public Builder mergeFrom(App app) {
                if (app == App.getDefaultInstance()) {
                    return this;
                }
                if (!app.getId().isEmpty()) {
                    this.id_ = app.id_;
                    onChanged();
                }
                if (!app.getName().isEmpty()) {
                    this.name_ = app.name_;
                    onChanged();
                }
                if (app.hasPub()) {
                    mergePub(app.getPub());
                }
                if (app.hasContent()) {
                    mergeContent(app.getContent());
                }
                if (!app.getDomain().isEmpty()) {
                    this.domain_ = app.domain_;
                    onChanged();
                }
                if (!app.cat_.isEmpty()) {
                    if (this.cat_.isEmpty()) {
                        this.cat_ = app.cat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCatIsMutable();
                        this.cat_.addAll(app.cat_);
                    }
                    onChanged();
                }
                if (!app.sectcat_.isEmpty()) {
                    if (this.sectcat_.isEmpty()) {
                        this.sectcat_ = app.sectcat_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSectcatIsMutable();
                        this.sectcat_.addAll(app.sectcat_);
                    }
                    onChanged();
                }
                if (!app.pagecat_.isEmpty()) {
                    if (this.pagecat_.isEmpty()) {
                        this.pagecat_ = app.pagecat_;
                        this.bitField0_ &= -5;
                    } else {
                        ensurePagecatIsMutable();
                        this.pagecat_.addAll(app.pagecat_);
                    }
                    onChanged();
                }
                if (app.cattax_ != 0) {
                    setCattaxValue(app.getCattaxValue());
                }
                if (app.getPrivpolicy()) {
                    setPrivpolicy(app.getPrivpolicy());
                }
                if (!app.getKeywords().isEmpty()) {
                    this.keywords_ = app.keywords_;
                    onChanged();
                }
                if (!app.getBundle().isEmpty()) {
                    this.bundle_ = app.bundle_;
                    onChanged();
                }
                if (!app.getStoreid().isEmpty()) {
                    this.storeid_ = app.storeid_;
                    onChanged();
                }
                if (!app.getStoreurl().isEmpty()) {
                    this.storeurl_ = app.storeurl_;
                    onChanged();
                }
                if (!app.getVer().isEmpty()) {
                    this.ver_ = app.ver_;
                    onChanged();
                }
                if (app.getPaid()) {
                    setPaid(app.getPaid());
                }
                if (app.hasRelease()) {
                    mergeRelease(app.getRelease());
                }
                if (app.hasExt()) {
                    mergeExt(app.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!app.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = app.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(app.extProto_);
                        }
                        onChanged();
                    }
                } else if (!app.extProto_.isEmpty()) {
                    boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var = this.extProtoBuilder_;
                    if (zIsEmpty) {
                        o7 extProtoFieldBuilder = null;
                        o7Var.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = app.extProto_;
                        this.bitField0_ &= -9;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var.a(app.extProto_);
                    }
                }
                mergeUnknownFields(((y4) app).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setBundle(String str) {
                str.getClass();
                this.bundle_ = str;
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCat(int i, String str) {
                str.getClass();
                ensureCatIsMutable();
                this.cat_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                categoryTaxonomy.getClass();
                this.cattax_ = categoryTaxonomy.getNumber();
                onChanged();
                return this;
            }

            public Builder setDomain(String str) {
                str.getClass();
                this.domain_ = str;
                onChanged();
                return this;
            }

            public Builder setDomainBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.domain_ = byteString;
                onChanged();
                return this;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
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
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPagecat(int i, String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setSectcat(int i, String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setStoreid(String str) {
                str.getClass();
                this.storeid_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreidBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.storeid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStoreurl(String str) {
                str.getClass();
                this.storeurl_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.storeurl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVer(String str) {
                str.getClass();
                this.ver_ = str;
                onChanged();
                return this;
            }

            public Builder setVerBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.ver_ = byteString;
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
            public App mo250getDefaultInstanceForType() {
                return App.getDefaultInstance();
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

            public Builder setContent(Content content) {
                v7 v7Var = this.contentBuilder_;
                if (v7Var == null) {
                    content.getClass();
                    this.content_ = content;
                    onChanged();
                    return this;
                }
                v7Var.h(content);
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

            public Builder setPub(Publisher publisher) {
                v7 v7Var = this.pubBuilder_;
                if (v7Var == null) {
                    publisher.getClass();
                    this.pub_ = publisher;
                    onChanged();
                    return this;
                }
                v7Var.h(publisher);
                return this;
            }

            public Builder setRelease(Release release) {
                v7 v7Var = this.releaseBuilder_;
                if (v7Var == null) {
                    release.getClass();
                    this.release_ = release;
                    onChanged();
                    return this;
                }
                v7Var.h(release);
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

            private Builder(h4 h4Var) {
                super(h4Var);
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                r5 r5Var = r5.c;
                this.cat_ = r5Var;
                this.sectcat_ = r5Var;
                this.pagecat_ = r5Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof App) {
                    return mergeFrom((App) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                App app = null;
                try {
                    try {
                        App app2 = (App) App.PARSER.parsePartialFrom(rVar, o3Var);
                        if (app2 != null) {
                            mergeFrom(app2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        App app3 = (App) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            app = app3;
                            if (app != null) {
                                mergeFrom(app);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (app != null) {
                        mergeFrom(app);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Content extends y4 implements ContentOrBuilder {
            public static final int ALBUM_FIELD_NUMBER = 8;
            public static final int ARTIST_FIELD_NUMBER = 6;
            public static final int CATTAX_FIELD_NUMBER = 12;
            public static final int CAT_FIELD_NUMBER = 11;
            public static final int CONTEXT_FIELD_NUMBER = 14;
            public static final int DATA_FIELD_NUMBER = 25;
            public static final int EMBED_FIELD_NUMBER = 23;
            public static final int EPISODE_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 27;
            public static final int EXT_PROTO_FIELD_NUMBER = 26;
            public static final int GENRE_FIELD_NUMBER = 7;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ISRC_FIELD_NUMBER = 9;
            public static final int KEYWORDS_FIELD_NUMBER = 18;
            public static final int LANG_FIELD_NUMBER = 22;
            public static final int LEN_FIELD_NUMBER = 21;
            public static final int LIVE_FIELD_NUMBER = 19;
            public static final int MRATING_FIELD_NUMBER = 17;
            public static final int PRODQ_FIELD_NUMBER = 13;
            public static final int PRODUCER_FIELD_NUMBER = 24;
            public static final int RATING_FIELD_NUMBER = 15;
            public static final int SEASON_FIELD_NUMBER = 5;
            public static final int SERIES_FIELD_NUMBER = 4;
            public static final int SRCREL_FIELD_NUMBER = 20;
            public static final int TITLE_FIELD_NUMBER = 3;
            public static final int URATING_FIELD_NUMBER = 16;
            public static final int URL_FIELD_NUMBER = 10;
            private static final long serialVersionUID = 0;
            private volatile Object album_;
            private volatile Object artist_;
            private s5 cat_;
            private int cattax_;
            private int context_;
            private List<Data> data_;
            private boolean embed_;
            private int episode_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object genre_;
            private volatile Object id_;
            private volatile Object isrc_;
            private volatile Object keywords_;
            private volatile Object lang_;
            private int len_;
            private boolean live_;
            private byte memoizedIsInitialized;
            private int mrating_;
            private int prodq_;
            private Producer producer_;
            private volatile Object rating_;
            private volatile Object season_;
            private volatile Object series_;
            private int srcrel_;
            private volatile Object title_;
            private volatile Object urating_;
            private volatile Object url_;
            private static final Content DEFAULT_INSTANCE = new Content();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.1
                @Override // com.explorestack.protobuf.g7
                public Content parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Content(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements ContentOrBuilder {
                private Object album_;
                private Object artist_;
                private int bitField0_;
                private s5 cat_;
                private int cattax_;
                private int context_;
                private o7 dataBuilder_;
                private List<Data> data_;
                private boolean embed_;
                private int episode_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object genre_;
                private Object id_;
                private Object isrc_;
                private Object keywords_;
                private Object lang_;
                private int len_;
                private boolean live_;
                private int mrating_;
                private int prodq_;
                private v7 producerBuilder_;
                private Producer producer_;
                private Object rating_;
                private Object season_;
                private Object series_;
                private int srcrel_;
                private Object title_;
                private Object urating_;
                private Object url_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = r5.c;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearContext() {
                    this.context_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearEmbed() {
                    this.embed_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearEpisode() {
                    this.episode_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLen() {
                    this.len_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLive() {
                    this.live_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearMrating() {
                    this.mrating_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProdq() {
                    this.prodq_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSrcrel() {
                    this.srcrel_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new r5(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureDataIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.data_ = new ArrayList(this.data_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                private o7 getDataFieldBuilder() {
                    if (this.dataBuilder_ == null) {
                        this.dataBuilder_ = new o7(this.data_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    return this.dataBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.g;
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
                        this.extProtoBuilder_ = new o7(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private v7 getProducerFieldBuilder() {
                    if (this.producerBuilder_ == null) {
                        this.producerBuilder_ = new v7(getProducer(), getParentForChildren(), isClean());
                        this.producer_ = null;
                    }
                    return this.producerBuilder_;
                }

                public Builder addAllData(Iterable<? extends Data> iterable) {
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var != null) {
                        o7Var.a(iterable);
                        return this;
                    }
                    ensureDataIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.data_);
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

                public Builder addData(Data.Builder builder) {
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
                public Content buildPartial() {
                    Content content = new Content(this);
                    content.id_ = this.id_;
                    content.episode_ = this.episode_;
                    content.title_ = this.title_;
                    content.series_ = this.series_;
                    content.season_ = this.season_;
                    content.artist_ = this.artist_;
                    content.genre_ = this.genre_;
                    content.album_ = this.album_;
                    content.isrc_ = this.isrc_;
                    content.url_ = this.url_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    content.cat_ = this.cat_;
                    content.cattax_ = this.cattax_;
                    content.prodq_ = this.prodq_;
                    content.context_ = this.context_;
                    content.rating_ = this.rating_;
                    content.urating_ = this.urating_;
                    content.mrating_ = this.mrating_;
                    content.keywords_ = this.keywords_;
                    content.live_ = this.live_;
                    content.srcrel_ = this.srcrel_;
                    content.len_ = this.len_;
                    content.lang_ = this.lang_;
                    content.embed_ = this.embed_;
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var == null) {
                        content.producer_ = this.producer_;
                    } else {
                        content.producer_ = (Producer) v7Var.a();
                    }
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.data_ = Collections.unmodifiableList(this.data_);
                            this.bitField0_ &= -3;
                        }
                        content.data_ = this.data_;
                    } else {
                        content.data_ = o7Var.f();
                    }
                    v7 v7Var2 = this.extBuilder_;
                    if (v7Var2 == null) {
                        content.ext_ = this.ext_;
                    } else {
                        content.ext_ = (Struct) v7Var2.a();
                    }
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (o7Var2 == null) {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        content.extProto_ = this.extProto_;
                    } else {
                        content.extProto_ = o7Var2.f();
                    }
                    onBuilt();
                    return content;
                }

                public Builder clearCat() {
                    this.cat_ = r5.c;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearData() {
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var != null) {
                        o7Var.g();
                        return this;
                    }
                    this.data_ = Collections.EMPTY_LIST;
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
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearProducer() {
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                        onChanged();
                        return this;
                    }
                    this.producer_ = null;
                    this.producerBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getAlbum() {
                    Object obj = this.album_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.album_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getAlbumBytes() {
                    Object obj = this.album_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.album_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getArtist() {
                    Object obj = this.artist_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.artist_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getArtistBytes() {
                    Object obj = this.artist_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.artist_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public j7 getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ContentContext getContext() {
                    ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                    return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getContextValue() {
                    return this.context_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Data getData(int i) {
                    o7 o7Var = this.dataBuilder_;
                    return o7Var == null ? this.data_.get(i) : (Data) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getDataCount() {
                    o7 o7Var = this.dataBuilder_;
                    return o7Var == null ? this.data_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Data> getDataList() {
                    o7 o7Var = this.dataBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.data_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public DataOrBuilder getDataOrBuilder(int i) {
                    o7 o7Var = this.dataBuilder_;
                    return o7Var == null ? this.data_.get(i) : (DataOrBuilder) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends DataOrBuilder> getDataOrBuilderList() {
                    o7 o7Var = this.dataBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.data_);
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.g;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getEmbed() {
                    return this.embed_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getEpisode() {
                    return this.episode_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getGenre() {
                    Object obj = this.genre_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.genre_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getGenreBytes() {
                    Object obj = this.genre_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.genre_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getIsrc() {
                    Object obj = this.isrc_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.isrc_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIsrcBytes() {
                    Object obj = this.isrc_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.isrc_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getKeywords() {
                    Object obj = this.keywords_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.keywords_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getKeywordsBytes() {
                    Object obj = this.keywords_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.keywords_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getLang() {
                    Object obj = this.lang_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lang_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getLangBytes() {
                    Object obj = this.lang_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lang_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getLen() {
                    return this.len_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getLive() {
                    return this.live_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public MediaRating getMrating() {
                    MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                    return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getMratingValue() {
                    return this.mrating_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProductionQuality getProdq() {
                    ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                    return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getProdqValue() {
                    return this.prodq_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Producer getProducer() {
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var != null) {
                        return (Producer) v7Var.d();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProducerOrBuilder getProducerOrBuilder() {
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var != null) {
                        return (ProducerOrBuilder) v7Var.e();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getRating() {
                    Object obj = this.rating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.rating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getRatingBytes() {
                    Object obj = this.rating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.rating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeason() {
                    Object obj = this.season_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.season_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeasonBytes() {
                    Object obj = this.season_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.season_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeries() {
                    Object obj = this.series_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.series_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeriesBytes() {
                    Object obj = this.series_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.series_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getSrcrel() {
                    return this.srcrel_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.title_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrating() {
                    Object obj = this.urating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUratingBytes() {
                    Object obj = this.urating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasProducer() {
                    return (this.producerBuilder_ == null && this.producer_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.h;
                    w4Var.c(Content.class, Builder.class);
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

                public Builder mergeProducer(Producer producer) {
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var != null) {
                        v7Var.f(producer);
                        return this;
                    }
                    Producer producer2 = this.producer_;
                    if (producer2 != null) {
                        this.producer_ = Producer.newBuilder(producer2).mergeFrom(producer).buildPartial();
                    } else {
                        this.producer_ = producer;
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

                public Builder setCattaxValue(int i) {
                    this.cattax_ = i;
                    onChanged();
                    return this;
                }

                public Builder setContextValue(int i) {
                    this.context_ = i;
                    onChanged();
                    return this;
                }

                public Builder setData(int i, Data.Builder builder) {
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

                public Builder setEmbed(boolean z) {
                    this.embed_ = z;
                    onChanged();
                    return this;
                }

                public Builder setEpisode(int i) {
                    this.episode_ = i;
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

                public Builder setLive(boolean z) {
                    this.live_ = z;
                    onChanged();
                    return this;
                }

                public Builder setMratingValue(int i) {
                    this.mrating_ = i;
                    onChanged();
                    return this;
                }

                public Builder setProdqValue(int i) {
                    this.prodq_ = i;
                    onChanged();
                    return this;
                }

                public Builder setProducer(Producer.Builder builder) {
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var != null) {
                        v7Var.h(builder.build());
                        return this;
                    }
                    this.producer_ = builder.build();
                    onChanged();
                    return this;
                }

                public Builder setSrcrel(int i) {
                    this.srcrel_ = i;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getDataFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.cat_);
                    onChanged();
                    return this;
                }

                public Builder addCat(String str) {
                    str.getClass();
                    ensureCatIsMutable();
                    this.cat_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addCatBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    ensureCatIsMutable();
                    this.cat_.b(byteString);
                    onChanged();
                    return this;
                }

                public Data.Builder addDataBuilder() {
                    return (Data.Builder) getDataFieldBuilder().c(Data.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Content build() {
                    Content contentBuildPartial = buildPartial();
                    if (contentBuildPartial.isInitialized()) {
                        return contentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) contentBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.episode_ = 0;
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = r5.c;
                    int i = this.bitField0_;
                    this.bitField0_ = i & (-2);
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.live_ = false;
                    this.srcrel_ = 0;
                    this.len_ = 0;
                    this.lang_ = "";
                    this.embed_ = false;
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                    } else {
                        this.producer_ = null;
                        this.producerBuilder_ = null;
                    }
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var == null) {
                        this.data_ = Collections.EMPTY_LIST;
                        this.bitField0_ = i & (-4);
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
                        this.bitField0_ &= -5;
                        return this;
                    }
                    o7Var2.g();
                    return this;
                }

                public Builder clearAlbum() {
                    this.album_ = Content.getDefaultInstance().getAlbum();
                    onChanged();
                    return this;
                }

                public Builder clearArtist() {
                    this.artist_ = Content.getDefaultInstance().getArtist();
                    onChanged();
                    return this;
                }

                public Builder clearGenre() {
                    this.genre_ = Content.getDefaultInstance().getGenre();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Content.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearIsrc() {
                    this.isrc_ = Content.getDefaultInstance().getIsrc();
                    onChanged();
                    return this;
                }

                public Builder clearKeywords() {
                    this.keywords_ = Content.getDefaultInstance().getKeywords();
                    onChanged();
                    return this;
                }

                public Builder clearLang() {
                    this.lang_ = Content.getDefaultInstance().getLang();
                    onChanged();
                    return this;
                }

                public Builder clearRating() {
                    this.rating_ = Content.getDefaultInstance().getRating();
                    onChanged();
                    return this;
                }

                public Builder clearSeason() {
                    this.season_ = Content.getDefaultInstance().getSeason();
                    onChanged();
                    return this;
                }

                public Builder clearSeries() {
                    this.series_ = Content.getDefaultInstance().getSeries();
                    onChanged();
                    return this;
                }

                public Builder clearTitle() {
                    this.title_ = Content.getDefaultInstance().getTitle();
                    onChanged();
                    return this;
                }

                public Builder clearUrating() {
                    this.urating_ = Content.getDefaultInstance().getUrating();
                    onChanged();
                    return this;
                }

                public Builder clearUrl() {
                    this.url_ = Content.getDefaultInstance().getUrl();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public Data.Builder getDataBuilder(int i) {
                    return (Data.Builder) getDataFieldBuilder().j(i);
                }

                public List<Data.Builder> getDataBuilderList() {
                    return getDataFieldBuilder().k();
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

                public Producer.Builder getProducerBuilder() {
                    onChanged();
                    return (Producer.Builder) getProducerFieldBuilder().c();
                }

                public Builder mergeFrom(Content content) {
                    o7 dataFieldBuilder;
                    if (content == Content.getDefaultInstance()) {
                        return this;
                    }
                    if (!content.getId().isEmpty()) {
                        this.id_ = content.id_;
                        onChanged();
                    }
                    if (content.getEpisode() != 0) {
                        setEpisode(content.getEpisode());
                    }
                    if (!content.getTitle().isEmpty()) {
                        this.title_ = content.title_;
                        onChanged();
                    }
                    if (!content.getSeries().isEmpty()) {
                        this.series_ = content.series_;
                        onChanged();
                    }
                    if (!content.getSeason().isEmpty()) {
                        this.season_ = content.season_;
                        onChanged();
                    }
                    if (!content.getArtist().isEmpty()) {
                        this.artist_ = content.artist_;
                        onChanged();
                    }
                    if (!content.getGenre().isEmpty()) {
                        this.genre_ = content.genre_;
                        onChanged();
                    }
                    if (!content.getAlbum().isEmpty()) {
                        this.album_ = content.album_;
                        onChanged();
                    }
                    if (!content.getIsrc().isEmpty()) {
                        this.isrc_ = content.isrc_;
                        onChanged();
                    }
                    if (!content.getUrl().isEmpty()) {
                        this.url_ = content.url_;
                        onChanged();
                    }
                    if (!content.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = content.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(content.cat_);
                        }
                        onChanged();
                    }
                    if (content.cattax_ != 0) {
                        setCattaxValue(content.getCattaxValue());
                    }
                    if (content.prodq_ != 0) {
                        setProdqValue(content.getProdqValue());
                    }
                    if (content.context_ != 0) {
                        setContextValue(content.getContextValue());
                    }
                    if (!content.getRating().isEmpty()) {
                        this.rating_ = content.rating_;
                        onChanged();
                    }
                    if (!content.getUrating().isEmpty()) {
                        this.urating_ = content.urating_;
                        onChanged();
                    }
                    if (content.mrating_ != 0) {
                        setMratingValue(content.getMratingValue());
                    }
                    if (!content.getKeywords().isEmpty()) {
                        this.keywords_ = content.keywords_;
                        onChanged();
                    }
                    if (content.getLive()) {
                        setLive(content.getLive());
                    }
                    if (content.getSrcrel() != 0) {
                        setSrcrel(content.getSrcrel());
                    }
                    if (content.getLen() != 0) {
                        setLen(content.getLen());
                    }
                    if (!content.getLang().isEmpty()) {
                        this.lang_ = content.lang_;
                        onChanged();
                    }
                    if (content.getEmbed()) {
                        setEmbed(content.getEmbed());
                    }
                    if (content.hasProducer()) {
                        mergeProducer(content.getProducer());
                    }
                    o7 extProtoFieldBuilder = null;
                    if (this.dataBuilder_ == null) {
                        if (!content.data_.isEmpty()) {
                            if (this.data_.isEmpty()) {
                                this.data_ = content.data_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureDataIsMutable();
                                this.data_.addAll(content.data_);
                            }
                            onChanged();
                        }
                    } else if (!content.data_.isEmpty()) {
                        boolean zIsEmpty = this.dataBuilder_.b.isEmpty();
                        o7 o7Var = this.dataBuilder_;
                        if (zIsEmpty) {
                            o7Var.a = null;
                            this.dataBuilder_ = null;
                            this.data_ = content.data_;
                            this.bitField0_ &= -3;
                            if (y4.alwaysUseFieldBuilders) {
                                dataFieldBuilder = getDataFieldBuilder();
                            } else {
                                dataFieldBuilder = null;
                            }
                            this.dataBuilder_ = dataFieldBuilder;
                        } else {
                            o7Var.a(content.data_);
                        }
                    }
                    if (content.hasExt()) {
                        mergeExt(content.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!content.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = content.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(content.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!content.extProto_.isEmpty()) {
                        boolean zIsEmpty2 = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var2 = this.extProtoBuilder_;
                        if (zIsEmpty2) {
                            o7Var2.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = content.extProto_;
                            this.bitField0_ &= -5;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var2.a(content.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) content).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setAlbum(String str) {
                    str.getClass();
                    this.album_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAlbumBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.album_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setArtist(String str) {
                    str.getClass();
                    this.artist_ = str;
                    onChanged();
                    return this;
                }

                public Builder setArtistBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.artist_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setCat(int i, String str) {
                    str.getClass();
                    ensureCatIsMutable();
                    this.cat_.set(i, str);
                    onChanged();
                    return this;
                }

                public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                    categoryTaxonomy.getClass();
                    this.cattax_ = categoryTaxonomy.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setContext(ContentContext contentContext) {
                    contentContext.getClass();
                    this.context_ = contentContext.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setGenre(String str) {
                    str.getClass();
                    this.genre_ = str;
                    onChanged();
                    return this;
                }

                public Builder setGenreBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.genre_ = byteString;
                    onChanged();
                    return this;
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

                public Builder setIsrc(String str) {
                    str.getClass();
                    this.isrc_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIsrcBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.isrc_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setKeywords(String str) {
                    str.getClass();
                    this.keywords_ = str;
                    onChanged();
                    return this;
                }

                public Builder setKeywordsBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.keywords_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLang(String str) {
                    str.getClass();
                    this.lang_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLangBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.lang_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setMrating(MediaRating mediaRating) {
                    mediaRating.getClass();
                    this.mrating_ = mediaRating.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setProdq(ProductionQuality productionQuality) {
                    productionQuality.getClass();
                    this.prodq_ = productionQuality.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setRating(String str) {
                    str.getClass();
                    this.rating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRatingBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.rating_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeason(String str) {
                    str.getClass();
                    this.season_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeasonBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.season_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeries(String str) {
                    str.getClass();
                    this.series_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeriesBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.series_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTitle(String str) {
                    str.getClass();
                    this.title_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.title_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setUrating(String str) {
                    str.getClass();
                    this.urating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setUratingBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.urating_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setUrl(String str) {
                    str.getClass();
                    this.url_ = str;
                    onChanged();
                    return this;
                }

                public Builder setUrlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.url_ = byteString;
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
                public Content mo250getDefaultInstanceForType() {
                    return Content.getDefaultInstance();
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

                public Data.Builder addDataBuilder(int i) {
                    return (Data.Builder) getDataFieldBuilder().b(i, Data.getDefaultInstance());
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

                public Builder setProducer(Producer producer) {
                    v7 v7Var = this.producerBuilder_;
                    if (v7Var == null) {
                        producer.getClass();
                        this.producer_ = producer;
                        onChanged();
                        return this;
                    }
                    v7Var.h(producer);
                    return this;
                }

                public Builder addData(int i, Data data) {
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var == null) {
                        data.getClass();
                        ensureDataIsMutable();
                        this.data_.add(i, data);
                        onChanged();
                        return this;
                    }
                    o7Var.d(i, data);
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

                public Builder setData(int i, Data data) {
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var == null) {
                        data.getClass();
                        ensureDataIsMutable();
                        this.data_.set(i, data);
                        onChanged();
                        return this;
                    }
                    o7Var.s(i, data);
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

                public Builder addData(Data data) {
                    o7 o7Var = this.dataBuilder_;
                    if (o7Var == null) {
                        data.getClass();
                        ensureDataIsMutable();
                        this.data_.add(data);
                        onChanged();
                        return this;
                    }
                    o7Var.e(data);
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

                public Builder addData(int i, Data.Builder builder) {
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
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = r5.c;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Content) {
                        return mergeFrom((Content) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Content content = null;
                    try {
                        try {
                            Content content2 = (Content) Content.PARSER.parsePartialFrom(rVar, o3Var);
                            if (content2 != null) {
                                mergeFrom(content2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Content content3 = (Content) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                content = content3;
                                if (content != null) {
                                    mergeFrom(content);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (content != null) {
                            mergeFrom(content);
                        }
                        throw th;
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Producer extends y4 implements ProducerOrBuilder {
                public static final int CATTAX_FIELD_NUMBER = 5;
                public static final int CAT_FIELD_NUMBER = 4;
                public static final int DOMAIN_FIELD_NUMBER = 3;
                public static final int EXT_FIELD_NUMBER = 7;
                public static final int EXT_PROTO_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int NAME_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private s5 cat_;
                private int cattax_;
                private volatile Object domain_;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object id_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Producer DEFAULT_INSTANCE = new Producer();
                private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.Producer.1
                    @Override // com.explorestack.protobuf.g7
                    public Producer parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                        return new Producer(rVar, o3Var);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                public static final class Builder extends g4 implements ProducerOrBuilder {
                    private int bitField0_;
                    private s5 cat_;
                    private int cattax_;
                    private Object domain_;
                    private v7 extBuilder_;
                    private o7 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object id_;
                    private Object name_;

                    private Builder() {
                        super(null);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = r5.c;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder clearCattax() {
                        this.cattax_ = 0;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    private void ensureCatIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.cat_ = new r5(this.cat_);
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
                        return b.i;
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
                    public Producer buildPartial() {
                        Producer producer = new Producer(this);
                        producer.id_ = this.id_;
                        producer.name_ = this.name_;
                        producer.domain_ = this.domain_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        producer.cat_ = this.cat_;
                        producer.cattax_ = this.cattax_;
                        v7 v7Var = this.extBuilder_;
                        if (v7Var == null) {
                            producer.ext_ = this.ext_;
                        } else {
                            producer.ext_ = (Struct) v7Var.a();
                        }
                        o7 o7Var = this.extProtoBuilder_;
                        if (o7Var == null) {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            producer.extProto_ = this.extProto_;
                        } else {
                            producer.extProto_ = o7Var.f();
                        }
                        onBuilt();
                        return producer;
                    }

                    public Builder clearCat() {
                        this.cat_ = r5.c;
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

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getCat(int i) {
                        return (String) this.cat_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getCatBytes(int i) {
                        return this.cat_.getByteString(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCatCount() {
                        return this.cat_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public j7 getCatList() {
                        return this.cat_.getUnmodifiableView();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public CategoryTaxonomy getCattax() {
                        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCattaxValue() {
                        return this.cattax_;
                    }

                    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.i;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getDomain() {
                        Object obj = this.domain_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.domain_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getDomainBytes() {
                        Object obj = this.domain_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.domain_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public Struct getExt() {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            return (Struct) v7Var.d();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public c8 getExtOrBuilder() {
                        v7 v7Var = this.extBuilder_;
                        if (v7Var != null) {
                            return (c8) v7Var.e();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public Any getExtProto(int i) {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getExtProtoCount() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<Any> getExtProtoList() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public g getExtProtoOrBuilder(int i) {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        o7 o7Var = this.extProtoBuilder_;
                        return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getId() {
                        Object obj = this.id_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.id_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getIdBytes() {
                        Object obj = this.id_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.id_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.g4
                    public w4 internalGetFieldAccessorTable() {
                        w4 w4Var = b.j;
                        w4Var.c(Producer.class, Builder.class);
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

                    public Builder setCattaxValue(int i) {
                        this.cattax_ = i;
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
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllCat(Iterable<String> iterable) {
                        ensureCatIsMutable();
                        com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.cat_);
                        onChanged();
                        return this;
                    }

                    public Builder addCat(String str) {
                        str.getClass();
                        ensureCatIsMutable();
                        this.cat_.add(str);
                        onChanged();
                        return this;
                    }

                    public Builder addCatBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                        ensureCatIsMutable();
                        this.cat_.b(byteString);
                        onChanged();
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Producer build() {
                        Producer producerBuildPartial = buildPartial();
                        if (producerBuildPartial.isInitialized()) {
                            return producerBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) producerBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = r5.c;
                        int i = this.bitField0_;
                        this.bitField0_ = i & (-2);
                        this.cattax_ = 0;
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

                    public Builder clearDomain() {
                        this.domain_ = Producer.getDefaultInstance().getDomain();
                        onChanged();
                        return this;
                    }

                    public Builder clearId() {
                        this.id_ = Producer.getDefaultInstance().getId();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Producer.getDefaultInstance().getName();
                        onChanged();
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

                    public Builder mergeFrom(Producer producer) {
                        if (producer == Producer.getDefaultInstance()) {
                            return this;
                        }
                        if (!producer.getId().isEmpty()) {
                            this.id_ = producer.id_;
                            onChanged();
                        }
                        if (!producer.getName().isEmpty()) {
                            this.name_ = producer.name_;
                            onChanged();
                        }
                        if (!producer.getDomain().isEmpty()) {
                            this.domain_ = producer.domain_;
                            onChanged();
                        }
                        if (!producer.cat_.isEmpty()) {
                            if (this.cat_.isEmpty()) {
                                this.cat_ = producer.cat_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureCatIsMutable();
                                this.cat_.addAll(producer.cat_);
                            }
                            onChanged();
                        }
                        if (producer.cattax_ != 0) {
                            setCattaxValue(producer.getCattaxValue());
                        }
                        if (producer.hasExt()) {
                            mergeExt(producer.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!producer.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = producer.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(producer.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!producer.extProto_.isEmpty()) {
                            boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                            o7 o7Var = this.extProtoBuilder_;
                            if (zIsEmpty) {
                                o7 extProtoFieldBuilder = null;
                                o7Var.a = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = producer.extProto_;
                                this.bitField0_ &= -3;
                                if (y4.alwaysUseFieldBuilders) {
                                    extProtoFieldBuilder = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = extProtoFieldBuilder;
                            } else {
                                o7Var.a(producer.extProto_);
                            }
                        }
                        mergeUnknownFields(((y4) producer).unknownFields);
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public final Builder mergeUnknownFields(s8 s8Var) {
                        return (Builder) super.mergeUnknownFields(s8Var);
                    }

                    public Builder setCat(int i, String str) {
                        str.getClass();
                        ensureCatIsMutable();
                        this.cat_.set(i, str);
                        onChanged();
                        return this;
                    }

                    public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                        categoryTaxonomy.getClass();
                        this.cattax_ = categoryTaxonomy.getNumber();
                        onChanged();
                        return this;
                    }

                    public Builder setDomain(String str) {
                        str.getClass();
                        this.domain_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDomainBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                        this.domain_ = byteString;
                        onChanged();
                        return this;
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

                    public Builder setName(String str) {
                        str.getClass();
                        this.name_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
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
                    public Producer mo250getDefaultInstanceForType() {
                        return Producer.getDefaultInstance();
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

                    private Builder(h4 h4Var) {
                        super(h4Var);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = r5.c;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
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
                        if (message instanceof Producer) {
                            return mergeFrom((Producer) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                        Producer producer = null;
                        try {
                            try {
                                Producer producer2 = (Producer) Producer.PARSER.parsePartialFrom(rVar, o3Var);
                                if (producer2 != null) {
                                    mergeFrom(producer2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Producer producer3 = (Producer) e.getUnfinishedMessage();
                                try {
                                    throw e.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    producer = producer3;
                                    if (producer != null) {
                                        mergeFrom(producer);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (producer != null) {
                                mergeFrom(producer);
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
                    if (!(obj instanceof Producer)) {
                        return super.equals(obj);
                    }
                    Producer producer = (Producer) obj;
                    if (getId().equals(producer.getId()) && getName().equals(producer.getName()) && getDomain().equals(producer.getDomain()) && getCatList().equals(producer.getCatList()) && this.cattax_ == producer.cattax_ && hasExt() == producer.hasExt()) {
                        return (!hasExt() || getExt().equals(producer.getExt())) && getExtProtoList().equals(producer.getExtProtoList()) && this.unknownFields.equals(producer.unknownFields);
                    }
                    return false;
                }

                public static Producer getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.i;
                }

                public static Builder newBuilder(Producer producer) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(producer);
                }

                public static Producer parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Producer) y4.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer);
                }

                public static g7 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
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
                    int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
                    if (!getNameBytes().isEmpty()) {
                        iComputeStringSize += y4.computeStringSize(2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        iComputeStringSize += y4.computeStringSize(3, this.domain_);
                    }
                    int iK = 0;
                    for (int i2 = 0; i2 < this.cat_.size(); i2++) {
                        iK = z.k(this.cat_, i2, iK);
                    }
                    int size = getCatList().size() + iComputeStringSize + iK;
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        size += w.g(5, this.cattax_);
                    }
                    for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                        size += w.o(6, this.extProto_.get(i3));
                    }
                    if (this.ext_ != null) {
                        size += w.o(7, getExt());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + size;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final s8 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = getDomain().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                    if (getCatCount() > 0) {
                        iHashCode = getCatList().hashCode() + pv1.c(iHashCode, 37, 4, 53);
                    }
                    int iC = pv1.c(iHashCode, 37, 5, 53) + this.cattax_;
                    if (hasExt()) {
                        iC = pv1.c(iC, 37, 7, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iC = pv1.c(iC, 37, 6, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = this.unknownFields.a.hashCode() + (iC * 29);
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.y4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.j;
                    w4Var.c(Producer.class, Builder.class);
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
                    return new Producer();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                private Producer(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    if (iF != 10) {
                                        if (iF != 18) {
                                            if (iF != 26) {
                                                if (iF != 34) {
                                                    if (iF != 40) {
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
                                                        this.cattax_ = rVar.o();
                                                    }
                                                } else {
                                                    String strE = rVar.E();
                                                    if ((i & 1) == 0) {
                                                        this.cat_ = new r5();
                                                        i |= 1;
                                                    }
                                                    this.cat_.add(strE);
                                                }
                                            } else {
                                                this.domain_ = rVar.E();
                                            }
                                        } else {
                                            this.name_ = rVar.E();
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
                            if ((i & 1) != 0) {
                                this.cat_ = this.cat_.getUnmodifiableView();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public c8 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(w wVar) throws IOException {
                    if (!getIdBytes().isEmpty()) {
                        y4.writeString(wVar, 1, this.id_);
                    }
                    if (!getNameBytes().isEmpty()) {
                        y4.writeString(wVar, 2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        y4.writeString(wVar, 3, this.domain_);
                    }
                    int iL = 0;
                    while (iL < this.cat_.size()) {
                        iL = z.l(this.cat_, iL, wVar, 4, iL, 1);
                    }
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        wVar.K(5, this.cattax_);
                    }
                    for (int i = 0; i < this.extProto_.size(); i++) {
                        wVar.M(6, this.extProto_.get(i));
                    }
                    if (this.ext_ != null) {
                        wVar.M(7, getExt());
                    }
                    this.unknownFields.writeTo(wVar);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public j7 getCatList() {
                    return this.cat_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Producer mo250getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                public static Producer parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Producer) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer, o3Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Producer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Producer parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString, o3Var);
                }

                public static Producer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr);
                }

                public static Producer parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr, o3Var);
                }

                public static Producer parseFrom(InputStream inputStream) throws IOException {
                    return (Producer) y4.parseWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                    return (Producer) y4.parseWithIOException(PARSER, inputStream, o3Var);
                }

                public static Producer parseFrom(r rVar) throws IOException {
                    return (Producer) y4.parseWithIOException(PARSER, rVar);
                }

                public static Producer parseFrom(r rVar, o3 o3Var) throws IOException {
                    return (Producer) y4.parseWithIOException(PARSER, rVar, o3Var);
                }

                private Producer(g4 g4Var) {
                    super(g4Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private Producer() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = r5.c;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public interface ProducerOrBuilder extends MessageOrBuilder {
                String getCat(int i);

                ByteString getCatBytes(int i);

                int getCatCount();

                List<String> getCatList();

                CategoryTaxonomy getCattax();

                int getCattaxValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo250getDefaultInstanceForType();

                String getDomain();

                ByteString getDomainBytes();

                Struct getExt();

                c8 getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                g getExtProtoOrBuilder(int i);

                List<? extends g> getExtProtoOrBuilderList();

                String getId();

                ByteString getIdBytes();

                String getName();

                ByteString getNameBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return super.equals(obj);
                }
                Content content = (Content) obj;
                if (!getId().equals(content.getId()) || getEpisode() != content.getEpisode() || !getTitle().equals(content.getTitle()) || !getSeries().equals(content.getSeries()) || !getSeason().equals(content.getSeason()) || !getArtist().equals(content.getArtist()) || !getGenre().equals(content.getGenre()) || !getAlbum().equals(content.getAlbum()) || !getIsrc().equals(content.getIsrc()) || !getUrl().equals(content.getUrl()) || !getCatList().equals(content.getCatList()) || this.cattax_ != content.cattax_ || this.prodq_ != content.prodq_ || this.context_ != content.context_ || !getRating().equals(content.getRating()) || !getUrating().equals(content.getUrating()) || this.mrating_ != content.mrating_ || !getKeywords().equals(content.getKeywords()) || getLive() != content.getLive() || getSrcrel() != content.getSrcrel() || getLen() != content.getLen() || !getLang().equals(content.getLang()) || getEmbed() != content.getEmbed() || hasProducer() != content.hasProducer()) {
                    return false;
                }
                if ((!hasProducer() || getProducer().equals(content.getProducer())) && getDataList().equals(content.getDataList()) && hasExt() == content.hasExt()) {
                    return (!hasExt() || getExt().equals(content.getExt())) && getExtProtoList().equals(content.getExtProtoList()) && this.unknownFields.equals(content.unknownFields);
                }
                return false;
            }

            public static Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.g;
            }

            public static Builder newBuilder(Content content) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(content);
            }

            public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Content) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getAlbum() {
                Object obj = this.album_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.album_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getAlbumBytes() {
                Object obj = this.album_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.album_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getArtist() {
                Object obj = this.artist_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.artist_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getArtistBytes() {
                Object obj = this.artist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.artist_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ContentContext getContext() {
                ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Data getData(int i) {
                return this.data_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getDataCount() {
                return this.data_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Data> getDataList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public DataOrBuilder getDataOrBuilder(int i) {
                return this.data_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getEmbed() {
                return this.embed_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getEpisode() {
                return this.episode_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getGenre() {
                Object obj = this.genre_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.genre_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getGenreBytes() {
                Object obj = this.genre_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.genre_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getIsrc() {
                Object obj = this.isrc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.isrc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIsrcBytes() {
                Object obj = this.isrc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.isrc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getLen() {
                return this.len_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getLive() {
                return this.live_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public MediaRating getMrating() {
                MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getMratingValue() {
                return this.mrating_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public g7 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProductionQuality getProdq() {
                ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getProdqValue() {
                return this.prodq_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Producer getProducer() {
                Producer producer = this.producer_;
                return producer == null ? Producer.getDefaultInstance() : producer;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getRating() {
                Object obj = this.rating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.rating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getRatingBytes() {
                Object obj = this.rating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.rating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeason() {
                Object obj = this.season_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.season_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeasonBytes() {
                Object obj = this.season_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.season_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
                int i2 = this.episode_;
                if (i2 != 0) {
                    iComputeStringSize += w.t(2, i2);
                }
                if (!getTitleBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(10, this.url_);
                }
                int iK = 0;
                for (int i3 = 0; i3 < this.cat_.size(); i3++) {
                    iK = z.k(this.cat_, i3, iK);
                }
                int size = getCatList().size() + iComputeStringSize + iK;
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += w.g(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    size += w.g(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    size += w.g(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    size += y4.computeStringSize(15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    size += y4.computeStringSize(16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    size += w.g(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    size += y4.computeStringSize(18, this.keywords_);
                }
                if (this.live_) {
                    size += w.c(19);
                }
                int i4 = this.srcrel_;
                if (i4 != 0) {
                    size += w.t(20, i4);
                }
                int i5 = this.len_;
                if (i5 != 0) {
                    size += w.t(21, i5);
                }
                if (!getLangBytes().isEmpty()) {
                    size += y4.computeStringSize(22, this.lang_);
                }
                if (this.embed_) {
                    size += w.c(23);
                }
                if (this.producer_ != null) {
                    size += w.o(24, getProducer());
                }
                for (int i6 = 0; i6 < this.data_.size(); i6++) {
                    size += w.o(25, this.data_.get(i6));
                }
                for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
                    size += w.o(26, this.extProto_.get(i7));
                }
                if (this.ext_ != null) {
                    size += w.o(27, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeries() {
                Object obj = this.series_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.series_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeriesBytes() {
                Object obj = this.series_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.series_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getSrcrel() {
                return this.srcrel_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrating() {
                Object obj = this.urating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.urating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUratingBytes() {
                Object obj = this.urating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.urating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasProducer() {
                return this.producer_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getUrl().hashCode() + ((((getIsrc().hashCode() + ((((getAlbum().hashCode() + ((((getGenre().hashCode() + ((((getArtist().hashCode() + ((((getSeason().hashCode() + ((((getSeries().hashCode() + ((((getTitle().hashCode() + ((((getEpisode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53);
                if (getCatCount() > 0) {
                    iHashCode = pv1.c(iHashCode, 37, 11, 53) + getCatList().hashCode();
                }
                int iC = l5.c(getEmbed()) + ((((getLang().hashCode() + ((((getLen() + ((((getSrcrel() + ((((l5.c(getLive()) + ((((getKeywords().hashCode() + z.i((((getUrating().hashCode() + ((((getRating().hashCode() + z.i(z.i(z.i(pv1.c(iHashCode, 37, 12, 53), this.cattax_, 37, 13, 53), this.prodq_, 37, 14, 53), this.context_, 37, 15, 53)) * 37) + 16) * 53)) * 37) + 17) * 53, this.mrating_, 37, 18, 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53);
                if (hasProducer()) {
                    iC = pv1.c(iC, 37, 24, 53) + getProducer().hashCode();
                }
                if (getDataCount() > 0) {
                    iC = pv1.c(iC, 37, 25, 53) + getDataList().hashCode();
                }
                if (hasExt()) {
                    iC = pv1.c(iC, 37, 27, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iC = pv1.c(iC, 37, 26, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iC * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.h;
                w4Var.c(Content.class, Builder.class);
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
                return new Content();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private Content(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    this.id_ = rVar.E();
                                    continue;
                                case 16:
                                    this.episode_ = rVar.G();
                                    continue;
                                case 26:
                                    this.title_ = rVar.E();
                                    continue;
                                case 34:
                                    this.series_ = rVar.E();
                                    continue;
                                case 42:
                                    this.season_ = rVar.E();
                                    continue;
                                case 50:
                                    this.artist_ = rVar.E();
                                    continue;
                                case 58:
                                    this.genre_ = rVar.E();
                                    continue;
                                case 66:
                                    this.album_ = rVar.E();
                                    continue;
                                case 74:
                                    this.isrc_ = rVar.E();
                                    continue;
                                case 82:
                                    this.url_ = rVar.E();
                                    continue;
                                case 90:
                                    String strE = rVar.E();
                                    int i2 = (i == true ? 1 : 0) & 1;
                                    i = i;
                                    if (i2 == 0) {
                                        this.cat_ = new r5();
                                        i = (i == true ? 1 : 0) | 1;
                                    }
                                    this.cat_.add(strE);
                                    continue;
                                case 96:
                                    this.cattax_ = rVar.o();
                                    continue;
                                case 104:
                                    this.prodq_ = rVar.o();
                                    continue;
                                case 112:
                                    this.context_ = rVar.o();
                                    continue;
                                case INVALID_ADS_ENDPOINT_VALUE:
                                    this.rating_ = rVar.E();
                                    continue;
                                case 130:
                                    this.urating_ = rVar.E();
                                    continue;
                                case 136:
                                    this.mrating_ = rVar.o();
                                    continue;
                                case 146:
                                    this.keywords_ = rVar.E();
                                    continue;
                                case 152:
                                    this.live_ = rVar.l();
                                    continue;
                                case 160:
                                    this.srcrel_ = rVar.G();
                                    continue;
                                case 168:
                                    this.len_ = rVar.G();
                                    continue;
                                case 178:
                                    this.lang_ = rVar.E();
                                    continue;
                                case 184:
                                    this.embed_ = rVar.l();
                                    continue;
                                case 194:
                                    Producer producer = this.producer_;
                                    Producer.Builder builder = producer != null ? producer.toBuilder() : null;
                                    Producer producer2 = (Producer) rVar.v(Producer.parser(), o3Var);
                                    this.producer_ = producer2;
                                    if (builder != null) {
                                        builder.mergeFrom(producer2);
                                        this.producer_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 202:
                                    int i3 = (i == true ? 1 : 0) & 2;
                                    i = i;
                                    if (i3 == 0) {
                                        this.data_ = new ArrayList();
                                        i = (i == true ? 1 : 0) | 2;
                                    }
                                    this.data_.add((Data) rVar.v(Data.parser(), o3Var));
                                    continue;
                                case 210:
                                    int i4 = (i == true ? 1 : 0) & 4;
                                    i = i;
                                    if (i4 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i = (i == true ? 1 : 0) | 4;
                                    }
                                    this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                    continue;
                                case MRAID_JS_DOES_NOT_EXIST_VALUE:
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
                            this.cat_ = this.cat_.getUnmodifiableView();
                        }
                        if (((i == true ? 1 : 0) & 2) != 0) {
                            this.data_ = Collections.unmodifiableList(this.data_);
                        }
                        if (((i == true ? 1 : 0) & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = p8VarB.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.data_ = Collections.unmodifiableList(this.data_);
                }
                if (((i == true ? 1 : 0) & 4) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProducerOrBuilder getProducerOrBuilder() {
                return getProducer();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.id_);
                }
                int i = this.episode_;
                if (i != 0) {
                    wVar.T(2, i);
                }
                if (!getTitleBytes().isEmpty()) {
                    y4.writeString(wVar, 3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    y4.writeString(wVar, 4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    y4.writeString(wVar, 5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    y4.writeString(wVar, 6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    y4.writeString(wVar, 7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    y4.writeString(wVar, 8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    y4.writeString(wVar, 9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    y4.writeString(wVar, 10, this.url_);
                }
                int iL = 0;
                while (iL < this.cat_.size()) {
                    iL = z.l(this.cat_, iL, wVar, 11, iL, 1);
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    wVar.K(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    wVar.K(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    wVar.K(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    y4.writeString(wVar, 15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    y4.writeString(wVar, 16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    wVar.K(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    y4.writeString(wVar, 18, this.keywords_);
                }
                boolean z = this.live_;
                if (z) {
                    wVar.A(19, z);
                }
                int i2 = this.srcrel_;
                if (i2 != 0) {
                    wVar.T(20, i2);
                }
                int i3 = this.len_;
                if (i3 != 0) {
                    wVar.T(21, i3);
                }
                if (!getLangBytes().isEmpty()) {
                    y4.writeString(wVar, 22, this.lang_);
                }
                boolean z2 = this.embed_;
                if (z2) {
                    wVar.A(23, z2);
                }
                if (this.producer_ != null) {
                    wVar.M(24, getProducer());
                }
                for (int i4 = 0; i4 < this.data_.size(); i4++) {
                    wVar.M(25, this.data_.get(i4));
                }
                for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                    wVar.M(26, this.extProto_.get(i5));
                }
                if (this.ext_ != null) {
                    wVar.M(27, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public j7 getCatList() {
                return this.cat_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Content mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Content parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Content) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Content parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString, o3Var);
            }

            public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr);
            }

            public static Content parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr, o3Var);
            }

            public static Content parseFrom(InputStream inputStream) throws IOException {
                return (Content) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Content) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Content parseFrom(r rVar) throws IOException {
                return (Content) y4.parseWithIOException(PARSER, rVar);
            }

            public static Content parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Content) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Content(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Content() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.title_ = "";
                this.series_ = "";
                this.season_ = "";
                this.artist_ = "";
                this.genre_ = "";
                this.album_ = "";
                this.isrc_ = "";
                this.url_ = "";
                this.cat_ = r5.c;
                this.cattax_ = 0;
                this.prodq_ = 0;
                this.context_ = 0;
                this.rating_ = "";
                this.urating_ = "";
                this.mrating_ = 0;
                this.keywords_ = "";
                this.lang_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ContentOrBuilder extends MessageOrBuilder {
            String getAlbum();

            ByteString getAlbumBytes();

            String getArtist();

            ByteString getArtistBytes();

            String getCat(int i);

            ByteString getCatBytes(int i);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            ContentContext getContext();

            int getContextValue();

            Data getData(int i);

            int getDataCount();

            List<Data> getDataList();

            DataOrBuilder getDataOrBuilder(int i);

            List<? extends DataOrBuilder> getDataOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            boolean getEmbed();

            int getEpisode();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            String getGenre();

            ByteString getGenreBytes();

            String getId();

            ByteString getIdBytes();

            String getIsrc();

            ByteString getIsrcBytes();

            String getKeywords();

            ByteString getKeywordsBytes();

            String getLang();

            ByteString getLangBytes();

            int getLen();

            boolean getLive();

            MediaRating getMrating();

            int getMratingValue();

            ProductionQuality getProdq();

            int getProdqValue();

            Content.Producer getProducer();

            Content.ProducerOrBuilder getProducerOrBuilder();

            String getRating();

            ByteString getRatingBytes();

            String getSeason();

            ByteString getSeasonBytes();

            String getSeries();

            ByteString getSeriesBytes();

            int getSrcrel();

            String getTitle();

            ByteString getTitleBytes();

            String getUrating();

            ByteString getUratingBytes();

            String getUrl();

            ByteString getUrlBytes();

            boolean hasExt();

            boolean hasProducer();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Publisher extends y4 implements PublisherOrBuilder {
            public static final int CATTAX_FIELD_NUMBER = 5;
            public static final int CAT_FIELD_NUMBER = 4;
            public static final int DOMAIN_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private s5 cat_;
            private int cattax_;
            private volatile Object domain_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private static final Publisher DEFAULT_INSTANCE = new Publisher();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Publisher.1
                @Override // com.explorestack.protobuf.g7
                public Publisher parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Publisher(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements PublisherOrBuilder {
                private int bitField0_;
                private s5 cat_;
                private int cattax_;
                private Object domain_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = r5.c;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new r5(this.cat_);
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
                    return b.e;
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
                public Publisher buildPartial() {
                    Publisher publisher = new Publisher(this);
                    publisher.id_ = this.id_;
                    publisher.name_ = this.name_;
                    publisher.domain_ = this.domain_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    publisher.cat_ = this.cat_;
                    publisher.cattax_ = this.cattax_;
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        publisher.ext_ = this.ext_;
                    } else {
                        publisher.ext_ = (Struct) v7Var.a();
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        publisher.extProto_ = this.extProto_;
                    } else {
                        publisher.extProto_ = o7Var.f();
                    }
                    onBuilt();
                    return publisher;
                }

                public Builder clearCat() {
                    this.cat_ = r5.c;
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

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public j7 getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.e;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.f;
                    w4Var.c(Publisher.class, Builder.class);
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

                public Builder setCattaxValue(int i) {
                    this.cattax_ = i;
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
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.cat_);
                    onChanged();
                    return this;
                }

                public Builder addCat(String str) {
                    str.getClass();
                    ensureCatIsMutable();
                    this.cat_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addCatBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    ensureCatIsMutable();
                    this.cat_.b(byteString);
                    onChanged();
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Publisher build() {
                    Publisher publisherBuildPartial = buildPartial();
                    if (publisherBuildPartial.isInitialized()) {
                        return publisherBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) publisherBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = r5.c;
                    int i = this.bitField0_;
                    this.bitField0_ = i & (-2);
                    this.cattax_ = 0;
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

                public Builder clearDomain() {
                    this.domain_ = Publisher.getDefaultInstance().getDomain();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Publisher.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Publisher.getDefaultInstance().getName();
                    onChanged();
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

                public Builder mergeFrom(Publisher publisher) {
                    if (publisher == Publisher.getDefaultInstance()) {
                        return this;
                    }
                    if (!publisher.getId().isEmpty()) {
                        this.id_ = publisher.id_;
                        onChanged();
                    }
                    if (!publisher.getName().isEmpty()) {
                        this.name_ = publisher.name_;
                        onChanged();
                    }
                    if (!publisher.getDomain().isEmpty()) {
                        this.domain_ = publisher.domain_;
                        onChanged();
                    }
                    if (!publisher.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = publisher.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(publisher.cat_);
                        }
                        onChanged();
                    }
                    if (publisher.cattax_ != 0) {
                        setCattaxValue(publisher.getCattaxValue());
                    }
                    if (publisher.hasExt()) {
                        mergeExt(publisher.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!publisher.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = publisher.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(publisher.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!publisher.extProto_.isEmpty()) {
                        boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var = this.extProtoBuilder_;
                        if (zIsEmpty) {
                            o7 extProtoFieldBuilder = null;
                            o7Var.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = publisher.extProto_;
                            this.bitField0_ &= -3;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var.a(publisher.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) publisher).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setCat(int i, String str) {
                    str.getClass();
                    ensureCatIsMutable();
                    this.cat_.set(i, str);
                    onChanged();
                    return this;
                }

                public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                    categoryTaxonomy.getClass();
                    this.cattax_ = categoryTaxonomy.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setDomain(String str) {
                    str.getClass();
                    this.domain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
                    onChanged();
                    return this;
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
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
                public Publisher mo250getDefaultInstanceForType() {
                    return Publisher.getDefaultInstance();
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

                private Builder(h4 h4Var) {
                    super(h4Var);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = r5.c;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
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
                    if (message instanceof Publisher) {
                        return mergeFrom((Publisher) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Publisher publisher = null;
                    try {
                        try {
                            Publisher publisher2 = (Publisher) Publisher.PARSER.parsePartialFrom(rVar, o3Var);
                            if (publisher2 != null) {
                                mergeFrom(publisher2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Publisher publisher3 = (Publisher) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                publisher = publisher3;
                                if (publisher != null) {
                                    mergeFrom(publisher);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (publisher != null) {
                            mergeFrom(publisher);
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
                if (!(obj instanceof Publisher)) {
                    return super.equals(obj);
                }
                Publisher publisher = (Publisher) obj;
                if (getId().equals(publisher.getId()) && getName().equals(publisher.getName()) && getDomain().equals(publisher.getDomain()) && getCatList().equals(publisher.getCatList()) && this.cattax_ == publisher.cattax_ && hasExt() == publisher.hasExt()) {
                    return (!hasExt() || getExt().equals(publisher.getExt())) && getExtProtoList().equals(publisher.getExtProtoList()) && this.unknownFields.equals(publisher.unknownFields);
                }
                return false;
            }

            public static Publisher getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.e;
            }

            public static Builder newBuilder(Publisher publisher) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(publisher);
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Publisher) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
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
                int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(3, this.domain_);
                }
                int iK = 0;
                for (int i2 = 0; i2 < this.cat_.size(); i2++) {
                    iK = z.k(this.cat_, i2, iK);
                }
                int size = getCatList().size() + iComputeStringSize + iK;
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += w.g(5, this.cattax_);
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    size += w.o(6, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    size += w.o(7, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDomain().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                if (getCatCount() > 0) {
                    iHashCode = getCatList().hashCode() + pv1.c(iHashCode, 37, 4, 53);
                }
                int iC = pv1.c(iHashCode, 37, 5, 53) + this.cattax_;
                if (hasExt()) {
                    iC = pv1.c(iC, 37, 7, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iC = pv1.c(iC, 37, 6, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iC * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.f;
                w4Var.c(Publisher.class, Builder.class);
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
                return new Publisher();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private Publisher(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                if (iF != 10) {
                                    if (iF != 18) {
                                        if (iF != 26) {
                                            if (iF != 34) {
                                                if (iF != 40) {
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
                                                    this.cattax_ = rVar.o();
                                                }
                                            } else {
                                                String strE = rVar.E();
                                                if ((i & 1) == 0) {
                                                    this.cat_ = new r5();
                                                    i |= 1;
                                                }
                                                this.cat_.add(strE);
                                            }
                                        } else {
                                            this.domain_ = rVar.E();
                                        }
                                    } else {
                                        this.name_ = rVar.E();
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
                        if ((i & 1) != 0) {
                            this.cat_ = this.cat_.getUnmodifiableView();
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
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if ((i & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    y4.writeString(wVar, 2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    y4.writeString(wVar, 3, this.domain_);
                }
                int iL = 0;
                while (iL < this.cat_.size()) {
                    iL = z.l(this.cat_, iL, wVar, 4, iL, 1);
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    wVar.K(5, this.cattax_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    wVar.M(6, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    wVar.M(7, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public j7 getCatList() {
                return this.cat_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Publisher mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Publisher) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Publisher parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Publisher parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString, o3Var);
            }

            public static Publisher parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr);
            }

            public static Publisher parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr, o3Var);
            }

            public static Publisher parseFrom(InputStream inputStream) throws IOException {
                return (Publisher) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Publisher) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Publisher parseFrom(r rVar) throws IOException {
                return (Publisher) y4.parseWithIOException(PARSER, rVar);
            }

            public static Publisher parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Publisher) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Publisher(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Publisher() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = r5.c;
                this.cattax_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface PublisherOrBuilder extends MessageOrBuilder {
            String getCat(int i);

            ByteString getCatBytes(int i);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            String getDomain();

            ByteString getDomainBytes();

            Struct getExt();

            c8 getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i);

            List<? extends g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Release extends y4 implements ReleaseOrBuilder {
            private static final Release DEFAULT_INSTANCE = new Release();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Release.1
                @Override // com.explorestack.protobuf.g7
                public Release parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Release(rVar, o3Var);
                }
            };
            public static final int SIGNATURESHA1_FIELD_NUMBER = 2;
            public static final int SIGNATURESHA256_FIELD_NUMBER = 3;
            public static final int TYPE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object signatureSHA1_;
            private volatile Object signatureSHA256_;
            private volatile Object type_;

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements ReleaseOrBuilder {
                private Object signatureSHA1_;
                private Object signatureSHA256_;
                private Object type_;

                private Builder() {
                    super(null);
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.k;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release buildPartial() {
                    Release release = new Release(this);
                    release.type_ = this.type_;
                    release.signatureSHA1_ = this.signatureSHA1_;
                    release.signatureSHA256_ = this.signatureSHA256_;
                    onBuilt();
                    return release;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.k;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA1() {
                    Object obj = this.signatureSHA1_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA1_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA1Bytes() {
                    Object obj = this.signatureSHA1_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA1_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA256() {
                    Object obj = this.signatureSHA256_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA256_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA256Bytes() {
                    Object obj = this.signatureSHA256_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA256_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.l;
                    w4Var.c(Release.class, Builder.class);
                    return w4Var;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = y4.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release build() {
                    Release releaseBuildPartial = buildPartial();
                    if (releaseBuildPartial.isInitialized()) {
                        return releaseBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) releaseBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    return this;
                }

                public Builder clearSignatureSHA1() {
                    this.signatureSHA1_ = Release.getDefaultInstance().getSignatureSHA1();
                    onChanged();
                    return this;
                }

                public Builder clearSignatureSHA256() {
                    this.signatureSHA256_ = Release.getDefaultInstance().getSignatureSHA256();
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = Release.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public Builder mergeFrom(Release release) {
                    if (release == Release.getDefaultInstance()) {
                        return this;
                    }
                    if (!release.getType().isEmpty()) {
                        this.type_ = release.type_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA1().isEmpty()) {
                        this.signatureSHA1_ = release.signatureSHA1_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA256().isEmpty()) {
                        this.signatureSHA256_ = release.signatureSHA256_;
                        onChanged();
                    }
                    mergeUnknownFields(((y4) release).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setSignatureSHA1(String str) {
                    str.getClass();
                    this.signatureSHA1_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA1Bytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.signatureSHA1_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256(String str) {
                    str.getClass();
                    this.signatureSHA256_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256Bytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.signatureSHA256_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setType(String str) {
                    str.getClass();
                    this.type_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
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
                public Release mo250getDefaultInstanceForType() {
                    return Release.getDefaultInstance();
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
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Release) {
                        return mergeFrom((Release) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Release release = null;
                    try {
                        try {
                            Release release2 = (Release) Release.PARSER.parsePartialFrom(rVar, o3Var);
                            if (release2 != null) {
                                mergeFrom(release2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Release release3 = (Release) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                release = release3;
                                if (release != null) {
                                    mergeFrom(release);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (release != null) {
                            mergeFrom(release);
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
                if (!(obj instanceof Release)) {
                    return super.equals(obj);
                }
                Release release = (Release) obj;
                return getType().equals(release.getType()) && getSignatureSHA1().equals(release.getSignatureSHA1()) && getSignatureSHA256().equals(release.getSignatureSHA256()) && this.unknownFields.equals(release.unknownFields);
            }

            public static Release getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.k;
            }

            public static Builder newBuilder(Release release) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(release);
            }

            public static Release parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Release) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
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
                int iComputeStringSize = !getTypeBytes().isEmpty() ? y4.computeStringSize(1, this.type_) : 0;
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(3, this.signatureSHA256_);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA1() {
                Object obj = this.signatureSHA1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA1Bytes() {
                Object obj = this.signatureSHA1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA256() {
                Object obj = this.signatureSHA256_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA256_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA256Bytes() {
                Object obj = this.signatureSHA256_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA256_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
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
                int iHashCode = this.unknownFields.a.hashCode() + ((getSignatureSHA256().hashCode() + ((((getSignatureSHA1().hashCode() + ((((getType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.l;
                w4Var.c(Release.class, Builder.class);
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
                return new Release();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private Release(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                            }
                                        } else {
                                            this.signatureSHA256_ = rVar.E();
                                        }
                                    } else {
                                        this.signatureSHA1_ = rVar.E();
                                    }
                                } else {
                                    this.type_ = rVar.E();
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

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.type_);
                }
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    y4.writeString(wVar, 2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    y4.writeString(wVar, 3, this.signatureSHA256_);
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Release mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Release parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Release) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Release parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Release parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Release parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString, o3Var);
            }

            public static Release parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr);
            }

            public static Release parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr, o3Var);
            }

            public static Release parseFrom(InputStream inputStream) throws IOException {
                return (Release) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Release) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Release parseFrom(r rVar) throws IOException {
                return (Release) y4.parseWithIOException(PARSER, rVar);
            }

            public static Release parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Release) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Release(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Release() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = "";
                this.signatureSHA1_ = "";
                this.signatureSHA256_ = "";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ReleaseOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            String getSignatureSHA1();

            ByteString getSignatureSHA1Bytes();

            String getSignatureSHA256();

            ByteString getSignatureSHA256Bytes();

            String getType();

            ByteString getTypeBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return super.equals(obj);
            }
            App app = (App) obj;
            if (!getId().equals(app.getId()) || !getName().equals(app.getName()) || hasPub() != app.hasPub()) {
                return false;
            }
            if ((hasPub() && !getPub().equals(app.getPub())) || hasContent() != app.hasContent()) {
                return false;
            }
            if ((hasContent() && !getContent().equals(app.getContent())) || !getDomain().equals(app.getDomain()) || !getCatList().equals(app.getCatList()) || !getSectcatList().equals(app.getSectcatList()) || !getPagecatList().equals(app.getPagecatList()) || this.cattax_ != app.cattax_ || getPrivpolicy() != app.getPrivpolicy() || !getKeywords().equals(app.getKeywords()) || !getBundle().equals(app.getBundle()) || !getStoreid().equals(app.getStoreid()) || !getStoreurl().equals(app.getStoreurl()) || !getVer().equals(app.getVer()) || getPaid() != app.getPaid() || hasRelease() != app.hasRelease()) {
                return false;
            }
            if ((!hasRelease() || getRelease().equals(app.getRelease())) && hasExt() == app.hasExt()) {
                return (!hasExt() || getExt().equals(app.getExt())) && getExtProtoList().equals(app.getExtProtoList()) && this.unknownFields.equals(app.unknownFields);
            }
            return false;
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.c;
        }

        public static Builder newBuilder(App app) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getCat(int i) {
            return (String) this.cat_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getCatBytes(int i) {
            return this.cat_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCatCount() {
            return this.cat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getDomain() {
            Object obj = this.domain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domain_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getDomainBytes() {
            Object obj = this.domain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domain_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getPagecat(int i) {
            return (String) this.pagecat_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getPagecatBytes(int i) {
            return this.pagecat_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getPagecatCount() {
            return this.pagecat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPaid() {
            return this.paid_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPrivpolicy() {
            return this.privpolicy_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Publisher getPub() {
            Publisher publisher = this.pub_;
            return publisher == null ? Publisher.getDefaultInstance() : publisher;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Release getRelease() {
            Release release = this.release_;
            return release == null ? Release.getDefaultInstance() : release;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getSectcat(int i) {
            return (String) this.sectcat_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getSectcatBytes(int i) {
            return this.sectcat_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getSectcatCount() {
            return this.sectcat_.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(2, this.name_);
            }
            if (this.pub_ != null) {
                iComputeStringSize += w.o(3, getPub());
            }
            if (this.content_ != null) {
                iComputeStringSize += w.o(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(5, this.domain_);
            }
            int iK = 0;
            for (int i2 = 0; i2 < this.cat_.size(); i2++) {
                iK = z.k(this.cat_, i2, iK);
            }
            int size = getCatList().size() + iComputeStringSize + iK;
            int iK2 = 0;
            for (int i3 = 0; i3 < this.sectcat_.size(); i3++) {
                iK2 = z.k(this.sectcat_, i3, iK2);
            }
            int size2 = getSectcatList().size() + size + iK2;
            int iK3 = 0;
            for (int i4 = 0; i4 < this.pagecat_.size(); i4++) {
                iK3 = z.k(this.pagecat_, i4, iK3);
            }
            int size3 = getPagecatList().size() + size2 + iK3;
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size3 += w.g(9, this.cattax_);
            }
            if (this.privpolicy_) {
                size3 += w.c(10);
            }
            if (!getKeywordsBytes().isEmpty()) {
                size3 += y4.computeStringSize(11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                size3 += y4.computeStringSize(12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                size3 += y4.computeStringSize(13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                size3 += y4.computeStringSize(14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                size3 += y4.computeStringSize(15, this.ver_);
            }
            if (this.paid_) {
                size3 += w.c(16);
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                size3 += w.o(17, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                size3 += w.o(18, getExt());
            }
            if (this.release_ != null) {
                size3 += w.o(19, getRelease());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size3;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreid() {
            Object obj = this.storeid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreidBytes() {
            Object obj = this.storeid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreurl() {
            Object obj = this.storeurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreurlBytes() {
            Object obj = this.storeurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasPub() {
            return this.pub_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasRelease() {
            return this.release_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (hasPub()) {
                iHashCode = pv1.c(iHashCode, 37, 3, 53) + getPub().hashCode();
            }
            if (hasContent()) {
                iHashCode = pv1.c(iHashCode, 37, 4, 53) + getContent().hashCode();
            }
            int iHashCode2 = getDomain().hashCode() + pv1.c(iHashCode, 37, 5, 53);
            if (getCatCount() > 0) {
                iHashCode2 = getCatList().hashCode() + pv1.c(iHashCode2, 37, 6, 53);
            }
            if (getSectcatCount() > 0) {
                iHashCode2 = getSectcatList().hashCode() + pv1.c(iHashCode2, 37, 7, 53);
            }
            if (getPagecatCount() > 0) {
                iHashCode2 = getPagecatList().hashCode() + pv1.c(iHashCode2, 37, 8, 53);
            }
            int iC = l5.c(getPaid()) + ((((getVer().hashCode() + ((((getStoreurl().hashCode() + ((((getStoreid().hashCode() + ((((getBundle().hashCode() + ((((getKeywords().hashCode() + ((((l5.c(getPrivpolicy()) + z.i(pv1.c(iHashCode2, 37, 9, 53), this.cattax_, 37, 10, 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53);
            if (hasRelease()) {
                iC = getRelease().hashCode() + pv1.c(iC, 37, 19, 53);
            }
            if (hasExt()) {
                iC = getExt().hashCode() + pv1.c(iC, 37, 18, 53);
            }
            if (getExtProtoCount() > 0) {
                iC = getExtProtoList().hashCode() + pv1.c(iC, 37, 17, 53);
            }
            int iHashCode3 = this.unknownFields.a.hashCode() + (iC * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.d;
            w4Var.c(App.class, Builder.class);
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
            return new App();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private App(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                this.id_ = rVar.E();
                                continue;
                            case 18:
                                this.name_ = rVar.E();
                                continue;
                            case 26:
                                Publisher publisher = this.pub_;
                                Publisher.Builder builder = publisher != null ? publisher.toBuilder() : null;
                                Publisher publisher2 = (Publisher) rVar.v(Publisher.parser(), o3Var);
                                this.pub_ = publisher2;
                                if (builder != null) {
                                    builder.mergeFrom(publisher2);
                                    this.pub_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 34:
                                Content content = this.content_;
                                Content.Builder builder2 = content != null ? content.toBuilder() : null;
                                Content content2 = (Content) rVar.v(Content.parser(), o3Var);
                                this.content_ = content2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(content2);
                                    this.content_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 42:
                                this.domain_ = rVar.E();
                                continue;
                            case 50:
                                String strE = rVar.E();
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 == 0) {
                                    this.cat_ = new r5();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.cat_.add(strE);
                                continue;
                            case 58:
                                String strE2 = rVar.E();
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 == 0) {
                                    this.sectcat_ = new r5();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.sectcat_.add(strE2);
                                continue;
                            case 66:
                                String strE3 = rVar.E();
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 == 0) {
                                    this.pagecat_ = new r5();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.pagecat_.add(strE3);
                                continue;
                            case 72:
                                this.cattax_ = rVar.o();
                                continue;
                            case C5073y1.c /* 80 */:
                                this.privpolicy_ = rVar.l();
                                continue;
                            case 90:
                                this.keywords_ = rVar.E();
                                continue;
                            case 98:
                                this.bundle_ = rVar.E();
                                continue;
                            case 106:
                                this.storeid_ = rVar.E();
                                continue;
                            case ASSET_WRITE_ERROR_VALUE:
                                this.storeurl_ = rVar.E();
                                continue;
                            case INVALID_ADS_ENDPOINT_VALUE:
                                this.ver_ = rVar.E();
                                continue;
                            case 128:
                                this.paid_ = rVar.l();
                                continue;
                            case 138:
                                int i5 = (i == true ? 1 : 0) & 8;
                                i = i;
                                if (i5 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case 146:
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
                            case 154:
                                Release release = this.release_;
                                Release.Builder builder4 = release != null ? release.toBuilder() : null;
                                Release release2 = (Release) rVar.v(Release.parser(), o3Var);
                                this.release_ = release2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(release2);
                                    this.release_ = builder4.buildPartial();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 2) != 0) {
                        this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 4) != 0) {
                        this.pagecat_ = this.pagecat_.getUnmodifiableView();
                    }
                    if (((i == true ? 1 : 0) & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i == true ? 1 : 0) & 1) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 2) != 0) {
                this.sectcat_ = this.sectcat_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 4) != 0) {
                this.pagecat_ = this.pagecat_.getUnmodifiableView();
            }
            if (((i == true ? 1 : 0) & 8) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ContentOrBuilder getContentOrBuilder() {
            return getContent();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public PublisherOrBuilder getPubOrBuilder() {
            return getPub();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ReleaseOrBuilder getReleaseOrBuilder() {
            return getRelease();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                y4.writeString(wVar, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                y4.writeString(wVar, 2, this.name_);
            }
            if (this.pub_ != null) {
                wVar.M(3, getPub());
            }
            if (this.content_ != null) {
                wVar.M(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                y4.writeString(wVar, 5, this.domain_);
            }
            int iL = 0;
            while (iL < this.cat_.size()) {
                iL = z.l(this.cat_, iL, wVar, 6, iL, 1);
            }
            int iL2 = 0;
            while (iL2 < this.sectcat_.size()) {
                iL2 = z.l(this.sectcat_, iL2, wVar, 7, iL2, 1);
            }
            int iL3 = 0;
            while (iL3 < this.pagecat_.size()) {
                iL3 = z.l(this.pagecat_, iL3, wVar, 8, iL3, 1);
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                wVar.K(9, this.cattax_);
            }
            boolean z = this.privpolicy_;
            if (z) {
                wVar.A(10, z);
            }
            if (!getKeywordsBytes().isEmpty()) {
                y4.writeString(wVar, 11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                y4.writeString(wVar, 12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                y4.writeString(wVar, 13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                y4.writeString(wVar, 14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                y4.writeString(wVar, 15, this.ver_);
            }
            boolean z2 = this.paid_;
            if (z2) {
                wVar.A(16, z2);
            }
            for (int i = 0; i < this.extProto_.size(); i++) {
                wVar.M(17, this.extProto_.get(i));
            }
            if (this.ext_ != null) {
                wVar.M(18, getExt());
            }
            if (this.release_ != null) {
                wVar.M(19, getRelease());
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public j7 getCatList() {
            return this.cat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public j7 getPagecatList() {
            return this.pagecat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public j7 getSectcatList() {
            return this.sectcat_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public App mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static App parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (App) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static App parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static App parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString, o3Var);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr);
        }

        public static App parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr, o3Var);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) y4.parseWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (App) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static App parseFrom(r rVar) throws IOException {
            return (App) y4.parseWithIOException(PARSER, rVar);
        }

        public static App parseFrom(r rVar, o3 o3Var) throws IOException {
            return (App) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private App(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private App() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.domain_ = "";
            r5 r5Var = r5.c;
            this.cat_ = r5Var;
            this.sectcat_ = r5Var;
            this.pagecat_ = r5Var;
            this.cattax_ = 0;
            this.keywords_ = "";
            this.bundle_ = "";
            this.storeid_ = "";
            this.storeurl_ = "";
            this.ver_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AppOrBuilder extends MessageOrBuilder {
        String getBundle();

        ByteString getBundleBytes();

        String getCat(int i);

        ByteString getCatBytes(int i);

        int getCatCount();

        List<String> getCatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

        App.Content getContent();

        App.ContentOrBuilder getContentOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        String getDomain();

        ByteString getDomainBytes();

        Struct getExt();

        c8 getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i);

        List<? extends g> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        String getName();

        ByteString getNameBytes();

        String getPagecat(int i);

        ByteString getPagecatBytes(int i);

        int getPagecatCount();

        List<String> getPagecatList();

        boolean getPaid();

        boolean getPrivpolicy();

        App.Publisher getPub();

        App.PublisherOrBuilder getPubOrBuilder();

        App.Release getRelease();

        App.ReleaseOrBuilder getReleaseOrBuilder();

        String getSectcat(int i);

        ByteString getSectcatBytes(int i);

        int getSectcatCount();

        List<String> getSectcatList();

        String getStoreid();

        ByteString getStoreidBytes();

        String getStoreurl();

        ByteString getStoreurlBytes();

        String getVer();

        ByteString getVerBytes();

        boolean hasContent();

        boolean hasExt();

        boolean hasPub();

        boolean hasRelease();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements d {
        private v7 appBuilder_;
        private App app_;
        private int bitField0_;
        private v7 deviceBuilder_;
        private Device device_;
        private v7 extBuilder_;
        private o7 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private v7 regsBuilder_;
        private Regs regs_;
        private v7 restrictionsBuilder_;
        private Restrictions restrictions_;
        private v7 userBuilder_;
        private User user_;

        private Builder() {
            super(null);
            this.extProto_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
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

        private v7 getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new v7(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.a;
        }

        private v7 getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new v7(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
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

        private v7 getRegsFieldBuilder() {
            if (this.regsBuilder_ == null) {
                this.regsBuilder_ = new v7(getRegs(), getParentForChildren(), isClean());
                this.regs_ = null;
            }
            return this.regsBuilder_;
        }

        private v7 getRestrictionsFieldBuilder() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictionsBuilder_ = new v7(getRestrictions(), getParentForChildren(), isClean());
                this.restrictions_ = null;
            }
            return this.restrictionsBuilder_;
        }

        private v7 getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new v7(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
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
        public Context buildPartial() {
            Context context = new Context(this);
            v7 v7Var = this.appBuilder_;
            if (v7Var == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) v7Var.a();
            }
            v7 v7Var2 = this.deviceBuilder_;
            if (v7Var2 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) v7Var2.a();
            }
            v7 v7Var3 = this.regsBuilder_;
            if (v7Var3 == null) {
                context.regs_ = this.regs_;
            } else {
                context.regs_ = (Regs) v7Var3.a();
            }
            v7 v7Var4 = this.restrictionsBuilder_;
            if (v7Var4 == null) {
                context.restrictions_ = this.restrictions_;
            } else {
                context.restrictions_ = (Restrictions) v7Var4.a();
            }
            v7 v7Var5 = this.userBuilder_;
            if (v7Var5 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) v7Var5.a();
            }
            v7 v7Var6 = this.extBuilder_;
            if (v7Var6 == null) {
                context.ext_ = this.ext_;
            } else {
                context.ext_ = (Struct) v7Var6.a();
            }
            o7 o7Var = this.extProtoBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -2;
                }
                context.extProto_ = this.extProto_;
            } else {
                context.extProto_ = o7Var.f();
            }
            onBuilt();
            return context;
        }

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
                return this;
            }
            this.app_ = null;
            this.appBuilder_ = null;
            return this;
        }

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
                return this;
            }
            this.device_ = null;
            this.deviceBuilder_ = null;
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

        public Builder clearRegs() {
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
                onChanged();
                return this;
            }
            this.regs_ = null;
            this.regsBuilder_ = null;
            return this;
        }

        public Builder clearRestrictions() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
                onChanged();
                return this;
            }
            this.restrictions_ = null;
            this.restrictionsBuilder_ = null;
            return this;
        }

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
                return this;
            }
            this.user_ = null;
            this.userBuilder_ = null;
            return this;
        }

        public App getApp() {
            v7 v7Var = this.appBuilder_;
            if (v7Var != null) {
                return (App) v7Var.d();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public AppOrBuilder getAppOrBuilder() {
            v7 v7Var = this.appBuilder_;
            if (v7Var != null) {
                return (AppOrBuilder) v7Var.e();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.a;
        }

        public Device getDevice() {
            v7 v7Var = this.deviceBuilder_;
            if (v7Var != null) {
                return (Device) v7Var.d();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public DeviceOrBuilder getDeviceOrBuilder() {
            v7 v7Var = this.deviceBuilder_;
            if (v7Var != null) {
                return (DeviceOrBuilder) v7Var.e();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
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

        public Regs getRegs() {
            v7 v7Var = this.regsBuilder_;
            if (v7Var != null) {
                return (Regs) v7Var.d();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        public RegsOrBuilder getRegsOrBuilder() {
            v7 v7Var = this.regsBuilder_;
            if (v7Var != null) {
                return (RegsOrBuilder) v7Var.e();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        public Restrictions getRestrictions() {
            v7 v7Var = this.restrictionsBuilder_;
            if (v7Var != null) {
                return (Restrictions) v7Var.d();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public RestrictionsOrBuilder getRestrictionsOrBuilder() {
            v7 v7Var = this.restrictionsBuilder_;
            if (v7Var != null) {
                return (RestrictionsOrBuilder) v7Var.e();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public User getUser() {
            v7 v7Var = this.userBuilder_;
            if (v7Var != null) {
                return (User) v7Var.d();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public UserOrBuilder getUserOrBuilder() {
            v7 v7Var = this.userBuilder_;
            if (v7Var != null) {
                return (UserOrBuilder) v7Var.e();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasRegs() {
            return (this.regsBuilder_ == null && this.regs_ == null) ? false : true;
        }

        public boolean hasRestrictions() {
            return (this.restrictionsBuilder_ == null && this.restrictions_ == null) ? false : true;
        }

        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.b;
            w4Var.c(Context.class, Builder.class);
            return w4Var;
        }

        public Builder mergeApp(App app) {
            v7 v7Var = this.appBuilder_;
            if (v7Var != null) {
                v7Var.f(app);
                return this;
            }
            App app2 = this.app_;
            if (app2 != null) {
                this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.app_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDevice(Device device) {
            v7 v7Var = this.deviceBuilder_;
            if (v7Var != null) {
                v7Var.f(device);
                return this;
            }
            Device device2 = this.device_;
            if (device2 != null) {
                this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.device_ = device;
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

        public Builder mergeRegs(Regs regs) {
            v7 v7Var = this.regsBuilder_;
            if (v7Var != null) {
                v7Var.f(regs);
                return this;
            }
            Regs regs2 = this.regs_;
            if (regs2 != null) {
                this.regs_ = Regs.newBuilder(regs2).mergeFrom(regs).buildPartial();
            } else {
                this.regs_ = regs;
            }
            onChanged();
            return this;
        }

        public Builder mergeRestrictions(Restrictions restrictions) {
            v7 v7Var = this.restrictionsBuilder_;
            if (v7Var != null) {
                v7Var.f(restrictions);
                return this;
            }
            Restrictions restrictions2 = this.restrictions_;
            if (restrictions2 != null) {
                this.restrictions_ = Restrictions.newBuilder(restrictions2).mergeFrom(restrictions).buildPartial();
            } else {
                this.restrictions_ = restrictions;
            }
            onChanged();
            return this;
        }

        public Builder mergeUser(User user) {
            v7 v7Var = this.userBuilder_;
            if (v7Var != null) {
                v7Var.f(user);
                return this;
            }
            User user2 = this.user_;
            if (user2 != null) {
                this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.user_ = user;
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

        public Builder setApp(App.Builder builder) {
            v7 v7Var = this.appBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.app_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setDevice(Device.Builder builder) {
            v7 v7Var = this.deviceBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.device_ = builder.build();
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

        public Builder setRegs(Regs.Builder builder) {
            v7 v7Var = this.regsBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.regs_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setRestrictions(Restrictions.Builder builder) {
            v7 v7Var = this.restrictionsBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.restrictions_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setUser(User.Builder builder) {
            v7 v7Var = this.userBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.user_ = builder.build();
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
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
            } else {
                this.restrictions_ = null;
                this.restrictionsBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
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

        public App.Builder getAppBuilder() {
            onChanged();
            return (App.Builder) getAppFieldBuilder().c();
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return (Device.Builder) getDeviceFieldBuilder().c();
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

        public Regs.Builder getRegsBuilder() {
            onChanged();
            return (Regs.Builder) getRegsFieldBuilder().c();
        }

        public Restrictions.Builder getRestrictionsBuilder() {
            onChanged();
            return (Restrictions.Builder) getRestrictionsFieldBuilder().c();
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return (User.Builder) getUserFieldBuilder().c();
        }

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasRegs()) {
                mergeRegs(context.getRegs());
            }
            if (context.hasRestrictions()) {
                mergeRestrictions(context.getRestrictions());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasExt()) {
                mergeExt(context.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!context.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = context.extProto_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(context.extProto_);
                    }
                    onChanged();
                }
            } else if (!context.extProto_.isEmpty()) {
                boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                o7 o7Var = this.extProtoBuilder_;
                if (zIsEmpty) {
                    o7 extProtoFieldBuilder = null;
                    o7Var.a = null;
                    this.extProtoBuilder_ = null;
                    this.extProto_ = context.extProto_;
                    this.bitField0_ &= -2;
                    if (y4.alwaysUseFieldBuilders) {
                        extProtoFieldBuilder = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = extProtoFieldBuilder;
                } else {
                    o7Var.a(context.extProto_);
                }
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
            this.extProto_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Any.Builder addExtProtoBuilder(int i) {
            return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
        }

        public Builder setApp(App app) {
            v7 v7Var = this.appBuilder_;
            if (v7Var == null) {
                app.getClass();
                this.app_ = app;
                onChanged();
                return this;
            }
            v7Var.h(app);
            return this;
        }

        public Builder setDevice(Device device) {
            v7 v7Var = this.deviceBuilder_;
            if (v7Var == null) {
                device.getClass();
                this.device_ = device;
                onChanged();
                return this;
            }
            v7Var.h(device);
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

        public Builder setRegs(Regs regs) {
            v7 v7Var = this.regsBuilder_;
            if (v7Var == null) {
                regs.getClass();
                this.regs_ = regs;
                onChanged();
                return this;
            }
            v7Var.h(regs);
            return this;
        }

        public Builder setRestrictions(Restrictions restrictions) {
            v7 v7Var = this.restrictionsBuilder_;
            if (v7Var == null) {
                restrictions.getClass();
                this.restrictions_ = restrictions;
                onChanged();
                return this;
            }
            v7Var.h(restrictions);
            return this;
        }

        public Builder setUser(User user) {
            v7 v7Var = this.userBuilder_;
            if (v7Var == null) {
                user.getClass();
                this.user_ = user;
                onChanged();
                return this;
            }
            v7Var.h(user);
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

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Data extends y4 implements DataOrBuilder {
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int SEGMENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<Segment> segment_;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Data.1
            @Override // com.explorestack.protobuf.g7
            public Data parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Data(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements DataOrBuilder {
            private int bitField0_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object name_;
            private o7 segmentBuilder_;
            private List<Segment> segment_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
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

            private void ensureSegmentIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.segment_ = new ArrayList(this.segment_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.m;
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

            private o7 getSegmentFieldBuilder() {
                if (this.segmentBuilder_ == null) {
                    this.segmentBuilder_ = new o7(this.segment_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.segment_ = null;
                }
                return this.segmentBuilder_;
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

            public Builder addAllSegment(Iterable<? extends Segment> iterable) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureSegmentIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.segment_);
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

            public Builder addSegment(Segment.Builder builder) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var != null) {
                    o7Var.e(builder.build());
                    return this;
                }
                ensureSegmentIsMutable();
                this.segment_.add(builder.build());
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.id_ = this.id_;
                data.name_ = this.name_;
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.segment_ = Collections.unmodifiableList(this.segment_);
                        this.bitField0_ &= -2;
                    }
                    data.segment_ = this.segment_;
                } else {
                    data.segment_ = o7Var.f();
                }
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    data.ext_ = this.ext_;
                } else {
                    data.ext_ = (Struct) v7Var.a();
                }
                o7 o7Var2 = this.extProtoBuilder_;
                if (o7Var2 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    data.extProto_ = this.extProto_;
                } else {
                    data.extProto_ = o7Var2.f();
                }
                onBuilt();
                return data;
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

            public Builder clearSegment() {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var != null) {
                    o7Var.g();
                    return this;
                }
                this.segment_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.m;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public Segment getSegment(int i) {
                o7 o7Var = this.segmentBuilder_;
                return o7Var == null ? this.segment_.get(i) : (Segment) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getSegmentCount() {
                o7 o7Var = this.segmentBuilder_;
                return o7Var == null ? this.segment_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Segment> getSegmentList() {
                o7 o7Var = this.segmentBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.segment_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public SegmentOrBuilder getSegmentOrBuilder(int i) {
                o7 o7Var = this.segmentBuilder_;
                return o7Var == null ? this.segment_.get(i) : (SegmentOrBuilder) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
                o7 o7Var = this.segmentBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.segment_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.n;
                w4Var.c(Data.class, Builder.class);
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

            public Builder removeSegment(int i) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var != null) {
                    o7Var.r(i);
                    return this;
                }
                ensureSegmentIsMutable();
                this.segment_.remove(i);
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

            public Builder setSegment(int i, Segment.Builder builder) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var != null) {
                    o7Var.s(i, builder.build());
                    return this;
                }
                ensureSegmentIsMutable();
                this.segment_.set(i, builder.build());
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getSegmentFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Segment.Builder addSegmentBuilder() {
                return (Segment.Builder) getSegmentFieldBuilder().c(Segment.getDefaultInstance());
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
                this.id_ = "";
                this.name_ = "";
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    this.segment_ = Collections.EMPTY_LIST;
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

            public Builder clearId() {
                this.id_ = Data.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Data.getDefaultInstance().getName();
                onChanged();
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

            public Segment.Builder getSegmentBuilder(int i) {
                return (Segment.Builder) getSegmentFieldBuilder().j(i);
            }

            public List<Segment.Builder> getSegmentBuilderList() {
                return getSegmentFieldBuilder().k();
            }

            public Builder mergeFrom(Data data) {
                o7 segmentFieldBuilder;
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (!data.getId().isEmpty()) {
                    this.id_ = data.id_;
                    onChanged();
                }
                if (!data.getName().isEmpty()) {
                    this.name_ = data.name_;
                    onChanged();
                }
                o7 extProtoFieldBuilder = null;
                if (this.segmentBuilder_ == null) {
                    if (!data.segment_.isEmpty()) {
                        if (this.segment_.isEmpty()) {
                            this.segment_ = data.segment_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSegmentIsMutable();
                            this.segment_.addAll(data.segment_);
                        }
                        onChanged();
                    }
                } else if (!data.segment_.isEmpty()) {
                    boolean zIsEmpty = this.segmentBuilder_.b.isEmpty();
                    o7 o7Var = this.segmentBuilder_;
                    if (zIsEmpty) {
                        o7Var.a = null;
                        this.segmentBuilder_ = null;
                        this.segment_ = data.segment_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            segmentFieldBuilder = getSegmentFieldBuilder();
                        } else {
                            segmentFieldBuilder = null;
                        }
                        this.segmentBuilder_ = segmentFieldBuilder;
                    } else {
                        o7Var.a(data.segment_);
                    }
                }
                if (data.hasExt()) {
                    mergeExt(data.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!data.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = data.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(data.extProto_);
                        }
                        onChanged();
                    }
                } else if (!data.extProto_.isEmpty()) {
                    boolean zIsEmpty2 = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (zIsEmpty2) {
                        o7Var2.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = data.extProto_;
                        this.bitField0_ &= -3;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var2.a(data.extProto_);
                    }
                }
                mergeUnknownFields(((y4) data).unknownFields);
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

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
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

            public Any.Builder addExtProtoBuilder(int i) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i, Any.getDefaultInstance());
            }

            public Segment.Builder addSegmentBuilder(int i) {
                return (Segment.Builder) getSegmentFieldBuilder().b(i, Segment.getDefaultInstance());
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.id_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
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

            public Builder addSegment(int i, Segment segment) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    segment.getClass();
                    ensureSegmentIsMutable();
                    this.segment_.add(i, segment);
                    onChanged();
                    return this;
                }
                o7Var.d(i, segment);
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

            public Builder setSegment(int i, Segment segment) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    segment.getClass();
                    ensureSegmentIsMutable();
                    this.segment_.set(i, segment);
                    onChanged();
                    return this;
                }
                o7Var.s(i, segment);
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

            public Builder addSegment(Segment segment) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    segment.getClass();
                    ensureSegmentIsMutable();
                    this.segment_.add(segment);
                    onChanged();
                    return this;
                }
                o7Var.e(segment);
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

            public Builder addSegment(int i, Segment.Builder builder) {
                o7 o7Var = this.segmentBuilder_;
                if (o7Var == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(i, builder.build());
                    onChanged();
                    return this;
                }
                o7Var.d(i, builder.build());
                return this;
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

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Segment extends y4 implements SegmentOrBuilder {
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object value_;
            private static final Segment DEFAULT_INSTANCE = new Segment();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Data.Segment.1
                @Override // com.explorestack.protobuf.g7
                public Segment parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Segment(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements SegmentOrBuilder {
                private int bitField0_;
                private v7 extBuilder_;
                private o7 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;
                private Object value_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
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
                    return b.o;
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
                public Segment buildPartial() {
                    Segment segment = new Segment(this);
                    segment.id_ = this.id_;
                    segment.name_ = this.name_;
                    segment.value_ = this.value_;
                    v7 v7Var = this.extBuilder_;
                    if (v7Var == null) {
                        segment.ext_ = this.ext_;
                    } else {
                        segment.ext_ = (Struct) v7Var.a();
                    }
                    o7 o7Var = this.extProtoBuilder_;
                    if (o7Var == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        segment.extProto_ = this.extProto_;
                    } else {
                        segment.extProto_ = o7Var.f();
                    }
                    onBuilt();
                    return segment;
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
                    return b.o;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public Struct getExt() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (Struct) v7Var.d();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public c8 getExtOrBuilder() {
                    v7 v7Var = this.extBuilder_;
                    if (v7Var != null) {
                        return (c8) v7Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public Any getExtProto(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public int getExtProtoCount() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.size() : o7Var.b.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<Any> getExtProtoList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public g getExtProtoOrBuilder(int i) {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    o7 o7Var = this.extProtoBuilder_;
                    return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.p;
                    w4Var.c(Segment.class, Builder.class);
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

                private void maybeForceBuilderInitialization() {
                    if (y4.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Segment build() {
                    Segment segmentBuildPartial = buildPartial();
                    if (segmentBuildPartial.isInitialized()) {
                        return segmentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) segmentBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
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
                    this.id_ = Segment.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Segment.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = Segment.getDefaultInstance().getValue();
                    onChanged();
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

                public Builder mergeFrom(Segment segment) {
                    if (segment == Segment.getDefaultInstance()) {
                        return this;
                    }
                    if (!segment.getId().isEmpty()) {
                        this.id_ = segment.id_;
                        onChanged();
                    }
                    if (!segment.getName().isEmpty()) {
                        this.name_ = segment.name_;
                        onChanged();
                    }
                    if (!segment.getValue().isEmpty()) {
                        this.value_ = segment.value_;
                        onChanged();
                    }
                    if (segment.hasExt()) {
                        mergeExt(segment.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!segment.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = segment.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(segment.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!segment.extProto_.isEmpty()) {
                        boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                        o7 o7Var = this.extProtoBuilder_;
                        if (zIsEmpty) {
                            o7 extProtoFieldBuilder = null;
                            o7Var.a = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = segment.extProto_;
                            this.bitField0_ &= -2;
                            if (y4.alwaysUseFieldBuilders) {
                                extProtoFieldBuilder = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = extProtoFieldBuilder;
                        } else {
                            o7Var.a(segment.extProto_);
                        }
                    }
                    mergeUnknownFields(((y4) segment).unknownFields);
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString;
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
                public Segment mo250getDefaultInstanceForType() {
                    return Segment.getDefaultInstance();
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
                    this.name_ = "";
                    this.value_ = "";
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
                    if (message instanceof Segment) {
                        return mergeFrom((Segment) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Segment segment = null;
                    try {
                        try {
                            Segment segment2 = (Segment) Segment.PARSER.parsePartialFrom(rVar, o3Var);
                            if (segment2 != null) {
                                mergeFrom(segment2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Segment segment3 = (Segment) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                segment = segment3;
                                if (segment != null) {
                                    mergeFrom(segment);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (segment != null) {
                            mergeFrom(segment);
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
                if (!(obj instanceof Segment)) {
                    return super.equals(obj);
                }
                Segment segment = (Segment) obj;
                if (getId().equals(segment.getId()) && getName().equals(segment.getName()) && getValue().equals(segment.getValue()) && hasExt() == segment.hasExt()) {
                    return (!hasExt() || getExt().equals(segment.getExt())) && getExtProtoList().equals(segment.getExtProtoList()) && this.unknownFields.equals(segment.unknownFields);
                }
                return false;
            }

            public static Segment getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.o;
            }

            public static Builder newBuilder(Segment segment) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(segment);
            }

            public static Segment parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Segment) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public g getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
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
                int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    iComputeStringSize += y4.computeStringSize(3, this.value_);
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    iComputeStringSize += w.o(4, this.extProto_.get(i2));
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

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getValue().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                if (hasExt()) {
                    iHashCode = getExt().hashCode() + pv1.c(iHashCode, 37, 5, 53);
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = getExtProtoList().hashCode() + pv1.c(iHashCode, 37, 4, 53);
                }
                int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.p;
                w4Var.c(Segment.class, Builder.class);
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
                return new Segment();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private Segment(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    if (iF != 10) {
                                        if (iF != 18) {
                                            if (iF != 26) {
                                                if (iF != 34) {
                                                    if (iF != 42) {
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
                                                this.value_ = rVar.E();
                                            }
                                        } else {
                                            this.name_ = rVar.E();
                                        }
                                    } else {
                                        this.id_ = rVar.E();
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

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public c8 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    y4.writeString(wVar, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    y4.writeString(wVar, 2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    y4.writeString(wVar, 3, this.value_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    wVar.M(4, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    wVar.M(5, getExt());
                }
                this.unknownFields.writeTo(wVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Segment mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Segment parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Segment) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Segment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Segment parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString, o3Var);
            }

            public static Segment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr);
            }

            public static Segment parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr, o3Var);
            }

            public static Segment parseFrom(InputStream inputStream) throws IOException {
                return (Segment) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Segment) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Segment parseFrom(r rVar) throws IOException {
                return (Segment) y4.parseWithIOException(PARSER, rVar);
            }

            public static Segment parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Segment) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Segment(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Segment() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.value_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface SegmentOrBuilder extends MessageOrBuilder {
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

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
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
            if (getId().equals(data.getId()) && getName().equals(data.getName()) && getSegmentList().equals(data.getSegmentList()) && hasExt() == data.hasExt()) {
                return (!hasExt() || getExt().equals(data.getExt())) && getExtProtoList().equals(data.getExtProtoList()) && this.unknownFields.equals(data.unknownFields);
            }
            return false;
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.m;
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

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
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

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Segment getSegment(int i) {
            return this.segment_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getSegmentCount() {
            return this.segment_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Segment> getSegmentList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public SegmentOrBuilder getSegmentOrBuilder(int i) {
            return this.segment_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? y4.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(2, this.name_);
            }
            for (int i2 = 0; i2 < this.segment_.size(); i2++) {
                iComputeStringSize += w.o(3, this.segment_.get(i2));
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

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (getSegmentCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 3, 53) + getSegmentList().hashCode();
            }
            if (hasExt()) {
                iHashCode = pv1.c(iHashCode, 37, 5, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 4, 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.n;
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

        private Data(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                            if (iF != 34) {
                                                if (iF != 42) {
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
                                                this.segment_ = new ArrayList();
                                                i |= 1;
                                            }
                                            this.segment_.add((Segment) rVar.v(Segment.parser(), o3Var));
                                        }
                                    } else {
                                        this.name_ = rVar.E();
                                    }
                                } else {
                                    this.id_ = rVar.E();
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
                        this.segment_ = Collections.unmodifiableList(this.segment_);
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
                this.segment_ = Collections.unmodifiableList(this.segment_);
            }
            if ((i & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                y4.writeString(wVar, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                y4.writeString(wVar, 2, this.name_);
            }
            for (int i = 0; i < this.segment_.size(); i++) {
                wVar.M(3, this.segment_.get(i));
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
            this.id_ = "";
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.segment_ = list;
            this.extProto_ = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DataOrBuilder extends MessageOrBuilder {
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

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        Data.Segment getSegment(int i);

        int getSegmentCount();

        List<Data.Segment> getSegmentList();

        Data.SegmentOrBuilder getSegmentOrBuilder(int i);

        List<? extends Data.SegmentOrBuilder> getSegmentOrBuilderList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Device extends y4 implements DeviceOrBuilder {
        public static final int AUDIOCONTEXT_FIELD_NUMBER = 30;
        public static final int CARRIER_FIELD_NUMBER = 21;
        public static final int CONNECTION_FIELD_NUMBER = 29;
        public static final int CONTYPE_FIELD_NUMBER = 24;
        public static final int DNT_FIELD_NUMBER = 4;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int GEOFETCH_FIELD_NUMBER = 25;
        public static final int GEO_FIELD_NUMBER = 26;
        public static final int HWV_FIELD_NUMBER = 10;
        public static final int H_FIELD_NUMBER = 11;
        public static final int IFA_FIELD_NUMBER = 3;
        public static final int IPTR_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 18;
        public static final int IP_FIELD_NUMBER = 17;
        public static final int JS_FIELD_NUMBER = 15;
        public static final int LANG_FIELD_NUMBER = 16;
        public static final int LMT_FIELD_NUMBER = 5;
        public static final int MAKE_FIELD_NUMBER = 6;
        public static final int MCCMNCSIM_FIELD_NUMBER = 23;
        public static final int MCCMNC_FIELD_NUMBER = 22;
        public static final int MODEL_FIELD_NUMBER = 7;
        public static final int OSV_FIELD_NUMBER = 9;
        public static final int OS_FIELD_NUMBER = 8;
        public static final int PPI_FIELD_NUMBER = 13;
        public static final int PXRATIO_FIELD_NUMBER = 14;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 12;
        public static final int XFF_FIELD_NUMBER = 19;
        private static final long serialVersionUID = 0;
        private AudioContext audioContext_;
        private volatile Object carrier_;
        private Connection connection_;
        private int contype_;
        private boolean dnt_;
        private List<Any> extProto_;
        private Struct ext_;
        private Geo geo_;
        private boolean geofetch_;
        private int h_;
        private volatile Object hwv_;
        private volatile Object ifa_;
        private volatile Object ip_;
        private boolean iptr_;
        private volatile Object ipv6_;
        private boolean js_;
        private volatile Object lang_;
        private boolean lmt_;
        private volatile Object make_;
        private volatile Object mccmnc_;
        private volatile Object mccmncsim_;
        private byte memoizedIsInitialized;
        private volatile Object model_;
        private int os_;
        private volatile Object osv_;
        private int ppi_;
        private float pxratio_;
        private int type_;
        private volatile Object ua_;
        private int w_;
        private volatile Object xff_;
        private static final Device DEFAULT_INSTANCE = new Device();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.1
            @Override // com.explorestack.protobuf.g7
            public Device parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Device(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class AudioContext extends y4 implements AudioContextOrBuilder {
            public static final int ISAUDIOPLAYING_FIELD_NUMBER = 1;
            public static final int VOLUMELEVEL_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private boolean isAudioPlaying_;
            private byte memoizedIsInitialized;
            private float volumelevel_;
            private static final AudioContext DEFAULT_INSTANCE = new AudioContext();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.AudioContext.1
                @Override // com.explorestack.protobuf.g7
                public AudioContext parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new AudioContext(rVar, o3Var);
                }
            };

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements AudioContextOrBuilder {
                private boolean isAudioPlaying_;
                private float volumelevel_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                public Builder clearIsAudioPlaying() {
                    this.isAudioPlaying_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearVolumelevel() {
                    this.volumelevel_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.w;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext buildPartial() {
                    AudioContext audioContext = new AudioContext(this);
                    audioContext.isAudioPlaying_ = this.isAudioPlaying_;
                    audioContext.volumelevel_ = this.volumelevel_;
                    onBuilt();
                    return audioContext;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.w;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public boolean getIsAudioPlaying() {
                    return this.isAudioPlaying_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public float getVolumelevel() {
                    return this.volumelevel_;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.x;
                    w4Var.c(AudioContext.class, Builder.class);
                    return w4Var;
                }

                public Builder setIsAudioPlaying(boolean z) {
                    this.isAudioPlaying_ = z;
                    onChanged();
                    return this;
                }

                public Builder setVolumelevel(float f) {
                    this.volumelevel_ = f;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = y4.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext build() {
                    AudioContext audioContextBuildPartial = buildPartial();
                    if (audioContextBuildPartial.isInitialized()) {
                        return audioContextBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioContextBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.isAudioPlaying_ = false;
                    this.volumelevel_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public Builder mergeFrom(AudioContext audioContext) {
                    if (audioContext == AudioContext.getDefaultInstance()) {
                        return this;
                    }
                    if (audioContext.getIsAudioPlaying()) {
                        setIsAudioPlaying(audioContext.getIsAudioPlaying());
                    }
                    if (audioContext.getVolumelevel() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        setVolumelevel(audioContext.getVolumelevel());
                    }
                    mergeUnknownFields(((y4) audioContext).unknownFields);
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
                public AudioContext mo250getDefaultInstanceForType() {
                    return AudioContext.getDefaultInstance();
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
                    if (message instanceof AudioContext) {
                        return mergeFrom((AudioContext) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    AudioContext audioContext = null;
                    try {
                        try {
                            AudioContext audioContext2 = (AudioContext) AudioContext.PARSER.parsePartialFrom(rVar, o3Var);
                            if (audioContext2 != null) {
                                mergeFrom(audioContext2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            AudioContext audioContext3 = (AudioContext) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                audioContext = audioContext3;
                                if (audioContext != null) {
                                    mergeFrom(audioContext);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (audioContext != null) {
                            mergeFrom(audioContext);
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
                if (!(obj instanceof AudioContext)) {
                    return super.equals(obj);
                }
                AudioContext audioContext = (AudioContext) obj;
                return getIsAudioPlaying() == audioContext.getIsAudioPlaying() && Float.floatToIntBits(getVolumelevel()) == Float.floatToIntBits(audioContext.getVolumelevel()) && this.unknownFields.equals(audioContext.unknownFields);
            }

            public static AudioContext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.w;
            }

            public static Builder newBuilder(AudioContext audioContext) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioContext);
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AudioContext) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public boolean getIsAudioPlaying() {
                return this.isAudioPlaying_;
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
                int iC = this.isAudioPlaying_ ? w.c(1) : 0;
                if (this.volumelevel_ != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    iC += w.j(2);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iC;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public float getVolumelevel() {
                return this.volumelevel_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = this.unknownFields.a.hashCode() + ((Float.floatToIntBits(getVolumelevel()) + ((((l5.c(getIsAudioPlaying()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.x;
                w4Var.c(AudioContext.class, Builder.class);
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
                return new AudioContext();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                boolean z = this.isAudioPlaying_;
                if (z) {
                    wVar.A(1, z);
                }
                float f = this.volumelevel_;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    wVar.J(2, f);
                }
                this.unknownFields.writeTo(wVar);
            }

            private AudioContext(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    if (iF != 21) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        this.volumelevel_ = rVar.r();
                                    }
                                } else {
                                    this.isAudioPlaying_ = rVar.l();
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
            public AudioContext mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (AudioContext) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static AudioContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AudioContext parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString, o3Var);
            }

            public static AudioContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr);
            }

            public static AudioContext parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr, o3Var);
            }

            public static AudioContext parseFrom(InputStream inputStream) throws IOException {
                return (AudioContext) y4.parseWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (AudioContext) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static AudioContext parseFrom(r rVar) throws IOException {
                return (AudioContext) y4.parseWithIOException(PARSER, rVar);
            }

            public static AudioContext parseFrom(r rVar, o3 o3Var) throws IOException {
                return (AudioContext) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private AudioContext(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private AudioContext() {
                this.memoizedIsInitialized = (byte) -1;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface AudioContextOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            boolean getIsAudioPlaying();

            float getVolumelevel();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements DeviceOrBuilder {
            private v7 audioContextBuilder_;
            private AudioContext audioContext_;
            private int bitField0_;
            private Object carrier_;
            private v7 connectionBuilder_;
            private Connection connection_;
            private int contype_;
            private boolean dnt_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private v7 geoBuilder_;
            private Geo geo_;
            private boolean geofetch_;
            private int h_;
            private Object hwv_;
            private Object ifa_;
            private Object ip_;
            private boolean iptr_;
            private Object ipv6_;
            private boolean js_;
            private Object lang_;
            private boolean lmt_;
            private Object make_;
            private Object mccmnc_;
            private Object mccmncsim_;
            private Object model_;
            private int os_;
            private Object osv_;
            private int ppi_;
            private float pxratio_;
            private int type_;
            private Object ua_;
            private int w_;
            private Object xff_;

            private Builder() {
                super(null);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder clearContype() {
                this.contype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDnt() {
                this.dnt_ = false;
                onChanged();
                return this;
            }

            public Builder clearGeofetch() {
                this.geofetch_ = false;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIptr() {
                this.iptr_ = false;
                onChanged();
                return this;
            }

            public Builder clearJs() {
                this.js_ = false;
                onChanged();
                return this;
            }

            public Builder clearLmt() {
                this.lmt_ = false;
                onChanged();
                return this;
            }

            public Builder clearOs() {
                this.os_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPpi() {
                this.ppi_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPxratio() {
                this.pxratio_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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

            private v7 getAudioContextFieldBuilder() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContextBuilder_ = new v7(getAudioContext(), getParentForChildren(), isClean());
                    this.audioContext_ = null;
                }
                return this.audioContextBuilder_;
            }

            private v7 getConnectionFieldBuilder() {
                if (this.connectionBuilder_ == null) {
                    this.connectionBuilder_ = new v7(getConnection(), getParentForChildren(), isClean());
                    this.connection_ = null;
                }
                return this.connectionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.s;
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

            private v7 getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new v7(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
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
            public Device buildPartial() {
                Device device = new Device(this);
                device.type_ = this.type_;
                device.ua_ = this.ua_;
                device.ifa_ = this.ifa_;
                device.dnt_ = this.dnt_;
                device.lmt_ = this.lmt_;
                device.make_ = this.make_;
                device.model_ = this.model_;
                device.os_ = this.os_;
                device.osv_ = this.osv_;
                device.hwv_ = this.hwv_;
                device.h_ = this.h_;
                device.w_ = this.w_;
                device.ppi_ = this.ppi_;
                device.pxratio_ = this.pxratio_;
                device.js_ = this.js_;
                device.lang_ = this.lang_;
                device.ip_ = this.ip_;
                device.ipv6_ = this.ipv6_;
                device.xff_ = this.xff_;
                device.iptr_ = this.iptr_;
                device.carrier_ = this.carrier_;
                device.mccmnc_ = this.mccmnc_;
                device.mccmncsim_ = this.mccmncsim_;
                device.contype_ = this.contype_;
                device.geofetch_ = this.geofetch_;
                v7 v7Var = this.geoBuilder_;
                if (v7Var == null) {
                    device.geo_ = this.geo_;
                } else {
                    device.geo_ = (Geo) v7Var.a();
                }
                v7 v7Var2 = this.connectionBuilder_;
                if (v7Var2 == null) {
                    device.connection_ = this.connection_;
                } else {
                    device.connection_ = (Connection) v7Var2.a();
                }
                v7 v7Var3 = this.audioContextBuilder_;
                if (v7Var3 == null) {
                    device.audioContext_ = this.audioContext_;
                } else {
                    device.audioContext_ = (AudioContext) v7Var3.a();
                }
                v7 v7Var4 = this.extBuilder_;
                if (v7Var4 == null) {
                    device.ext_ = this.ext_;
                } else {
                    device.ext_ = (Struct) v7Var4.a();
                }
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    device.extProto_ = this.extProto_;
                } else {
                    device.extProto_ = o7Var.f();
                }
                onBuilt();
                return device;
            }

            public Builder clearAudioContext() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                    onChanged();
                    return this;
                }
                this.audioContext_ = null;
                this.audioContextBuilder_ = null;
                return this;
            }

            public Builder clearConnection() {
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                    onChanged();
                    return this;
                }
                this.connection_ = null;
                this.connectionBuilder_ = null;
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContext getAudioContext() {
                v7 v7Var = this.audioContextBuilder_;
                if (v7Var != null) {
                    return (AudioContext) v7Var.d();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContextOrBuilder getAudioContextOrBuilder() {
                v7 v7Var = this.audioContextBuilder_;
                if (v7Var != null) {
                    return (AudioContextOrBuilder) v7Var.e();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getCarrier() {
                Object obj = this.carrier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.carrier_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getCarrierBytes() {
                Object obj = this.carrier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.carrier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Connection getConnection() {
                v7 v7Var = this.connectionBuilder_;
                if (v7Var != null) {
                    return (Connection) v7Var.d();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionOrBuilder getConnectionOrBuilder() {
                v7 v7Var = this.connectionBuilder_;
                if (v7Var != null) {
                    return (ConnectionOrBuilder) v7Var.e();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionType getContype() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getContypeValue() {
                return this.contype_;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.s;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getDnt() {
                return this.dnt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Geo getGeo() {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    return (Geo) v7Var.d();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    return (GeoOrBuilder) v7Var.e();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getGeofetch() {
                return this.geofetch_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getHwv() {
                Object obj = this.hwv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hwv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getHwvBytes() {
                Object obj = this.hwv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hwv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIfa() {
                Object obj = this.ifa_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifa_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIfaBytes() {
                Object obj = this.ifa_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifa_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIp() {
                Object obj = this.ip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpBytes() {
                Object obj = this.ip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getIptr() {
                return this.iptr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIpv6() {
                Object obj = this.ipv6_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ipv6_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpv6Bytes() {
                Object obj = this.ipv6_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ipv6_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getJs() {
                return this.js_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getLmt() {
                return this.lmt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMake() {
                Object obj = this.make_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.make_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMakeBytes() {
                Object obj = this.make_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.make_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmnc() {
                Object obj = this.mccmnc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmnc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncBytes() {
                Object obj = this.mccmnc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmnc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmncsim() {
                Object obj = this.mccmncsim_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmncsim_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncsimBytes() {
                Object obj = this.mccmncsim_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmncsim_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public OS getOs() {
                OS osValueOf = OS.valueOf(this.os_);
                return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getOsValue() {
                return this.os_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getOsv() {
                Object obj = this.osv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getOsvBytes() {
                Object obj = this.osv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getPpi() {
                return this.ppi_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public float getPxratio() {
                return this.pxratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public DeviceType getType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
                return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getUa() {
                Object obj = this.ua_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ua_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getUaBytes() {
                Object obj = this.ua_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ua_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getXff() {
                Object obj = this.xff_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.xff_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getXffBytes() {
                Object obj = this.xff_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.xff_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasAudioContext() {
                return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasConnection() {
                return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.t;
                w4Var.c(Device.class, Builder.class);
                return w4Var;
            }

            public Builder mergeAudioContext(AudioContext audioContext) {
                v7 v7Var = this.audioContextBuilder_;
                if (v7Var != null) {
                    v7Var.f(audioContext);
                    return this;
                }
                AudioContext audioContext2 = this.audioContext_;
                if (audioContext2 != null) {
                    this.audioContext_ = AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
                } else {
                    this.audioContext_ = audioContext;
                }
                onChanged();
                return this;
            }

            public Builder mergeConnection(Connection connection) {
                v7 v7Var = this.connectionBuilder_;
                if (v7Var != null) {
                    v7Var.f(connection);
                    return this;
                }
                Connection connection2 = this.connection_;
                if (connection2 != null) {
                    this.connection_ = Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
                } else {
                    this.connection_ = connection;
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

            public Builder mergeGeo(Geo geo) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    v7Var.f(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
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

            public Builder setAudioContext(AudioContext.Builder builder) {
                v7 v7Var = this.audioContextBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.audioContext_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setConnection(Connection.Builder builder) {
                v7 v7Var = this.connectionBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.connection_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setContypeValue(int i) {
                this.contype_ = i;
                onChanged();
                return this;
            }

            public Builder setDnt(boolean z) {
                this.dnt_ = z;
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

            public Builder setGeo(Geo.Builder builder) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.geo_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setGeofetch(boolean z) {
                this.geofetch_ = z;
                onChanged();
                return this;
            }

            public Builder setH(int i) {
                this.h_ = i;
                onChanged();
                return this;
            }

            public Builder setIptr(boolean z) {
                this.iptr_ = z;
                onChanged();
                return this;
            }

            public Builder setJs(boolean z) {
                this.js_ = z;
                onChanged();
                return this;
            }

            public Builder setLmt(boolean z) {
                this.lmt_ = z;
                onChanged();
                return this;
            }

            public Builder setOsValue(int i) {
                this.os_ = i;
                onChanged();
                return this;
            }

            public Builder setPpi(int i) {
                this.ppi_ = i;
                onChanged();
                return this;
            }

            public Builder setPxratio(float f) {
                this.pxratio_ = f;
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

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.dnt_ = false;
                this.lmt_ = false;
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.h_ = 0;
                this.w_ = 0;
                this.ppi_ = 0;
                this.pxratio_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.js_ = false;
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.iptr_ = false;
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.geofetch_ = false;
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                } else {
                    this.connection_ = null;
                    this.connectionBuilder_ = null;
                }
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                } else {
                    this.audioContext_ = null;
                    this.audioContextBuilder_ = null;
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

            public Builder clearCarrier() {
                this.carrier_ = Device.getDefaultInstance().getCarrier();
                onChanged();
                return this;
            }

            public Builder clearHwv() {
                this.hwv_ = Device.getDefaultInstance().getHwv();
                onChanged();
                return this;
            }

            public Builder clearIfa() {
                this.ifa_ = Device.getDefaultInstance().getIfa();
                onChanged();
                return this;
            }

            public Builder clearIp() {
                this.ip_ = Device.getDefaultInstance().getIp();
                onChanged();
                return this;
            }

            public Builder clearIpv6() {
                this.ipv6_ = Device.getDefaultInstance().getIpv6();
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.lang_ = Device.getDefaultInstance().getLang();
                onChanged();
                return this;
            }

            public Builder clearMake() {
                this.make_ = Device.getDefaultInstance().getMake();
                onChanged();
                return this;
            }

            public Builder clearMccmnc() {
                this.mccmnc_ = Device.getDefaultInstance().getMccmnc();
                onChanged();
                return this;
            }

            public Builder clearMccmncsim() {
                this.mccmncsim_ = Device.getDefaultInstance().getMccmncsim();
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.model_ = Device.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder clearOsv() {
                this.osv_ = Device.getDefaultInstance().getOsv();
                onChanged();
                return this;
            }

            public Builder clearUa() {
                this.ua_ = Device.getDefaultInstance().getUa();
                onChanged();
                return this;
            }

            public Builder clearXff() {
                this.xff_ = Device.getDefaultInstance().getXff();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public AudioContext.Builder getAudioContextBuilder() {
                onChanged();
                return (AudioContext.Builder) getAudioContextFieldBuilder().c();
            }

            public Connection.Builder getConnectionBuilder() {
                onChanged();
                return (Connection.Builder) getConnectionFieldBuilder().c();
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

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().c();
            }

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.type_ != 0) {
                    setTypeValue(device.getTypeValue());
                }
                if (!device.getUa().isEmpty()) {
                    this.ua_ = device.ua_;
                    onChanged();
                }
                if (!device.getIfa().isEmpty()) {
                    this.ifa_ = device.ifa_;
                    onChanged();
                }
                if (device.getDnt()) {
                    setDnt(device.getDnt());
                }
                if (device.getLmt()) {
                    setLmt(device.getLmt());
                }
                if (!device.getMake().isEmpty()) {
                    this.make_ = device.make_;
                    onChanged();
                }
                if (!device.getModel().isEmpty()) {
                    this.model_ = device.model_;
                    onChanged();
                }
                if (device.os_ != 0) {
                    setOsValue(device.getOsValue());
                }
                if (!device.getOsv().isEmpty()) {
                    this.osv_ = device.osv_;
                    onChanged();
                }
                if (!device.getHwv().isEmpty()) {
                    this.hwv_ = device.hwv_;
                    onChanged();
                }
                if (device.getH() != 0) {
                    setH(device.getH());
                }
                if (device.getW() != 0) {
                    setW(device.getW());
                }
                if (device.getPpi() != 0) {
                    setPpi(device.getPpi());
                }
                if (device.getPxratio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    setPxratio(device.getPxratio());
                }
                if (device.getJs()) {
                    setJs(device.getJs());
                }
                if (!device.getLang().isEmpty()) {
                    this.lang_ = device.lang_;
                    onChanged();
                }
                if (!device.getIp().isEmpty()) {
                    this.ip_ = device.ip_;
                    onChanged();
                }
                if (!device.getIpv6().isEmpty()) {
                    this.ipv6_ = device.ipv6_;
                    onChanged();
                }
                if (!device.getXff().isEmpty()) {
                    this.xff_ = device.xff_;
                    onChanged();
                }
                if (device.getIptr()) {
                    setIptr(device.getIptr());
                }
                if (!device.getCarrier().isEmpty()) {
                    this.carrier_ = device.carrier_;
                    onChanged();
                }
                if (!device.getMccmnc().isEmpty()) {
                    this.mccmnc_ = device.mccmnc_;
                    onChanged();
                }
                if (!device.getMccmncsim().isEmpty()) {
                    this.mccmncsim_ = device.mccmncsim_;
                    onChanged();
                }
                if (device.contype_ != 0) {
                    setContypeValue(device.getContypeValue());
                }
                if (device.getGeofetch()) {
                    setGeofetch(device.getGeofetch());
                }
                if (device.hasGeo()) {
                    mergeGeo(device.getGeo());
                }
                if (device.hasConnection()) {
                    mergeConnection(device.getConnection());
                }
                if (device.hasAudioContext()) {
                    mergeAudioContext(device.getAudioContext());
                }
                if (device.hasExt()) {
                    mergeExt(device.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!device.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = device.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(device.extProto_);
                        }
                        onChanged();
                    }
                } else if (!device.extProto_.isEmpty()) {
                    boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var = this.extProtoBuilder_;
                    if (zIsEmpty) {
                        o7 extProtoFieldBuilder = null;
                        o7Var.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = device.extProto_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var.a(device.extProto_);
                    }
                }
                mergeUnknownFields(((y4) device).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setCarrier(String str) {
                str.getClass();
                this.carrier_ = str;
                onChanged();
                return this;
            }

            public Builder setCarrierBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.carrier_ = byteString;
                onChanged();
                return this;
            }

            public Builder setContype(ConnectionType connectionType) {
                connectionType.getClass();
                this.contype_ = connectionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setHwv(String str) {
                str.getClass();
                this.hwv_ = str;
                onChanged();
                return this;
            }

            public Builder setHwvBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.hwv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIfa(String str) {
                str.getClass();
                this.ifa_ = str;
                onChanged();
                return this;
            }

            public Builder setIfaBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.ifa_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIp(String str) {
                str.getClass();
                this.ip_ = str;
                onChanged();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.ip_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIpv6(String str) {
                str.getClass();
                this.ipv6_ = str;
                onChanged();
                return this;
            }

            public Builder setIpv6Bytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.ipv6_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLang(String str) {
                str.getClass();
                this.lang_ = str;
                onChanged();
                return this;
            }

            public Builder setLangBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.lang_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMake(String str) {
                str.getClass();
                this.make_ = str;
                onChanged();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.make_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmnc(String str) {
                str.getClass();
                this.mccmnc_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.mccmnc_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmncsim(String str) {
                str.getClass();
                this.mccmncsim_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncsimBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.mccmncsim_ = byteString;
                onChanged();
                return this;
            }

            public Builder setModel(String str) {
                str.getClass();
                this.model_ = str;
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.model_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOs(OS os) {
                os.getClass();
                this.os_ = os.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsv(String str) {
                str.getClass();
                this.osv_ = str;
                onChanged();
                return this;
            }

            public Builder setOsvBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.osv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(DeviceType deviceType) {
                deviceType.getClass();
                this.type_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUa(String str) {
                str.getClass();
                this.ua_ = str;
                onChanged();
                return this;
            }

            public Builder setUaBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.ua_ = byteString;
                onChanged();
                return this;
            }

            public Builder setXff(String str) {
                str.getClass();
                this.xff_ = str;
                onChanged();
                return this;
            }

            public Builder setXffBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.xff_ = byteString;
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
            public Device mo250getDefaultInstanceForType() {
                return Device.getDefaultInstance();
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

            public Builder setAudioContext(AudioContext audioContext) {
                v7 v7Var = this.audioContextBuilder_;
                if (v7Var == null) {
                    audioContext.getClass();
                    this.audioContext_ = audioContext;
                    onChanged();
                    return this;
                }
                v7Var.h(audioContext);
                return this;
            }

            public Builder setConnection(Connection connection) {
                v7 v7Var = this.connectionBuilder_;
                if (v7Var == null) {
                    connection.getClass();
                    this.connection_ = connection;
                    onChanged();
                    return this;
                }
                v7Var.h(connection);
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

            public Builder setGeo(Geo geo) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var == null) {
                    geo.getClass();
                    this.geo_ = geo;
                    onChanged();
                    return this;
                }
                v7Var.h(geo);
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

            private Builder(h4 h4Var) {
                super(h4Var);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Device device = null;
                try {
                    try {
                        Device device2 = (Device) Device.PARSER.parsePartialFrom(rVar, o3Var);
                        if (device2 != null) {
                            mergeFrom(device2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Device device3 = (Device) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            device = device3;
                            if (device != null) {
                                mergeFrom(device);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (device != null) {
                        mergeFrom(device);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Connection extends y4 implements ConnectionOrBuilder {
            private static final Connection DEFAULT_INSTANCE = new Connection();
            private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.Connection.1
                @Override // com.explorestack.protobuf.g7
                public Connection parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                    return new Connection(rVar, o3Var);
                }
            };
            public static final int PROXY_FIELD_NUMBER = 2;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VPN_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int proxy_;
            private int type_;
            private int vpn_;

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            public static final class Builder extends g4 implements ConnectionOrBuilder {
                private int proxy_;
                private int type_;
                private int vpn_;

                private Builder() {
                    super(null);
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                public Builder clearProxy() {
                    this.proxy_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearVpn() {
                    this.vpn_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.u;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection buildPartial() {
                    Connection connection = new Connection(this);
                    connection.type_ = this.type_;
                    connection.proxy_ = this.proxy_;
                    connection.vpn_ = this.vpn_;
                    onBuilt();
                    return connection;
                }

                @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.u;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getProxy() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getProxyValue() {
                    return this.proxy_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionType getType() {
                    ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                    return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getVpn() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getVpnValue() {
                    return this.vpn_;
                }

                @Override // com.explorestack.protobuf.g4
                public w4 internalGetFieldAccessorTable() {
                    w4 w4Var = b.v;
                    w4Var.c(Connection.class, Builder.class);
                    return w4Var;
                }

                public Builder setProxyValue(int i) {
                    this.proxy_ = i;
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i) {
                    this.type_ = i;
                    onChanged();
                    return this;
                }

                public Builder setVpnValue(int i) {
                    this.vpn_ = i;
                    onChanged();
                    return this;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = y4.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection build() {
                    Connection connectionBuildPartial = buildPartial();
                    if (connectionBuildPartial.isInitialized()) {
                        return connectionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionBuildPartial);
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo247clone() {
                    return (Builder) super.mo247clone();
                }

                public Builder mergeFrom(Connection connection) {
                    if (connection == Connection.getDefaultInstance()) {
                        return this;
                    }
                    if (connection.type_ != 0) {
                        setTypeValue(connection.getTypeValue());
                    }
                    if (connection.proxy_ != 0) {
                        setProxyValue(connection.getProxyValue());
                    }
                    if (connection.vpn_ != 0) {
                        setVpnValue(connection.getVpnValue());
                    }
                    mergeUnknownFields(((y4) connection).unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(s8 s8Var) {
                    return (Builder) super.mergeUnknownFields(s8Var);
                }

                public Builder setProxy(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.proxy_ = connectionStatus.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setType(ConnectionType connectionType) {
                    connectionType.getClass();
                    this.type_ = connectionType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setVpn(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.vpn_ = connectionStatus.getNumber();
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
                public Connection mo250getDefaultInstanceForType() {
                    return Connection.getDefaultInstance();
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
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Connection) {
                        return mergeFrom((Connection) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                    Connection connection = null;
                    try {
                        try {
                            Connection connection2 = (Connection) Connection.PARSER.parsePartialFrom(rVar, o3Var);
                            if (connection2 != null) {
                                mergeFrom(connection2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Connection connection3 = (Connection) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                connection = connection3;
                                if (connection != null) {
                                    mergeFrom(connection);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (connection != null) {
                            mergeFrom(connection);
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
                if (!(obj instanceof Connection)) {
                    return super.equals(obj);
                }
                Connection connection = (Connection) obj;
                return this.type_ == connection.type_ && this.proxy_ == connection.proxy_ && this.vpn_ == connection.vpn_ && this.unknownFields.equals(connection.unknownFields);
            }

            public static Connection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.u;
            }

            public static Builder newBuilder(Connection connection) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(connection);
            }

            public static Connection parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Connection) y4.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer);
            }

            public static g7 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public g7 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getProxy() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getProxyValue() {
                return this.proxy_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iG = this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
                int i2 = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i2 != connectionStatus.getNumber()) {
                    iG += w.g(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    iG += w.g(3, this.vpn_);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iG;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionType getType() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final s8 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getVpn() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getVpnValue() {
                return this.vpn_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = this.unknownFields.a.hashCode() + ((z.i(z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53), this.proxy_, 37, 3, 53) + this.vpn_) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.y4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.v;
                w4Var.c(Connection.class, Builder.class);
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
                return new Connection();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(w wVar) throws IOException {
                if (this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                    wVar.K(1, this.type_);
                }
                int i = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i != connectionStatus.getNumber()) {
                    wVar.K(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    wVar.K(3, this.vpn_);
                }
                this.unknownFields.writeTo(wVar);
            }

            private Connection(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                            this.vpn_ = rVar.o();
                                        }
                                    } else {
                                        this.proxy_ = rVar.o();
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
            public Connection mo250getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Connection parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Connection) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer, o3Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Connection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Connection parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString, o3Var);
            }

            public static Connection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr);
            }

            public static Connection parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr, o3Var);
            }

            public static Connection parseFrom(InputStream inputStream) throws IOException {
                return (Connection) y4.parseWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
                return (Connection) y4.parseWithIOException(PARSER, inputStream, o3Var);
            }

            public static Connection parseFrom(r rVar) throws IOException {
                return (Connection) y4.parseWithIOException(PARSER, rVar);
            }

            public static Connection parseFrom(r rVar, o3 o3Var) throws IOException {
                return (Connection) y4.parseWithIOException(PARSER, rVar, o3Var);
            }

            private Connection(g4 g4Var) {
                super(g4Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            private Connection() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                this.proxy_ = 0;
                this.vpn_ = 0;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ConnectionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo250getDefaultInstanceForType();

            ConnectionStatus getProxy();

            int getProxyValue();

            ConnectionType getType();

            int getTypeValue();

            ConnectionStatus getVpn();

            int getVpnValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (this.type_ != device.type_ || !getUa().equals(device.getUa()) || !getIfa().equals(device.getIfa()) || getDnt() != device.getDnt() || getLmt() != device.getLmt() || !getMake().equals(device.getMake()) || !getModel().equals(device.getModel()) || this.os_ != device.os_ || !getOsv().equals(device.getOsv()) || !getHwv().equals(device.getHwv()) || getH() != device.getH() || getW() != device.getW() || getPpi() != device.getPpi() || Float.floatToIntBits(getPxratio()) != Float.floatToIntBits(device.getPxratio()) || getJs() != device.getJs() || !getLang().equals(device.getLang()) || !getIp().equals(device.getIp()) || !getIpv6().equals(device.getIpv6()) || !getXff().equals(device.getXff()) || getIptr() != device.getIptr() || !getCarrier().equals(device.getCarrier()) || !getMccmnc().equals(device.getMccmnc()) || !getMccmncsim().equals(device.getMccmncsim()) || this.contype_ != device.contype_ || getGeofetch() != device.getGeofetch() || hasGeo() != device.hasGeo()) {
                return false;
            }
            if ((hasGeo() && !getGeo().equals(device.getGeo())) || hasConnection() != device.hasConnection()) {
                return false;
            }
            if ((hasConnection() && !getConnection().equals(device.getConnection())) || hasAudioContext() != device.hasAudioContext()) {
                return false;
            }
            if ((!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && hasExt() == device.hasExt()) {
                return (!hasExt() || getExt().equals(device.getExt())) && getExtProtoList().equals(device.getExtProtoList()) && this.unknownFields.equals(device.unknownFields);
            }
            return false;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.s;
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContext getAudioContext() {
            AudioContext audioContext = this.audioContext_;
            return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getCarrier() {
            Object obj = this.carrier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.carrier_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getCarrierBytes() {
            Object obj = this.carrier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.carrier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Connection getConnection() {
            Connection connection = this.connection_;
            return connection == null ? Connection.getDefaultInstance() : connection;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getDnt() {
            return this.dnt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getGeofetch() {
            return this.geofetch_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getIptr() {
            return this.iptr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIpv6() {
            Object obj = this.ipv6_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ipv6_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpv6Bytes() {
            Object obj = this.ipv6_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ipv6_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getJs() {
            return this.js_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getLmt() {
            return this.lmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmnc() {
            Object obj = this.mccmnc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmnc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncBytes() {
            Object obj = this.mccmnc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmnc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmncsim() {
            Object obj = this.mccmncsim_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmncsim_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncsimBytes() {
            Object obj = this.mccmncsim_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmncsim_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getPpi() {
            return this.ppi_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public float getPxratio() {
            return this.pxratio_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
            if (!getUaBytes().isEmpty()) {
                iG += y4.computeStringSize(2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                iG += y4.computeStringSize(3, this.ifa_);
            }
            if (this.dnt_) {
                iG += w.c(4);
            }
            if (this.lmt_) {
                iG += w.c(5);
            }
            if (!getMakeBytes().isEmpty()) {
                iG += y4.computeStringSize(6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                iG += y4.computeStringSize(7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                iG += w.g(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                iG += y4.computeStringSize(9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                iG += y4.computeStringSize(10, this.hwv_);
            }
            int i2 = this.h_;
            if (i2 != 0) {
                iG += w.t(11, i2);
            }
            int i3 = this.w_;
            if (i3 != 0) {
                iG += w.t(12, i3);
            }
            int i4 = this.ppi_;
            if (i4 != 0) {
                iG += w.t(13, i4);
            }
            if (this.pxratio_ != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                iG += w.j(14);
            }
            if (this.js_) {
                iG += w.c(15);
            }
            if (!getLangBytes().isEmpty()) {
                iG += y4.computeStringSize(16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                iG += y4.computeStringSize(17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                iG += y4.computeStringSize(18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                iG += y4.computeStringSize(19, this.xff_);
            }
            if (this.iptr_) {
                iG += w.c(20);
            }
            if (!getCarrierBytes().isEmpty()) {
                iG += y4.computeStringSize(21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                iG += y4.computeStringSize(22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                iG += y4.computeStringSize(23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                iG += w.g(24, this.contype_);
            }
            if (this.geofetch_) {
                iG += w.c(25);
            }
            if (this.geo_ != null) {
                iG += w.o(26, getGeo());
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                iG += w.o(27, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                iG += w.o(28, getExt());
            }
            if (this.connection_ != null) {
                iG += w.o(29, getConnection());
            }
            if (this.audioContext_ != null) {
                iG += w.o(30, getAudioContext());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iG;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public DeviceType getType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getUa() {
            Object obj = this.ua_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ua_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getUaBytes() {
            Object obj = this.ua_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ua_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getXff() {
            Object obj = this.xff_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.xff_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getXffBytes() {
            Object obj = this.xff_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.xff_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasAudioContext() {
            return this.audioContext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasConnection() {
            return this.connection_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iC = l5.c(getGeofetch()) + z.i((((getMccmncsim().hashCode() + ((((getMccmnc().hashCode() + ((((getCarrier().hashCode() + ((((l5.c(getIptr()) + ((((getXff().hashCode() + ((((getIpv6().hashCode() + ((((getIp().hashCode() + ((((getLang().hashCode() + ((((l5.c(getJs()) + ((((Float.floatToIntBits(getPxratio()) + ((((getPpi() + ((((getW() + ((((getH() + ((((getHwv().hashCode() + ((((getOsv().hashCode() + z.i((((getModel().hashCode() + ((((getMake().hashCode() + ((((l5.c(getLmt()) + ((((l5.c(getDnt()) + ((((getIfa().hashCode() + ((((getUa().hashCode() + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53, this.os_, 37, 9, 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53)) * 37) + 24) * 53, this.contype_, 37, 25, 53);
            if (hasGeo()) {
                iC = getGeo().hashCode() + pv1.c(iC, 37, 26, 53);
            }
            if (hasConnection()) {
                iC = getConnection().hashCode() + pv1.c(iC, 37, 29, 53);
            }
            if (hasAudioContext()) {
                iC = getAudioContext().hashCode() + pv1.c(iC, 37, 30, 53);
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
            w4 w4Var = b.t;
            w4Var.c(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
                wVar.K(1, this.type_);
            }
            if (!getUaBytes().isEmpty()) {
                y4.writeString(wVar, 2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                y4.writeString(wVar, 3, this.ifa_);
            }
            boolean z = this.dnt_;
            if (z) {
                wVar.A(4, z);
            }
            boolean z2 = this.lmt_;
            if (z2) {
                wVar.A(5, z2);
            }
            if (!getMakeBytes().isEmpty()) {
                y4.writeString(wVar, 6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                y4.writeString(wVar, 7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                wVar.K(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                y4.writeString(wVar, 9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                y4.writeString(wVar, 10, this.hwv_);
            }
            int i = this.h_;
            if (i != 0) {
                wVar.T(11, i);
            }
            int i2 = this.w_;
            if (i2 != 0) {
                wVar.T(12, i2);
            }
            int i3 = this.ppi_;
            if (i3 != 0) {
                wVar.T(13, i3);
            }
            float f = this.pxratio_;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wVar.J(14, f);
            }
            boolean z3 = this.js_;
            if (z3) {
                wVar.A(15, z3);
            }
            if (!getLangBytes().isEmpty()) {
                y4.writeString(wVar, 16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                y4.writeString(wVar, 17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                y4.writeString(wVar, 18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                y4.writeString(wVar, 19, this.xff_);
            }
            boolean z4 = this.iptr_;
            if (z4) {
                wVar.A(20, z4);
            }
            if (!getCarrierBytes().isEmpty()) {
                y4.writeString(wVar, 21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                y4.writeString(wVar, 22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                y4.writeString(wVar, 23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                wVar.K(24, this.contype_);
            }
            boolean z5 = this.geofetch_;
            if (z5) {
                wVar.A(25, z5);
            }
            if (this.geo_ != null) {
                wVar.M(26, getGeo());
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                wVar.M(27, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                wVar.M(28, getExt());
            }
            if (this.connection_ != null) {
                wVar.M(29, getConnection());
            }
            if (this.audioContext_ != null) {
                wVar.M(30, getAudioContext());
            }
            this.unknownFields.writeTo(wVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Device(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            this();
            o3Var.getClass();
            p8 p8VarB = s8.b();
            boolean z = false;
            byte b = false;
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
                                this.ua_ = rVar.E();
                                continue;
                            case 26:
                                this.ifa_ = rVar.E();
                                continue;
                            case 32:
                                this.dnt_ = rVar.l();
                                continue;
                            case 40:
                                this.lmt_ = rVar.l();
                                continue;
                            case 50:
                                this.make_ = rVar.E();
                                continue;
                            case 58:
                                this.model_ = rVar.E();
                                continue;
                            case 64:
                                this.os_ = rVar.o();
                                continue;
                            case 74:
                                this.osv_ = rVar.E();
                                continue;
                            case 82:
                                this.hwv_ = rVar.E();
                                continue;
                            case 88:
                                this.h_ = rVar.G();
                                continue;
                            case 96:
                                this.w_ = rVar.G();
                                continue;
                            case 104:
                                this.ppi_ = rVar.G();
                                continue;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                this.pxratio_ = rVar.r();
                                continue;
                            case com.safedk.android.analytics.brandsafety.b.v /* 120 */:
                                this.js_ = rVar.l();
                                continue;
                            case 130:
                                this.lang_ = rVar.E();
                                continue;
                            case 138:
                                this.ip_ = rVar.E();
                                continue;
                            case 146:
                                this.ipv6_ = rVar.E();
                                continue;
                            case 154:
                                this.xff_ = rVar.E();
                                continue;
                            case 160:
                                this.iptr_ = rVar.l();
                                continue;
                            case 170:
                                this.carrier_ = rVar.E();
                                continue;
                            case 178:
                                this.mccmnc_ = rVar.E();
                                continue;
                            case 186:
                                this.mccmncsim_ = rVar.E();
                                continue;
                            case 192:
                                this.contype_ = rVar.o();
                                continue;
                            case 200:
                                this.geofetch_ = rVar.l();
                                continue;
                            case 210:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) rVar.v(Geo.parser(), o3Var);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if (b == false) {
                                    this.extProto_ = new ArrayList();
                                    b = true;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
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
                            case 234:
                                Connection connection = this.connection_;
                                Connection.Builder builder3 = connection != null ? connection.toBuilder() : null;
                                Connection connection2 = (Connection) rVar.v(Connection.parser(), o3Var);
                                this.connection_ = connection2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(connection2);
                                    this.connection_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 242:
                                AudioContext audioContext = this.audioContext_;
                                AudioContext.Builder builder4 = audioContext != null ? audioContext.toBuilder() : null;
                                AudioContext audioContext2 = (AudioContext) rVar.v(AudioContext.parser(), o3Var);
                                this.audioContext_ = audioContext2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(audioContext2);
                                    this.audioContext_ = builder4.buildPartial();
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

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContextOrBuilder getAudioContextOrBuilder() {
            return getAudioContext();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionOrBuilder getConnectionOrBuilder() {
            return getConnection();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Device mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Device parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Device) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString, o3Var);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr);
        }

        public static Device parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr, o3Var);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Device) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Device parseFrom(r rVar) throws IOException {
            return (Device) y4.parseWithIOException(PARSER, rVar);
        }

        public static Device parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Device) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Device(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Device() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ua_ = "";
            this.ifa_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.hwv_ = "";
            this.lang_ = "";
            this.ip_ = "";
            this.ipv6_ = "";
            this.xff_ = "";
            this.carrier_ = "";
            this.mccmnc_ = "";
            this.mccmncsim_ = "";
            this.contype_ = 0;
            this.extProto_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DeviceOrBuilder extends MessageOrBuilder {
        Device.AudioContext getAudioContext();

        Device.AudioContextOrBuilder getAudioContextOrBuilder();

        String getCarrier();

        ByteString getCarrierBytes();

        Device.Connection getConnection();

        Device.ConnectionOrBuilder getConnectionOrBuilder();

        ConnectionType getContype();

        int getContypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo250getDefaultInstanceForType();

        boolean getDnt();

        Struct getExt();

        c8 getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i);

        List<? extends g> getExtProtoOrBuilderList();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        boolean getGeofetch();

        int getH();

        String getHwv();

        ByteString getHwvBytes();

        String getIfa();

        ByteString getIfaBytes();

        String getIp();

        ByteString getIpBytes();

        boolean getIptr();

        String getIpv6();

        ByteString getIpv6Bytes();

        boolean getJs();

        String getLang();

        ByteString getLangBytes();

        boolean getLmt();

        String getMake();

        ByteString getMakeBytes();

        String getMccmnc();

        ByteString getMccmncBytes();

        String getMccmncsim();

        ByteString getMccmncsimBytes();

        String getModel();

        ByteString getModelBytes();

        OS getOs();

        int getOsValue();

        String getOsv();

        ByteString getOsvBytes();

        int getPpi();

        float getPxratio();

        DeviceType getType();

        int getTypeValue();

        String getUa();

        ByteString getUaBytes();

        int getW();

        String getXff();

        ByteString getXffBytes();

        boolean hasAudioContext();

        boolean hasConnection();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Geo extends y4 implements GeoOrBuilder {
        public static final int ACCUR_FIELD_NUMBER = 4;
        public static final int CITY_FIELD_NUMBER = 10;
        public static final int COUNTRY_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int IPSERV_FIELD_NUMBER = 6;
        public static final int LASTFIX_FIELD_NUMBER = 5;
        public static final int LAT_FIELD_NUMBER = 2;
        public static final int LON_FIELD_NUMBER = 3;
        public static final int METRO_FIELD_NUMBER = 9;
        public static final int REGION_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UTCOFFSET_FIELD_NUMBER = 12;
        public static final int ZIP_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int accur_;
        private volatile Object city_;
        private volatile Object country_;
        private List<Any> extProto_;
        private Struct ext_;
        private int ipserv_;
        private long lastfix_;
        private float lat_;
        private float lon_;
        private byte memoizedIsInitialized;
        private volatile Object metro_;
        private volatile Object region_;
        private int type_;
        private int utcoffset_;
        private volatile Object zip_;
        private static final Geo DEFAULT_INSTANCE = new Geo();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Geo.1
            @Override // com.explorestack.protobuf.g7
            public Geo parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Geo(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements GeoOrBuilder {
            private int accur_;
            private int bitField0_;
            private Object city_;
            private Object country_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int ipserv_;
            private long lastfix_;
            private float lat_;
            private float lon_;
            private Object metro_;
            private Object region_;
            private int type_;
            private int utcoffset_;
            private Object zip_;

            private Builder() {
                super(null);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder clearAccur() {
                this.accur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIpserv() {
                this.ipserv_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLat() {
                this.lat_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                onChanged();
                return this;
            }

            public Builder clearLon() {
                this.lon_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUtcoffset() {
                this.utcoffset_ = 0;
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
                return b.q;
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
            public Geo buildPartial() {
                Geo geo = new Geo(this);
                geo.type_ = this.type_;
                geo.lat_ = this.lat_;
                geo.lon_ = this.lon_;
                geo.accur_ = this.accur_;
                geo.lastfix_ = this.lastfix_;
                geo.ipserv_ = this.ipserv_;
                geo.country_ = this.country_;
                geo.region_ = this.region_;
                geo.metro_ = this.metro_;
                geo.city_ = this.city_;
                geo.zip_ = this.zip_;
                geo.utcoffset_ = this.utcoffset_;
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    geo.ext_ = this.ext_;
                } else {
                    geo.ext_ = (Struct) v7Var.a();
                }
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    geo.extProto_ = this.extProto_;
                } else {
                    geo.extProto_ = o7Var.f();
                }
                onBuilt();
                return geo;
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

            public Builder clearLastfix() {
                this.lastfix_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getAccur() {
                return this.accur_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.q;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public IpLocationService getIpserv() {
                IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
                return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getIpservValue() {
                return this.ipserv_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public long getLastfix() {
                return this.lastfix_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLat() {
                return this.lat_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLon() {
                return this.lon_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getMetro() {
                Object obj = this.metro_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.metro_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getMetroBytes() {
                Object obj = this.metro_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.metro_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getRegion() {
                Object obj = this.region_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.region_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getRegionBytes() {
                Object obj = this.region_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.region_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public LocationType getType() {
                LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
                return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getUtcoffset() {
                return this.utcoffset_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getZip() {
                Object obj = this.zip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.zip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getZipBytes() {
                Object obj = this.zip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.zip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.r;
                w4Var.c(Geo.class, Builder.class);
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

            public Builder setAccur(int i) {
                this.accur_ = i;
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

            public Builder setIpservValue(int i) {
                this.ipserv_ = i;
                onChanged();
                return this;
            }

            public Builder setLastfix(long j) {
                this.lastfix_ = j;
                onChanged();
                return this;
            }

            public Builder setLat(float f) {
                this.lat_ = f;
                onChanged();
                return this;
            }

            public Builder setLon(float f) {
                this.lon_ = f;
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public Builder setUtcoffset(int i) {
                this.utcoffset_ = i;
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
            public Geo build() {
                Geo geoBuildPartial = buildPartial();
                if (geoBuildPartial.isInitialized()) {
                    return geoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geoBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.lat_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.lon_ = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.accur_ = 0;
                this.lastfix_ = 0L;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.utcoffset_ = 0;
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

            public Builder clearCity() {
                this.city_ = Geo.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder clearCountry() {
                this.country_ = Geo.getDefaultInstance().getCountry();
                onChanged();
                return this;
            }

            public Builder clearMetro() {
                this.metro_ = Geo.getDefaultInstance().getMetro();
                onChanged();
                return this;
            }

            public Builder clearRegion() {
                this.region_ = Geo.getDefaultInstance().getRegion();
                onChanged();
                return this;
            }

            public Builder clearZip() {
                this.zip_ = Geo.getDefaultInstance().getZip();
                onChanged();
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

            public Builder mergeFrom(Geo geo) {
                if (geo == Geo.getDefaultInstance()) {
                    return this;
                }
                if (geo.type_ != 0) {
                    setTypeValue(geo.getTypeValue());
                }
                if (geo.getLat() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    setLat(geo.getLat());
                }
                if (geo.getLon() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    setLon(geo.getLon());
                }
                if (geo.getAccur() != 0) {
                    setAccur(geo.getAccur());
                }
                if (geo.getLastfix() != 0) {
                    setLastfix(geo.getLastfix());
                }
                if (geo.ipserv_ != 0) {
                    setIpservValue(geo.getIpservValue());
                }
                if (!geo.getCountry().isEmpty()) {
                    this.country_ = geo.country_;
                    onChanged();
                }
                if (!geo.getRegion().isEmpty()) {
                    this.region_ = geo.region_;
                    onChanged();
                }
                if (!geo.getMetro().isEmpty()) {
                    this.metro_ = geo.metro_;
                    onChanged();
                }
                if (!geo.getCity().isEmpty()) {
                    this.city_ = geo.city_;
                    onChanged();
                }
                if (!geo.getZip().isEmpty()) {
                    this.zip_ = geo.zip_;
                    onChanged();
                }
                if (geo.getUtcoffset() != 0) {
                    setUtcoffset(geo.getUtcoffset());
                }
                if (geo.hasExt()) {
                    mergeExt(geo.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!geo.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = geo.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(geo.extProto_);
                        }
                        onChanged();
                    }
                } else if (!geo.extProto_.isEmpty()) {
                    boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var = this.extProtoBuilder_;
                    if (zIsEmpty) {
                        o7 extProtoFieldBuilder = null;
                        o7Var.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = geo.extProto_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var.a(geo.extProto_);
                    }
                }
                mergeUnknownFields(((y4) geo).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setCity(String str) {
                str.getClass();
                this.city_ = str;
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.city_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCountry(String str) {
                str.getClass();
                this.country_ = str;
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.country_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIpserv(IpLocationService ipLocationService) {
                ipLocationService.getClass();
                this.ipserv_ = ipLocationService.getNumber();
                onChanged();
                return this;
            }

            public Builder setMetro(String str) {
                str.getClass();
                this.metro_ = str;
                onChanged();
                return this;
            }

            public Builder setMetroBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.metro_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRegion(String str) {
                str.getClass();
                this.region_ = str;
                onChanged();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.region_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(LocationType locationType) {
                locationType.getClass();
                this.type_ = locationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setZip(String str) {
                str.getClass();
                this.zip_ = str;
                onChanged();
                return this;
            }

            public Builder setZipBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.zip_ = byteString;
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
            public Geo mo250getDefaultInstanceForType() {
                return Geo.getDefaultInstance();
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

            private Builder(h4 h4Var) {
                super(h4Var);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
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
                if (message instanceof Geo) {
                    return mergeFrom((Geo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Geo geo = null;
                try {
                    try {
                        Geo geo2 = (Geo) Geo.PARSER.parsePartialFrom(rVar, o3Var);
                        if (geo2 != null) {
                            mergeFrom(geo2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Geo geo3 = (Geo) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            geo = geo3;
                            if (geo != null) {
                                mergeFrom(geo);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (geo != null) {
                        mergeFrom(geo);
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
            if (!(obj instanceof Geo)) {
                return super.equals(obj);
            }
            Geo geo = (Geo) obj;
            if (this.type_ == geo.type_ && Float.floatToIntBits(getLat()) == Float.floatToIntBits(geo.getLat()) && Float.floatToIntBits(getLon()) == Float.floatToIntBits(geo.getLon()) && getAccur() == geo.getAccur() && getLastfix() == geo.getLastfix() && this.ipserv_ == geo.ipserv_ && getCountry().equals(geo.getCountry()) && getRegion().equals(geo.getRegion()) && getMetro().equals(geo.getMetro()) && getCity().equals(geo.getCity()) && getZip().equals(geo.getZip()) && getUtcoffset() == geo.getUtcoffset() && hasExt() == geo.hasExt()) {
                return (!hasExt() || getExt().equals(geo.getExt())) && getExtProtoList().equals(geo.getExtProtoList()) && this.unknownFields.equals(geo.unknownFields);
            }
            return false;
        }

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.q;
        }

        public static Builder newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(geo);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getAccur() {
            return this.accur_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public IpLocationService getIpserv() {
            IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
            return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getIpservValue() {
            return this.ipserv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public long getLastfix() {
            return this.lastfix_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLon() {
            return this.lon_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getMetro() {
            Object obj = this.metro_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.metro_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getMetroBytes() {
            Object obj = this.metro_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.metro_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public g7 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iG = this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber() ? w.g(1, this.type_) : 0;
            if (this.lat_ != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                iG += w.j(2);
            }
            if (this.lon_ != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                iG += w.j(3);
            }
            int i2 = this.accur_;
            if (i2 != 0) {
                iG += w.t(4, i2);
            }
            long j = this.lastfix_;
            if (j != 0) {
                iG += w.v(5, j);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                iG += w.g(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                iG += y4.computeStringSize(7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                iG += y4.computeStringSize(8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                iG += y4.computeStringSize(9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                iG += y4.computeStringSize(10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                iG += y4.computeStringSize(11, this.zip_);
            }
            int i3 = this.utcoffset_;
            if (i3 != 0) {
                iG += w.l(12, i3);
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                iG += w.o(13, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                iG += w.o(14, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iG;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public LocationType getType() {
            LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
            return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getUtcoffset() {
            return this.utcoffset_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getZip() {
            Object obj = this.zip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.zip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getZipBytes() {
            Object obj = this.zip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.zip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int utcoffset = getUtcoffset() + ((((getZip().hashCode() + ((((getCity().hashCode() + ((((getMetro().hashCode() + ((((getRegion().hashCode() + ((((getCountry().hashCode() + z.i((((l5.d(getLastfix()) + ((((getAccur() + ((((Float.floatToIntBits(getLon()) + ((((Float.floatToIntBits(getLat()) + z.i((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53, this.ipserv_, 37, 7, 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53);
            if (hasExt()) {
                utcoffset = pv1.c(utcoffset, 37, 14, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                utcoffset = pv1.c(utcoffset, 37, 13, 53) + getExtProtoList().hashCode();
            }
            int iHashCode = this.unknownFields.a.hashCode() + (utcoffset * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.r;
            w4Var.c(Geo.class, Builder.class);
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
            return new Geo();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber()) {
                wVar.K(1, this.type_);
            }
            float f = this.lat_;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wVar.J(2, f);
            }
            float f2 = this.lon_;
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wVar.J(3, f2);
            }
            int i = this.accur_;
            if (i != 0) {
                wVar.T(4, i);
            }
            long j = this.lastfix_;
            if (j != 0) {
                wVar.V(5, j);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                wVar.K(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                y4.writeString(wVar, 7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                y4.writeString(wVar, 8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                y4.writeString(wVar, 9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                y4.writeString(wVar, 10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                y4.writeString(wVar, 11, this.zip_);
            }
            int i2 = this.utcoffset_;
            if (i2 != 0) {
                wVar.K(12, i2);
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                wVar.M(13, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                wVar.M(14, getExt());
            }
            this.unknownFields.writeTo(wVar);
        }

        private Geo(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                        switch (iF) {
                            case 0:
                                break;
                            case 8:
                                this.type_ = rVar.o();
                                continue;
                            case 21:
                                this.lat_ = rVar.r();
                                continue;
                            case 29:
                                this.lon_ = rVar.r();
                                continue;
                            case 32:
                                this.accur_ = rVar.G();
                                continue;
                            case 40:
                                this.lastfix_ = rVar.H();
                                continue;
                            case 48:
                                this.ipserv_ = rVar.o();
                                continue;
                            case 58:
                                this.country_ = rVar.E();
                                continue;
                            case 66:
                                this.region_ = rVar.E();
                                continue;
                            case 74:
                                this.metro_ = rVar.E();
                                continue;
                            case 82:
                                this.city_ = rVar.E();
                                continue;
                            case 90:
                                this.zip_ = rVar.E();
                                continue;
                            case 96:
                                this.utcoffset_ = rVar.t();
                                continue;
                            case 106:
                                if (!z2) {
                                    this.extProto_ = new ArrayList();
                                    z2 = true;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case ASSET_WRITE_ERROR_VALUE:
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

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Geo mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Geo) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Geo parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString, o3Var);
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr);
        }

        public static Geo parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr, o3Var);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Geo) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Geo parseFrom(r rVar) throws IOException {
            return (Geo) y4.parseWithIOException(PARSER, rVar);
        }

        public static Geo parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Geo) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Geo(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Geo() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ipserv_ = 0;
            this.country_ = "";
            this.region_ = "";
            this.metro_ = "";
            this.city_ = "";
            this.zip_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface GeoOrBuilder extends MessageOrBuilder {
        int getAccur();

        String getCity();

        ByteString getCityBytes();

        String getCountry();

        ByteString getCountryBytes();

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

        IpLocationService getIpserv();

        int getIpservValue();

        long getLastfix();

        float getLat();

        float getLon();

        String getMetro();

        ByteString getMetroBytes();

        String getRegion();

        ByteString getRegionBytes();

        LocationType getType();

        int getTypeValue();

        int getUtcoffset();

        String getZip();

        ByteString getZipBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Regs extends y4 implements RegsOrBuilder {
        public static final int COPPA_FIELD_NUMBER = 1;
        public static final int EXT_FIELD_NUMBER = 4;
        public static final int EXT_PROTO_FIELD_NUMBER = 3;
        public static final int GDPR_FIELD_NUMBER = 2;
        public static final int GPP_FIELD_NUMBER = 5;
        public static final int GPP_SID_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private boolean coppa_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean gdpr_;
        private int gppSidMemoizedSerializedSize;
        private g5 gppSid_;
        private volatile Object gpp_;
        private byte memoizedIsInitialized;
        private static final Regs DEFAULT_INSTANCE = new Regs();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Regs.1
            @Override // com.explorestack.protobuf.g7
            public Regs parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Regs(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements RegsOrBuilder {
            private int bitField0_;
            private boolean coppa_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean gdpr_;
            private g5 gppSid_;
            private Object gpp_;

            private Builder() {
                super(null);
                this.gpp_ = "";
                this.gppSid_ = y4.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder clearCoppa() {
                this.coppa_ = false;
                onChanged();
                return this;
            }

            public Builder clearGdpr() {
                this.gdpr_ = false;
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

            private void ensureGppSidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.gppSid_ = y4.mutableCopy(this.gppSid_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.y;
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
            public Regs buildPartial() {
                Regs regs = new Regs(this);
                regs.coppa_ = this.coppa_;
                regs.gdpr_ = this.gdpr_;
                regs.gpp_ = this.gpp_;
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    ((com.explorestack.protobuf.e) this.gppSid_).a = false;
                    this.bitField0_ = i & (-2);
                }
                regs.gppSid_ = this.gppSid_;
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    regs.ext_ = this.ext_;
                } else {
                    regs.ext_ = (Struct) v7Var.a();
                }
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    regs.extProto_ = this.extProto_;
                } else {
                    regs.extProto_ = o7Var.f();
                }
                onBuilt();
                return regs;
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

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getCoppa() {
                return this.coppa_;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.y;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getGdpr() {
                return this.gdpr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public String getGpp() {
                Object obj = this.gpp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gpp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public ByteString getGppBytes() {
                Object obj = this.gpp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gpp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSid(int i) {
                return ((z4) this.gppSid_).getInt(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSidCount() {
                return this.gppSid_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Integer> getGppSidList() {
                int i = this.bitField0_ & 1;
                g5 g5Var = this.gppSid_;
                return i != 0 ? Collections.unmodifiableList(g5Var) : g5Var;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.z;
                w4Var.c(Regs.class, Builder.class);
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

            public Builder setCoppa(boolean z) {
                this.coppa_ = z;
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

            public Builder setGdpr(boolean z) {
                this.gdpr_ = z;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
                ensureGppSidIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.gppSid_);
                onChanged();
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addGppSid(int i) {
                ensureGppSidIsMutable();
                ((z4) this.gppSid_).addInt(i);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Regs build() {
                Regs regsBuildPartial = buildPartial();
                if (regsBuildPartial.isInitialized()) {
                    return regsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) regsBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.coppa_ = false;
                this.gdpr_ = false;
                this.gpp_ = "";
                this.gppSid_ = y4.emptyIntList();
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
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ = i & (-4);
                    return this;
                }
                o7Var.g();
                return this;
            }

            public Builder clearGpp() {
                this.gpp_ = Regs.getDefaultInstance().getGpp();
                onChanged();
                return this;
            }

            public Builder clearGppSid() {
                this.gppSid_ = y4.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
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

            public Builder mergeFrom(Regs regs) {
                if (regs == Regs.getDefaultInstance()) {
                    return this;
                }
                if (regs.getCoppa()) {
                    setCoppa(regs.getCoppa());
                }
                if (regs.getGdpr()) {
                    setGdpr(regs.getGdpr());
                }
                if (!regs.getGpp().isEmpty()) {
                    this.gpp_ = regs.gpp_;
                    onChanged();
                }
                if (!regs.gppSid_.isEmpty()) {
                    if (this.gppSid_.isEmpty()) {
                        this.gppSid_ = regs.gppSid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureGppSidIsMutable();
                        this.gppSid_.addAll(regs.gppSid_);
                    }
                    onChanged();
                }
                if (regs.hasExt()) {
                    mergeExt(regs.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!regs.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = regs.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(regs.extProto_);
                        }
                        onChanged();
                    }
                } else if (!regs.extProto_.isEmpty()) {
                    boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var = this.extProtoBuilder_;
                    if (zIsEmpty) {
                        o7 extProtoFieldBuilder = null;
                        o7Var.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = regs.extProto_;
                        this.bitField0_ &= -3;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var.a(regs.extProto_);
                    }
                }
                mergeUnknownFields(((y4) regs).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setGpp(String str) {
                str.getClass();
                this.gpp_ = str;
                onChanged();
                return this;
            }

            public Builder setGppBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.gpp_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGppSid(int i, int i2) {
                ensureGppSidIsMutable();
                ((z4) this.gppSid_).setInt(i, i2);
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
            public Regs mo250getDefaultInstanceForType() {
                return Regs.getDefaultInstance();
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
                this.gpp_ = "";
                this.gppSid_ = y4.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
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
                if (message instanceof Regs) {
                    return mergeFrom((Regs) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Regs regs = null;
                try {
                    try {
                        Regs regs2 = (Regs) Regs.PARSER.parsePartialFrom(rVar, o3Var);
                        if (regs2 != null) {
                            mergeFrom(regs2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Regs regs3 = (Regs) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            regs = regs3;
                            if (regs != null) {
                                mergeFrom(regs);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (regs != null) {
                        mergeFrom(regs);
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
            if (!(obj instanceof Regs)) {
                return super.equals(obj);
            }
            Regs regs = (Regs) obj;
            if (getCoppa() == regs.getCoppa() && getGdpr() == regs.getGdpr() && getGpp().equals(regs.getGpp()) && getGppSidList().equals(regs.getGppSidList()) && hasExt() == regs.hasExt()) {
                return (!hasExt() || getExt().equals(regs.getExt())) && getExtProtoList().equals(regs.getExtProtoList()) && this.unknownFields.equals(regs.unknownFields);
            }
            return false;
        }

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.y;
        }

        public static Builder newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(regs);
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public String getGpp() {
            Object obj = this.gpp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public ByteString getGppBytes() {
            Object obj = this.gpp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSid(int i) {
            return ((z4) this.gppSid_).getInt(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Integer> getGppSidList() {
            return this.gppSid_;
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
            int iC = this.coppa_ ? w.c(1) : 0;
            if (this.gdpr_) {
                iC += w.c(2);
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                iC += w.o(3, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                iC += w.o(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                iC += y4.computeStringSize(5, this.gpp_);
            }
            int iU = 0;
            for (int i3 = 0; i3 < this.gppSid_.size(); i3++) {
                iU += w.u(((z4) this.gppSid_).getInt(i3));
            }
            int iM = iC + iU;
            if (!getGppSidList().isEmpty()) {
                iM = iM + 1 + w.m(iU);
            }
            this.gppSidMemoizedSerializedSize = iU;
            int serializedSize = this.unknownFields.getSerializedSize() + iM;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getGpp().hashCode() + ((((l5.c(getGdpr()) + ((((l5.c(getCoppa()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 5) * 53);
            if (getGppSidCount() > 0) {
                iHashCode = getGppSidList().hashCode() + pv1.c(iHashCode, 37, 6, 53);
            }
            if (hasExt()) {
                iHashCode = getExt().hashCode() + pv1.c(iHashCode, 37, 4, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashCode = getExtProtoList().hashCode() + pv1.c(iHashCode, 37, 3, 53);
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.z;
            w4Var.c(Regs.class, Builder.class);
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
            return new Regs();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        private Regs(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                    if (iF != 26) {
                                        if (iF != 34) {
                                            if (iF != 42) {
                                                if (iF != 48) {
                                                    if (iF != 50) {
                                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                                        }
                                                    } else {
                                                        int iK = rVar.k(rVar.x());
                                                        if ((i & 1) == 0 && rVar.d() > 0) {
                                                            this.gppSid_ = y4.newIntList();
                                                            i |= 1;
                                                        }
                                                        while (rVar.d() > 0) {
                                                            ((z4) this.gppSid_).addInt(rVar.G());
                                                        }
                                                        rVar.j(iK);
                                                    }
                                                } else {
                                                    if ((i & 1) == 0) {
                                                        this.gppSid_ = y4.newIntList();
                                                        i |= 1;
                                                    }
                                                    ((z4) this.gppSid_).addInt(rVar.G());
                                                }
                                            } else {
                                                this.gpp_ = rVar.E();
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
                                    this.gdpr_ = rVar.l();
                                }
                            } else {
                                this.coppa_ = rVar.l();
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
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    if ((i & 1) != 0) {
                        ((com.explorestack.protobuf.e) this.gppSid_).a = false;
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            if ((i & 1) != 0) {
                ((com.explorestack.protobuf.e) this.gppSid_).a = false;
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            getSerializedSize();
            boolean z = this.coppa_;
            if (z) {
                wVar.A(1, z);
            }
            boolean z2 = this.gdpr_;
            if (z2) {
                wVar.A(2, z2);
            }
            for (int i = 0; i < this.extProto_.size(); i++) {
                wVar.M(3, this.extProto_.get(i));
            }
            if (this.ext_ != null) {
                wVar.M(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                y4.writeString(wVar, 5, this.gpp_);
            }
            if (getGppSidList().size() > 0) {
                wVar.U(50);
                wVar.U(this.gppSidMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.gppSid_.size(); i2++) {
                wVar.U(((z4) this.gppSid_).getInt(i2));
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Regs mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Regs) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Regs parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString, o3Var);
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr);
        }

        public static Regs parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr, o3Var);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Regs) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Regs parseFrom(r rVar) throws IOException {
            return (Regs) y4.parseWithIOException(PARSER, rVar);
        }

        public static Regs parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Regs) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Regs(g4 g4Var) {
            super(g4Var);
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Regs() {
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.gpp_ = "";
            this.gppSid_ = y4.emptyIntList();
            this.extProto_ = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RegsOrBuilder extends MessageOrBuilder {
        boolean getCoppa();

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

        boolean getGdpr();

        String getGpp();

        ByteString getGppBytes();

        int getGppSid(int i);

        int getGppSidCount();

        List<Integer> getGppSidList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Restrictions extends y4 implements RestrictionsOrBuilder {
        public static final int BADV_FIELD_NUMBER = 3;
        public static final int BAPP_FIELD_NUMBER = 4;
        public static final int BATTR_FIELD_NUMBER = 5;
        public static final int BCAT_FIELD_NUMBER = 1;
        public static final int CATTAX_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private s5 badv_;
        private s5 bapp_;
        private int battrMemoizedSerializedSize;
        private List<Integer> battr_;
        private s5 bcat_;
        private int cattax_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private static final h5 battr_converter_ = new h5() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.1
            @Override // com.explorestack.protobuf.h5
            public CreativeAttribute convert(Integer num) {
                CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
                if (creativeAttributeValueOf == null) {
                    return CreativeAttribute.UNRECOGNIZED;
                }
                return creativeAttributeValueOf;
            }
        };
        private static final Restrictions DEFAULT_INSTANCE = new Restrictions();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.2
            @Override // com.explorestack.protobuf.g7
            public Restrictions parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new Restrictions(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements RestrictionsOrBuilder {
            private s5 badv_;
            private s5 bapp_;
            private List<Integer> battr_;
            private s5 bcat_;
            private int bitField0_;
            private int cattax_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;

            private Builder() {
                super(null);
                r5 r5Var = r5.c;
                this.bcat_ = r5Var;
                this.cattax_ = 0;
                this.badv_ = r5Var;
                this.bapp_ = r5Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
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
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.A;
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
            public Restrictions buildPartial() {
                Restrictions restrictions = new Restrictions(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                restrictions.bcat_ = this.bcat_;
                restrictions.cattax_ = this.cattax_;
                if ((this.bitField0_ & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                restrictions.badv_ = this.badv_;
                if ((this.bitField0_ & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                restrictions.bapp_ = this.bapp_;
                if ((this.bitField0_ & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                    this.bitField0_ &= -9;
                }
                restrictions.battr_ = this.battr_;
                v7 v7Var = this.extBuilder_;
                if (v7Var == null) {
                    restrictions.ext_ = this.ext_;
                } else {
                    restrictions.ext_ = (Struct) v7Var.a();
                }
                o7 o7Var = this.extProtoBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    restrictions.extProto_ = this.extProto_;
                } else {
                    restrictions.extProto_ = o7Var.f();
                }
                onBuilt();
                return restrictions;
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBadv(int i) {
                return (String) this.badv_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBadvBytes(int i) {
                return this.badv_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBadvCount() {
                return this.badv_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public j7 getBadvList() {
                return this.badv_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBapp(int i) {
                return (String) this.bapp_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBappBytes(int i) {
                return this.bapp_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBappCount() {
                return this.bapp_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public j7 getBappList() {
                return this.bapp_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<CreativeAttribute> getBattrList() {
                return new i5(this.battr_, Restrictions.battr_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrValue(int i) {
                return this.battr_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Integer> getBattrValueList() {
                return Collections.unmodifiableList(this.battr_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBcat(int i) {
                return (String) this.bcat_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBcatBytes(int i) {
                return this.bcat_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBcatCount() {
                return this.bcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public j7 getBcatList() {
                return this.bcat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.A;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.B;
                w4Var.c(Restrictions.class, Builder.class);
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

            public Builder setCattaxValue(int i) {
                this.cattax_ = i;
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

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Restrictions build() {
                Restrictions restrictionsBuildPartial = buildPartial();
                if (restrictionsBuildPartial.isInitialized()) {
                    return restrictionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) restrictionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                r5 r5Var = r5.c;
                this.bcat_ = r5Var;
                int i = this.bitField0_;
                this.cattax_ = 0;
                this.badv_ = r5Var;
                this.bapp_ = r5Var;
                this.bitField0_ = i & (-8);
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
                this.bitField0_ = i & (-16);
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CreativeAttribute getBattr(int i) {
                return (CreativeAttribute) Restrictions.battr_converter_.convert(this.battr_.get(i));
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

            public Builder mergeFrom(Restrictions restrictions) {
                if (restrictions == Restrictions.getDefaultInstance()) {
                    return this;
                }
                if (!restrictions.bcat_.isEmpty()) {
                    if (this.bcat_.isEmpty()) {
                        this.bcat_ = restrictions.bcat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureBcatIsMutable();
                        this.bcat_.addAll(restrictions.bcat_);
                    }
                    onChanged();
                }
                if (restrictions.cattax_ != 0) {
                    setCattaxValue(restrictions.getCattaxValue());
                }
                if (!restrictions.badv_.isEmpty()) {
                    if (this.badv_.isEmpty()) {
                        this.badv_ = restrictions.badv_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureBadvIsMutable();
                        this.badv_.addAll(restrictions.badv_);
                    }
                    onChanged();
                }
                if (!restrictions.bapp_.isEmpty()) {
                    if (this.bapp_.isEmpty()) {
                        this.bapp_ = restrictions.bapp_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureBappIsMutable();
                        this.bapp_.addAll(restrictions.bapp_);
                    }
                    onChanged();
                }
                if (!restrictions.battr_.isEmpty()) {
                    if (this.battr_.isEmpty()) {
                        this.battr_ = restrictions.battr_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureBattrIsMutable();
                        this.battr_.addAll(restrictions.battr_);
                    }
                    onChanged();
                }
                if (restrictions.hasExt()) {
                    mergeExt(restrictions.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!restrictions.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = restrictions.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(restrictions.extProto_);
                        }
                        onChanged();
                    }
                } else if (!restrictions.extProto_.isEmpty()) {
                    boolean zIsEmpty = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var = this.extProtoBuilder_;
                    if (zIsEmpty) {
                        o7 extProtoFieldBuilder = null;
                        o7Var.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = restrictions.extProto_;
                        this.bitField0_ &= -17;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var.a(restrictions.extProto_);
                    }
                }
                mergeUnknownFields(((y4) restrictions).unknownFields);
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
            public Restrictions mo250getDefaultInstanceForType() {
                return Restrictions.getDefaultInstance();
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
                r5 r5Var = r5.c;
                this.bcat_ = r5Var;
                this.cattax_ = 0;
                this.badv_ = r5Var;
                this.bapp_ = r5Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
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
                if (message instanceof Restrictions) {
                    return mergeFrom((Restrictions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                Restrictions restrictions = null;
                try {
                    try {
                        Restrictions restrictions2 = (Restrictions) Restrictions.PARSER.parsePartialFrom(rVar, o3Var);
                        if (restrictions2 != null) {
                            mergeFrom(restrictions2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Restrictions restrictions3 = (Restrictions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            restrictions = restrictions3;
                            if (restrictions != null) {
                                mergeFrom(restrictions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (restrictions != null) {
                        mergeFrom(restrictions);
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
            if (!(obj instanceof Restrictions)) {
                return super.equals(obj);
            }
            Restrictions restrictions = (Restrictions) obj;
            if (getBcatList().equals(restrictions.getBcatList()) && this.cattax_ == restrictions.cattax_ && getBadvList().equals(restrictions.getBadvList()) && getBappList().equals(restrictions.getBappList()) && this.battr_.equals(restrictions.battr_) && hasExt() == restrictions.hasExt()) {
                return (!hasExt() || getExt().equals(restrictions.getExt())) && getExtProtoList().equals(restrictions.getExtProtoList()) && this.unknownFields.equals(restrictions.unknownFields);
            }
            return false;
        }

        public static Restrictions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.A;
        }

        public static Builder newBuilder(Restrictions restrictions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restrictions);
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Restrictions) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBadv(int i) {
            return (String) this.badv_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBadvBytes(int i) {
            return this.badv_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBadvCount() {
            return this.badv_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBapp(int i) {
            return (String) this.bapp_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBappBytes(int i) {
            return this.bapp_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBappCount() {
            return this.bapp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CreativeAttribute getBattr(int i) {
            return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrCount() {
            return this.battr_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<CreativeAttribute> getBattrList() {
            return new i5(this.battr_, battr_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrValue(int i) {
            return this.battr_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Integer> getBattrValueList() {
            return this.battr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBcat(int i) {
            return (String) this.bcat_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBcatBytes(int i) {
            return this.bcat_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBcatCount() {
            return this.bcat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            int iK = 0;
            for (int i2 = 0; i2 < this.bcat_.size(); i2++) {
                iK = z.k(this.bcat_, i2, iK);
            }
            int size = getBcatList().size() + iK;
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size += w.g(2, this.cattax_);
            }
            int iK2 = 0;
            for (int i3 = 0; i3 < this.badv_.size(); i3++) {
                iK2 = z.k(this.badv_, i3, iK2);
            }
            int size2 = getBadvList().size() + size + iK2;
            int iK3 = 0;
            for (int i4 = 0; i4 < this.bapp_.size(); i4++) {
                iK3 = z.k(this.bapp_, i4, iK3);
            }
            int size3 = getBappList().size() + size2 + iK3;
            int iJ = 0;
            for (int i5 = 0; i5 < this.battr_.size(); i5++) {
                iJ = z.j(iJ, this.battr_.get(i5));
            }
            int iO = size3 + iJ;
            if (!getBattrList().isEmpty()) {
                iO = iO + 1 + w.u(iJ);
            }
            this.battrMemoizedSerializedSize = iJ;
            for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                iO += w.o(6, this.extProto_.get(i6));
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

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            if (getBcatCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 1, 53) + getBcatList().hashCode();
            }
            int iC = pv1.c(iHashCode, 37, 2, 53) + this.cattax_;
            if (getBadvCount() > 0) {
                iC = pv1.c(iC, 37, 3, 53) + getBadvList().hashCode();
            }
            if (getBappCount() > 0) {
                iC = pv1.c(iC, 37, 4, 53) + getBappList().hashCode();
            }
            if (getBattrCount() > 0) {
                iC = pv1.c(iC, 37, 5, 53) + this.battr_.hashCode();
            }
            if (hasExt()) {
                iC = pv1.c(iC, 37, 7, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iC = pv1.c(iC, 37, 6, 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iC * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.B;
            w4Var.c(Restrictions.class, Builder.class);
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
            return new Restrictions();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Restrictions(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                            if (iF != 10) {
                                if (iF != 16) {
                                    if (iF != 26) {
                                        if (iF != 34) {
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
                                                        if ((i & 16) == 0) {
                                                            this.extProto_ = new ArrayList();
                                                            i |= 16;
                                                        }
                                                        this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                                    }
                                                } else {
                                                    int iK = rVar.k(rVar.x());
                                                    while (rVar.d() > 0) {
                                                        int iO = rVar.o();
                                                        if ((i & 8) == 0) {
                                                            this.battr_ = new ArrayList();
                                                            i |= 8;
                                                        }
                                                        this.battr_.add(Integer.valueOf(iO));
                                                    }
                                                    rVar.j(iK);
                                                }
                                            } else {
                                                int iO2 = rVar.o();
                                                if ((i & 8) == 0) {
                                                    this.battr_ = new ArrayList();
                                                    i |= 8;
                                                }
                                                this.battr_.add(Integer.valueOf(iO2));
                                            }
                                        } else {
                                            String strE = rVar.E();
                                            if ((i & 4) == 0) {
                                                this.bapp_ = new r5();
                                                i |= 4;
                                            }
                                            this.bapp_.add(strE);
                                        }
                                    } else {
                                        String strE2 = rVar.E();
                                        if ((i & 2) == 0) {
                                            this.badv_ = new r5();
                                            i |= 2;
                                        }
                                        this.badv_.add(strE2);
                                    }
                                } else {
                                    this.cattax_ = rVar.o();
                                }
                            } else {
                                String strE3 = rVar.E();
                                if ((i & 1) == 0) {
                                    this.bcat_ = new r5();
                                    i |= 1;
                                }
                                this.bcat_.add(strE3);
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
                        this.bcat_ = this.bcat_.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.badv_ = this.badv_.getUnmodifiableView();
                    }
                    if ((i & 4) != 0) {
                        this.bapp_ = this.bapp_.getUnmodifiableView();
                    }
                    if ((i & 8) != 0) {
                        this.battr_ = Collections.unmodifiableList(this.battr_);
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
                this.bcat_ = this.bcat_.getUnmodifiableView();
            }
            if ((i & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
            }
            if ((i & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
            }
            if ((i & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
            }
            if ((i & 16) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            getSerializedSize();
            int iL = 0;
            while (iL < this.bcat_.size()) {
                iL = z.l(this.bcat_, iL, wVar, 1, iL, 1);
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                wVar.K(2, this.cattax_);
            }
            int iL2 = 0;
            while (iL2 < this.badv_.size()) {
                iL2 = z.l(this.badv_, iL2, wVar, 3, iL2, 1);
            }
            int iL3 = 0;
            while (iL3 < this.bapp_.size()) {
                iL3 = z.l(this.bapp_, iL3, wVar, 4, iL3, 1);
            }
            if (getBattrList().size() > 0) {
                wVar.U(42);
                wVar.U(this.battrMemoizedSerializedSize);
            }
            for (int i = 0; i < this.battr_.size(); i++) {
                wVar.L(this.battr_.get(i).intValue());
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                wVar.M(6, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                wVar.M(7, getExt());
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public j7 getBadvList() {
            return this.badv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public j7 getBappList() {
            return this.bapp_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public j7 getBcatList() {
            return this.bcat_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Restrictions mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Restrictions) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Restrictions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Restrictions parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString, o3Var);
        }

        public static Restrictions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr);
        }

        public static Restrictions parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr, o3Var);
        }

        public static Restrictions parseFrom(InputStream inputStream) throws IOException {
            return (Restrictions) y4.parseWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (Restrictions) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static Restrictions parseFrom(r rVar) throws IOException {
            return (Restrictions) y4.parseWithIOException(PARSER, rVar);
        }

        public static Restrictions parseFrom(r rVar, o3 o3Var) throws IOException {
            return (Restrictions) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private Restrictions(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Restrictions() {
            this.memoizedIsInitialized = (byte) -1;
            r5 r5Var = r5.c;
            this.bcat_ = r5Var;
            this.cattax_ = 0;
            this.badv_ = r5Var;
            this.bapp_ = r5Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.extProto_ = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RestrictionsOrBuilder extends MessageOrBuilder {
        String getBadv(int i);

        ByteString getBadvBytes(int i);

        int getBadvCount();

        List<String> getBadvList();

        String getBapp(int i);

        ByteString getBappBytes(int i);

        int getBappCount();

        List<String> getBappList();

        CreativeAttribute getBattr(int i);

        int getBattrCount();

        List<CreativeAttribute> getBattrList();

        int getBattrValue(int i);

        List<Integer> getBattrValueList();

        String getBcat(int i);

        ByteString getBcatBytes(int i);

        int getBcatCount();

        List<String> getBcatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

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

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class User extends y4 implements UserOrBuilder {
        public static final int BUYERUID_FIELD_NUMBER = 2;
        public static final int CONSENT_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 8;
        public static final int EXT_FIELD_NUMBER = 10;
        public static final int EXT_PROTO_FIELD_NUMBER = 9;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int GEO_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 5;
        public static final int YOB_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object buyeruid_;
        private volatile Object consent_;
        private List<Data> data_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object gender_;
        private Geo geo_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private int yob_;
        private static final User DEFAULT_INSTANCE = new User();
        private static final g7 PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.User.1
            @Override // com.explorestack.protobuf.g7
            public User parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
                return new User(rVar, o3Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends g4 implements UserOrBuilder {
            private int bitField0_;
            private Object buyeruid_;
            private Object consent_;
            private o7 dataBuilder_;
            private List<Data> data_;
            private v7 extBuilder_;
            private o7 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object gender_;
            private v7 geoBuilder_;
            private Geo geo_;
            private Object id_;
            private Object keywords_;
            private int yob_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder clearYob() {
                this.yob_ = 0;
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

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
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
                return b.C;
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

            private v7 getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new v7(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
            }

            public Builder addAllData(Iterable<? extends Data> iterable) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var != null) {
                    o7Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                com.explorestack.protobuf.b.addAll((Iterable) iterable, (List) this.data_);
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

            public Builder addData(Data.Builder builder) {
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
            public User buildPartial() {
                User user = new User(this);
                user.id_ = this.id_;
                user.buyeruid_ = this.buyeruid_;
                user.yob_ = this.yob_;
                user.gender_ = this.gender_;
                user.keywords_ = this.keywords_;
                user.consent_ = this.consent_;
                v7 v7Var = this.geoBuilder_;
                if (v7Var == null) {
                    user.geo_ = this.geo_;
                } else {
                    user.geo_ = (Geo) v7Var.a();
                }
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    user.data_ = this.data_;
                } else {
                    user.data_ = o7Var.f();
                }
                v7 v7Var2 = this.extBuilder_;
                if (v7Var2 == null) {
                    user.ext_ = this.ext_;
                } else {
                    user.ext_ = (Struct) v7Var2.a();
                }
                o7 o7Var2 = this.extProtoBuilder_;
                if (o7Var2 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    user.extProto_ = this.extProto_;
                } else {
                    user.extProto_ = o7Var2.f();
                }
                onBuilt();
                return user;
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getBuyeruid() {
                Object obj = this.buyeruid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.buyeruid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getBuyeruidBytes() {
                Object obj = this.buyeruid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.buyeruid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getConsent() {
                Object obj = this.consent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.consent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getConsentBytes() {
                Object obj = this.consent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Data getData(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (Data) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getDataCount() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Data> getDataList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.data_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public DataOrBuilder getDataOrBuilder(int i) {
                o7 o7Var = this.dataBuilder_;
                return o7Var == null ? this.data_.get(i) : (DataOrBuilder) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                o7 o7Var = this.dataBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.C;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Struct getExt() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (Struct) v7Var.d();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public c8 getExtOrBuilder() {
                v7 v7Var = this.extBuilder_;
                if (v7Var != null) {
                    return (c8) v7Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Any getExtProto(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (Any) o7Var.l(i, false);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getExtProtoCount() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.size() : o7Var.b.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Any> getExtProtoList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? Collections.unmodifiableList(this.extProto_) : o7Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public g getExtProtoOrBuilder(int i) {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var == null ? this.extProto_.get(i) : (g) o7Var.n(i);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                o7 o7Var = this.extProtoBuilder_;
                return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getGender() {
                Object obj = this.gender_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gender_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getGenderBytes() {
                Object obj = this.gender_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gender_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Geo getGeo() {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    return (Geo) v7Var.d();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    return (GeoOrBuilder) v7Var.e();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getYob() {
                return this.yob_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.g4
            public w4 internalGetFieldAccessorTable() {
                w4 w4Var = b.D;
                w4Var.c(User.class, Builder.class);
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

            public Builder mergeGeo(Geo geo) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    v7Var.f(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
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

            public Builder setData(int i, Data.Builder builder) {
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

            public Builder setGeo(Geo.Builder builder) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var != null) {
                    v7Var.h(builder.build());
                    return this;
                }
                this.geo_ = builder.build();
                onChanged();
                return this;
            }

            public Builder setYob(int i) {
                this.yob_ = i;
                onChanged();
                return this;
            }

            private void maybeForceBuilderInitialization() {
                if (y4.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Data.Builder addDataBuilder() {
                return (Data.Builder) getDataFieldBuilder().c(Data.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public User build() {
                User userBuildPartial = buildPartial();
                if (userBuildPartial.isInitialized()) {
                    return userBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userBuildPartial);
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.buyeruid_ = "";
                this.yob_ = 0;
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
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

            public Builder clearBuyeruid() {
                this.buyeruid_ = User.getDefaultInstance().getBuyeruid();
                onChanged();
                return this;
            }

            public Builder clearConsent() {
                this.consent_ = User.getDefaultInstance().getConsent();
                onChanged();
                return this;
            }

            public Builder clearGender() {
                this.gender_ = User.getDefaultInstance().getGender();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = User.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = User.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo247clone() {
                return (Builder) super.mo247clone();
            }

            public Data.Builder getDataBuilder(int i) {
                return (Data.Builder) getDataFieldBuilder().j(i);
            }

            public List<Data.Builder> getDataBuilderList() {
                return getDataFieldBuilder().k();
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

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().c();
            }

            public Builder mergeFrom(User user) {
                o7 dataFieldBuilder;
                if (user == User.getDefaultInstance()) {
                    return this;
                }
                if (!user.getId().isEmpty()) {
                    this.id_ = user.id_;
                    onChanged();
                }
                if (!user.getBuyeruid().isEmpty()) {
                    this.buyeruid_ = user.buyeruid_;
                    onChanged();
                }
                if (user.getYob() != 0) {
                    setYob(user.getYob());
                }
                if (!user.getGender().isEmpty()) {
                    this.gender_ = user.gender_;
                    onChanged();
                }
                if (!user.getKeywords().isEmpty()) {
                    this.keywords_ = user.keywords_;
                    onChanged();
                }
                if (!user.getConsent().isEmpty()) {
                    this.consent_ = user.consent_;
                    onChanged();
                }
                if (user.hasGeo()) {
                    mergeGeo(user.getGeo());
                }
                o7 extProtoFieldBuilder = null;
                if (this.dataBuilder_ == null) {
                    if (!user.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = user.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(user.data_);
                        }
                        onChanged();
                    }
                } else if (!user.data_.isEmpty()) {
                    boolean zIsEmpty = this.dataBuilder_.b.isEmpty();
                    o7 o7Var = this.dataBuilder_;
                    if (zIsEmpty) {
                        o7Var.a = null;
                        this.dataBuilder_ = null;
                        this.data_ = user.data_;
                        this.bitField0_ &= -2;
                        if (y4.alwaysUseFieldBuilders) {
                            dataFieldBuilder = getDataFieldBuilder();
                        } else {
                            dataFieldBuilder = null;
                        }
                        this.dataBuilder_ = dataFieldBuilder;
                    } else {
                        o7Var.a(user.data_);
                    }
                }
                if (user.hasExt()) {
                    mergeExt(user.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!user.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = user.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(user.extProto_);
                        }
                        onChanged();
                    }
                } else if (!user.extProto_.isEmpty()) {
                    boolean zIsEmpty2 = this.extProtoBuilder_.b.isEmpty();
                    o7 o7Var2 = this.extProtoBuilder_;
                    if (zIsEmpty2) {
                        o7Var2.a = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = user.extProto_;
                        this.bitField0_ &= -3;
                        if (y4.alwaysUseFieldBuilders) {
                            extProtoFieldBuilder = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = extProtoFieldBuilder;
                    } else {
                        o7Var2.a(user.extProto_);
                    }
                }
                mergeUnknownFields(((y4) user).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(s8 s8Var) {
                return (Builder) super.mergeUnknownFields(s8Var);
            }

            public Builder setBuyeruid(String str) {
                str.getClass();
                this.buyeruid_ = str;
                onChanged();
                return this;
            }

            public Builder setBuyeruidBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.buyeruid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConsent(String str) {
                str.getClass();
                this.consent_ = str;
                onChanged();
                return this;
            }

            public Builder setConsentBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.consent_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGender(String str) {
                str.getClass();
                this.gender_ = str;
                onChanged();
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.gender_ = byteString;
                onChanged();
                return this;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.c.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
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
            public User mo250getDefaultInstanceForType() {
                return User.getDefaultInstance();
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

            public Data.Builder addDataBuilder(int i) {
                return (Data.Builder) getDataFieldBuilder().b(i, Data.getDefaultInstance());
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

            public Builder setGeo(Geo geo) {
                v7 v7Var = this.geoBuilder_;
                if (v7Var == null) {
                    geo.getClass();
                    this.geo_ = geo;
                    onChanged();
                    return this;
                }
                v7Var.h(geo);
                return this;
            }

            private Builder(h4 h4Var) {
                super(h4Var);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i, Data data) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, data);
                    onChanged();
                    return this;
                }
                o7Var.d(i, data);
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

            public Builder setData(int i, Data data) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, data);
                    onChanged();
                    return this;
                }
                o7Var.s(i, data);
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

            public Builder addData(Data data) {
                o7 o7Var = this.dataBuilder_;
                if (o7Var == null) {
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(data);
                    onChanged();
                    return this;
                }
                o7Var.e(data);
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

            public Builder addData(int i, Data.Builder builder) {
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
                if (message instanceof User) {
                    return mergeFrom((User) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
                User user = null;
                try {
                    try {
                        User user2 = (User) User.PARSER.parsePartialFrom(rVar, o3Var);
                        if (user2 != null) {
                            mergeFrom(user2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        User user3 = (User) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            user = user3;
                            if (user != null) {
                                mergeFrom(user);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (user != null) {
                        mergeFrom(user);
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
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User user = (User) obj;
            if (!getId().equals(user.getId()) || !getBuyeruid().equals(user.getBuyeruid()) || getYob() != user.getYob() || !getGender().equals(user.getGender()) || !getKeywords().equals(user.getKeywords()) || !getConsent().equals(user.getConsent()) || hasGeo() != user.hasGeo()) {
                return false;
            }
            if ((!hasGeo() || getGeo().equals(user.getGeo())) && getDataList().equals(user.getDataList()) && hasExt() == user.hasExt()) {
                return (!hasExt() || getExt().equals(user.getExt())) && getExtProtoList().equals(user.getExtProtoList()) && this.unknownFields.equals(user.unknownFields);
            }
            return false;
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.C;
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) y4.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer);
        }

        public static g7 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getBuyeruid() {
            Object obj = this.buyeruid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.buyeruid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getBuyeruidBytes() {
            Object obj = this.buyeruid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.buyeruid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Data getData(int i) {
            return this.data_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Data> getDataList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public DataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends DataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public g getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getGender() {
            Object obj = this.gender_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gender_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getGenderBytes() {
            Object obj = this.gender_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gender_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
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
            if (!getBuyeruidBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(2, this.buyeruid_);
            }
            int i2 = this.yob_;
            if (i2 != 0) {
                iComputeStringSize += w.t(3, i2);
            }
            if (!getGenderBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                iComputeStringSize += y4.computeStringSize(6, this.consent_);
            }
            if (this.geo_ != null) {
                iComputeStringSize += w.o(7, getGeo());
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                iComputeStringSize += w.o(8, this.data_.get(i3));
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                iComputeStringSize += w.o(9, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                iComputeStringSize += w.o(10, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final s8 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getYob() {
            return this.yob_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getConsent().hashCode() + ((((getKeywords().hashCode() + ((((getGender().hashCode() + ((((getYob() + ((((getBuyeruid().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53);
            if (hasGeo()) {
                iHashCode = pv1.c(iHashCode, 37, 7, 53) + getGeo().hashCode();
            }
            if (getDataCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 8, 53) + getDataList().hashCode();
            }
            if (hasExt()) {
                iHashCode = pv1.c(iHashCode, 37, 10, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = pv1.c(iHashCode, 37, 9, 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.y4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = b.D;
            w4Var.c(User.class, Builder.class);
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
            return new User();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private User(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                                this.id_ = rVar.E();
                                continue;
                            case 18:
                                this.buyeruid_ = rVar.E();
                                continue;
                            case 24:
                                this.yob_ = rVar.G();
                                continue;
                            case 34:
                                this.gender_ = rVar.E();
                                continue;
                            case 42:
                                this.keywords_ = rVar.E();
                                continue;
                            case 50:
                                this.consent_ = rVar.E();
                                continue;
                            case 58:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) rVar.v(Geo.parser(), o3Var);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 66:
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 == 0) {
                                    this.data_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.data_.add((Data) rVar.v(Data.parser(), o3Var));
                                continue;
                            case 74:
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.extProto_.add((Any) rVar.v(Any.parser(), o3Var));
                                continue;
                            case 82:
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
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    if (((i == true ? 1 : 0) & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = p8VarB.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i == true ? 1 : 0) & 1) != 0) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            if (((i == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = p8VarB.build();
            makeExtensionsImmutable();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public c8 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(w wVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                y4.writeString(wVar, 1, this.id_);
            }
            if (!getBuyeruidBytes().isEmpty()) {
                y4.writeString(wVar, 2, this.buyeruid_);
            }
            int i = this.yob_;
            if (i != 0) {
                wVar.T(3, i);
            }
            if (!getGenderBytes().isEmpty()) {
                y4.writeString(wVar, 4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                y4.writeString(wVar, 5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                y4.writeString(wVar, 6, this.consent_);
            }
            if (this.geo_ != null) {
                wVar.M(7, getGeo());
            }
            for (int i2 = 0; i2 < this.data_.size(); i2++) {
                wVar.M(8, this.data_.get(i2));
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                wVar.M(9, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                wVar.M(10, getExt());
            }
            this.unknownFields.writeTo(wVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public User mo250getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static User parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (User) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
        }

        public static User parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer, o3Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static User parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString, o3Var);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr);
        }

        public static User parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr, o3Var);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) y4.parseWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
            return (User) y4.parseWithIOException(PARSER, inputStream, o3Var);
        }

        public static User parseFrom(r rVar) throws IOException {
            return (User) y4.parseWithIOException(PARSER, rVar);
        }

        public static User parseFrom(r rVar, o3 o3Var) throws IOException {
            return (User) y4.parseWithIOException(PARSER, rVar, o3Var);
        }

        private User(g4 g4Var) {
            super(g4Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        private User() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.buyeruid_ = "";
            this.gender_ = "";
            this.keywords_ = "";
            this.consent_ = "";
            List list = Collections.EMPTY_LIST;
            this.data_ = list;
            this.extProto_ = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface UserOrBuilder extends MessageOrBuilder {
        String getBuyeruid();

        ByteString getBuyeruidBytes();

        String getConsent();

        ByteString getConsentBytes();

        Data getData(int i);

        int getDataCount();

        List<Data> getDataList();

        DataOrBuilder getDataOrBuilder(int i);

        List<? extends DataOrBuilder> getDataOrBuilderList();

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

        String getGender();

        ByteString getGenderBytes();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        int getYob();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
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
        if (hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(context.getDevice())) || hasRegs() != context.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !getRegs().equals(context.getRegs())) || hasRestrictions() != context.hasRestrictions()) {
            return false;
        }
        if ((hasRestrictions() && !getRestrictions().equals(context.getRestrictions())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((!hasUser() || getUser().equals(context.getUser())) && hasExt() == context.hasExt()) {
            return (!hasExt() || getExt().equals(context.getExt())) && getExtProtoList().equals(context.getExtProtoList()) && this.unknownFields.equals(context.unknownFields);
        }
        return false;
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.a;
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

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
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

    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    public Restrictions getRestrictions() {
        Restrictions restrictions = this.restrictions_;
        return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iO = this.app_ != null ? w.o(1, getApp()) : 0;
        if (this.device_ != null) {
            iO += w.o(2, getDevice());
        }
        if (this.regs_ != null) {
            iO += w.o(3, getRegs());
        }
        if (this.restrictions_ != null) {
            iO += w.o(4, getRestrictions());
        }
        if (this.user_ != null) {
            iO += w.o(5, getUser());
        }
        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
            iO += w.o(6, this.extProto_.get(i2));
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

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public boolean hasApp() {
        return this.app_ != null;
    }

    public boolean hasDevice() {
        return this.device_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasRegs() {
        return this.regs_ != null;
    }

    public boolean hasRestrictions() {
        return this.restrictions_ != null;
    }

    public boolean hasUser() {
        return this.user_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasApp()) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + getApp().hashCode();
        }
        if (hasDevice()) {
            iHashCode = pv1.c(iHashCode, 37, 2, 53) + getDevice().hashCode();
        }
        if (hasRegs()) {
            iHashCode = pv1.c(iHashCode, 37, 3, 53) + getRegs().hashCode();
        }
        if (hasRestrictions()) {
            iHashCode = pv1.c(iHashCode, 37, 4, 53) + getRestrictions().hashCode();
        }
        if (hasUser()) {
            iHashCode = pv1.c(iHashCode, 37, 5, 53) + getUser().hashCode();
        }
        if (hasExt()) {
            iHashCode = pv1.c(iHashCode, 37, 7, 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = pv1.c(iHashCode, 37, 6, 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = b.b;
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
        if (this.app_ != null) {
            wVar.M(1, getApp());
        }
        if (this.device_ != null) {
            wVar.M(2, getDevice());
        }
        if (this.regs_ != null) {
            wVar.M(3, getRegs());
        }
        if (this.restrictions_ != null) {
            wVar.M(4, getRestrictions());
        }
        if (this.user_ != null) {
            wVar.M(5, getUser());
        }
        for (int i = 0; i < this.extProto_.size(); i++) {
            wVar.M(6, this.extProto_.get(i));
        }
        if (this.ext_ != null) {
            wVar.M(7, getExt());
        }
        this.unknownFields.writeTo(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Context(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
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
                            if (iF != 18) {
                                if (iF != 26) {
                                    if (iF != 34) {
                                        if (iF != 42) {
                                            if (iF != 50) {
                                                if (iF != 58) {
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
                                            User user = this.user_;
                                            User.Builder builder2 = user != null ? user.toBuilder() : null;
                                            User user2 = (User) rVar.v(User.parser(), o3Var);
                                            this.user_ = user2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(user2);
                                                this.user_ = builder2.buildPartial();
                                            }
                                        }
                                    } else {
                                        Restrictions restrictions = this.restrictions_;
                                        Restrictions.Builder builder3 = restrictions != null ? restrictions.toBuilder() : null;
                                        Restrictions restrictions2 = (Restrictions) rVar.v(Restrictions.parser(), o3Var);
                                        this.restrictions_ = restrictions2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(restrictions2);
                                            this.restrictions_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    Regs regs = this.regs_;
                                    Regs.Builder builder4 = regs != null ? regs.toBuilder() : null;
                                    Regs regs2 = (Regs) rVar.v(Regs.parser(), o3Var);
                                    this.regs_ = regs2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(regs2);
                                        this.regs_ = builder4.buildPartial();
                                    }
                                }
                            } else {
                                Device device = this.device_;
                                Device.Builder builder5 = device != null ? device.toBuilder() : null;
                                Device device2 = (Device) rVar.v(Device.parser(), o3Var);
                                this.device_ = device2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(device2);
                                    this.device_ = builder5.buildPartial();
                                }
                            }
                        } else {
                            App app = this.app_;
                            App.Builder builder6 = app != null ? app.toBuilder() : null;
                            App app2 = (App) rVar.v(App.parser(), o3Var);
                            this.app_ = app2;
                            if (builder6 != null) {
                                builder6.mergeFrom(app2);
                                this.app_ = builder6.buildPartial();
                            }
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

    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    public c8 getExtOrBuilder() {
        return getExt();
    }

    public RegsOrBuilder getRegsOrBuilder() {
        return getRegs();
    }

    public RestrictionsOrBuilder getRestrictionsOrBuilder() {
        return getRestrictions();
    }

    public UserOrBuilder getUserOrBuilder() {
        return getUser();
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
        this.extProto_ = Collections.EMPTY_LIST;
    }
}
