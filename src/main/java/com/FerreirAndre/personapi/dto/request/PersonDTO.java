package com.FerreirAndre.personapi.dto.request;

import com.FerreirAndre.personapi.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
        private Long id;

        @NotEmpty
        @Size(min = 1, max = 100)
        private String firstName;

        @NotEmpty
        @Size(min = 1, max = 100)
        private String lastName;

        @NotEmpty
        private String cpf;

        private LocalDate birthDate;

        @Valid
        @NotEmpty
        private List<Phone> phones;
}
