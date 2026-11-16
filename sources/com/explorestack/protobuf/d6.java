package com.explorestack.protobuf;

import defpackage.m93;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d6 extends AbstractMessage {
    public final Object a;
    public final Object b;
    public final c6 c;
    public volatile int d;

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final a6 newBuilderForType() {
        c6 c6Var = this.c;
        return new a6(c6Var, c6Var.b, c6Var.d, false, false);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final Map getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.c.e.getFields()) {
            b(fieldDescriptor);
            treeMap.put(fieldDescriptor, getField(fieldDescriptor));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final Message mo250getDefaultInstanceForType() {
        c6 c6Var = this.c;
        return new d6(c6Var, c6Var.b, c6Var.d);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return this.c.e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g7 getParserForType() {
        return this.c.f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final int getSerializedSize() {
        if (this.d != -1) {
            return this.d;
        }
        c6 c6Var = this.c;
        Object obj = this.a;
        Object obj2 = this.b;
        int iG = y3.g(c6Var.c, 2, obj2) + y3.g(c6Var.a, 1, obj);
        this.d = iG;
        return iG;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return s8.c;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        if (this.c.c.a == m9.MESSAGE) {
            return ((MessageLite) this.b).isInitialized();
        }
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final Message.Builder toBuilder() {
        return new a6(this.c, this.a, this.b, true, true);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public final void writeTo(w wVar) {
        c6 c6Var = this.c;
        y3.y(wVar, c6Var.a, 1, this.a);
        y3.y(wVar, c6Var.c, 2, this.b);
    }

    public d6(r rVar, o3 o3Var, c6 c6Var) throws InvalidProtocolBufferException {
        this.d = -1;
        try {
            this.c = c6Var;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntryA = f6.a(rVar, o3Var, c6Var);
            this.a = simpleImmutableEntryA.getKey();
            this.b = simpleImmutableEntryA.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    public final void b(Descriptors.FieldDescriptor fieldDescriptor) {
        Descriptors.Descriptor containingType = fieldDescriptor.getContainingType();
        c6 c6Var = this.c;
        if (containingType == c6Var.e) {
            return;
        }
        m93.k("Wrong FieldDescriptor \"", fieldDescriptor.getFullName(), "\" used in message \"", c6Var.e.getFullName());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        Object obj;
        b(fieldDescriptor);
        if (fieldDescriptor.getNumber() == 1) {
            obj = this.a;
        } else {
            obj = this.b;
        }
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
            return fieldDescriptor.m249getEnumType().findValueByNumberCreatingIfUnknown(((Integer) obj).intValue());
        }
        return obj;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public final MessageLite mo250getDefaultInstanceForType() {
        c6 c6Var = this.c;
        return new d6(c6Var, c6Var.b, c6Var.d);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final MessageLite.Builder toBuilder() {
        return new a6(this.c, this.a, this.b, true, true);
    }

    public d6(c6 c6Var, Object obj, Object obj2) {
        this.d = -1;
        this.a = obj;
        this.b = obj2;
        this.c = c6Var;
    }

    public d6(Descriptors.Descriptor descriptor, l9 l9Var, l9 l9Var2, Serializable serializable) {
        this.d = -1;
        this.a = "";
        this.b = serializable;
        this.c = new c6(descriptor, this, l9Var, l9Var2);
    }
}
