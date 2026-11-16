package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.e80;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CampaignMetadataKt {

    @NotNull
    public static final CampaignMetadataKt INSTANCE = new CampaignMetadataKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0013\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0014\u0010\u0012J-\u0010\u001a\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0019J0\u0010 \u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R$\u0010+\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00107\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R$\u0010:\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*¨\u0006="}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;)V", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "_build", "()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "Laz2;", "clearCampaignStateDataVersion", "()V", "clearCampaignStateData", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "value", "addAssetsToCache", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;)V", com.safedk.android.analytics.brandsafety.m.l, "plusAssignAssetsToCache", "plusAssign", "", "values", "addAllAssetsToCache", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllAssetsToCache", "", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "setAssetsToCache", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;)V", "set", "clearAssetsToCache", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearAdDataRefreshDelayMs", "clearTtlSeconds", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "getCampaignStateDataVersion", "()I", "setCampaignStateDataVersion", "(I)V", "campaignStateDataVersion", "Lcom/google/protobuf/ByteString;", "getCampaignStateData", "()Lcom/google/protobuf/ByteString;", "setCampaignStateData", "(Lcom/google/protobuf/ByteString;)V", "campaignStateData", "getAssetsToCache", "()Lcom/google/protobuf/kotlin/DslList;", "assetsToCache", "getAdDataRefreshDelayMs", "setAdDataRefreshDelayMs", "adDataRefreshDelayMs", "getTtlSeconds", "setTtlSeconds", "ttlSeconds", "Companion", "AssetsToCacheProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignMetadataOuterClass.CampaignMetadata.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AssetsToCacheProxy extends DslProxy {
            private AssetsToCacheProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignMetadata _build() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadataBuild = this._builder.build();
            campaignMetadataBuild.getClass();
            return campaignMetadataBuild;
        }

        public final void clearAdDataRefreshDelayMs() {
            this._builder.clearAdDataRefreshDelayMs();
        }

        public final void clearCampaignStateData() {
            this._builder.clearCampaignStateData();
        }

        public final void clearCampaignStateDataVersion() {
            this._builder.clearCampaignStateDataVersion();
        }

        public final void clearTtlSeconds() {
            this._builder.clearTtlSeconds();
        }

        public final int getAdDataRefreshDelayMs() {
            return this._builder.getAdDataRefreshDelayMs();
        }

        public final /* synthetic */ DslList getAssetsToCache() {
            List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = this._builder.getAssetsToCacheList();
            assetsToCacheList.getClass();
            return new DslList(assetsToCacheList);
        }

        @NotNull
        public final ByteString getCampaignStateData() {
            ByteString campaignStateData = this._builder.getCampaignStateData();
            campaignStateData.getClass();
            return campaignStateData;
        }

        public final int getCampaignStateDataVersion() {
            return this._builder.getCampaignStateDataVersion();
        }

        public final int getTtlSeconds() {
            return this._builder.getTtlSeconds();
        }

        public final void setAdDataRefreshDelayMs(int i) {
            this._builder.setAdDataRefreshDelayMs(i);
        }

        public final void setCampaignStateDataVersion(int i) {
            this._builder.setCampaignStateDataVersion(i);
        }

        public final void setTtlSeconds(int i) {
            this._builder.setTtlSeconds(i);
        }

        private Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ void addAllAssetsToCache(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllAssetsToCache(iterable);
        }

        public final /* synthetic */ void addAssetsToCache(DslList dslList, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
            dslList.getClass();
            campaignAsset.getClass();
            this._builder.addAssetsToCache(campaignAsset);
        }

        public final /* synthetic */ void clearAssetsToCache(DslList dslList) {
            dslList.getClass();
            this._builder.clearAssetsToCache();
        }

        public final /* synthetic */ void plusAssignAllAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, Iterable<CampaignMetadataOuterClass.CampaignAsset> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllAssetsToCache(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
            dslList.getClass();
            campaignAsset.getClass();
            addAssetsToCache(dslList, campaignAsset);
        }

        public final /* synthetic */ void setAssetsToCache(DslList dslList, int i, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
            dslList.getClass();
            campaignAsset.getClass();
            this._builder.setAssetsToCache(i, campaignAsset);
        }

        public final void setCampaignStateData(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setCampaignStateData(byteString);
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private CampaignMetadataKt() {
    }
}
