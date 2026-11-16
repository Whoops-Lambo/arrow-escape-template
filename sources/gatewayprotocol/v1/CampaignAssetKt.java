package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CampaignAssetKt {

    @NotNull
    public static final CampaignAssetKt INSTANCE = new CampaignAssetKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt$Dsl;", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;)V", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "_build", "()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "Laz2;", "clearUrl", "()V", "clearPriority", "clearRequired", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;", "", "value", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "url", "", "getPriority", "()I", "setPriority", "(I)V", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "getRequired", "()Z", "setRequired", "(Z)V", "required", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignMetadataOuterClass.CampaignAsset.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignAssetKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset _build() {
            CampaignMetadataOuterClass.CampaignAsset campaignAssetBuild = this._builder.build();
            campaignAssetBuild.getClass();
            return campaignAssetBuild;
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearRequired() {
            this._builder.clearRequired();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final int getPriority() {
            return this._builder.getPriority();
        }

        public final boolean getRequired() {
            return this._builder.getRequired();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            url.getClass();
            return url;
        }

        public final void setPriority(int i) {
            this._builder.setPriority(i);
        }

        public final void setRequired(boolean z) {
            this._builder.setRequired(z);
        }

        private Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
            this._builder = builder;
        }

        public final void setUrl(@NotNull String str) {
            str.getClass();
            this._builder.setUrl(str);
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private CampaignAssetKt() {
    }
}
