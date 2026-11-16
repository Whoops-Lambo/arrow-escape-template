package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r8 extends d {
    @Override // com.explorestack.protobuf.g7
    public final Object parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        p8 p8VarB = s8.b();
        try {
            p8VarB.h(rVar);
            return p8VarB.build();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(p8VarB.build());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(p8VarB.build());
        }
    }
}
