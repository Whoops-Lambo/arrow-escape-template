package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
final class MapFieldSchemas {
    public static final MapFieldSchema a;
    public static final MapFieldSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        MapFieldSchema mapFieldSchema = null;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = mapFieldSchema;
        b = new MapFieldSchemaLite();
    }
}
