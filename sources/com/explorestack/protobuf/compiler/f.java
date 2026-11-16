package com.explorestack.protobuf.compiler;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import defpackage.pv1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends y4 implements MessageOrBuilder {
    public static final f f = new f();
    public static final a g = new a();
    public int a;
    public volatile Serializable b;
    public long c;
    public List d;
    public byte e;

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof f)) {
                return super.equals(obj);
            }
            f fVar = (f) obj;
            int i = this.a;
            if (((i & 1) != 0) != ((fVar.a & 1) != 0) || (((i & 1) != 0 && !f().equals(fVar.f())) || g() != fVar.g() || ((g() && this.c != fVar.c) || !this.d.equals(fVar.d) || !this.unknownFields.equals(fVar.unknownFields)))) {
                return false;
            }
        }
        return true;
    }

    public final String f() {
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

    public final boolean g() {
        return (this.a & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final Message mo250getDefaultInstanceForType() {
        return f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g7 getParserForType() {
        return g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.a & 1) != 0 ? y4.computeStringSize(1, this.b) : 0;
        if ((this.a & 2) != 0) {
            iComputeStringSize += w.v(2, this.c);
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iComputeStringSize += w.o(15, (MessageLite) this.d.get(i2));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final b toBuilder() {
        if (this == f) {
            return new b();
        }
        b bVar = new b();
        bVar.g(this);
        return bVar;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = g.a.hashCode() + 779;
        if ((this.a & 1) != 0) {
            iHashCode = pv1.c(iHashCode, 37, 1, 53) + f().hashCode();
        }
        if (g()) {
            iHashCode = pv1.c(iHashCode, 37, 2, 53) + l5.d(this.c);
        }
        if (this.d.size() > 0) {
            iHashCode = pv1.c(iHashCode, 37, 15, 53) + this.d.hashCode();
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public final w4 internalGetFieldAccessorTable() {
        w4 w4Var = g.b;
        w4Var.c(f.class, b.class);
        return w4Var;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.e = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.y4
    public final Message.Builder newBuilderForType(h4 h4Var) {
        b bVar = new b(h4Var);
        bVar.b = "";
        bVar.d = Collections.EMPTY_LIST;
        if (y4.alwaysUseFieldBuilders) {
            bVar.f();
        }
        return bVar;
    }

    @Override // com.explorestack.protobuf.y4
    public final Object newInstance(x4 x4Var) {
        return new f();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final void writeTo(w wVar) throws IOException {
        if ((this.a & 1) != 0) {
            y4.writeString(wVar, 1, this.b);
        }
        if ((this.a & 2) != 0) {
            wVar.V(2, this.c);
        }
        for (int i = 0; i < this.d.size(); i++) {
            wVar.M(15, (MessageLite) this.d.get(i));
        }
        this.unknownFields.writeTo(wVar);
    }

    public f(r rVar, o3 o3Var) {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    if (iF != 0) {
                        if (iF != 10) {
                            if (iF != 16) {
                                if (iF != 122) {
                                    if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                    }
                                } else {
                                    if ((c & 4) == 0) {
                                        this.d = new ArrayList();
                                        c = 4;
                                    }
                                    this.d.add(rVar.v(e.h, o3Var));
                                }
                            } else {
                                this.a |= 2;
                                this.c = rVar.H();
                            }
                        } else {
                            ByteString byteStringM = rVar.m();
                            this.a = 1 | this.a;
                            this.b = byteStringM;
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((c & 4) != 0) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((c & 4) != 0) {
            this.d = Collections.unmodifiableList(this.d);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final MessageLite mo250getDefaultInstanceForType() {
        return f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f.toBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f.toBuilder();
    }

    public f() {
        this.e = (byte) -1;
        this.b = "";
        this.d = Collections.EMPTY_LIST;
    }
}
