package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ListFieldSchemas {
    public static final ListFieldSchema a;
    public static final ListFieldSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        ListFieldSchema listFieldSchema = null;
        try {
            listFieldSchema = (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = listFieldSchema;
        b = new ListFieldSchemaLite();
    }
}
