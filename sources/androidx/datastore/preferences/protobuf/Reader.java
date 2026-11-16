package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
interface Reader {
    void A(List list);

    void B(List list);

    int C();

    long D();

    int E();

    String F();

    Object G(Class cls, ExtensionRegistryLite extensionRegistryLite);

    boolean H();

    void I(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void J(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object K(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void L(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void M(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    String N();

    void O(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void a(List list);

    long b();

    int c();

    int d();

    int e();

    void f(List list);

    ByteString g();

    int getTag();

    void h(List list);

    long i();

    void j(List list);

    void k(List list);

    void l(List list);

    int m();

    void n(List list);

    void o(List list);

    void p(List list);

    void q(List list);

    long r();

    double readDouble();

    float readFloat();

    long s();

    void t(List list);

    boolean u();

    void v(List list);

    void w(List list);

    void x(List list);

    void y(List list);

    int z();
}
