<style>
    /* Pagination styles */
    .pagination .page-link {
        color: rgb(40, 167, 69);
    }

    .pagination .page-item.active .page-link {
        background-color: rgb(40, 167, 69);
        border-color: rgb(40, 167, 69);
    }

    .pagination .page-link:hover {
        background-color: rgb(200, 200, 200);
    }

    /* Content Header styles */
    .content-header {
        background: rgb(40, 167, 69);
        color: white;
    }

    /* Breadcrumb styles */
    .breadcrumb-item a,
    .breadcrumb-item.active {
        background: rgb(40, 167, 69);
        color: white;
    }

    /* Card Header styles */
    .card-header {
        background: rgb(40, 167, 69);
        color: white;
    }

    /* Card Footer styles */
    .card-footer {
        /* Add styles if needed */
    }

    /* 공통 스타일 */
    .btn-block {
        width: 100%;
    }

    /* 수정하기 버튼 스타일 */
    #modifyBtn {
        background-color: transparent; /* 배경색: 투명 */
        color: #ffc107; /* 글자색: 노란색 */
        border: 1px solid #ffc107; /* 테두리: 노란색 */
        transition: background-color 0.3s, border-color 0.3s, color 0.3s; /* 마우스 호버 시 부드러운 효과 */
    }

    #modifyBtn:hover {
        background-color: #ffc107; /* 배경색: 노란색 */
        border-color: #ffc107; /* 테두리: 노란색 */
        color: #ffffff; /* 글자색: 흰색 */
    }

    /* 취소 버튼 스타일 */
    #cancelBtn {
        color: #28a745;
        border: 1px solid #28a745;
        background-color: transparent;
        transition: background-color 0.3s, color 0.3s; /* 마우스 호버 시 부드러운 효과 */
    }

    #cancelBtn:hover {
        color: #ffffff; /* 글자색: 흰색 */
        background-color: #28a745; /* 배경색: 녹색 */
        border-color: #28a745; /* 테두리: 녹색 */
    }
    
    /* 등록 버튼 스타일 */
    #registBtn {
        background-color: transparent;
        color: #ffc107;
        border: 1px solid #ffc107;
        transition: background-color 0.3s, color 0.3s;
    }

    #registBtn:hover {
        color: #ffffff; /* 글자색: 흰색 */
        background-color: #ffc107; /* 배경색: 노란색 */
        border-color: #ffc107; /* 테두리: 노란색 */
    }
</style>
