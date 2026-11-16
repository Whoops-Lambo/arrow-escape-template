package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import defpackage.dt1;
import defpackage.e80;
import defpackage.qh1;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", "", "billingClientInternalInstance", "<init>", "(Ljava/lang/Object;)V", "", "purchaseType", "Lcom/unity3d/services/store/gpbl/proxies/PurchasesResponseListenerProxy;", "purchasesResponseListenerProxy", "Laz2;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "(Ljava/lang/String;Lcom/unity3d/services/store/gpbl/proxies/PurchasesResponseListenerProxy;)V", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsParamsBridge;", "params", "Lcom/unity3d/services/store/gpbl/proxies/SkuDetailsResponseListenerProxy;", "skuDetailsResponseListenerProxy", "querySkuDetailsAsync", "(Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsParamsBridge;Lcom/unity3d/services/store/gpbl/proxies/SkuDetailsResponseListenerProxy;)V", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "queryProductDetailsParamsBridge", "Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", "productDetailsResponseListenerProxy", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillingClientBridge extends BillingClientBridgeCommon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";

    @NotNull
    public static final String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge$Companion;", "", "<init>", "()V", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "context", "Landroid/content/Context;", "QUERY_PURCHASES_ASYNC_METHOD", "", "QUERY_PRODUCT_DETAILS_ASYNC_METHOD", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            context.getClass();
            return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
        }

        private Companion() {
        }
    }

    public BillingClientBridge(@Nullable Object obj) {
        super(obj, qh1.Y(new dt1(QUERY_PURCHASES_ASYNC_METHOD, new Class[]{QueryPurchasesParamsBridge.INSTANCE.getClassForParams(), PurchasesResponseListenerProxy.getProxyListenerClass()}), new dt1(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, new Class[]{QueryProductDetailsParamsBridge.INSTANCE.getClassForParams(), ProductDetailsResponseListenerProxy.INSTANCE.getProxyListenerClass()})));
    }

    @NotNull
    public static final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return INSTANCE.newBuilder(context);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        if (purchaseType != null) {
            QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryPurchasesParamsBridge.INSTANCE.newBuilder().setProductType(purchaseType).build();
            Object obj = this._billingClientInternalInstance;
            Object queryProductDetailsParamsInternalInstance = queryProductDetailsParamsBridgeBuild.getQueryProductDetailsParamsInternalInstance();
            purchasesResponseListenerProxy.getClass();
            callVoidMethod(QUERY_PURCHASES_ASYNC_METHOD, obj, queryProductDetailsParamsInternalInstance, purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    public final void queryProductDetailsAsync(@NotNull QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, @NotNull ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) {
        queryProductDetailsParamsBridge.getClass();
        productDetailsResponseListenerProxy.getClass();
        callVoidMethod(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(@NotNull SkuDetailsParamsBridge params, @NotNull SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws NoSuchMethodException, ClassNotFoundException {
        params.getClass();
        skuDetailsResponseListenerProxy.getClass();
        throw new NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }
}
