package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final Internal.ProtobufList a(long j, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.c.m(j, obj);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        UnsafeUtil.r(j, obj, protobufListMutableCopyWithCapacity);
        return protobufListMutableCopyWithCapacity;
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void b(long j, Object obj, Object obj2) {
        UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
        Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) memoryAccessor.m(j, obj);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m(j, obj2);
        int size = protobufListMutableCopyWithCapacity.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            protobufListMutableCopyWithCapacity.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity;
        }
        UnsafeUtil.r(j, obj, protobufList);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void c(long j, Object obj) {
        ((Internal.ProtobufList) UnsafeUtil.c.m(j, obj)).makeImmutable();
    }
}
