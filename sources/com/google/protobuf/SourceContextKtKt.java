package com.google.protobuf;

import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/SourceContextKt$Dsl;", "Laz2;", "block", "Lcom/google/protobuf/SourceContext;", "-initializesourceContext", "(Lwr0;)Lcom/google/protobuf/SourceContext;", "sourceContext", "copy", "(Lcom/google/protobuf/SourceContext;Lwr0;)Lcom/google/protobuf/SourceContext;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SourceContextKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m326initializesourceContext(@NotNull wr0 wr0Var) {
        wr0Var.getClass();
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.INSTANCE;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        builderNewBuilder.getClass();
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final SourceContext copy(@NotNull SourceContext sourceContext, @NotNull wr0 wr0Var) {
        sourceContext.getClass();
        wr0Var.getClass();
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.INSTANCE;
        SourceContext.Builder builder = sourceContext.toBuilder();
        builder.getClass();
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }
}
