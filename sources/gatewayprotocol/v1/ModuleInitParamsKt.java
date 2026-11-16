package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ModuleInitParamsKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleInitParamsKt {

    @NotNull
    public static final ModuleInitParamsKt INSTANCE = new ModuleInitParamsKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lgatewayprotocol/v1/ModuleInitParamsKt$Dsl;", "", "Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams$Builder;)V", "Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams;", "_build", "()Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams;", "Laz2;", "clearName", "()V", "clearParams", "clearClassName", "Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams$Builder;", "", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Lcom/google/protobuf/ByteString;", "getParams", "()Lcom/google/protobuf/ByteString;", "setParams", "(Lcom/google/protobuf/ByteString;)V", "params", "getClassName", "setClassName", "className", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ModuleInitParamsOuterClass.ModuleInitParams.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ModuleInitParamsKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ModuleInitParamsKt$Dsl;", "builder", "Lgatewayprotocol/v1/ModuleInitParamsOuterClass$ModuleInitParams$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public final /* synthetic */ ModuleInitParamsOuterClass.ModuleInitParams _build() {
            ModuleInitParamsOuterClass.ModuleInitParams moduleInitParamsBuild = this._builder.build();
            moduleInitParamsBuild.getClass();
            return moduleInitParamsBuild;
        }

        public final void clearClassName() {
            this._builder.clearClassName();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearParams() {
            this._builder.clearParams();
        }

        @NotNull
        public final String getClassName() {
            String className = this._builder.getClassName();
            className.getClass();
            return className;
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        @NotNull
        public final ByteString getParams() {
            ByteString params = this._builder.getParams();
            params.getClass();
            return params;
        }

        private Dsl(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder) {
            this._builder = builder;
        }

        public final void setClassName(@NotNull String str) {
            str.getClass();
            this._builder.setClassName(str);
        }

        public final void setName(@NotNull String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setParams(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setParams(byteString);
        }

        public /* synthetic */ Dsl(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private ModuleInitParamsKt() {
    }
}
