package com.explorestack.protobuf.compiler;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import defpackage.pv1;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends y4 implements MessageOrBuilder {
    public static final e g = new e();
    public static final c h = new c();
    public int a;
    public volatile Serializable b;
    public volatile Serializable c;
    public volatile Serializable d;
    public t1 e;
    public byte f;

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof e)) {
                return super.equals(obj);
            }
            e eVar = (e) obj;
            int i = this.a;
            if (((i & 1) != 0) != ((eVar.a & 1) != 0) || (((i & 1) != 0 && !getName().equals(eVar.getName())) || i() != eVar.i() || ((i() && !g().equals(eVar.g())) || hasContent() != eVar.hasContent() || ((hasContent() && !getContent().equals(eVar.getContent())) || h() != eVar.h() || ((h() && !f().equals(eVar.f())) || !this.unknownFields.equals(eVar.unknownFields)))))) {
                return false;
            }
        }
        return true;
    }

    public final t1 f() {
        t1 t1Var = this.e;
        return t1Var == null ? t1.c : t1Var;
    }

    public final String g() {
        Serializable serializable = this.c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.c = stringUtf8;
        }
        return stringUtf8;
    }

    public final String getContent() {
        Serializable serializable = this.d;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.d = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final Message mo250getDefaultInstanceForType() {
        return g;
    }

    public final String getName() {
        Serializable serializable = this.b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.b = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g7 getParserForType() {
        return h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.a & 1) != 0 ? y4.computeStringSize(1, this.b) : 0;
        if ((this.a & 2) != 0) {
            iComputeStringSize += y4.computeStringSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            iComputeStringSize += y4.computeStringSize(15, this.d);
        }
        if ((this.a & 8) != 0) {
            iComputeStringSize += w.o(16, f());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    public final boolean h() {
        return (this.a & 8) != 0;
    }

    public final boolean hasContent() {
        return (this.a & 4) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = g.c.hashCode() + 779;
        if ((this.a & 1) != 0) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (i()) {
            iHashCode = pv1.c(iHashCode, 37, 2, 53) + g().hashCode();
        }
        if (hasContent()) {
            iHashCode = pv1.c(iHashCode, 37, 15, 53) + getContent().hashCode();
        }
        if (h()) {
            iHashCode = pv1.c(iHashCode, 37, 16, 53) + f().hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public final boolean i() {
        return (this.a & 2) != 0;
    }

    @Override // com.explorestack.protobuf.y4
    public final w4 internalGetFieldAccessorTable() {
        w4 w4Var = g.d;
        w4Var.c(e.class, d.class);
        return w4Var;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final d toBuilder() {
        if (this == g) {
            return new d();
        }
        d dVar = new d();
        dVar.g(this);
        return dVar;
    }

    @Override // com.explorestack.protobuf.y4
    public final Message.Builder newBuilderForType(h4 h4Var) {
        d dVar = new d(h4Var);
        dVar.b = "";
        dVar.c = "";
        dVar.d = "";
        dVar.f();
        return dVar;
    }

    @Override // com.explorestack.protobuf.y4
    public final Object newInstance(x4 x4Var) {
        return new e();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final void writeTo(w wVar) throws IOException {
        if ((this.a & 1) != 0) {
            y4.writeString(wVar, 1, this.b);
        }
        if ((this.a & 2) != 0) {
            y4.writeString(wVar, 2, this.c);
        }
        if ((this.a & 4) != 0) {
            y4.writeString(wVar, 15, this.d);
        }
        if ((this.a & 8) != 0) {
            wVar.M(16, f());
        }
        this.unknownFields.writeTo(wVar);
    }

    public e(r rVar, o3 o3Var) {
        s1 builder;
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
                                if (iF != 122) {
                                    if (iF != 130) {
                                        if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                        }
                                    } else {
                                        if ((this.a & 8) != 0) {
                                            builder = this.e.toBuilder();
                                        } else {
                                            builder = null;
                                        }
                                        t1 t1Var = (t1) rVar.v(t1.d, o3Var);
                                        this.e = t1Var;
                                        if (builder != null) {
                                            builder.g(t1Var);
                                            this.e = builder.buildPartial();
                                        }
                                        this.a |= 8;
                                    }
                                } else {
                                    ByteString byteStringM = rVar.m();
                                    this.a |= 4;
                                    this.d = byteStringM;
                                }
                            } else {
                                ByteString byteStringM2 = rVar.m();
                                this.a |= 2;
                                this.c = byteStringM2;
                            }
                        } else {
                            ByteString byteStringM3 = rVar.m();
                            this.a = 1 | this.a;
                            this.b = byteStringM3;
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
    public final MessageLite mo250getDefaultInstanceForType() {
        return g;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return g.toBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return g.toBuilder();
    }

    public e() {
        this.f = (byte) -1;
        this.b = "";
        this.c = "";
        this.d = "";
    }
}
