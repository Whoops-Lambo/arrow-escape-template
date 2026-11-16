package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@CheckReturnValue
final class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object c(Object obj) {
        ((MapFieldLite) obj).a = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteG = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteG.a) {
                mapFieldLiteG = mapFieldLiteG.g();
            }
            mapFieldLiteG.f();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteG.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteG;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata b(Object obj) {
        return ((MapEntryLite) obj).a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int d(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iY = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iX = CodedOutputStream.X(i);
            int iA = MapEntryLite.a(mapEntryLite.a, key, value);
            iY += CodedOutputStream.Y(iA) + iA + iX;
        }
        return iY;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean f(Object obj) {
        return !((MapFieldLite) obj).a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite h() {
        return MapFieldLite.b.g();
    }
}
