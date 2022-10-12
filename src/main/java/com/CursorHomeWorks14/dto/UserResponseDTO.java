package com.CursorHomeWorks14.dto;

import lombok.Data;
import com.CursorHomeWorks14.model.AppUserRole;

import java.util.List;

@Data
public class UserResponseDTO {

  private Integer id;
  private String username;
  private String email;
  List<AppUserRole> appUserRoles;
}
