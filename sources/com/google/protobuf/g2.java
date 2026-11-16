package com.google.protobuf;

import defpackage.g22;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g2 {
    public abstract UnknownFieldSetLite a(Object obj);

    public final boolean b(Object obj, g22 g22Var, int i) throws IOException {
        s sVar;
        int i2 = ((s) g22Var).b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType == 0) {
            s sVar2 = (s) g22Var;
            sVar2.x(0);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(sVar2.a.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            s sVar3 = (s) g22Var;
            sVar3.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(sVar3.a.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), ((s) g22Var).e());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            s sVar4 = (s) g22Var;
            sVar4.x(5);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(sVar4.a.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i3 = i + 1;
        if (i3 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        do {
            sVar = (s) g22Var;
            if (sVar.a() == Integer.MAX_VALUE) {
                break;
            }
        } while (b(unknownFieldSetLiteNewInstance, sVar, i3));
        if (iMakeTag != sVar.b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        unknownFieldSetLiteNewInstance.makeImmutable();
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), unknownFieldSetLiteNewInstance);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
