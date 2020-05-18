package com.gbusiness.agentslot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "AgentSlot")
public class AgentSlotModel implements Serializable {

    @Id
    private Integer id;
    private Integer agentId;
    private Integer status;
    private LocalDateTime slotFrom;
    private LocalDateTime slotTo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentSlotModel that = (AgentSlotModel) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agentId);
    }

    @Override
    public String toString() {
        return "AgentSlot{" +
                "id=" + id +
                ", agentId='" + agentId + '\'' +
                ", from =" + slotFrom +
                ", to =" + slotTo +
                '}';
    }
}
