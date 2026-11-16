package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements g7 {
    private static final o3 EMPTY_REGISTRY = o3.a();

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        r rVarI = r.i(byteBuffer, false);
        MessageLite messageLite = (MessageLite) parsePartialFrom(rVarI, o3Var);
        try {
            rVarI.a(0);
            a(messageLite);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    public static void a(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
        } else {
            throw (messageLite instanceof c ? ((c) messageLite).newUninitializedMessageException() : new n8(messageLite)).d().setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws InvalidProtocolBufferException {
        MessageLite messageLiteM283parsePartialDelimitedFrom = m283parsePartialDelimitedFrom(inputStream, o3Var);
        a(messageLiteM283parsePartialDelimitedFrom);
        return messageLiteM283parsePartialDelimitedFrom;
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m283parsePartialDelimitedFrom(InputStream inputStream, o3 o3Var) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return m288parsePartialFrom((InputStream) new a(inputStream, r.y(i, inputStream)), o3Var);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m285parsePartialFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        r rVarNewCodedInput = byteString.newCodedInput();
        MessageLite messageLite = (MessageLite) parsePartialFrom(rVarNewCodedInput, o3Var);
        try {
            rVarNewCodedInput.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m286parsePartialFrom(r rVar) throws InvalidProtocolBufferException {
        return (MessageLite) parsePartialFrom(rVar, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m284parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return m285parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m282parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m283parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m291parsePartialFrom(byte[] bArr, int i, int i2, o3 o3Var) throws InvalidProtocolBufferException {
        n nVarG = r.g(bArr, i, i2, false);
        MessageLite messageLite = (MessageLite) parsePartialFrom(nVarG, o3Var);
        try {
            nVarG.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        MessageLite messageLite = (MessageLite) parsePartialFrom(rVar, o3Var);
        a(messageLite);
        return messageLite;
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(r rVar) throws InvalidProtocolBufferException {
        return parseFrom(rVar, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m290parsePartialFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m291parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        MessageLite messageLiteM285parsePartialFrom = m285parsePartialFrom(byteString, o3Var);
        a(messageLiteM285parsePartialFrom);
        return messageLiteM285parsePartialFrom;
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m292parsePartialFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return m291parsePartialFrom(bArr, 0, bArr.length, o3Var);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m289parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return m291parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m288parsePartialFrom(InputStream inputStream, o3 o3Var) throws InvalidProtocolBufferException {
        r rVarH = r.h(inputStream);
        MessageLite messageLite = (MessageLite) parsePartialFrom(rVarH, o3Var);
        try {
            rVarH.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messageLite);
        }
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m281parseFrom(byte[] bArr, int i, int i2, o3 o3Var) throws InvalidProtocolBufferException {
        MessageLite messageLiteM291parsePartialFrom = m291parsePartialFrom(bArr, i, i2, o3Var);
        a(messageLiteM291parsePartialFrom);
        return messageLiteM291parsePartialFrom;
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m280parseFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m281parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return m281parseFrom(bArr, 0, bArr.length, o3Var);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m287parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m288parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(InputStream inputStream, o3 o3Var) throws InvalidProtocolBufferException {
        MessageLite messageLiteM288parsePartialFrom = m288parsePartialFrom(inputStream, o3Var);
        a(messageLiteM288parsePartialFrom);
        return messageLiteM288parsePartialFrom;
    }

    @Override // com.explorestack.protobuf.g7
    public MessageLite parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
