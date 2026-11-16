package io.p071bidmachine;

import android.content.Context;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.p071bidmachine.AdContentType;
import io.p071bidmachine.AdPlacementConfig;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.Constants;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.core.a;
import io.p071bidmachine.displays.b;
import io.p071bidmachine.displays.e;
import io.p071bidmachine.displays.f;
import io.p071bidmachine.displays.k;
import io.p071bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.p071bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.util.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Interstitial' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class AdsType {
    public static final AdsType Interstitial;
    public static final AdsType Rewarded;

    @NonNull
    private final ApiRequest.ApiAuctionDataBinder binder;

    @NonNull
    private final String name;

    @NonNull
    private final f[] placementBuilders;

    @NonNull
    private final Executor placementCreateExecutor;
    public static final AdsType Banner = new AdsType("Banner", 0, "banner", new ApiRequest.ApiAuctionDataBinder(), new f[]{new o(false)});
    public static final AdsType Native = new AdsType("Native", 3, "native", new ApiRequest.ApiAuctionDataBinder(), new f[]{new e(AdContentType.All)});
    private static final /* synthetic */ AdsType[] $VALUES = $values();

    private static /* synthetic */ AdsType[] $values() {
        return new AdsType[]{Banner, Interstitial, Rewarded, Native};
    }

    static {
        final boolean z = false;
        final boolean z2 = true;
        Interstitial = new AdsType("Interstitial", 1, "interstitial", new ApiRequest.ApiAuctionDataBinder(), new f[]{new b(true), new f(z2) { // from class: io.bidmachine.displays.g
            public final boolean c;

            {
                super(AdContentType.Video);
                this.c = z2;
            }

            @Override // io.p071bidmachine.displays.f
            public final io.p071bidmachine.models.b a(Ad ad) {
                if (!ad.hasVideo()) {
                    return null;
                }
                h hVarB = b(ad);
                if (hVarB == null) {
                    Ad.Video video = ad.getVideo();
                    a aVar = new a(ad);
                    String adm = video.getAdm();
                    if (adm != null && adm.length() != 0) {
                        ((ConcurrentHashMap) aVar.a()).put("creativeAdm", adm);
                        return aVar;
                    }
                    ((ConcurrentHashMap) aVar.a()).remove("creativeAdm");
                    return aVar;
                }
                return hVarB;
            }

            @Override // io.p071bidmachine.displays.f
            public final Message.Builder d(ContextProvider contextProvider, d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i) {
                Context context = contextProvider.getContext();
                context.getClass();
                Size sizeX = p.x(context);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeX.getWidth()).setH(sizeX.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Constants.VIDEO_MIME_TYPES).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderC = c(contextProvider, dVar, adsType, collection, list, i);
                if (adPlacementConfig == null && builderC != null) {
                    linearValue.addExtProto(Any.pack(builderC.build()));
                    return linearValue;
                }
                if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f.e(adPlacementConfig, builderC)));
                }
                return linearValue;
            }
        }});
        Rewarded = new AdsType("Rewarded", 2, "rewarded", new ApiRequest.ApiAuctionDataBinder(), new f[]{new b(true), new f(z) { // from class: io.bidmachine.displays.g
            public final boolean c;

            {
                super(AdContentType.Video);
                this.c = z;
            }

            @Override // io.p071bidmachine.displays.f
            public final io.p071bidmachine.models.b a(Ad ad) {
                if (!ad.hasVideo()) {
                    return null;
                }
                h hVarB = b(ad);
                if (hVarB == null) {
                    Ad.Video video = ad.getVideo();
                    a aVar = new a(ad);
                    String adm = video.getAdm();
                    if (adm != null && adm.length() != 0) {
                        ((ConcurrentHashMap) aVar.a()).put("creativeAdm", adm);
                        return aVar;
                    }
                    ((ConcurrentHashMap) aVar.a()).remove("creativeAdm");
                    return aVar;
                }
                return hVarB;
            }

            @Override // io.p071bidmachine.displays.f
            public final Message.Builder d(ContextProvider contextProvider, d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i) {
                Context context = contextProvider.getContext();
                context.getClass();
                Size sizeX = p.x(context);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeX.getWidth()).setH(sizeX.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Constants.VIDEO_MIME_TYPES).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderC = c(contextProvider, dVar, adsType, collection, list, i);
                if (adPlacementConfig == null && builderC != null) {
                    linearValue.addExtProto(Any.pack(builderC.build()));
                    return linearValue;
                }
                if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f.e(adPlacementConfig, builderC)));
                }
                return linearValue;
            }
        }});
    }

    public static AdsType valueOf(String str) {
        return (AdsType) Enum.valueOf(AdsType.class, str);
    }

    public static AdsType[] values() {
        return (AdsType[]) $VALUES.clone();
    }

    public void collectPlacements(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull d dVar, @NonNull Collection<NetworkConfig> collection, @NonNull List<Message.Builder> list, @NonNull List<NetworkAdUnit> list2, @Nullable AdPlacementConfig adPlacementConfig, int i) {
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        f[] fVarArr = adsType.placementBuilders;
        int length = fVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            f fVar = fVarArr[i2];
            if (adRequest.isPlacementBuilderMatch(fVar)) {
                adsType.placementCreateExecutor.execute(new p(adsType, fVar, contextProvider, dVar, collection, list2, adPlacementConfig, i, list, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
            i2++;
            adsType = this;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            a.i(e);
        }
    }

    @Nullable
    public io.p071bidmachine.models.b createAdObjectParams(@NonNull String str, @NonNull Ad ad) {
        for (f fVar : this.placementBuilders) {
            io.p071bidmachine.models.b bVarA = fVar.a(ad);
            if (bVarA != null) {
                ((ConcurrentHashMap) bVarA.a()).put("bidId", str);
                return bVarA;
            }
        }
        return null;
    }

    @NonNull
    public ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad) {
        for (f fVar : this.placementBuilders) {
            k kVar = fVar.b;
            HeaderBiddingAd headerBiddingAdB = k.b(ad);
            if (headerBiddingAdB != null) {
                return headerBiddingAdB;
            }
        }
        return null;
    }

    private AdsType(@NonNull String str, @NonNull int i, @NonNull String str2, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, f[] fVarArr) {
        super(str, i);
        this.name = str2;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = fVarArr;
        this.placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
    }

    @Nullable
    public NetworkAdapter findNetworkAdapter(@NonNull Ad ad) {
        NetworkAdapter adapter;
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad);
        if (headerBiddingAdObtainHeaderBiddingAd != null) {
            adapter = NetworkRegistry.getAdapter(headerBiddingAdObtainHeaderBiddingAd.getBidder());
        } else {
            adapter = null;
        }
        if (adapter == null) {
            if (this == Native) {
                return NetworkRegistry.getAdapter("nast");
            }
            if (ad.hasDisplay()) {
                return NetworkRegistry.getAdapter("mraid");
            }
            if (ad.hasVideo()) {
                return NetworkRegistry.getAdapter(CreativeInfo.r);
            }
        }
        return adapter;
    }
}
