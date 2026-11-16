package com.google.protobuf;

import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/BoolValueKt$Dsl;", "Laz2;", "block", "Lcom/google/protobuf/BoolValue;", "-initializeboolValue", "(Lwr0;)Lcom/google/protobuf/BoolValue;", "boolValue", "copy", "(Lcom/google/protobuf/BoolValue;Lwr0;)Lcom/google/protobuf/BoolValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BoolValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m310initializeboolValue(@NotNull wr0 wr0Var) {
        wr0Var.getClass();
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.INSTANCE;
        BoolValue.Builder builderNewBuilder = BoolValue.newBuilder();
        builderNewBuilder.getClass();
        BoolValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final BoolValue copy(@NotNull BoolValue boolValue, @NotNull wr0 wr0Var) {
        boolValue.getClass();
        wr0Var.getClass();
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.INSTANCE;
        BoolValue.Builder builder = boolValue.toBuilder();
        builder.getClass();
        BoolValueKt.Dsl dsl_create = companion._create(builder);
        wr0Var.invoke(dsl_create);
        return dsl_create._build();
    }
}
