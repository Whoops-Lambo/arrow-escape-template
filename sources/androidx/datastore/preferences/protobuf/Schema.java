package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@CheckReturnValue
interface Schema<T> {
    void a(Object obj, Object obj2);

    void b(Object obj);

    Object c();

    boolean d(Object obj);

    int e(AbstractMessageLite abstractMessageLite);

    void f(Object obj, Writer writer);

    boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    void h(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    int i(GeneratedMessageLite generatedMessageLite);
}
