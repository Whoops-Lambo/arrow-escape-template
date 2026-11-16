package com.unity3d.services.core.reflection;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import defpackage.dt1;
import defpackage.e80;
import defpackage.qh1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getCommunicatorInstance", "()Ljava/lang/Object;", "", "getClassName", "()Ljava/lang/String;", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "proxy", "topic", AppLovinCommunicatorBridge.SUBSCRIBE, "(Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;Ljava/lang/String;)Ljava/lang/Object;", "subscriber", "Laz2;", AppLovinCommunicatorBridge.UNSUBSCRIBE, "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppLovinCommunicatorBridge extends GenericBridge {

    @NotNull
    private static final String CLASS_NAME = "com.applovin.communicator.AppLovinCommunicator";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String GET_INSTANCE = "getInstance";

    @NotNull
    private static final String SUBSCRIBE = "subscribe";

    @NotNull
    private static final String UNSUBSCRIBE = "unsubscribe";

    @NotNull
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b0\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge$Companion;", "", "<init>", "()V", "CLASS_NAME", "", "GET_INSTANCE", "SUBSCRIBE", "UNSUBSCRIBE", "buildFunctionMap", "", "", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Class<?>[]> buildFunctionMap() {
            LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("getInstance", new Class[]{Context.class}));
            try {
                linkedHashMapZ.put(AppLovinCommunicatorBridge.SUBSCRIBE, new Class[]{AppLovinCommunicatorSubscriber.class, String.class});
                linkedHashMapZ.put(AppLovinCommunicatorBridge.UNSUBSCRIBE, new Class[]{AppLovinCommunicatorSubscriber.class, String.class});
            } catch (ClassNotFoundException unused) {
            }
            return linkedHashMapZ;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        private Companion() {
        }
    }

    private final Object getCommunicatorInstance() {
        return callNonVoidMethod("getInstance", null, this.context);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return CLASS_NAME;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinCommunicatorBridge(@NotNull Context context) {
        super(INSTANCE.buildFunctionMap(), false);
        context.getClass();
        this.context = context;
    }

    @Nullable
    public final Object subscribe(@NotNull CommunicatorSubscriberProxy proxy, @NotNull String topic) {
        proxy.getClass();
        topic.getClass();
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return null;
        }
        try {
            Object proxyInstance = proxy.getProxyInstance();
            callVoidMethod(SUBSCRIBE, communicatorInstance, proxyInstance, topic);
            return proxyInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void unsubscribe(@NotNull Object subscriber, @NotNull String topic) {
        subscriber.getClass();
        topic.getClass();
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return;
        }
        callVoidMethod(UNSUBSCRIBE, communicatorInstance, subscriber, topic);
    }
}
