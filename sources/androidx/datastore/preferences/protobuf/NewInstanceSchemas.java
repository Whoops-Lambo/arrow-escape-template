package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
final class NewInstanceSchemas {
    public static final NewInstanceSchema a;
    public static final NewInstanceSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        NewInstanceSchema newInstanceSchema = null;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = newInstanceSchema;
        b = new NewInstanceSchemaLite();
    }
}
