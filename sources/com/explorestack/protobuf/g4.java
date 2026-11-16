package com.explorestack.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g4 extends AbstractMessage.Builder {
    private h4 builderParent;
    private boolean isClean;
    private f4 meAsParent;
    private s8 unknownFields = s8.c;

    @Override // com.explorestack.protobuf.AbstractMessage.Builder
    public void dispose() {
        this.builderParent = null;
    }

    public abstract w4 internalGetFieldAccessorTable();

    @Override // com.explorestack.protobuf.AbstractMessage.Builder
    public void markClean() {
        this.isClean = true;
    }

    public final TreeMap b() {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().a.getFields();
        int fieldCount = 0;
        while (fieldCount < fields.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
            Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                fieldCount += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
            }
            fieldCount++;
        }
        return treeMap;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public g4 clear() {
        this.unknownFields = s8.c;
        onChanged();
        return this;
    }

    public h4 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new f4(this);
        }
        return this.meAsParent;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    public k6 internalGetMapField(int i) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    public k6 internalGetMutableMapField(int i) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public g4 mergeUnknownFields(s8 s8Var) {
        s8 s8Var2 = this.unknownFields;
        p8 p8VarB = s8.b();
        p8VarB.i(s8Var2);
        p8VarB.i(s8Var);
        return setUnknownFields(p8VarB.build());
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    public final void onChanged() {
        h4 h4Var;
        if (!this.isClean || (h4Var = this.builderParent) == null) {
            return;
        }
        h4Var.markDirty();
        this.isClean = false;
    }

    public g4 setUnknownFields(s8 s8Var) {
        this.unknownFields = s8Var;
        onChanged();
        return this;
    }

    public g4 setUnknownFieldsProto3(s8 s8Var) {
        this.unknownFields = s8Var;
        onChanged();
        return this;
    }

    public g4(h4 h4Var) {
        this.builderParent = h4Var;
    }

    public g4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        w4.b(internalGetFieldAccessorTable(), fieldDescriptor).c(this, obj);
        return this;
    }

    public g4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        w4.b(internalGetFieldAccessorTable(), fieldDescriptor).h(this);
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public g4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        y4.access$1100(w4.a(internalGetFieldAccessorTable(), oneofDescriptor).d, this, new Object[0]);
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /* JADX INFO: renamed from: clone */
    public g4 mo247clone() {
        g4 g4Var = (g4) getDefaultInstanceForType().newBuilderForType();
        g4Var.mergeFrom(buildPartial());
        return g4Var;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(b());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        Object objP = w4.b(internalGetFieldAccessorTable(), fieldDescriptor).p(this);
        if (fieldDescriptor.isRepeated()) {
            return Collections.unmodifiableList((List) objP);
        }
        return objP;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).a(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        m4 m4VarA = w4.a(internalGetFieldAccessorTable(), oneofDescriptor);
        Descriptors.FieldDescriptor fieldDescriptor = m4VarA.e;
        if (fieldDescriptor != null) {
            if (hasField(fieldDescriptor)) {
                return fieldDescriptor;
            }
            return null;
        }
        int number = ((c5) y4.access$1100(m4VarA.c, this, new Object[0])).getNumber();
        if (number > 0) {
            return m4VarA.a.findFieldByNumber(number);
        }
        return null;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).b(this, i);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).i(this, i);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).o(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).f(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        m4 m4VarA = w4.a(internalGetFieldAccessorTable(), oneofDescriptor);
        Descriptors.FieldDescriptor fieldDescriptor = m4VarA.e;
        if (fieldDescriptor != null) {
            return hasField(fieldDescriptor);
        }
        if (((c5) y4.access$1100(m4VarA.c, this, new Object[0])).getNumber() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
        return w4.b(internalGetFieldAccessorTable(), fieldDescriptor).n();
    }

    public g4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        w4.b(internalGetFieldAccessorTable(), fieldDescriptor).j(this, obj);
        return this;
    }

    public g4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        w4.b(internalGetFieldAccessorTable(), fieldDescriptor).m(this, i, obj);
        return this;
    }
}
