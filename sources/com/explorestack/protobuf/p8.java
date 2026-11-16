package com.explorestack.protobuf;

import defpackage.vq2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p8 implements MessageLite.Builder {
    public Map a;
    public int b;
    public z5 c;

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final s8 build() {
        s8 s8Var;
        c(0);
        if (this.a.isEmpty()) {
            s8Var = s8.c;
        } else {
            s8Var = new s8(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(((TreeMap) this.a).descendingMap()));
        }
        this.a = null;
        return s8Var;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /* JADX INFO: renamed from: clone */
    public final MessageLite.Builder mo247clone() {
        c(0);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((TreeMap) this.a).descendingMap());
        p8 p8VarB = s8.b();
        p8VarB.i(new s8(this.a, mapUnmodifiableMap));
        return p8VarB;
    }

    public final void f(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
        try {
            n nVarG = r.g(bArr, i, i2, false);
            h(nVarG);
            nVarG.a(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            vq2.n("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public final void j(byte[] bArr) throws InvalidProtocolBufferException {
        try {
            n nVarG = r.g(bArr, 0, bArr.length, false);
            h(nVarG);
            nVarG.a(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            vq2.n("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public final void a(int i, q8 q8Var) {
        if (i == 0) {
            defpackage.d.r("Zero is not a valid field number.");
            return;
        }
        if (this.c != null && this.b == i) {
            this.c = null;
            this.b = 0;
        }
        if (this.a.isEmpty()) {
            this.a = new TreeMap();
        }
        this.a.put(Integer.valueOf(i), q8Var);
    }

    public final z5 c(int i) {
        z5 z5Var = this.c;
        if (z5Var != null) {
            int i2 = this.b;
            if (i == i2) {
                return z5Var;
            }
            a(i2, z5Var.a());
        }
        if (i == 0) {
            return null;
        }
        q8 q8Var = (q8) this.a.get(Integer.valueOf(i));
        this.b = i;
        z5 z5Var2 = new z5(5);
        z5Var2.b = new q8();
        this.c = z5Var2;
        if (q8Var != null) {
            z5Var2.c(q8Var);
        }
        return this.c;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder clear() {
        this.a = Collections.EMPTY_MAP;
        this.b = 0;
        this.c = null;
        return this;
    }

    public final void d(int i, q8 q8Var) {
        if (i == 0) {
            defpackage.d.r("Zero is not a valid field number.");
            return;
        }
        if (i == 0) {
            defpackage.d.r("Zero is not a valid field number.");
        } else if (i == this.b || this.a.containsKey(Integer.valueOf(i))) {
            c(i).c(q8Var);
        } else {
            a(i, q8Var);
        }
    }

    public final boolean e(int i, r rVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            z5 z5VarC = c(i2);
            long jU = rVar.u();
            q8 q8Var = (q8) z5VarC.b;
            if (q8Var.a == null) {
                q8Var.a = new ArrayList();
            }
            ((q8) z5VarC.b).a.add(Long.valueOf(jU));
            return true;
        }
        if (i3 == 1) {
            z5 z5VarC2 = c(i2);
            long jQ = rVar.q();
            q8 q8Var2 = (q8) z5VarC2.b;
            if (q8Var2.c == null) {
                q8Var2.c = new ArrayList();
            }
            ((q8) z5VarC2.b).c.add(Long.valueOf(jQ));
            return true;
        }
        if (i3 == 2) {
            z5 z5VarC3 = c(i2);
            ByteString byteStringM = rVar.m();
            q8 q8Var3 = (q8) z5VarC3.b;
            if (q8Var3.d == null) {
                q8Var3.d = new ArrayList();
            }
            ((q8) z5VarC3.b).d.add(byteStringM);
            return true;
        }
        if (i3 == 3) {
            p8 p8VarB = s8.b();
            rVar.s(i2, p8VarB, l3.h);
            z5 z5VarC4 = c(i2);
            s8 s8VarBuild = p8VarB.build();
            q8 q8Var4 = (q8) z5VarC4.b;
            if (q8Var4.e == null) {
                q8Var4.e = new ArrayList();
            }
            ((q8) z5VarC4.b).e.add(s8VarBuild);
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        z5 z5VarC5 = c(i2);
        int iP = rVar.p();
        q8 q8Var5 = (q8) z5VarC5.b;
        if (q8Var5.b == null) {
            q8Var5.b = new ArrayList();
        }
        ((q8) z5VarC5.b).b.add(Integer.valueOf(iP));
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final MessageLite mo250getDefaultInstanceForType() {
        return s8.c;
    }

    public final void i(s8 s8Var) {
        if (s8Var != s8.c) {
            for (Map.Entry entry : s8Var.a.entrySet()) {
                d(((Integer) entry.getKey()).intValue(), (q8) entry.getValue());
            }
        }
    }

    public final void k(int i, int i2) {
        if (i == 0) {
            defpackage.d.r("Zero is not a valid field number.");
            return;
        }
        z5 z5VarC = c(i);
        long j = i2;
        q8 q8Var = (q8) z5VarC.b;
        if (q8Var.a == null) {
            q8Var.a = new ArrayList();
        }
        ((q8) z5VarC.b).a.add(Long.valueOf(j));
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder
    public final MessageLite.Builder mergeFrom(MessageLite messageLite) {
        if (messageLite instanceof s8) {
            i((s8) messageLite);
            return this;
        }
        defpackage.d.r("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite buildPartial() {
        return build();
    }

    public final void g(ByteString byteString) throws InvalidProtocolBufferException {
        try {
            r rVarNewCodedInput = byteString.newCodedInput();
            h(rVarNewCodedInput);
            rVarNewCodedInput.a(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            vq2.n("Reading from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final void h(r rVar) {
        int iF;
        do {
            iF = rVar.F();
            if (iF == 0) {
                return;
            }
        } while (e(iF, rVar));
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        r rVarH = r.h(new a(inputStream, r.y(i, inputStream)));
        h(rVarH);
        rVarH.a(0);
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(r rVar) {
        h(rVar);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
        j(bArr);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        f(i, i2, bArr);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(InputStream inputStream) {
        r rVarH = r.h(inputStream);
        h(rVarH);
        rVarH.a(0);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(InputStream inputStream, o3 o3Var) {
        r rVarH = r.h(inputStream);
        h(rVarH);
        rVarH.a(0);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(r rVar, o3 o3Var) {
        h(rVar);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        g(byteString);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        j(bArr);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, o3 o3Var) throws InvalidProtocolBufferException {
        f(i, i2, bArr);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final boolean mergeDelimitedFrom(InputStream inputStream, o3 o3Var) {
        return mergeDelimitedFrom(inputStream);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
        g(byteString);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m297clone() {
        c(0);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((TreeMap) this.a).descendingMap());
        p8 p8VarB = s8.b();
        p8VarB.i(new s8(this.a, mapUnmodifiableMap));
        return p8VarB;
    }
}
