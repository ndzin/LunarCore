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

public final class SceneEntityInfoOuterClass {
  /**
   * Protobuf type {@code SceneEntityInfo}
   */
  public static final class SceneEntityInfo extends ProtoMessage<SceneEntityInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 inst_id = 3;</code>
     */
    private int instId;

    /**
     * <code>optional uint32 entity_id = 4;</code>
     */
    private int entityId;

    /**
     * <code>optional uint32 group_id = 9;</code>
     */
    private int groupId;

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     */
    private final SceneNpcInfoOuterClass.SceneNpcInfo npc = SceneNpcInfoOuterClass.SceneNpcInfo.newInstance();

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     */
    private final ScenePropInfoOuterClass.ScenePropInfo prop = ScenePropInfoOuterClass.ScenePropInfo.newInstance();

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     */
    private final SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo npcMonster = SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo.newInstance();

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     */
    private final SceneActorInfoOuterClass.SceneActorInfo actor = SceneActorInfoOuterClass.SceneActorInfo.newInstance();

    private SceneEntityInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityInfo}
     */
    public static SceneEntityInfo newInstance() {
      return new SceneEntityInfo();
    }

    public boolean hasEntityCase() {
      return (((bitField0_ & 0x0000000f)) != 0);
    }

    public SceneEntityInfo clearEntityCase() {
      if (hasEntityCase()) {
        clearNpc();
        clearProp();
        clearNpcMonster();
        clearActor();
      }
      return this;
    }

    private void clearEntityCaseOtherNpc() {
      if ((((bitField0_ & 0x0000000e)) != 0)) {
        clearProp();
        clearNpcMonster();
        clearActor();
      }
    }

    private void clearEntityCaseOtherProp() {
      if ((((bitField0_ & 0x0000000d)) != 0)) {
        clearNpc();
        clearNpcMonster();
        clearActor();
      }
    }

    private void clearEntityCaseOtherNpcMonster() {
      if ((((bitField0_ & 0x0000000b)) != 0)) {
        clearNpc();
        clearProp();
        clearActor();
      }
    }

    private void clearEntityCaseOtherActor() {
      if ((((bitField0_ & 0x00000007)) != 0)) {
        clearNpc();
        clearProp();
        clearNpcMonster();
      }
    }

    /**
     * <code>optional uint32 inst_id = 3;</code>
     * @return whether the instId field is set
     */
    public boolean hasInstId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 inst_id = 3;</code>
     * @return this
     */
    public SceneEntityInfo clearInstId() {
      bitField0_ &= ~0x00000010;
      instId = 0;
      return this;
    }

    /**
     * <code>optional uint32 inst_id = 3;</code>
     * @return the instId
     */
    public int getInstId() {
      return instId;
    }

    /**
     * <code>optional uint32 inst_id = 3;</code>
     * @param value the instId to set
     * @return this
     */
    public SceneEntityInfo setInstId(final int value) {
      bitField0_ |= 0x00000010;
      instId = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 4;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 4;</code>
     * @return this
     */
    public SceneEntityInfo clearEntityId() {
      bitField0_ &= ~0x00000020;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 4;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 4;</code>
     * @param value the entityId to set
     * @return this
     */
    public SceneEntityInfo setEntityId(final int value) {
      bitField0_ |= 0x00000020;
      entityId = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return this
     */
    public SceneEntityInfo clearGroupId() {
      bitField0_ &= ~0x00000040;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @param value the groupId to set
     * @return this
     */
    public SceneEntityInfo setGroupId(final int value) {
      bitField0_ |= 0x00000040;
      groupId = value;
      return this;
    }

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     * @return whether the npc field is set
     */
    public boolean hasNpc() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     * @return this
     */
    public SceneEntityInfo clearNpc() {
      bitField0_ &= ~0x00000001;
      npc.clear();
      return this;
    }

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpc()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneNpcInfoOuterClass.SceneNpcInfo getNpc() {
      return npc;
    }

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneNpcInfoOuterClass.SceneNpcInfo getMutableNpc() {
      clearEntityCaseOtherNpc();
      bitField0_ |= 0x00000001;
      return npc;
    }

    /**
     * <pre>
     * SceneSummonUnitInfo summon_unit = 12;
     * </pre>
     *
     * <code>optional .SceneNpcInfo npc = 1;</code>
     * @param value the npc to set
     * @return this
     */
    public SceneEntityInfo setNpc(final SceneNpcInfoOuterClass.SceneNpcInfo value) {
      clearEntityCaseOtherNpc();
      bitField0_ |= 0x00000001;
      npc.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     * @return this
     */
    public SceneEntityInfo clearMotion() {
      bitField0_ &= ~0x00000080;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000080;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 2;</code>
     * @param value the motion to set
     * @return this
     */
    public SceneEntityInfo setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000080;
      motion.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @return whether the prop field is set
     */
    public boolean hasProp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @return this
     */
    public SceneEntityInfo clearProp() {
      bitField0_ &= ~0x00000002;
      prop.clear();
      return this;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableProp()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ScenePropInfoOuterClass.ScenePropInfo getProp() {
      return prop;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ScenePropInfoOuterClass.ScenePropInfo getMutableProp() {
      clearEntityCaseOtherProp();
      bitField0_ |= 0x00000002;
      return prop;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @param value the prop to set
     * @return this
     */
    public SceneEntityInfo setProp(final ScenePropInfoOuterClass.ScenePropInfo value) {
      clearEntityCaseOtherProp();
      bitField0_ |= 0x00000002;
      prop.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     * @return whether the npcMonster field is set
     */
    public boolean hasNpcMonster() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     * @return this
     */
    public SceneEntityInfo clearNpcMonster() {
      bitField0_ &= ~0x00000004;
      npcMonster.clear();
      return this;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpcMonster()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo getNpcMonster() {
      return npcMonster;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo getMutableNpcMonster() {
      clearEntityCaseOtherNpcMonster();
      bitField0_ |= 0x00000004;
      return npcMonster;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 10;</code>
     * @param value the npcMonster to set
     * @return this
     */
    public SceneEntityInfo setNpcMonster(
        final SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo value) {
      clearEntityCaseOtherNpcMonster();
      bitField0_ |= 0x00000004;
      npcMonster.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     * @return whether the actor field is set
     */
    public boolean hasActor() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     * @return this
     */
    public SceneEntityInfo clearActor() {
      bitField0_ &= ~0x00000008;
      actor.clear();
      return this;
    }

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableActor()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneActorInfoOuterClass.SceneActorInfo getActor() {
      return actor;
    }

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneActorInfoOuterClass.SceneActorInfo getMutableActor() {
      clearEntityCaseOtherActor();
      bitField0_ |= 0x00000008;
      return actor;
    }

    /**
     * <code>optional .SceneActorInfo actor = 11;</code>
     * @param value the actor to set
     * @return this
     */
    public SceneEntityInfo setActor(final SceneActorInfoOuterClass.SceneActorInfo value) {
      clearEntityCaseOtherActor();
      bitField0_ |= 0x00000008;
      actor.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityInfo copyFrom(final SceneEntityInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        instId = other.instId;
        entityId = other.entityId;
        groupId = other.groupId;
        npc.copyFrom(other.npc);
        motion.copyFrom(other.motion);
        prop.copyFrom(other.prop);
        npcMonster.copyFrom(other.npcMonster);
        actor.copyFrom(other.actor);
      }
      return this;
    }

    @Override
    public SceneEntityInfo mergeFrom(final SceneEntityInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasInstId()) {
        setInstId(other.instId);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasNpc()) {
        getMutableNpc().mergeFrom(other.npc);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      if (other.hasProp()) {
        getMutableProp().mergeFrom(other.prop);
      }
      if (other.hasNpcMonster()) {
        getMutableNpcMonster().mergeFrom(other.npcMonster);
      }
      if (other.hasActor()) {
        getMutableActor().mergeFrom(other.actor);
      }
      return this;
    }

    @Override
    public SceneEntityInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      instId = 0;
      entityId = 0;
      groupId = 0;
      npc.clear();
      motion.clear();
      prop.clear();
      npcMonster.clear();
      actor.clear();
      return this;
    }

    @Override
    public SceneEntityInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npc.clearQuick();
      motion.clearQuick();
      prop.clearQuick();
      npcMonster.clearQuick();
      actor.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityInfo)) {
        return false;
      }
      SceneEntityInfo other = (SceneEntityInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasInstId() || instId == other.instId)
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasNpc() || npc.equals(other.npc))
        && (!hasMotion() || motion.equals(other.motion))
        && (!hasProp() || prop.equals(other.prop))
        && (!hasNpcMonster() || npcMonster.equals(other.npcMonster))
        && (!hasActor() || actor.equals(other.actor));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(instId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(npc);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(motion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(prop);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(npcMonster);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(actor);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(instId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(npc);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(prop);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(npcMonster);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(actor);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // instId
            instId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // npc
            clearEntityCaseOtherNpc();
            input.readMessage(npc);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // prop
            clearEntityCaseOtherProp();
            input.readMessage(prop);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // npcMonster
            clearEntityCaseOtherNpcMonster();
            input.readMessage(npcMonster);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // actor
            clearEntityCaseOtherActor();
            input.readMessage(actor);
            bitField0_ |= 0x00000008;
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
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.instId, instId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.npc, npc);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.prop, prop);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.npcMonster, npcMonster);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.actor, actor);
      }
      output.endObject();
    }

    @Override
    public SceneEntityInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1183779327:
          case 1957567924: {
            if (input.isAtField(FieldNames.instId)) {
              if (!input.trySkipNullValue()) {
                instId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109281: {
            if (input.isAtField(FieldNames.npc)) {
              if (!input.trySkipNullValue()) {
                clearEntityCaseOtherNpc();
                input.readMessage(npc);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3449699: {
            if (input.isAtField(FieldNames.prop)) {
              if (!input.trySkipNullValue()) {
                clearEntityCaseOtherProp();
                input.readMessage(prop);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1367251527:
          case 119679100: {
            if (input.isAtField(FieldNames.npcMonster)) {
              if (!input.trySkipNullValue()) {
                clearEntityCaseOtherNpcMonster();
                input.readMessage(npcMonster);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 92645877: {
            if (input.isAtField(FieldNames.actor)) {
              if (!input.trySkipNullValue()) {
                clearEntityCaseOtherActor();
                input.readMessage(actor);
                bitField0_ |= 0x00000008;
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
    public SceneEntityInfo clone() {
      return new SceneEntityInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), data).checkInitialized();
    }

    public static SceneEntityInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), input).checkInitialized();
    }

    public static SceneEntityInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityInfo messages
     */
    public static MessageFactory<SceneEntityInfo> getFactory() {
      return SceneEntityInfoFactory.INSTANCE;
    }

    private enum SceneEntityInfoFactory implements MessageFactory<SceneEntityInfo> {
      INSTANCE;

      @Override
      public SceneEntityInfo create() {
        return SceneEntityInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName instId = FieldName.forField("instId", "inst_id");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName npc = FieldName.forField("npc");

      static final FieldName motion = FieldName.forField("motion");

      static final FieldName prop = FieldName.forField("prop");

      static final FieldName npcMonster = FieldName.forField("npcMonster", "npc_monster");

      static final FieldName actor = FieldName.forField("actor");
    }
  }
}
