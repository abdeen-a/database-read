package com.example.redShift;

import com.controller.Impl.CategoryControllerImpl;
import com.dto.CategoryDTO;
import com.service.generic.ServiceGeneric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryControllerImplTest {

    @Mock
    private ServiceGeneric serviceGenericImpl;

    @InjectMocks
    private CategoryControllerImpl categoryControllerImpl;

    @Test
    public void testGetCategory() {
        // given
        Integer categoryId = 1;
        CategoryDTO expectedResult = new CategoryDTO();
        expectedResult.setCatid(categoryId);
        expectedResult.setCatdesc("Category 1");
        when(serviceGenericImpl.getCategory(categoryId)).thenReturn(expectedResult);

        // when
        ResponseEntity<?> response = categoryControllerImpl.getCategory(categoryId);

        // then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expectedResult);
    }

    @Test
    public void testGetAllCategories() {
        // given
        List<CategoryDTO> expectedResult = Arrays.asList(
                new CategoryDTO(1, "Category 1"),
                new CategoryDTO(2, "Category 2")
        );
        when(serviceGenericImpl.getALlCategories()).thenReturn(expectedResult);

        // when
        ResponseEntity<?> response = categoryControllerImpl.getAllCategories();

        // then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expectedResult);
    }
}
