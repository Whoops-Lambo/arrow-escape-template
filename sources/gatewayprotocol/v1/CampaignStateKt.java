package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.e80;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignStateKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CampaignStateKt {

    @NotNull
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b#\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b$\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b&\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\tH\u0007¢\u0006\u0004\b'\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00061"}, d2 = {"Lgatewayprotocol/v1/CampaignStateKt$Dsl;", "", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState$Builder;)V", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "_build", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "Lgatewayprotocol/v1/CampaignStateKt$Dsl$LoadedCampaignsProxy;", "value", "Laz2;", "addLoadedCampaigns", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;)V", com.safedk.android.analytics.brandsafety.m.l, "plusAssignLoadedCampaigns", "plusAssign", "", "values", "addAllLoadedCampaigns", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllLoadedCampaigns", "", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "setLoadedCampaigns", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/CampaignStateOuterClass$Campaign;)V", "set", "clearLoadedCampaigns", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lgatewayprotocol/v1/CampaignStateKt$Dsl$ShownCampaignsProxy;", "addShownCampaigns", "plusAssignShownCampaigns", "addAllShownCampaigns", "plusAssignAllShownCampaigns", "setShownCampaigns", "clearShownCampaigns", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState$Builder;", "getLoadedCampaigns", "()Lcom/google/protobuf/kotlin/DslList;", "loadedCampaigns", "getShownCampaigns", "shownCampaigns", "Companion", "LoadedCampaignsProxy", "ShownCampaignsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignStateKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignStateKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignStateKt$Dsl$LoadedCampaignsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/CampaignStateKt$Dsl$ShownCampaignsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            CampaignStateOuterClass.CampaignState campaignStateBuild = this._builder.build();
            campaignStateBuild.getClass();
            return campaignStateBuild;
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List<CampaignStateOuterClass.Campaign> loadedCampaignsList = this._builder.getLoadedCampaignsList();
            loadedCampaignsList.getClass();
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List<CampaignStateOuterClass.Campaign> shownCampaignsList = this._builder.getShownCampaignsList();
            shownCampaignsList.getClass();
            return new DslList(shownCampaignsList);
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllLoadedCampaigns(iterable);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllShownCampaigns(iterable);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            this._builder.addLoadedCampaigns(campaign);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            this._builder.addShownCampaigns(campaign);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            dslList.getClass();
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            dslList.getClass();
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllLoadedCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllShownCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            addLoadedCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            addShownCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            this._builder.setLoadedCampaigns(i, campaign);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            dslList.getClass();
            campaign.getClass();
            this._builder.setShownCampaigns(i, campaign);
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private CampaignStateKt() {
    }
}
