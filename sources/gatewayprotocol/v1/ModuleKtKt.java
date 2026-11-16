package gatewayprotocol.v1;

import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/ModuleKt$Dsl;", "Laz2;", "block", "Lgatewayprotocol/v1/ModuleOuterClass$Module;", "-initializemodule", "(Lwr0;)Lgatewayprotocol/v1/ModuleOuterClass$Module;", "module", "copy", "(Lgatewayprotocol/v1/ModuleOuterClass$Module;Lwr0;)Lgatewayprotocol/v1/ModuleOuterClass$Module;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ModuleKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemodule, reason: not valid java name */
    public static final ModuleOuterClass.Module m1102initializemodule(@NotNull wr0 wr0Var) {
        wr0Var.getClass();
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.INSTANCE;
        ModuleOuterClass.Module.Builder builderNewBuilder = ModuleOuterClass.Module.newBuilder();
        builderNewBuilder.getClass();
        ModuleKt.Dsl dsl_create = companion._create(builderNewBuilder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final ModuleOuterClass.Module copy(@NotNull ModuleOuterClass.Module module, @NotNull wr0 wr0Var) {
        module.getClass();
        wr0Var.getClass();
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.INSTANCE;
        ModuleOuterClass.Module.Builder builder = module.toBuilder();
        builder.getClass();
        ModuleKt.Dsl dsl_create = companion._create(builder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }
}
