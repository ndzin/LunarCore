// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;

public final class GetNpcTakenRewardScRspOuterClass {
  /**
   * Protobuf type {@code GetNpcTakenRewardScRsp}
   */
  public static final class GetNpcTakenRewardScRsp extends ProtoMessage<GetNpcTakenRewardScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 npc_id = 2;</code>
     */
    private int npcId;

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     */
    private final RepeatedInt oABGIDHGGHI = RepeatedInt.newEmptyInstance();

    private GetNpcTakenRewardScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetNpcTakenRewardScRsp}
     */
    public static GetNpcTakenRewardScRsp newInstance() {
      return new GetNpcTakenRewardScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public GetNpcTakenRewardScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetNpcTakenRewardScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 npc_id = 2;</code>
     * @return whether the npcId field is set
     */
    public boolean hasNpcId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 npc_id = 2;</code>
     * @return this
     */
    public GetNpcTakenRewardScRsp clearNpcId() {
      bitField0_ &= ~0x00000002;
      npcId = 0;
      return this;
    }

    /**
     * <code>optional uint32 npc_id = 2;</code>
     * @return the npcId
     */
    public int getNpcId() {
      return npcId;
    }

    /**
     * <code>optional uint32 npc_id = 2;</code>
     * @param value the npcId to set
     * @return this
     */
    public GetNpcTakenRewardScRsp setNpcId(final int value) {
      bitField0_ |= 0x00000002;
      npcId = value;
      return this;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     * @return whether the oABGIDHGGHI field is set
     */
    public boolean hasOABGIDHGGHI() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     * @return this
     */
    public GetNpcTakenRewardScRsp clearOABGIDHGGHI() {
      bitField0_ &= ~0x00000004;
      oABGIDHGGHI.clear();
      return this;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableOABGIDHGGHI()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getOABGIDHGGHI() {
      return oABGIDHGGHI;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableOABGIDHGGHI() {
      bitField0_ |= 0x00000004;
      return oABGIDHGGHI;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     * @param value the oABGIDHGGHI to add
     * @return this
     */
    public GetNpcTakenRewardScRsp addOABGIDHGGHI(final int value) {
      bitField0_ |= 0x00000004;
      oABGIDHGGHI.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 OABGIDHGGHI = 4;</code>
     * @param values the oABGIDHGGHI to add
     * @return this
     */
    public GetNpcTakenRewardScRsp addAllOABGIDHGGHI(final int... values) {
      bitField0_ |= 0x00000004;
      oABGIDHGGHI.addAll(values);
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp copyFrom(final GetNpcTakenRewardScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        npcId = other.npcId;
        oABGIDHGGHI.copyFrom(other.oABGIDHGGHI);
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp mergeFrom(final GetNpcTakenRewardScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNpcId()) {
        setNpcId(other.npcId);
      }
      if (other.hasOABGIDHGGHI()) {
        getMutableOABGIDHGGHI().addAll(other.oABGIDHGGHI);
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      npcId = 0;
      oABGIDHGGHI.clear();
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      oABGIDHGGHI.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetNpcTakenRewardScRsp)) {
        return false;
      }
      GetNpcTakenRewardScRsp other = (GetNpcTakenRewardScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNpcId() || npcId == other.npcId)
        && (!hasOABGIDHGGHI() || oABGIDHGGHI.equals(other.oABGIDHGGHI));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(npcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < oABGIDHGGHI.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(oABGIDHGGHI.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(npcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * oABGIDHGGHI.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(oABGIDHGGHI);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetNpcTakenRewardScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // npcId
            npcId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // oABGIDHGGHI [packed=true]
            input.readPackedUInt32(oABGIDHGGHI, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 32: {
            // oABGIDHGGHI [packed=false]
            tag = input.readRepeatedUInt32(oABGIDHGGHI, tag);
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.npcId, npcId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.oABGIDHGGHI, oABGIDHGGHI);
      }
      output.endObject();
    }

    @Override
    public GetNpcTakenRewardScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 105021404:
          case -1039282375: {
            if (input.isAtField(FieldNames.npcId)) {
              if (!input.trySkipNullValue()) {
                npcId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1877387145: {
            if (input.isAtField(FieldNames.oABGIDHGGHI)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(oABGIDHGGHI);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetNpcTakenRewardScRsp clone() {
      return new GetNpcTakenRewardScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetNpcTakenRewardScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), data).checkInitialized();
    }

    public static GetNpcTakenRewardScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), input).checkInitialized();
    }

    public static GetNpcTakenRewardScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetNpcTakenRewardScRsp messages
     */
    public static MessageFactory<GetNpcTakenRewardScRsp> getFactory() {
      return GetNpcTakenRewardScRspFactory.INSTANCE;
    }

    private enum GetNpcTakenRewardScRspFactory implements MessageFactory<GetNpcTakenRewardScRsp> {
      INSTANCE;

      @Override
      public GetNpcTakenRewardScRsp create() {
        return GetNpcTakenRewardScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName npcId = FieldName.forField("npcId", "npc_id");

      static final FieldName oABGIDHGGHI = FieldName.forField("OABGIDHGGHI");
    }
  }
}
