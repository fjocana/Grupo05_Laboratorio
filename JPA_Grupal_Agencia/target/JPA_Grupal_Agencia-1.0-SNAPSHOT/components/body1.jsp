<%-- 
    Document   : body1
    Created on : 25 ago 2023, 12:47:43
    Author     : EUNICE-ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-icon">
                    <i class="fas fa-car"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Agencia Vehicular</div>
            </a>


            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">                    
                    <i class="fas fa-solid fa-bars"></i>
                    <span>MENU</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-car"></i>
                    <span>Agencias</span>
                </a>

                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Agencias de Transito</h6>
                        <a class="collapse-item" href="add.jsp"><i class="fas fa-plus"></i> Crear Agencias</a>
                        <a class="collapse-item" href="AgenciaServlet"><i class="fas fa-eye"></i> Listar Agencias</a>
                        
                        
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

        </ul>
        <!-- End of Sidebar -->
        <div id="content-wrapper">
            <!-- Main Content -->
            <div id="content">
                <!-- Logo de Agencias Vehiculares -->
                <div>
                    <img src="IMG/agencia.png" alt="Agencias Vehiculares" width="850px" hight="600px">
                </div>
                <!-- Topbar -->
                <div class="topbar">