package com.explorestack.protobuf;

import defpackage.vq2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class s8 implements MessageLite {
    public static final s8 c;
    public static final r8 d;
    public final Map a;
    public final Map b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s8) {
            return this.a.equals(((s8) obj).a);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    static {
        Map map = Collections.EMPTY_MAP;
        c = new s8(map, map);
        d = new r8();
    }

    public static p8 b() {
        p8 p8Var = new p8();
        p8Var.a = Collections.EMPTY_MAP;
        p8Var.b = 0;
        p8Var.c = null;
        return p8Var;
    }

    public final int a() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            q8 q8Var = (q8) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Iterator it = q8Var.d.iterator();
            int iD = 0;
            while (it.hasNext()) {
                iD += w.d(3, (ByteString) it.next()) + w.t(2, iIntValue) + (w.s(1) * 2);
            }
            i += iD;
        }
        return i;
    }

    public final void c(w wVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            q8 q8Var = (q8) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Iterator it = q8Var.d.iterator();
            while (it.hasNext()) {
                wVar.P(iIntValue, (ByteString) it.next());
            }
        }
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final MessageLite mo250getDefaultInstanceForType() {
        return c;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g7 getParserForType() {
        return d;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            q8 q8Var = (q8) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Iterator it = q8Var.a.iterator();
            int serializedSize = 0;
            while (it.hasNext()) {
                serializedSize += w.v(iIntValue, ((Long) it.next()).longValue());
            }
            Iterator it2 = q8Var.b.iterator();
            while (it2.hasNext()) {
                ((Integer) it2.next()).getClass();
                serializedSize += w.h(iIntValue);
            }
            Iterator it3 = q8Var.c.iterator();
            while (it3.hasNext()) {
                ((Long) it3.next()).getClass();
                serializedSize += w.i(iIntValue);
            }
            Iterator it4 = q8Var.d.iterator();
            while (it4.hasNext()) {
                serializedSize += w.d(iIntValue, (ByteString) it4.next());
            }
            Iterator it5 = q8Var.e.iterator();
            while (it5.hasNext()) {
                serializedSize += ((s8) it5.next()).getSerializedSize() + (w.s(iIntValue) * 2);
            }
            i += serializedSize;
        }
        return i;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final void writeDelimitedTo(OutputStream outputStream) {
        Logger logger = w.a;
        v vVar = new v(outputStream, 4096);
        vVar.U(getSerializedSize());
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.c0();
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final void writeTo(w wVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            q8 q8Var = (q8) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Iterator it = q8Var.a.iterator();
            while (it.hasNext()) {
                wVar.V(iIntValue, ((Long) it.next()).longValue());
            }
            Iterator it2 = q8Var.b.iterator();
            while (it2.hasNext()) {
                wVar.F(iIntValue, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = q8Var.c.iterator();
            while (it3.hasNext()) {
                wVar.H(iIntValue, ((Long) it3.next()).longValue());
            }
            Iterator it4 = q8Var.d.iterator();
            while (it4.hasNext()) {
                wVar.C(iIntValue, (ByteString) it4.next());
            }
            for (s8 s8Var : q8Var.e) {
                wVar.S(iIntValue, 3);
                s8Var.writeTo(wVar);
                wVar.S(iIntValue, 4);
            }
        }
    }

    public s8(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return b();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final MessageLite.Builder toBuilder() {
        p8 p8VarB = b();
        p8VarB.i(this);
        return p8VarB;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = w.a;
            t tVar = new t(bArr, serializedSize);
            writeTo(tVar);
            if (tVar.y() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vq2.n("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e) {
            vq2.n("Serializing to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    public final String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public final void writeTo(OutputStream outputStream) {
        Logger logger = w.a;
        v vVar = new v(outputStream, 4096);
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.c0();
        }
    }
}
