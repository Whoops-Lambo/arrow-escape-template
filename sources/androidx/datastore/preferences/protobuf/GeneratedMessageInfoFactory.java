package androidx.datastore.preferences.protobuf;

import defpackage.d;
import defpackage.vq2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {
    public static final GeneratedMessageInfoFactory a = new GeneratedMessageInfoFactory();

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            d.r("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (MessageInfo) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).h(GeneratedMessageLite.MethodToInvoke.c, null);
        } catch (Exception e) {
            vq2.n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
