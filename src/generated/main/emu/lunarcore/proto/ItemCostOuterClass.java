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

public final class ItemCostOuterClass {
  /**
   * Protobuf type {@code ItemCost}
   */
  public static final class ItemCost extends ProtoMessage<ItemCost> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 relic_unique_id = 5;</code>
     */
    private int relicUniqueId;

    /**
     * <code>optional uint32 equipment_unique_id = 10;</code>
     */
    private int equipmentUniqueId;

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     */
    private final PileItemOuterClass.PileItem pileItem = PileItemOuterClass.PileItem.newInstance();

    private ItemCost() {
    }

    /**
     * @return a new empty instance of {@code ItemCost}
     */
    public static ItemCost newInstance() {
      return new ItemCost();
    }

    public boolean hasItemCase() {
      return (((bitField0_ & 0x00000007)) != 0);
    }

    public ItemCost clearItemCase() {
      if (hasItemCase()) {
        clearRelicUniqueId();
        clearEquipmentUniqueId();
        clearPileItem();
      }
      return this;
    }

    private void clearItemCaseOtherRelicUniqueId() {
      if ((((bitField0_ & 0x00000006)) != 0)) {
        clearEquipmentUniqueId();
        clearPileItem();
      }
    }

    private void clearItemCaseOtherEquipmentUniqueId() {
      if ((((bitField0_ & 0x00000005)) != 0)) {
        clearRelicUniqueId();
        clearPileItem();
      }
    }

    private void clearItemCaseOtherPileItem() {
      if ((((bitField0_ & 0x00000003)) != 0)) {
        clearRelicUniqueId();
        clearEquipmentUniqueId();
      }
    }

    /**
     * <code>optional uint32 relic_unique_id = 5;</code>
     * @return whether the relicUniqueId field is set
     */
    public boolean hasRelicUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 relic_unique_id = 5;</code>
     * @return this
     */
    public ItemCost clearRelicUniqueId() {
      bitField0_ &= ~0x00000001;
      relicUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 relic_unique_id = 5;</code>
     * @return the relicUniqueId
     */
    public int getRelicUniqueId() {
      return relicUniqueId;
    }

    /**
     * <code>optional uint32 relic_unique_id = 5;</code>
     * @param value the relicUniqueId to set
     * @return this
     */
    public ItemCost setRelicUniqueId(final int value) {
      clearItemCaseOtherRelicUniqueId();
      bitField0_ |= 0x00000001;
      relicUniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 10;</code>
     * @return whether the equipmentUniqueId field is set
     */
    public boolean hasEquipmentUniqueId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 10;</code>
     * @return this
     */
    public ItemCost clearEquipmentUniqueId() {
      bitField0_ &= ~0x00000002;
      equipmentUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 10;</code>
     * @return the equipmentUniqueId
     */
    public int getEquipmentUniqueId() {
      return equipmentUniqueId;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 10;</code>
     * @param value the equipmentUniqueId to set
     * @return this
     */
    public ItemCost setEquipmentUniqueId(final int value) {
      clearItemCaseOtherEquipmentUniqueId();
      bitField0_ |= 0x00000002;
      equipmentUniqueId = value;
      return this;
    }

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     * @return whether the pileItem field is set
     */
    public boolean hasPileItem() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     * @return this
     */
    public ItemCost clearPileItem() {
      bitField0_ &= ~0x00000004;
      pileItem.clear();
      return this;
    }

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePileItem()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PileItemOuterClass.PileItem getPileItem() {
      return pileItem;
    }

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PileItemOuterClass.PileItem getMutablePileItem() {
      clearItemCaseOtherPileItem();
      bitField0_ |= 0x00000004;
      return pileItem;
    }

    /**
     * <code>optional .PileItem pile_item = 7;</code>
     * @param value the pileItem to set
     * @return this
     */
    public ItemCost setPileItem(final PileItemOuterClass.PileItem value) {
      clearItemCaseOtherPileItem();
      bitField0_ |= 0x00000004;
      pileItem.copyFrom(value);
      return this;
    }

    @Override
    public ItemCost copyFrom(final ItemCost other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        relicUniqueId = other.relicUniqueId;
        equipmentUniqueId = other.equipmentUniqueId;
        pileItem.copyFrom(other.pileItem);
      }
      return this;
    }

    @Override
    public ItemCost mergeFrom(final ItemCost other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRelicUniqueId()) {
        setRelicUniqueId(other.relicUniqueId);
      }
      if (other.hasEquipmentUniqueId()) {
        setEquipmentUniqueId(other.equipmentUniqueId);
      }
      if (other.hasPileItem()) {
        getMutablePileItem().mergeFrom(other.pileItem);
      }
      return this;
    }

    @Override
    public ItemCost clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      relicUniqueId = 0;
      equipmentUniqueId = 0;
      pileItem.clear();
      return this;
    }

    @Override
    public ItemCost clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      pileItem.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ItemCost)) {
        return false;
      }
      ItemCost other = (ItemCost) o;
      return bitField0_ == other.bitField0_
        && (!hasRelicUniqueId() || relicUniqueId == other.relicUniqueId)
        && (!hasEquipmentUniqueId() || equipmentUniqueId == other.equipmentUniqueId)
        && (!hasPileItem() || pileItem.equals(other.pileItem));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(pileItem);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(pileItem);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ItemCost mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // relicUniqueId
            clearItemCaseOtherRelicUniqueId();
            relicUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // equipmentUniqueId
            clearItemCaseOtherEquipmentUniqueId();
            equipmentUniqueId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // pileItem
            clearItemCaseOtherPileItem();
            input.readMessage(pileItem);
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.relicUniqueId, relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.equipmentUniqueId, equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.pileItem, pileItem);
      }
      output.endObject();
    }

    @Override
    public ItemCost mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1966200481:
          case 49648253: {
            if (input.isAtField(FieldNames.relicUniqueId)) {
              if (!input.trySkipNullValue()) {
                clearItemCaseOtherRelicUniqueId();
                relicUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1867136902:
          case 760467160: {
            if (input.isAtField(FieldNames.equipmentUniqueId)) {
              if (!input.trySkipNullValue()) {
                clearItemCaseOtherEquipmentUniqueId();
                equipmentUniqueId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -487618715:
          case 2083693056: {
            if (input.isAtField(FieldNames.pileItem)) {
              if (!input.trySkipNullValue()) {
                clearItemCaseOtherPileItem();
                input.readMessage(pileItem);
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
    public ItemCost clone() {
      return new ItemCost().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ItemCost parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ItemCost(), data).checkInitialized();
    }

    public static ItemCost parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemCost(), input).checkInitialized();
    }

    public static ItemCost parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemCost(), input).checkInitialized();
    }

    /**
     * @return factory for creating ItemCost messages
     */
    public static MessageFactory<ItemCost> getFactory() {
      return ItemCostFactory.INSTANCE;
    }

    private enum ItemCostFactory implements MessageFactory<ItemCost> {
      INSTANCE;

      @Override
      public ItemCost create() {
        return ItemCost.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName relicUniqueId = FieldName.forField("relicUniqueId", "relic_unique_id");

      static final FieldName equipmentUniqueId = FieldName.forField("equipmentUniqueId", "equipment_unique_id");

      static final FieldName pileItem = FieldName.forField("pileItem", "pile_item");
    }
  }
}
