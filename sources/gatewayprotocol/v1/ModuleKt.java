package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ModuleKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleKt {

    @NotNull
    public static final ModuleKt INSTANCE = new ModuleKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lgatewayprotocol/v1/ModuleKt$Dsl;", "", "Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;)V", "Lgatewayprotocol/v1/ModuleOuterClass$Module;", "_build", "()Lgatewayprotocol/v1/ModuleOuterClass$Module;", "Laz2;", "clearName", "()V", "clearConfig", "Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;", "", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Lcom/google/protobuf/ByteString;", "getConfig", "()Lcom/google/protobuf/ByteString;", "setConfig", "(Lcom/google/protobuf/ByteString;)V", "config", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ModuleOuterClass.Module.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ModuleKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ModuleKt$Dsl;", "builder", "Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(ModuleOuterClass.Module.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public final /* synthetic */ ModuleOuterClass.Module _build() {
            ModuleOuterClass.Module moduleBuild = this._builder.build();
            moduleBuild.getClass();
            return moduleBuild;
        }

        public final void clearConfig() {
            this._builder.clearConfig();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        @NotNull
        public final ByteString getConfig() {
            ByteString config = this._builder.getConfig();
            config.getClass();
            return config;
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        private Dsl(ModuleOuterClass.Module.Builder builder) {
            this._builder = builder;
        }

        public final void setConfig(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setConfig(byteString);
        }

        public final void setName(@NotNull String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public /* synthetic */ Dsl(ModuleOuterClass.Module.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private ModuleKt() {
    }
}
