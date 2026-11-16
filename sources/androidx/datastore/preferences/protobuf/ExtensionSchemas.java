package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@CheckReturnValue
final class ExtensionSchemas {
    public static final ExtensionSchemaLite a = new ExtensionSchemaLite();
    public static final ExtensionSchema b;

    static {
        Protobuf protobuf = Protobuf.c;
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = extensionSchema;
    }
}
