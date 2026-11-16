package com.google.protobuf;

import defpackage.e32;
import defpackage.mk2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<n0> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public mk2 build() {
        if (this.wasBuilt) {
            e32.i("Builder can only build once");
            return null;
        }
        if (this.syntax == null) {
            e32.i("Must specify a proto syntax");
            return null;
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new mk2(this.syntax, this.messageSetWireFormat, this.checkInitialized, (n0[]) this.fields.toArray(new n0[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(n0 n0Var) {
        if (this.wasBuilt) {
            e32.i("Builder can only build once");
        } else {
            this.fields.add(n0Var);
        }
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
