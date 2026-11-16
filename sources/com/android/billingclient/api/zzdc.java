package com.android.billingclient.api;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzdc {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    static final BillingResult zzF;
    static final BillingResult zzG;
    static final BillingResult zzH;
    public static final /* synthetic */ int zzI = 0;
    static final BillingResult zza;
    static final BillingResult zzb;
    static final BillingResult zzc;
    static final BillingResult zzd;
    static final BillingResult zze;
    static final BillingResult zzf;
    static final BillingResult zzg;
    static final BillingResult zzh;
    static final BillingResult zzi;
    static final BillingResult zzj;
    static final BillingResult zzk;
    static final BillingResult zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(3);
        builderNewBuilder.setDebugMessage("Google Play In-app Billing API version is less than 3");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(3);
        builderNewBuilder2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        zza = builderNewBuilder2.build();
        zzb = h50.h(3, "Billing service unavailable on device.");
        zzc = h50.h(2, "Billing service unavailable on device.");
        zzd = h50.h(5, "Client is already in the process of connecting to billing service.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(5);
        builderNewBuilder3.setDebugMessage("The list of SKUs can't be empty.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(5);
        builderNewBuilder4.setDebugMessage("SKU type can't be empty.");
        builderNewBuilder4.build();
        BillingResult.Builder builderNewBuilder5 = BillingResult.newBuilder();
        builderNewBuilder5.setResponseCode(5);
        builderNewBuilder5.setDebugMessage("Product type can't be empty.");
        zze = builderNewBuilder5.build();
        zzf = h50.h(-2, "Client does not support extra params.");
        zzg = h50.h(5, "Invalid purchase token.");
        zzh = h50.h(6, "An internal error occurred.");
        BillingResult.Builder builderNewBuilder6 = BillingResult.newBuilder();
        builderNewBuilder6.setResponseCode(5);
        builderNewBuilder6.setDebugMessage("SKU can't be null.");
        builderNewBuilder6.build();
        BillingResult.Builder builderNewBuilder7 = BillingResult.newBuilder();
        builderNewBuilder7.setResponseCode(0);
        zzi = builderNewBuilder7.build();
        zzj = h50.h(-1, "Service connection is disconnected.");
        zzk = h50.h(2, "Timeout communicating with service.");
        zzl = h50.h(-2, "Client does not support subscriptions.");
        zzm = h50.h(-2, "Client does not support subscriptions update.");
        BillingResult.Builder builderNewBuilder8 = BillingResult.newBuilder();
        builderNewBuilder8.setResponseCode(-2);
        builderNewBuilder8.setDebugMessage("Client does not support get purchase history.");
        builderNewBuilder8.build();
        BillingResult.Builder builderNewBuilder9 = BillingResult.newBuilder();
        builderNewBuilder9.setResponseCode(-2);
        builderNewBuilder9.setDebugMessage("Client does not support price change confirmation.");
        zzn = builderNewBuilder9.build();
        zzo = h50.h(-2, "Play Store version installed does not support cross selling products.");
        zzp = h50.h(-2, "Client does not support multi-item purchases.");
        zzq = h50.h(-2, "Client does not support offer_id_token.");
        zzr = h50.h(-2, "Client does not support ProductDetails.");
        zzs = h50.h(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder10 = BillingResult.newBuilder();
        builderNewBuilder10.setResponseCode(-2);
        builderNewBuilder10.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder10.build();
        BillingResult.Builder builderNewBuilder11 = BillingResult.newBuilder();
        builderNewBuilder11.setResponseCode(-2);
        builderNewBuilder11.setDebugMessage("Play Store version installed does not support external offer.");
        zzt = builderNewBuilder11.build();
        zzu = h50.h(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        zzv = h50.h(-2, "Play Store version installed does not support querying AutoPay plan purchase.");
        zzw = h50.h(-2, "Play Store version installed does not support including suspended subscriptions.");
        zzx = h50.h(5, "Unknown feature");
        zzy = h50.h(-2, "Play Store version installed does not support get billing config.");
        zzz = h50.h(-2, "Query product details with serialized docid is not supported.");
        BillingResult.Builder builderNewBuilder12 = BillingResult.newBuilder();
        builderNewBuilder12.setResponseCode(-2);
        builderNewBuilder12.setDebugMessage("Play Store version installed does not support launching external offer flow.");
        builderNewBuilder12.build();
        BillingResult.Builder builderNewBuilder13 = BillingResult.newBuilder();
        builderNewBuilder13.setResponseCode(4);
        builderNewBuilder13.setDebugMessage("Item is unavailable for purchase.");
        zzA = builderNewBuilder13.build();
        zzB = h50.h(-2, "Query product details with developer specified account is not supported.");
        zzC = h50.h(-2, "Play Store version installed does not support alternative billing only.");
        zzD = h50.h(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        zzE = h50.h(6, "An error occurred while retrieving billing override.");
        zzF = h50.h(-2, "Play Store version installed does not support the provided billing program.");
        zzG = h50.h(-2, "Play Store version installed does not support launching external links.");
        zzH = h50.h(5, "A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
    }

    public static BillingResult zza(int i, String str) {
        return h50.h(i, str);
    }
}
