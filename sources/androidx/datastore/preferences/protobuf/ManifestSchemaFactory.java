package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;
import defpackage.d;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {
    public static final AnonymousClass1 b = new AnonymousClass1();
    public final CompositeMessageInfoFactory a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        public MessageInfoFactory[] a;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            d.u("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.a) {
                if (messageInfoFactory.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass2 {
        static {
            try {
                new int[ProtoSyntax.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        Protobuf protobuf = Protobuf.c;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            messageInfoFactory = b;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.a = messageInfoFactoryArr;
        Charset charset = Internal.a;
        this.a = compositeMessageInfoFactory;
    }
}
